package com.gfs.backspaceinstring;

public class BackspacesInString {
    public String solution(final String input) {
        return arraySolution(input);
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
}
