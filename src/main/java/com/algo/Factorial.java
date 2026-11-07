package com.algo;
// Logic: Builds the result from smaller known values using recurrence or iterative accumulation.


public class Factorial {

  public static void main(String[] args) {
    System.out.println(fact(5));
  }
  static long fact(long n) {
    if (n == 1) {
      return 1;
    }
    return n * fact(n - 1);
  }
}