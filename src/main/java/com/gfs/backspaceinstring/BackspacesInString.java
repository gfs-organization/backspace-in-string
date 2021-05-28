package com.gfs.backspaceinstring;

public class BackspacesInString {

    public String solution(final String input) {
        Character[] temp = new Character[input.length()];

        int currentIndex = 0;
        char[] inputArray = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            char currentCharacter = inputArray[i];
            if (currentCharacter == '#') {
                //Don't need to actually delete the character, just move back and overwrite it later if necessary
                currentIndex = Math.max(currentIndex - 1, 0);
            } else {
                temp[currentIndex] = currentCharacter;
                currentIndex++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < currentIndex; i++) {
            //The array could be huge, but if our index is at 0 it won't print.
            sb.append(temp[i]);
        }

        return sb.toString();
    }
}
