package com.gfs.backspaceinstring;

import java.util.HashMap;

/**
 * Basic left to right scan. Not thread-safe!
 */
public class BackspacesInString {

    private static final char[] buffer = new char[10000];

    private static final HashMap<String, String> cache = new HashMap<>(10000);

    public String solution(final String input) {

        String output = cache.get(input);
        if (output != null) {
            return output;
        }

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

        output = new String(buffer, 0, idx);
        cache.put(input, output);
        return output;
    }
}