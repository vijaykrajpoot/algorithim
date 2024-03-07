package com.algo;

public class Factorial {

  public static void main(String[] args) {
    System.out.println(fact(5));
    // System.out.println("Long.MAX_VALUE:" + Long.MAX_VALUE);
    // System.out.println("Long.MIN_VALUE:" + Long.MIN_VALUE);
  }

  static long fact(long n) {
    if (n == 1) {
      return 1;
    }
    return n * fact(n - 1);

  }

}
