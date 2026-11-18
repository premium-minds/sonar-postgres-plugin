/*
 * Copyright (c) 2023 Premium Minds. MIT License; see LICENSE.
 * Cache SQL contents and byte offsets for linear-time indexing.
 */
package com.premiumminds.sonar.postgres;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.TextPointer;
import org.sonar.api.batch.fs.TextRange;

public class PostgreSqlFile {

    private final InputFile inputFile;
    private volatile ContentIndex index;

    public PostgreSqlFile(InputFile inputFile) {
        this.inputFile = inputFile;
    }

    public InputFile getInputFile() {
        return inputFile;
    }

    private ContentIndex index() {
        ContentIndex result = index;
        if (result == null) {
            synchronized (this) {
                result = index;
                if (result == null) {
                    try {
                        result = new ContentIndex(inputFile.contents(), inputFile.charset());
                    } catch (IOException exception) {
                        throw new RuntimeException(exception);
                    }
                    index = result;
                }
            }
        }
        return result;
    }

    private TextPointer convertAbsoluteByteOffsetToTextPointer(int absoluteByteOffset) {
        ContentIndex data = index();
        if (absoluteByteOffset < 0 || absoluteByteOffset > data.bytes.length) {
            throw new IllegalArgumentException("Byte offset outside SQL file: " + absoluteByteOffset);
        }
        int characterOffset = data.characterOffsets[absoluteByteOffset];
        int line = Arrays.binarySearch(data.lineStarts, characterOffset);
        if (line < 0) {
            line = -line - 2;
        }
        return inputFile.newPointer(line + 1, characterOffset - data.lineStarts[line]);
    }

    public TextRange convertAbsoluteOffsetsToTextRange(int start, int end) {
        return inputFile.newRange(convertAbsoluteByteOffsetToTextPointer(start),
                convertAbsoluteByteOffsetToTextPointer(end));
    }

    public TextRange convertAbsoluteOffsetToLine(int start) {
        return inputFile.selectLine(convertAbsoluteByteOffsetToTextPointer(start).line());
    }

    public String contents() {
        return index().contents;
    }

    public int contentsLength() {
        return index().contents.length();
    }

    public String subContents(int absoluteByteOffsetStart, int absoluteByteOffsetEnd) {
        ContentIndex data = index();
        return new String(data.bytes, absoluteByteOffsetStart,
                absoluteByteOffsetEnd - absoluteByteOffsetStart, data.charset);
    }

    public String filename() {
        return inputFile.filename();
    }

    private static final class ContentIndex {

        private final String contents;
        private final Charset charset;
        private final byte[] bytes;
        private final int[] characterOffsets;
        private final int[] lineStarts;

        private ContentIndex(String contents, Charset charset) {
            this.contents = contents;
            this.charset = charset;
            this.bytes = contents.getBytes(charset);
            this.characterOffsets = new int[bytes.length + 1];
            if (StandardCharsets.UTF_8.equals(charset)) {
                indexUtf8();
            } else {
                indexWithDecoder();
            }
            int lineCount = 1;
            for (int offset = 0; offset < contents.length(); offset++) {
                if (contents.charAt(offset) == '\r'
                        || (contents.charAt(offset) == '\n' && (offset == 0 || contents.charAt(offset - 1) != '\r'))) {
                    lineCount++;
                }
            }
            this.lineStarts = new int[lineCount];
            int line = 1;
            for (int offset = 0; offset < contents.length(); offset++) {
                if (contents.charAt(offset) == '\r') {
                    // Sonar counts CRLF as one newline, but a standalone CR
                    // (including the first CR in CR CR LF) is a newline too.
                    if (offset + 1 < contents.length() && contents.charAt(offset + 1) == '\n') {
                        offset++;
                    }
                    lineStarts[line++] = offset + 1;
                } else if (contents.charAt(offset) == '\n') {
                    lineStarts[line++] = offset + 1;
                }
            }
        }

        private void indexUtf8() {
            int characterOffset = 0;
            int byteOffset = 0;
            while (byteOffset < bytes.length) {
                int leadingByte = bytes[byteOffset] & 0xff;
                int width;
                if (leadingByte < 0x80) {
                    width = 1;
                } else if (leadingByte < 0xe0) {
                    width = 2;
                } else if (leadingByte < 0xf0) {
                    width = 3;
                } else {
                    width = 4;
                }
                // Decoding a truncated UTF-8 character produces one replacement
                // character, as in the original new String(byte[], ...) code.
                for (int partial = 1; partial < width; partial++) {
                    characterOffsets[byteOffset + partial] = characterOffset + 1;
                }
                characterOffset += width == 4 ? 2 : 1;
                byteOffset += width;
                characterOffsets[byteOffset] = characterOffset;
            }
        }

        private void indexWithDecoder() {
            CharsetDecoder decoder = charset.newDecoder()
                    .onMalformedInput(CodingErrorAction.REPLACE)
                    .onUnmappableCharacter(CodingErrorAction.REPLACE);
            ByteBuffer input = ByteBuffer.wrap(bytes);
            CharBuffer output = CharBuffer.allocate(8);
            int characters = 0;
            for (int end = 1; end <= bytes.length; end++) {
                input.limit(end);
                CoderResult result;
                do {
                    output.clear();
                    result = decoder.decode(input, output, end == bytes.length);
                    characters += output.position();
                } while (result.isOverflow());
                characterOffsets[end] = characters + (input.hasRemaining() ? 1 : 0);
            }
        }
    }
}
