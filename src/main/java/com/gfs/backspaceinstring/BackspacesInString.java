package com.gfs.backspaceinstring;

public class BackspacesInString {
    public String solution(final String testString) {
        final int testStringLength = testString.length();
        final byte[] chars = new byte[testStringLength];
        int index = 0;
        int outputLength = 0;
        while (index < testStringLength) {
            final byte thisChar = (byte) testString.charAt(index++);
            if (thisChar == 35) {
                outputLength = Math.max(outputLength - 1, 0);
            } else {
                chars[outputLength++] = thisChar;
            }
        }
        return new String(chars, 0, outputLength);
    }
}
