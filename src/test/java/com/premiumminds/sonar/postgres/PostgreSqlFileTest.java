package com.premiumminds.sonar.postgres;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Test;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.TextPointer;
import org.sonar.api.batch.fs.TextRange;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

class PostgreSqlFileTest {

    @Test
    void mapsUtf8ByteOffsetsToUtf16Positions() {
        String text = "-- Zażółć gęślą jaźń 😀\r\nSELECT '漢字';\nSELECT 'Łukasz';";
        CountingFile fixture = createFile(text, StandardCharsets.UTF_8);
        PostgreSqlFile file = new PostgreSqlFile(fixture.input);
        int line = 1;
        int column = 0;
        for (int character = 0; character <= text.length();) {
            // The byte between CR and LF is not a valid position in Sonar's
            // logical line: line-ending characters are outside its columns.
            if (!(character > 0 && character < text.length()
                    && text.charAt(character - 1) == '\r' && text.charAt(character) == '\n')) {
                int byteOffset = text.substring(0, character).getBytes(StandardCharsets.UTF_8).length;
                TextPointer pointer = character == 0
                        ? file.convertAbsoluteOffsetToLine(0).start()
                        : file.convertAbsoluteOffsetsToTextRange(0, byteOffset).end();
                assertEquals(line, pointer.line());
                assertEquals(column, pointer.lineOffset());
            }
            if (character == text.length()) {
                break;
            }
            int codePoint = text.codePointAt(character);
            int width = Character.charCount(codePoint);
            if (codePoint == '\n') {
                line++;
                column = 0;
            } else {
                column += width;
            }
            character += width;
        }
        assertEquals(1, fixture.reads.get());
    }

    @Test
    void cachesContentsAndKeepsPublicOperations() {
        String text = "SELECT 'ę';\nSELECT 2;";
        CountingFile fixture = createFile(text, StandardCharsets.UTF_8);
        PostgreSqlFile file = new PostgreSqlFile(fixture.input);
        assertSame(fixture.input, file.getInputFile());
        assertEquals("fixture.sql", file.filename());
        assertEquals(text, file.contents());
        assertEquals(text.length(), file.contentsLength());
        assertEquals("ę", file.subContents(8, 10));
        assertEquals(2, file.convertAbsoluteOffsetToLine("SELECT 'ę';\n".getBytes(StandardCharsets.UTF_8).length).start().line());
        for (int i = 0; i < 100; i++) {
            file.contents();
            file.subContents(0, 6);
            file.convertAbsoluteOffsetsToTextRange(0, 6);
        }
        assertEquals(1, fixture.reads.get());
    }

    @Test
    void supportsConfiguredCp1250Encoding() {
        Charset charset = Charset.forName("windows-1250");
        String text = "Zażółć\r\nSELECT 'Łukasz';";
        CountingFile fixture = createFile(text, charset);
        PostgreSqlFile file = new PostgreSqlFile(fixture.input);
        int offset = "Zażółć\r\n".getBytes(charset).length;
        TextRange range = file.convertAbsoluteOffsetsToTextRange(offset, offset + 6);
        assertEquals(2, range.start().line());
        assertEquals(0, range.start().lineOffset());
        assertEquals(6, range.end().lineOffset());
        assertEquals("Zażółć", file.subContents(0, "Zażółć".getBytes(charset).length));
        assertEquals(1, fixture.reads.get());
    }

    @Test
    void supportsEmptyFileAndEofAfterNewline() {
        for (String text : List.of("", "\n", "\r\n", "ę\r\n", "x\n\n")) {
            PostgreSqlFile file = new PostgreSqlFile(createFile(text, StandardCharsets.UTF_8).input);
            int end = text.getBytes(StandardCharsets.UTF_8).length;
            if (text.isEmpty()) {
                assertEquals("", file.contents());
                assertEquals(0, file.contentsLength());
                // Sonar's real InputFile API rejects empty ranges.
                assertThrows(IllegalArgumentException.class, () -> file.convertAbsoluteOffsetsToTextRange(0, 0));
                continue;
            }
            TextRange range = file.convertAbsoluteOffsetsToTextRange(0, end);
            assertEquals(text.split("\n", -1).length, range.end().line());
            assertEquals(0, range.end().lineOffset());
        }
    }

    @Test
    void rejectsOffsetsOutsideFile() {
        PostgreSqlFile file = new PostgreSqlFile(createFile("SELECT 1;", StandardCharsets.UTF_8).input);
        assertThrows(IllegalArgumentException.class, () -> file.convertAbsoluteOffsetsToTextRange(-1, 0));
        assertThrows(IllegalArgumentException.class, () -> file.convertAbsoluteOffsetsToTextRange(0, 10));
    }

    @Test
    void mapsStandaloneCrAndMixedLineEndings() {
        for (String ending : List.of("\r", "\r\n", "\n", "\r\r\n", "\n\r")) {
            String prefix = "SELECT 'ę😀';" + ending + "'\r\n";
            String text = prefix + "  LANGUAGE plpgsql;";
            CountingFile fixture = createFile(text, StandardCharsets.UTF_8);
            PostgreSqlFile file = new PostgreSqlFile(fixture.input);
            int start = prefix.getBytes(StandardCharsets.UTF_8).length;
            TextRange range = file.convertAbsoluteOffsetsToTextRange(start, start + 2);
            int expectedLine = prefix.split("\\r\\n|\\r|\\n", -1).length;
            assertEquals(expectedLine, range.start().line(), "Line ending: " + ending);
            assertEquals(0, range.start().lineOffset());
            assertEquals(2, range.end().lineOffset());
            assertEquals(expectedLine, file.convertAbsoluteOffsetToLine(start).start().line());
            assertEquals(1, fixture.reads.get());
        }
    }

    @Test
    void mapsEofAfterStandaloneCr() {
        for (String ending : List.of("\r", "\r\r", "\r\r\n", "\n\r", "\r\n\r")) {
            String text = "SELECT 'ę';" + ending;
            PostgreSqlFile file = new PostgreSqlFile(createFile(text, StandardCharsets.UTF_8).input);
            TextRange range = file.convertAbsoluteOffsetsToTextRange(0, text.getBytes(StandardCharsets.UTF_8).length);
            assertEquals(text.split("\\r\\n|\\r|\\n", -1).length, range.end().line());
            assertEquals(0, range.end().lineOffset());
        }
    }

    @Test
    void preservesReadFailureCause() {
        InputFile input = (InputFile) Proxy.newProxyInstance(InputFile.class.getClassLoader(), new Class<?>[]{InputFile.class},
                (proxy, method, arguments) -> { throw new IOException("read failure"); });
        PostgreSqlFile file = new PostgreSqlFile(input);
        RuntimeException exception = assertThrows(RuntimeException.class, file::contents);
        assertInstanceOf(IOException.class, exception.getCause());
    }

    @Test
    void initializesContentsOnceWithConcurrentReaders() throws Exception {
        CountingFile fixture = createFile("SELECT 'ę';", StandardCharsets.UTF_8);
        PostgreSqlFile file = new PostgreSqlFile(fixture.input);
        var executor = Executors.newFixedThreadPool(8);
        try {
            List<Callable<String>> tasks = new ArrayList<>();
            for (int i = 0; i < 64; i++) {
                tasks.add(file::contents);
            }
            for (var result : executor.invokeAll(tasks)) {
                assertEquals("SELECT 'ę';", result.get(10, TimeUnit.SECONDS));
            }
            assertEquals(1, fixture.reads.get());
        } finally {
            executor.shutdownNow();
        }
    }

    @Test
    void indexesLongLineWithoutRepeatedEncodingOrReads() {
        assertTimeoutPreemptively(Duration.ofSeconds(10), () -> {
            String text = "x".repeat(1_000_000) + "ę😀";
            CountingFile fixture = createFile(text, StandardCharsets.UTF_8);
            PostgreSqlFile file = new PostgreSqlFile(fixture.input);
            int end = text.getBytes(StandardCharsets.UTF_8).length;
            for (int query = 0; query < 10_000; query++) {
                TextRange range = file.convertAbsoluteOffsetsToTextRange(end - 4, end);
                assertEquals(text.length(), range.end().lineOffset());
            }
            assertEquals(1, fixture.reads.get());
        });
    }

    private static CountingFile createFile(String contents, Charset charset) {
        InputFile delegate = TestInputFileBuilder.create("project", "fixture.sql")
                .setContents(contents)
                .setCharset(charset)
                .build();
        AtomicInteger reads = new AtomicInteger();
        InputFile input = (InputFile) Proxy.newProxyInstance(InputFile.class.getClassLoader(), new Class<?>[]{InputFile.class},
                (proxy, method, arguments) -> {
                    if (method.getName().equals("contents")) {
                        reads.incrementAndGet();
                    }
                    try {
                        return method.invoke(delegate, arguments);
                    } catch (InvocationTargetException exception) {
                        throw exception.getCause();
                    }
                });
        return new CountingFile(input, reads);
    }

    private record CountingFile(InputFile input, AtomicInteger reads) {
    }
}
