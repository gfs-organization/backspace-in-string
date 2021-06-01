package com.gfs.backspaceinstring;

public class BackspacesInString {
    public String solution(final String input) {
        //        return arraySolution(input);
        //        return regexSolution(input);
        return indexSolution(input);
        //        return indexSolutionRecurse(input);
        //        return input.replace('#', (char)8);
    }

    /**
     * @param input
     */
    private String arraySolution(final String input) {
        final char[] chars = input.toCharArray();
        final char[] result = new char[chars.length];
        int backspaceCount = 0;
        int charIndex = chars.length - 1;
        for (int i = chars.length - 1; i > -1 && backspaceCount < i + 1; --i) {
            if (chars[i] == '#') {
                ++backspaceCount;
            } else if (backspaceCount > 0) {
                --backspaceCount;
            } else {
                result[charIndex] = chars[i];
                --charIndex;
            }
        }
        return String.valueOf(result, charIndex + 1, chars.length - 1 - charIndex);
    }

    private static String regexSolution(String input) {
        while (input.matches(".*#.*")) {
            input = input.replaceFirst(".?#", "");
        }
        return input;
    }

    private static String indexSolutionRecurse(final String input) {
        final int idx = input.indexOf("#");
        return idx < 0 ? input : idx == 0 ? indexSolution(input.substring(1)) : indexSolution(input.substring(0, idx - 1) + input.substring(idx + 1));
    }

    private static String indexSolution(final String input) {
        int idx = 0;
        final StringBuilder buffer = new StringBuilder(input);
        while ((idx = buffer.indexOf("#")) >= 0) {
            if (idx == 0) {
                buffer.deleteCharAt(0);
            } else {
                buffer.deleteCharAt(idx);
                buffer.deleteCharAt(idx - 1);
            }
        }
        return buffer.toString();
    }
}