package com.gfs.backspaceinstring;

public class BackspacesInString {
    public String solution(final String testString) {
        StringBuilder solutionBuilder = new StringBuilder();
        final int testStringLength = testString.length();
        solutionBuilder.ensureCapacity(testStringLength);
        int i = 0;
        while (i < testStringLength) {
            if (testString.charAt(i) == '#') {
                if (solutionBuilder.length() > 0) {
                    solutionBuilder.deleteCharAt(solutionBuilder.length() - 1);
                }
            } else {
                solutionBuilder.append(testString.charAt(i));
            }
            i++;
        }
        return solutionBuilder.toString();
    }
}
