package com.gfs.backspaceinstring;

/**
 * Basic left to right scan. Not thread-safe!
 */
public class BackspacesInString {

    private static final char[] buffer = new char[1000000];

    public String solution(final String input) {

        final int len = input.length();

        int idx = 0;
        for (int i = 0; i < len; i++) {
            final char c = input.charAt(i);
            if (c == '#') {
                if (idx > 0) {
                    idx--;
                }
                continue;
            }
            buffer[idx++] = c;
        }
        return new String(buffer, 0, idx);
    }
}