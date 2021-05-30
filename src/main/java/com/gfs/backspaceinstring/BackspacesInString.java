package com.gfs.backspaceinstring;

public class BackspacesInString {
    public String solution(final String input) {
        char[] chars = input.toCharArray();
        int y = 0;
        int length = input.length();
        char[] result = new char[length];
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar == '#') {
                if (y > 0) {
                    y--;
                }
            } else {
                result[y] = aChar;
                y++;
            }
        }
        return String.valueOf(result, 0, y);
    }
}
