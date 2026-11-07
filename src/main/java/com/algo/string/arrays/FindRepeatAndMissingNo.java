package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Arrays; // Imports the classes needed to support this file's logic.

/**
 * 
 * 
 * You are given a read only array of n integers from 1 to n.
 * 
 * Each integer appears exactly once except A which appears twice and B which is missing.
 * 
 * Return A and B.
 * 
 * Note: Your algorithm should have a linear runtime complexity. Could you implement it without
 * using extra memory?
 * 
 * Note that in your output A should precede B.
 * 
 * 
 * Input:[3 1 2 5 3]
 * 
 * Output:[3, 4]
 * 
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class FindRepeatAndMissingNo { // Defines the Java type that contains the related data and behavior.


  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

    int arr[] = {4, 3, 6, 2, 1, 1}; // Executes the current statement to update state or trigger the required behavior.
    int[] arrResult = findAndRepeat(arr); // Stores the computed or supplied value in a variable for later use.

    for (int i : arrResult) { // Repeats the loop body as long as the loop condition remains true.
      System.out.println(i); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.

  } // Closes the current block and ends the active scope.

  public static int[] findAndRepeat(int arr[]) { // Defines the method that performs this unit of work for the class.
    int[] retArr = new int[2]; // Stores the computed or supplied value in a variable for later use.
    Arrays.sort(arr); // Executes the current statement to update state or trigger the required behavior.

    for (int i = 0; i < arr.length; i++) { // Repeats the loop body as long as the loop condition remains true.

      if (i < arr.length - 1 && arr[i + 1] - arr[i] == 0) { // Checks whether the condition is true before taking the matching action.
        retArr[0] = arr[i]; // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.

      if (i < arr.length - 1 && arr[i + 1] - arr[i] == 2) { // Checks whether the condition is true before taking the matching action.
        retArr[1] = arr[i] + 1; // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    System.out.println("Missing:" + retArr[1] + "  Repeat:" + retArr[0]); // Prints the result to the console so the current state can be inspected.

    return retArr; // Returns the computed value to the caller and exits the method.

  } // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
