package com.gfs.backspaceinstring;

public class BackspacesInString {
    public String solution(final String testString) {
        StringBuilder solutionBuilder = new StringBuilder();
        solutionBuilder.ensureCapacity(testString.length());
        int i = 0;
        final int len = testString.length();
        while (i < len) {
            if (testString.charAt(i) == '#') {
                if (solutionBuilder.length() > 0) {
                    solutionBuilder.deleteCharAt(solutionBuilder.length() - 1);
                }
            } else {
                solutionBuilder.append(testString.charAt(i));
            }
            i++;
        }
        String output = solutionBuilder.toString();
        solutionBuilder.setLength(0);
        return output;
    }
}
