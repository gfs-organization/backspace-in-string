package com.gfs.backspaceinstring;

import java.util.HashSet;
import java.util.Set;

public class BackspacesInString {

    public String solution(final String input) {
        StringBuilder sb = new StringBuilder(input.length());

        int index = input.indexOf('#');
        Set<Integer> backspaceIndexes = new HashSet<>(input.length());
        while (index >= 0) {
            backspaceIndexes.add(index);
            index = input.indexOf('#', index + 1);
        }
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (sb.length() > 0 && backspaceIndexes.contains(i)) {
                sb.deleteCharAt(sb.length() - 1);
            } else if (chars[i] == '#') {
                continue;
            } else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
