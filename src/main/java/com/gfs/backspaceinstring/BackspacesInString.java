package com.gfs.backspaceinstring;

public class BackspacesInString {

    public String solution(final String input) {
        var tempResult = new char[input.length()];
        var stringIndex = 0;

        for (var i = 0; i < input.length(); i++) {

            // ASCII of # == 35
            if (input.charAt(i) == '#') {
                if (stringIndex > 0) {
                    stringIndex--; // Delete previous char if index allows
                }
            } else {
                tempResult[stringIndex] = input.charAt(i);
                stringIndex++; // Increase string index since we have a new char to look at
            }
        }
        return String.valueOf(tempResult, 0, stringIndex);
    }
}
