package com.algo; // Declares the package so the class is organized under the correct Java namespace.

import java.util.ArrayList; // Imports the classes needed to support this file's logic.
import java.util.Arrays; // Imports the classes needed to support this file's logic.
import java.util.List; // Imports the classes needed to support this file's logic.

/**
 * 
 * Find all the factors of a given number
 * 
 * @author Vijay Kumar Rajput
 *
 */

public class FactorsOfANumber { // Defines the Java type that contains the related data and behavior.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    List<Integer> ll = FactorsOfANumber.findFactors(100000); // Stores the computed or supplied value in a variable for later use.

    System.out.println(Arrays.toString(ll.toArray())); // Prints the result to the console so the current state can be inspected.

  } // Closes the current block and ends the active scope.

  static List<Integer> findFactors(int number) { // Defines the method that performs this unit of work for the class.

    List<Integer> factorList = new ArrayList<Integer>(); // Stores the computed or supplied value in a variable for later use.

    for (int i = 1; i <= number; i++) { // Repeats the loop body as long as the loop condition remains true.
      if ((number % i) == 0) { // Checks whether the condition is true before taking the matching action.
        factorList.add(i); // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.
    return factorList; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
