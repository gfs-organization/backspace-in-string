package com.gfs.backspaceinstring;

public class BackspacesInString {

    public String solution(final String testString) {

        final int len = testString.length();
        final StringBuilder builder = new StringBuilder();
        int i = 0;
        int backSpaceCount = 0;
        while (i < len) {
            final char inputChar = testString.charAt(i);
            if (inputChar == '#') {
                backSpaceCount++;
                if (builder.length() > 0) {
                    builder.deleteCharAt(builder.length() - 1);
                } else if (backSpaceCount > len / 2) {
                    return "";
                }
            } else {
                builder.append(inputChar);
            }
            i++;
        }

        return builder.toString();
    }
}
