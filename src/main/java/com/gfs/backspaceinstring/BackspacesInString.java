package com.gfs.backspaceinstring;

public class BackspacesInString {

    public String solution(final String testString) {
        final char[] input = testString.toCharArray();

        final int len = input.length;
        final char[] buffer = new char[input.length];
        int bufferPosition = 0;

        char c = 0;
        for (int i = 0; i < len; i++) {
            c = input[i];
            if (c == '#') {
                if (bufferPosition > 0) {
                    bufferPosition--;
                }
            } else {
                buffer[bufferPosition] = c;
                bufferPosition++;
            }
        }

        return new String(buffer, 0, bufferPosition);

    }
}
