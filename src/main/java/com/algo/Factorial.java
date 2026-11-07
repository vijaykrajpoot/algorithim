package com.algo; // Declares the package so the class is organized under the correct Java namespace.

public class Factorial { // Defines the Java type that contains the related data and behavior.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    System.out.println(fact(5)); // Prints the result to the console so the current state can be inspected.
    // System.out.println("Long.MAX_VALUE:" + Long.MAX_VALUE);
    // System.out.println("Long.MIN_VALUE:" + Long.MIN_VALUE);
  } // Closes the current block and ends the active scope.

  static long fact(long n) { // Defines the method that performs this unit of work for the class.
    if (n == 1) { // Checks whether the condition is true before taking the matching action.
      return 1; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.
    return n * fact(n - 1); // Returns the computed value to the caller and exits the method.

  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
