package com.algo; // Declares the package so the class is organized under the correct Java namespace.

public class IntegerToString { // Defines the Java type that contains the related data and behavior.

  public static String convert(int number) { // Defines the method that performs this unit of work for the class.

    StringBuilder builder = new StringBuilder(); // Stores the computed or supplied value in a variable for later use.
    boolean isNegative = false; // Stores the computed or supplied value in a variable for later use.

    if (number < 0) { // Checks whether the condition is true before taking the matching action.
      isNegative = true; // Stores the computed or supplied value in a variable for later use.
      number = Math.abs(number); // Stores the computed or supplied value in a variable for later use.
    } // Closes the current block and ends the active scope.
    while (number != 0) { // Keeps executing this block until the loop condition becomes false.
      int reminder = number % 10; // Stores the computed or supplied value in a variable for later use.
      number = number / 10; // Stores the computed or supplied value in a variable for later use.
      builder.append(reminder); // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.
    String st = builder.reverse().toString(); // Stores the computed or supplied value in a variable for later use.
    if (isNegative) { // Checks whether the condition is true before taking the matching action.
      st = "-".concat(st); // Stores the computed or supplied value in a variable for later use.
    } // Closes the current block and ends the active scope.

    return st; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.


  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

    System.out.println(convert(5678)); // Prints the result to the console so the current state can be inspected.

  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
