package com.gfs.backspaceinstring;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BackspacesInString {

    public static String solution(final String testString) {
        StringBuilder builder = new StringBuilder(testString.length());
        for (char inputChar : testString.toCharArray()) {
            if (inputChar == '#') {
                if (builder.length() > 0) {
                    builder.deleteCharAt(builder.length() - 1);
                }
            } else {
                builder.append(inputChar);
            }
        }
        return builder.toString();
    }
}
