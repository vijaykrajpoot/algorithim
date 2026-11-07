package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

/**
 * 
 * Merge two given sorted array in a Single Array.
 * 
 * 
 * @author Vijay K Rajput
 *
 */
public class MergeTwoArray { // Defines the Java type that contains the related data and behavior.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    int[] arr1 = {1, 90}; // Stores the computed or supplied value in a variable for later use.
    int[] arr2 = {-1, 3, 5, 7, 9, 23, 56}; // Stores the computed or supplied value in a variable for later use.
    mergeArray(arr1, arr2); // Executes the current statement to update state or trigger the required behavior.
  } // Closes the current block and ends the active scope.

  static void mergeArray(int arr1[], int arr2[]) { // Defines the method that performs this unit of work for the class.
    int idx1 = 0, idx2 = 0, idx = 0; // Stores the computed or supplied value in a variable for later use.
    int arr3[] = new int[arr1.length + arr2.length]; // Executes the current statement to update state or trigger the required behavior.
    while (idx1 < arr1.length && idx2 < arr2.length) { // Keeps executing this block until the loop condition becomes false.
      if (arr1[idx1] < arr2[idx2]) { // Checks whether the condition is true before taking the matching action.
        arr3[idx++] = arr1[idx1++]; // Executes the current statement to update state or trigger the required behavior.
      } else { // Closes the current block and ends the active scope.
        arr3[idx++] = arr2[idx2++]; // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    for (int i = 0; i < arr3.length; i++) { // Repeats the loop body as long as the loop condition remains true.
      System.out.print(arr3[i] + ","); // Prints the value without moving to a new line.
    } // Closes the current block and ends the active scope.
    while (idx1 < arr1.length) { // Keeps executing this block until the loop condition becomes false.
      arr3[idx++] = arr1[idx1++]; // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.
    System.out.println(); // Prints the result to the console so the current state can be inspected.
    for (int i = 0; i < arr3.length; i++) { // Repeats the loop body as long as the loop condition remains true.
      System.out.print(arr3[i] + ","); // Prints the value without moving to a new line.
    } // Closes the current block and ends the active scope.
    System.out.println(); // Prints the result to the console so the current state can be inspected.
    while (idx2 < arr2.length) { // Keeps executing this block until the loop condition becomes false.
      arr3[idx++] = arr2[idx2++]; // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.

    for (int i = 0; i < arr3.length; i++) { // Repeats the loop body as long as the loop condition remains true.
      System.out.print(arr3[i] + ","); // Prints the value without moving to a new line.
    } // Closes the current block and ends the active scope.
  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
