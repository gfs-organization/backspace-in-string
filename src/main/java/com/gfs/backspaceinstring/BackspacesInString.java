package com.gfs.backspaceinstring;

public class BackspacesInString {

    public String solution(final String testString) {
        StringBuilder output = new StringBuilder(testString);
        for (int nextBackspace = output.indexOf("#"); nextBackspace != -1; nextBackspace = output.indexOf("#")) {
            output.delete(Math.max(0, nextBackspace - 1), nextBackspace + 1);
        }
        return output.toString();
    }

}
