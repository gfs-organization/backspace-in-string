package com.gfs.backspaceinstring;

public class BackspacesInString {

    public String solution(final String input) {
        BackspaceContext backspaceContext = new BackspaceContext(input.length());
        input.chars().forEach((x) -> backspaceContext.process(x));
        return new String(backspaceContext.buffer, 0, backspaceContext.bufferLength);
    }

    public static class BackspaceContext {
        private final int[] buffer;
        private int bufferLength = 0;

        public BackspaceContext(int capacity) {
            buffer = new int[capacity];
        }

        public void process(int value) {
            if (value == '#') {
                if (bufferLength > 0) {
                    bufferLength--;
                }
            } else {
                buffer[bufferLength++] = value;
            }
        }
    }
}
