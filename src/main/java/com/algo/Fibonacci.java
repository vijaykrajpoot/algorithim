package com.algo; // Declares the package so the class is organized under the correct Java namespace.

public class Fibonacci { // Defines the Java type that contains the related data and behavior.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    System.out.println("Fibonacci.fibonacci(10):" + Fibonacci.fibonacci(10)); // Prints the result to the console so the current state can be inspected.

    System.out.print("Fibonacci.fibonacciRecursion(10):"); // Prints the value without moving to a new line.
    Fibonacci.fibonacciRecursion(10); // Executes the current statement to update state or trigger the required behavior.
    System.out.println(); // Prints the result to the console so the current state can be inspected.
    System.out.print("Fibonacci.fibonacciItrative(10):"); // Prints the value without moving to a new line.
    Fibonacci.fibonacciItrative(10); // Executes the current statement to update state or trigger the required behavior.

  } // Closes the current block and ends the active scope.

  public static int fibonacci(int n) { // Defines the method that performs this unit of work for the class.

    if (n == 0 || n == 1) // Checks whether the condition is true before taking the matching action.
      return n; // Returns the computed value to the caller and exits the method.

    return fibonacci(n - 1) + fibonacci(n - 2); // Returns the computed value to the caller and exits the method.

  } // Closes the current block and ends the active scope.

  public static void fibonacciItrative(int n) { // Defines the method that performs this unit of work for the class.
    int n1 = 0; // Stores the computed or supplied value in a variable for later use.
    int n2 = 1; // Stores the computed or supplied value in a variable for later use.
    int n3 = 0; // Stores the computed or supplied value in a variable for later use.

    for (int i = 2; i <= n; i++) { // Repeats the loop body as long as the loop condition remains true.
      n3 = n1 + n2; // Stores the computed or supplied value in a variable for later use.
      System.out.print(n3 + " "); // Prints the value without moving to a new line.
      n1 = n2; // Stores the computed or supplied value in a variable for later use.
      n2 = n3; // Stores the computed or supplied value in a variable for later use.
    } // Closes the current block and ends the active scope.
  } // Closes the current block and ends the active scope.

  static int n1 = 0; // Stores the computed or supplied value in a variable for later use.
  static int n2 = 1; // Stores the computed or supplied value in a variable for later use.
  static int n3 = 0; // Stores the computed or supplied value in a variable for later use.


  public static void fibonacciRecursion(int n) { // Defines the method that performs this unit of work for the class.

    if (n <= 0) { // Checks whether the condition is true before taking the matching action.
      return; // Declares a variable to hold data needed by this method.
    } // Closes the current block and ends the active scope.
    n1 = n2; // Stores the computed or supplied value in a variable for later use.
    n2 = n3; // Stores the computed or supplied value in a variable for later use.
    n3 = n1 + n2; // Stores the computed or supplied value in a variable for later use.
    System.out.print(n3 + " "); // Prints the value without moving to a new line.

    fibonacciRecursion(n - 1); // Executes the current statement to update state or trigger the required behavior.
  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
