package com.algo;
public class Recursion {
  public static void main(String[] args) {
    new Recursion().myMethod(4); // Creates a new object instance so the code can use that class's behavior.
    
  }
  void myMethod(int counter) {
    if (counter == 0)
      return; // Declares a variable to hold data needed by this method.
    else { // Runs this branch when the previous conditional check is false.
      System.out.println("hello" + counter);
      myMethod(--counter);
      System.out.println("" + counter);
      return; // Declares a variable to hold data needed by this method.
    }
  }
}