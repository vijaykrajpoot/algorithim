package com.algo; // Declares the package so the class is organized under the correct Java namespace.

public class Recursion { // Defines the Java type that contains the related data and behavior.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    new Recursion().myMethod(4); // Creates a new object instance so the code can use that class's behavior.
    
  } // Closes the current block and ends the active scope.
  
  void myMethod(int counter) { // Defines the method that performs this unit of work for the class.
    if (counter == 0) // Checks whether the condition is true before taking the matching action.
      return; // Declares a variable to hold data needed by this method.
    else { // Runs this branch when the previous conditional check is false.
      System.out.println("hello" + counter); // Prints the result to the console so the current state can be inspected.
      myMethod(--counter); // Executes the current statement to update state or trigger the required behavior.
      System.out.println("" + counter); // Prints the result to the console so the current state can be inspected.
      return; // Declares a variable to hold data needed by this method.
    } // Closes the current block and ends the active scope.
  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
