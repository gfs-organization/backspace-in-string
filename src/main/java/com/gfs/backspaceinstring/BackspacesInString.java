package com.gfs.backspaceinstring;

public class BackspacesInString {
    final int backspace = Character.codePointAt(new char[] { '#' }, 0);

    public String solution(final String testString) {

        final int len = testString.length();
        final StringBuilder buffer = new StringBuilder(len);

        int cp = 0;
        int bufferLen = 0;
        for (int offset = 0; offset < len; ) {
            cp = testString.codePointAt(offset);
            offset += Character.charCount(cp);

            if (cp == backspace) {
                if (buffer.length() < 1) {
                    continue;
                }

                bufferLen = buffer.length();
                bufferLen = buffer.offsetByCodePoints(bufferLen, -1);
                buffer.setLength(bufferLen);
            } else {
                buffer.appendCodePoint(cp);
            }

        }
        return buffer.toString();

    }

}
