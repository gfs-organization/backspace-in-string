package com.code.challenge.benchmark;

public class RandomStringUtil {

  private static final String ALPHA_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";
  private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
      + "0123456789"
      + "abcdefghijklmnopqrstuvxyz";

  public static String replaceRandomString(String input) {
    final int inputLength = input.length();
    final StringBuilder sb = new StringBuilder(inputLength);

    for (int i = 0; i < inputLength; i++) {

      if (Character.isLetter(input.charAt(i))) {
        int index = (int) (ALPHA_STRING.length() * Math.random());
        sb.append(ALPHA_STRING.charAt(index));
      } else {
        sb.append(input.charAt(i));
      }
    }

    return sb.toString();
  }

  public static String generateRandomString(int length) {
    StringBuilder sb = new StringBuilder(length);

    for (int i = length; i > 0; i--) {
      int index = (int) (ALPHA_NUMERIC_STRING.length() * Math.random());
      sb.append(ALPHA_NUMERIC_STRING.charAt(index));
    }

    return sb.toString();
  }
}
