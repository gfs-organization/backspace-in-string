package com.gfs.backspaceinstring;

import java.nio.charset.StandardCharsets;

public class BackspacesInString {

    public String solution(final String input) {
        var inputBytes = input.getBytes(StandardCharsets.US_ASCII);
        var tempResult = new byte[input.length()];
        var stringIndex = 0;

        for (var i = 0; i < input.length(); i++) {
            stringIndex++; // Increase string index since we have a new char to look at

            // ASCII of # == 35
            if (inputBytes[i] == 35) {
                stringIndex--; // Backspace itself.
                if (stringIndex > 0) {
                    stringIndex--; // Delete previous char if index allows
                }
            } else {
                tempResult[stringIndex - 1] = inputBytes[i];
            }
        }

        var resultBytes = new byte[stringIndex];
        System.arraycopy(tempResult, 0, resultBytes, 0, stringIndex);

        return new String(resultBytes, StandardCharsets.US_ASCII);
    }
}
