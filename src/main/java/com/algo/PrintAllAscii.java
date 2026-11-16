package com.algo;


// Logic: processes the print all ascii problem by transforming the input according to the algorithm and returning the required result.
public class PrintAllAscii {

  public static void main(String[] args) {
    for (int i = 0; i < 255; i++) {
      System.out.println("Ascii Value of [" + i + "]:" + (char) i);
    }
  }
}
