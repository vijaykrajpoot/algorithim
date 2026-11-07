package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.lang.reflect.Array; // Imports the classes needed to support this file's logic.
import java.util.Arrays; // Imports the classes needed to support this file's logic.
import java.util.LinkedList; // Imports the classes needed to support this file's logic.
import java.util.List; // Imports the classes needed to support this file's logic.

/**
 * 
 * Find the contiguous subarray within an array (containing at least one number) which has the
 * largest sum.
 * 
 * For example:
 * 
 * Given the array [-2,1,-3,4,-1,2,1,-5,4],
 * 
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * 
 * For this problem, return the maximum sum.
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class MaxSumContiguousSubarray { // Defines the Java type that contains the related data and behavior.


  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Stores the computed or supplied value in a variable for later use.
    System.out.println("LaargestSum of " + Arrays.toString(arr) + " is " + findLargestSumOfSubArray(arr)); // Prints the result to the console so the current state can be inspected.

    int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Stores the computed or supplied value in a variable for later use.
    System.out.println("LaargestSum of " + Arrays.toString(arr1) + " is " + findLargestSumOfSubArray(arr1)); // Prints the result to the console so the current state can be inspected.

    int[] arr2 = {-1, -2, -3, 4, -5, -6, -7, -8, -9}; // Stores the computed or supplied value in a variable for later use.
    System.out.println("LaargestSum of " + Arrays.toString(arr2) + " is " + findLargestSumOfSubArray(arr2)); // Prints the result to the console so the current state can be inspected.

    int[] arr3 = {-163, -20}; // Stores the computed or supplied value in a variable for later use.
    System.out.println("LaargestSum of " + Arrays.toString(arr3) + " is " + findLargestSumOfSubArray(arr3)); // Prints the result to the console so the current state can be inspected.

  } // Closes the current block and ends the active scope.

  public static int findLargestSumOfSubArray(int[] arr) { // Defines the method that performs this unit of work for the class.

    int currentSum = 0; // Stores the computed or supplied value in a variable for later use.
    int finalSum = 0; // Stores the computed or supplied value in a variable for later use.

    for (int element : arr) { // Repeats the loop body as long as the loop condition remains true.
      currentSum = currentSum + element; // Stores the computed or supplied value in a variable for later use.
      if (currentSum < 0) { // Checks whether the condition is true before taking the matching action.
        currentSum = 0; // Stores the computed or supplied value in a variable for later use.
      } else if (finalSum < currentSum) { // Closes the current block and ends the active scope.
        finalSum = currentSum; // Stores the computed or supplied value in a variable for later use.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.
    return finalSum; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
