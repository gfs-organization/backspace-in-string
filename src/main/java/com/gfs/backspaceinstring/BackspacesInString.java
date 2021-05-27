package com.gfs.backspaceinstring;

/**
 * Basic left to right scan
 */
public class BackspacesInString {

    public String solution(final String input) {

        final char[] arr = input.toCharArray();
        final int len = arr.length;

        int idx = 0;
        for (int i = 0; i < len; i++) {
            final char c = arr[i];
            if (c == '#') {
                if (idx > 0) {
                    idx--;
                }
                continue;
            }
            arr[idx++] = c;
        }
        return new String(arr, 0, idx);
    }

}
