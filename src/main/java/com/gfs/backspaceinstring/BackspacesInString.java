package com.gfs.backspaceinstring;

import java.util.ArrayList;
import java.util.List;

public class BackspacesInString {

    public String solution(final String input) {
        List<Character> arrayList = convertStringToCharList(input);

        while (arrayList.contains('#')) {
            // Remove the '#' that is closest to the front of the array
            int nextBackspaceIndex = arrayList.indexOf('#');
            arrayList.remove(nextBackspaceIndex);

            // Find and remove the closest non '#' char on the left side of the '#' that just got removed
            for (int i = nextBackspaceIndex - 1; i >= 0; i--) {
                if (arrayList.get(i) != '#') {
                    arrayList.remove(i);
                    break;
                }
            }
        }

        return arrayList.toString();
    }

    public static List<Character> convertStringToCharList(String input) {
        List<Character> charList = new ArrayList<>();

        for (char ch : input.toCharArray()) {
            charList.add(ch);
        }

        return charList;
    }
}
