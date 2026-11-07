package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

public class BinarySearch { // Defines the Java type that contains the related data and behavior.

  public static boolean search(int arr[], int num) { // Defines the method that performs this unit of work for the class.
    if (arr == null || arr.length == 0) { // Checks whether the condition is true before taking the matching action.
      throw new IllegalArgumentException("Input is Empty || Null"); // Raises an exception to signal an invalid or unexpected condition.
    } // Closes the current block and ends the active scope.
    return s(arr, num, 0, arr.length) > -1; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

  private static int s(int arr[], int num, int start, int length) { // Defines the method that performs this unit of work for the class.
    int mid = (start + length) / 2; // Stores the computed or supplied value in a variable for later use.
    int idx = -1; // Stores the computed or supplied value in a variable for later use.

    if (mid < 0 || mid >= length) // Checks whether the condition is true before taking the matching action.
      return idx; // Returns the computed value to the caller and exits the method.

    if (arr[mid] == num) // Checks whether the condition is true before taking the matching action.
      return mid; // Returns the computed value to the caller and exits the method.

    if (arr[mid] > num) { // Checks whether the condition is true before taking the matching action.
      idx = s(arr, num, 0, mid); // Stores the computed or supplied value in a variable for later use.
    } else { // Closes the current block and ends the active scope.
      idx = s(arr, num, mid + 1, length); // Stores the computed or supplied value in a variable for later use.
    } // Closes the current block and ends the active scope.

    return idx; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Executes the current statement to update state or trigger the required behavior.
    System.out.println(ArrayBinarySearch.search(arr, -2)); // Prints the result to the console so the current state can be inspected.
  } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
