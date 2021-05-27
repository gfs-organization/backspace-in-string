package com.gfs.backspaceinstring;

public class BackspacesInString {
    private static char BACK_SPACE = '#';

    public static String solution(final String inputString) {
        final StringBuilder sb = new StringBuilder();
        int backSpaceCount = 0;
        for (final char c : inputString.toCharArray()) {
            if (c == BACK_SPACE) {
                ++backSpaceCount;
            } else {
                if (backSpaceCount > sb.length()) {
                    sb.setLength(0);
                } else {
                    sb.setLength(sb.length() - backSpaceCount);
                }
                backSpaceCount = 0;
                sb.append(c);
            }

        }
        return sb.toString();
    }
}