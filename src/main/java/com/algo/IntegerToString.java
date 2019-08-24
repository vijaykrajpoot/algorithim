package com.algo;

public class IntegerToString {

  public static String convert(int number) {

    StringBuilder builder = new StringBuilder();
    boolean isNegative = false;

    if (number < 0) {
      isNegative = true;
      number = Math.abs(number);
    }
    while (number != 0) {
      int reminder = number % 10;
      number = number / 10;
      builder.append(reminder);
    }
    String st = builder.reverse().toString();
    if (isNegative) {
      st="-".concat(st);
    }

    return st;
  }


  public static void main(String[] args) {

    System.out.println(convert(5678));

  }

}
