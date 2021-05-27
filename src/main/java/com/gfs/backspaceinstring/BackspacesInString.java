package com.gfs.backspaceinstring;

public class BackspacesInString {
    private static char BACK_SPACE = '#';

    public static String solution(final String inputString) {
        final StringBuilder sb = new StringBuilder();
        for (final char c : inputString.toCharArray()) {
            if (c == BACK_SPACE) {
                if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}