package com.gfs.backspaceinstring;

public class BackspacesInString {

    public String solution(final String testString) {
        final StringBuilder builder = new StringBuilder(testString.length());
        for (final char inputChar : testString.toCharArray()) {
            if (inputChar == '#') {
                if (builder.length() > 0) {
                    builder.deleteCharAt(builder.length() - 1);
                }
            } else {
                builder.append(inputChar);
            }
        }
        return builder.toString();
    }
}
