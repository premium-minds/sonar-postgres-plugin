package com.premiumminds.sonar.postgres;

import java.io.IOException;
import java.nio.charset.Charset;

import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.TextPointer;
import org.sonar.api.batch.fs.TextRange;

public class PostgreSqlFile {

    private final InputFile inputFile;
    private volatile String[] lines;

    public PostgreSqlFile(InputFile inputFile) {
        this.inputFile = inputFile;
    }

    public InputFile getInputFile() {
        return inputFile;
    }

    private TextPointer convertAbsoluteByteOffsetToTextPointer(int absoluteByteOffset) {
        final String contents = contents();

        int runningLines = 1;
        int runningAbsoluteOffset = 0;
        for (String line : lines()) {
            final int lineLength = line.getBytes(charset()).length + 1;
            if (runningAbsoluteOffset <= absoluteByteOffset && absoluteByteOffset < runningAbsoluteOffset + lineLength){
                final String substring = new String(contents.getBytes(charset()), runningAbsoluteOffset, absoluteByteOffset - runningAbsoluteOffset);
                return inputFile.newPointer(runningLines, substring.length());
            }
            runningLines++;
            runningAbsoluteOffset += lineLength;
        }
        throw new RuntimeException("offset " + absoluteByteOffset + "outside of contents " + contents);
    }

    public TextRange convertAbsoluteOffsetsToTextRange(int start, int end) {
        final TextPointer textPointerStart = convertAbsoluteByteOffsetToTextPointer(start);
        final TextPointer textPointerEnd = convertAbsoluteByteOffsetToTextPointer(end);
        return inputFile.newRange(textPointerStart, textPointerEnd);
    }

    public TextRange convertAbsoluteOffsetToLine(int start) {
        final TextPointer textPointer = convertAbsoluteByteOffsetToTextPointer(start);
        return inputFile.selectLine(textPointer.line());
    }

    private String[] lines() {
        if (lines == null){
            lines = contents().split("\n");
        }
        return lines;
    }

    public String contents() {
        try {
            return inputFile.contents();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int contentsLength() {
        return contents().length();
    }

    private Charset charset(){
        return inputFile.charset();
    }

    public String subContents(int absoluteByteOffsetStart, int absoluteByteOffsetEnd){
        return new String(contents().getBytes(charset()), absoluteByteOffsetStart, absoluteByteOffsetEnd - absoluteByteOffsetStart);
    }

    public String filename(){
        return inputFile.filename();
    }
}
