package com.gfs.backspaceinstring;

public class BackspacesInString {
    public String solution(final String input) {
        char[] output = new char[input.length()];

        int currentIndex = 0;
        char[] inputArray = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            char currentCharacter = inputArray[i];
            if (currentCharacter == '#') {
                //Don't need to actually delete the character, just move back and overwrite it later if necessary
                currentIndex = Math.max(currentIndex - 1, 0);
            } else {
                output[currentIndex] = currentCharacter;
                currentIndex++;
            }
        }

        return String.valueOf(output, 0, currentIndex);
    }
}
