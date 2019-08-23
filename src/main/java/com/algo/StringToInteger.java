package com.algo;

public class StringToInteger {

  static long convertToInt(String str) {
    long finalNumber = 0;
    int len = str.length();
    for (int i = 0; i < len; i++) {
      int num = str.charAt(i) - 48;
      finalNumber = (long) (finalNumber + (num * Math.pow(10, (len - 1 - i))));
    }
    return finalNumber;
  }

  static long convertToIntSol2(String str) {
    long finalNumber = 0;
    int len = str.length();
    int multiplyer = 1;
    for (int i = len - 1; i >= 0; i--) {
      int num = str.charAt(i) - 48;
      finalNumber = finalNumber + num * (multiplyer);
      multiplyer = multiplyer * 10;
    }

    return finalNumber;
  }

  public static void main(String[] args) {
    System.out.println(convertToIntSol2("76876"));
  }
}
