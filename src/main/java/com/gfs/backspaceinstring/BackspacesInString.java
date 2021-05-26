package com.gfs.backspaceinstring;

public class BackspacesInString {
    public String solution(final String testString) {
        final char[] buffer = testString.toCharArray();
        final int len = buffer.length;
        int writePos = 0;

        char c = 0;
        for (int i = 0; i < len; i++) {
            c = buffer[i];
            if (c == '#') {
                if (writePos > 0) {
                    writePos--;
                }
            } else {
                buffer[writePos] = c;
                writePos++;
            }
        }

        return new String(buffer, 0, writePos);

    }

}
