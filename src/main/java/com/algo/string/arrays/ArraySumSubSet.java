package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.HashMap; // Imports the classes needed to support this file's logic.

/**
 * find all the pairs of two integers in an unsorted array that sum up to a given S.
 * 
 * For example, if the array is [3, 5, 2, -4, 8, 11] and the sum is 7, your program should return
 * [[11, -4], [2, 5]] because 11 + -4 = 7 and 2 + 5 = 7.
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class ArraySumSubSet { // Defines the Java type that contains the related data and behavior.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

    int arr[] = {10, 20, 30, 40, 50, 60}; // Executes the current statement to update state or trigger the required behavior.
    int sum = 50; // Stores the computed or supplied value in a variable for later use.
    printSumSubset(arr, sum); // Executes the current statement to update state or trigger the required behavior.

    System.out.println("=========================="); // Prints the result to the console so the current state can be inspected.
    int arr1[] = {3, 5, 2, -4, 8, 11}; // Executes the current statement to update state or trigger the required behavior.
    printSumSubset(arr1, 7); // Executes the current statement to update state or trigger the required behavior.

    System.out.println("=========================="); // Prints the result to the console so the current state can be inspected.
    
    
    int arr2[] = {10,1,2,7,6,1,5}; // Executes the current statement to update state or trigger the required behavior.
    printSumSubset(arr2, 8); // Executes the current statement to update state or trigger the required behavior.

  } // Closes the current block and ends the active scope.

  /**
   * 
   * Add Item to Hashmap and see of the difference of that number from sum is there in that array or
   * not.
   * 
   * @param arr
   * @param sum
   */
  static void printSumSubset(int arr[], int sum) { // Defines the method that performs this unit of work for the class.

    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>(); // Stores the computed or supplied value in a variable for later use.
    for (int i : arr) { // Repeats the loop body as long as the loop condition remains true.
      hashMap.put(i, i); // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.
    for (int i = 0; i < arr.length; i++) { // Repeats the loop body as long as the loop condition remains true.
      int temp = sum - arr[i]; // Stores the computed or supplied value in a variable for later use.
      if (hashMap.containsValue(temp)) { // Checks whether the condition is true before taking the matching action.
        System.out.println("(" + arr[i] + "," + temp + ")"); // Prints the result to the console so the current state can be inspected.
        // Removed element to avoid same pair in different order
        hashMap.remove(arr[i]); // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.
  } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
