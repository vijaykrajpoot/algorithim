package com.algo;
// Logic: Solves the recursion problem by processing the input data, applying the required algorithmic rule, and returning the expected result.


public class Recursion {

  public static void main(String[] args) {
    new Recursion().myMethod(4);
  }
  void myMethod(int counter) {
    if (counter == 0)
      return;
    else {
      System.out.println("hello" + counter);
      myMethod(--counter);
      System.out.println("" + counter);
      return;
    }
  }
}