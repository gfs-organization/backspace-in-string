package com.gfs.backspaceinstring;

public class BackspacesInString {
    private static StringBuilder solutionBuilder = new StringBuilder();

    public String solution(final String testString) {
        for (int i = 0; i < testString.length(); i++) {
            if (testString.charAt(i) == '#') {
                solutionBuilder.setLength(Math.max(solutionBuilder.length() - 1, 0));
            } else {
                solutionBuilder.append(testString.charAt(i));
            }
        }
        String output = solutionBuilder.toString();
        solutionBuilder.setLength(0);
        return output;
    }
}
