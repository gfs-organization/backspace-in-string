package com.gfs.backspaceinstring;

import java.nio.charset.StandardCharsets;
import java.util.Stack;

public class BackspacesInString {
    public String solution(final String input) {
        Stack<Byte> result = new Stack<>();
        byte spaceChar = '#';
        for (byte aByte : input.getBytes(StandardCharsets.UTF_8)) {
            if (aByte == spaceChar) {
                if (result.size() > 0) {
                    result.pop();
                }
            } else {
                result.push(aByte);
            }
        }

        if (result.isEmpty()) {
            return "";
        }

        byte[] resultByte = new byte[result.size()];
        for (int i = result.size() - 1; i >= 0; i--) {
            resultByte[i] = result.pop();
        }

        return new String(resultByte);

    }
}
