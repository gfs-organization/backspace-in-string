package com.gfs.backspaceinstring;

public class BackspacesInString {
    public String solution(final String testString) {
        return removeBackspaces(testString);
    }

    private String removeBackspaces(String testString) {
        char[] charArray = testString.toCharArray();
        int charsToDelete = 0;

        for (int i = charArray.length - 1; i >= 0; i--) {
            char c = charArray[i];
            if (c == '#') {
                charsToDelete++;
                charArray[i] = '\u0000';
            } else if (charsToDelete > 0) {
                charsToDelete--;
                charArray[i] = '\u0000';
            } else {
                charArray[i] = c;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : charArray) {
            if (c != '\u0000') {
                sb = sb.append(c);
            }
        }

        return sb.toString();
    }
}