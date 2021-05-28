package com.gfs.backspaceinstring;

public class BackspacesInString {
    public String solution(final String input) {
        final char[] chars = input.toCharArray();
        int backspaceCount = 0;
        int currChar = input.length();
        for (int i = currChar - 1; i >= 0; i--) {
            if (chars[i] == '#') {
                backspaceCount++;
            } else if (backspaceCount > 0) {
                backspaceCount--;
            } else {
                currChar--;
                if (currChar != i) {
                    chars[currChar] = chars[i];
                }
            }
        }
        return new String(chars, currChar, input.length() - currChar);
    }
}
