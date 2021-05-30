package com.gfs.backspaceinstring;

public class BackspacesInString {

    public String solution(final String input) {
        char[] result = new char[input.length()];
        char[] chars = input.toCharArray();
        int y = 0;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar == '#' && y > 0) {
                y--;
            } else if (aChar != '#') {
                result[y] = aChar;
                y++;
            }
        }
        return String.valueOf(result, 0, y);
    }
}
