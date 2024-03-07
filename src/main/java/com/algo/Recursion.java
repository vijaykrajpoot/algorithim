package com.algo;

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
