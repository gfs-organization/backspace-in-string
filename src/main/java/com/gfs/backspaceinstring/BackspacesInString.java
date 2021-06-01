package com.gfs.backspaceinstring;

public class BackspacesInString {
    public String solution(final String testString) {
        final int testStringLength = testString.length();
        final char[] chars = new char[testStringLength];
        int index = 0;
        int outputLength = 0;
        while (index < testStringLength) {
            final char thisChar = testString.charAt(index++);
            if (thisChar == '#') {
                outputLength = Math.max(outputLength - 1, 0);
            } else {
                chars[outputLength++] = thisChar;
            }
        }
        return new String(chars, 0, outputLength);
    }
}
