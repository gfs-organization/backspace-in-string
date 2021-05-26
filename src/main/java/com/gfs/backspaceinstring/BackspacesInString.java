package com.gfs.backspaceinstring;

public class BackspacesInString {

    public String solution(final String input) {
        var skip = 0;
        var outputBuilder = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            var character = input.charAt(i);

            if (character == '#') {
                skip++;
            } else if (skip > 0) {
                skip--;
            } else {
                outputBuilder.append(character);
            }
        }

        return outputBuilder.reverse().toString();
    }

}
