package com.algo; // Declares the package so the class is organized under the correct Java namespace.

import java.util.ArrayList; // Imports the classes needed to support this file's logic.
import java.util.Arrays; // Imports the classes needed to support this file's logic.
import java.util.List; // Imports the classes needed to support this file's logic.

/**
 * 
 * Write a program that outputs the string representation of numbers from 1 to n.
 * 
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of
 * five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class FizzBuzz { // Defines the Java type that contains the related data and behavior.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    List<String> list = FizzBuzz.fizzBuzz(15); // Stores the computed or supplied value in a variable for later use.
    System.out.println(Arrays.toString(list.toArray())); // Prints the result to the console so the current state can be inspected.
  } // Closes the current block and ends the active scope.

  public static List<String> fizzBuzz(int n) { // Defines the method that performs this unit of work for the class.
    List<String> ll = new ArrayList<>(); // Stores the computed or supplied value in a variable for later use.
    for (int i = 1; i <= n; i++) { // Repeats the loop body as long as the loop condition remains true.
      if (i % 3 == 0 && i % 5 == 0) { // Checks whether the condition is true before taking the matching action.
        ll.add("FizzBuzz"); // Executes the current statement to update state or trigger the required behavior.
      } else if (i % 5 == 0) { // Closes the current block and ends the active scope.
        ll.add("Buzz"); // Executes the current statement to update state or trigger the required behavior.
      } else if (i % 3 == 0) { // Closes the current block and ends the active scope.
        ll.add("Fizz"); // Executes the current statement to update state or trigger the required behavior.
      } else { // Closes the current block and ends the active scope.
        ll.add(String.valueOf(i)); // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.
    return ll; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
