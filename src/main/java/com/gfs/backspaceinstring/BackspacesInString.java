package com.gfs.backspaceinstring;

import java.util.Iterator;
import java.util.Stack;

public class BackspacesInString {
    private static char BACK_SPACE = '#';

    public String solution(final String inputString) {

        final Stack stack = stringAfterBackSpaces(inputString);

        final Iterator itr = stack.iterator();
        final char[] charArray = new char[stack.size()];
        int count = 0;
        while (itr.hasNext()) {
            charArray[count++] = (char) itr.next();
        }
        return String.valueOf(charArray);
    }

    private static Stack stringAfterBackSpaces(final String input) {
        final Stack stack = new Stack();
        for (char c : input.toCharArray()) {
            if (c == BACK_SPACE) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        return stack;
    }
}