package com.gfs.codechallenge;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringOrderCheck {

    public String solution(final String testString) {
        byte[] testStringBytes = testString.getBytes(StandardCharsets.US_ASCII);
        var resultBytes = new byte[testStringBytes.length];
        System.arraycopy(testStringBytes, 0, resultBytes, 0, testStringBytes.length); // Store byte copy to compare later.
        Arrays.sort(testStringBytes); // Internal java array sort lib uses merge sort so it's pretty fast
        if (Arrays.equals(testStringBytes, resultBytes)) {
            return "in order";
        } else {
            return new String(testStringBytes, StandardCharsets.US_ASCII);
        }
    }

}
