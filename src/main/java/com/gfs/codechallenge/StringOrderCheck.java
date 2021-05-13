package com.gfs.codechallenge;

import java.util.Arrays;

public class StringOrderCheck {

    public String solution(final String testString) {
        final char[] chars = testString.toCharArray();

        for (int x = 0; x < chars.length; x++) {
            for (int y = x + 1; y < chars.length; y++) {
                char current = chars[x];
                char next = chars[y];
                if (current > next) {
                    chars[x] = next;
                    chars[y] = current;
                }
            }
        }

        if (testString.equals(new String(chars))) {
            return "in order";
        }

        return new String(chars);
    }

    public String jeremySolution(final String testString) {
        char[] stringChars = testString.toCharArray();
        char[] copy = Arrays.copyOf(stringChars, stringChars.length);
        Arrays.sort(stringChars);
        if (Arrays.equals(stringChars, copy)) {
            return "in order";
        }
        return new String(stringChars);
    }
}