package com.gfs.backspaceinstring;

public class BackspacesInString {

    public String solution(final String testString) {
        final int length = testString.length();
        final StringBuilder builder = new StringBuilder(length);
        int backSpaceCount = 0;
        for (final char inputChar : testString.toCharArray()) {
            if (inputChar == '#') {
                backSpaceCount++;
                if (builder.length() > 0) {
                    builder.deleteCharAt(builder.length() - 1);
                } else if (backSpaceCount > length / 2) {
                    return "";
                }
            } else {
                builder.append(inputChar);
            }
        }
        return builder.toString();
    }
}
