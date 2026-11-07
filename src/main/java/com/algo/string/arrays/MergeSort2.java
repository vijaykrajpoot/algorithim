package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

public class MergeSort2 { // Defines the Java type that contains the related data and behavior.


  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    int arr[] = {50, 30, 10, 80, 40,-1 , 90,-200}; // Executes the current statement to update state or trigger the required behavior.

    MergeSort mergeSort = new MergeSort(); // Stores the computed or supplied value in a variable for later use.
    int[] m = mergeSort.mergeS(arr); // Stores the computed or supplied value in a variable for later use.

    for (int i = 0; i < m.length; i++) { // Repeats the loop body as long as the loop condition remains true.
      System.out.print(m[i] + ","); // Prints the value without moving to a new line.
    } // Closes the current block and ends the active scope.

  } // Closes the current block and ends the active scope.

  int[] mergeS(int arr[]) { // Defines the method that performs this unit of work for the class.

    int len = arr.length; // Stores the computed or supplied value in a variable for later use.
    if (len <= 1) { // Checks whether the condition is true before taking the matching action.
      return arr; // Returns the computed value to the caller and exits the method.

    } else { // Closes the current block and ends the active scope.



      int mid = len / 2; // Stores the computed or supplied value in a variable for later use.
      int remLen = len - mid; // Stores the computed or supplied value in a variable for later use.

      int arr1[] = new int[mid]; // Executes the current statement to update state or trigger the required behavior.
      int arr2[] = new int[remLen]; // Executes the current statement to update state or trigger the required behavior.

      System.arraycopy(arr, 0, arr1, 0, mid); // Executes the current statement to update state or trigger the required behavior.
      System.arraycopy(arr, mid, arr2, 0, remLen); // Executes the current statement to update state or trigger the required behavior.

      arr1 = mergeS(arr1); // Stores the computed or supplied value in a variable for later use.
      arr2 = mergeS(arr2); // Stores the computed or supplied value in a variable for later use.

      return merge(arr1, arr2); // Returns the computed value to the caller and exits the method.

    } // Closes the current block and ends the active scope.
  } // Closes the current block and ends the active scope.

  int[] merge(int arr1[], int arr2[]) { // Defines the method that performs this unit of work for the class.

    int len1 = arr1.length; // Stores the computed or supplied value in a variable for later use.
    int len2 = arr2.length; // Stores the computed or supplied value in a variable for later use.

    int arr[] = new int[len1 + len2]; // Executes the current statement to update state or trigger the required behavior.

    int idx1 = 0, idx2 = 0, idx = 0; // Stores the computed or supplied value in a variable for later use.

    while (idx1 < len1 && idx2 < len2) { // Keeps executing this block until the loop condition becomes false.

      if (arr1[idx1] < arr2[idx2]) { // Checks whether the condition is true before taking the matching action.
        arr[idx++] = arr1[idx1++]; // Executes the current statement to update state or trigger the required behavior.
      } else { // Closes the current block and ends the active scope.
        arr[idx++] = arr2[idx2++]; // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.

      while (idx1 < len1) { // Keeps executing this block until the loop condition becomes false.
        arr[idx++] = arr1[idx1++]; // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.

      while (idx2 < len2) { // Keeps executing this block until the loop condition becomes false.
        arr[idx++] = arr2[idx2++]; // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.

    } // Closes the current block and ends the active scope.
    return arr; // Returns the computed value to the caller and exits the method.

  } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
