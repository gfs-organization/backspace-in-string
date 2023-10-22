package com.code.challenge;

public class RedoBackspaceInString {

  public String solution(String target) {
    StringBuilder sb = new StringBuilder();
    int backspaceCount = 0;
    for (int i = target.length() - 1; i >= 0; i--) {
      if (target.charAt(i) == '#') {
        backspaceCount++;
      } else {
        if (backspaceCount > 0) {
          backspaceCount--;
        } else {
          sb.append(target.charAt(i));
        }
      }
    }
    return sb.reverse().toString();
  }

}
