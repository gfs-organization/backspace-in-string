package com.gfs.backspaceinstring;

import java.util.HashMap;

public class BackspacesInString {
    private static final HashMap<String, String> seenStrings = new HashMap<>();

    public String solution(final String testString) {
        return seenStrings.computeIfAbsent(testString, s -> {
            byte[] bytes = s.getBytes();
            for (int i = 0; i < bytes.length; i++) {
                if (bytes[i] == 35) {
                    bytes[i] = 8;
                }
            }
            return new String(bytes);
        });
    }
}
