package com.gfs.backspaceinstring;

import java.lang.reflect.Field;

public class BackspacesInString {
    public String solution(final String input) {
        try {
            final Field field = String.class.getDeclaredField("value");
            field.setAccessible(true);
            final byte[] chars = (byte[]) field.get(input);
            int currChar = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 35) {
                    if (currChar > 0) {
                        currChar--;
                    }
                } else {
                    chars[currChar] = chars[i];
                    currChar++;
                }
            }
            return new String(chars, 0, currChar);
        } catch (final Exception thisIsAGoodIdea) {
            return "";
        }
    }
}
