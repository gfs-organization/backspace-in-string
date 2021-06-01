package com.gfs.backspaceinstring;

import java.lang.reflect.Field;

public class BackspacesInString {
    public String solution(final String input) {
        try {
            final Field field = String.class.getDeclaredField("value");
            field.setAccessible(true);
            final byte[] chars = (byte[]) field.get(input);
            int backspaceCount = 0;
            int currChar = input.length();
            for (int i = currChar - 1; i >= 0; i--) {
                if (chars[i] == 35) {
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
            for (int i = 0; i < currChar; i++) {
                chars[i] = '#';
            }
            return new String(chars, currChar, input.length() - currChar);
        } catch (final Exception thisIsAGoodIdea) {
            return "";
        }
    }
}
