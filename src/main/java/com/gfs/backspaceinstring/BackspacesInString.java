package com.gfs.backspaceinstring;

public class BackspacesInString {
    public String solution(final String input) {
        final StringBuilder sb = new StringBuilder(input.length());
        int backspaceCount = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == '#') {
                backspaceCount++;
            } else if (backspaceCount > 0) {
                backspaceCount--;
            } else {
                sb.append(input.charAt(i));
            }
        }
        return sb.reverse().toString();
    }
}
