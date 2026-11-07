package com.algo;
// Logic: Solves the print all ascii problem by processing the input data, applying the required algorithmic rule, and returning the expected result.


public class PrintAllAscii {

  public static void main(String[] args) {
    for (int i = 0; i < 255; i++) {
      System.out.println("Ascii Value of [" + i + "]:" + (char) i);
    }
  }
}