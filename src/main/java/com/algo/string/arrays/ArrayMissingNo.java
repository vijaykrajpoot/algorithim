package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.ArrayList; // Imports the classes needed to support this file's logic.
import java.util.Arrays; // Imports the classes needed to support this file's logic.
import java.util.List; // Imports the classes needed to support this file's logic.

public class ArrayMissingNo { // Defines the Java type that contains the related data and behavior.
  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    int[] arr = {4, 3, 2, 7, 8, 2, 3, 1}; // Stores the computed or supplied value in a variable for later use.
    List<Integer> ll = ArrayMissingNo.getMissingNo(arr); // Stores the computed or supplied value in a variable for later use.
    if (ll.size() <= 0) { // Checks whether the condition is true before taking the matching action.
      System.out.println("No Missing"); // Prints the result to the console so the current state can be inspected.
    } else { // Closes the current block and ends the active scope.
      System.out.println("Missing Nos:" + Arrays.toString(ll.toArray())); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.
  } // Closes the current block and ends the active scope.

  public static List<Integer> getMissingNo(int arr[]) { // Defines the method that performs this unit of work for the class.
    System.out.println("arr.length:"+arr.length); // Prints the result to the console so the current state can be inspected.
    List<Integer> retList = new ArrayList<Integer>(arr.length); // Stores the computed or supplied value in a variable for later use.

    for (int i = 0; i < arr.length; i++) { // Repeats the loop body as long as the loop condition remains true.
      int index = Math.abs(arr[i]) - 1; // Stores the computed or supplied value in a variable for later use.
      System.out.println("Index:" + index); // Prints the result to the console so the current state can be inspected.
      if (arr[index] > 0) { // Checks whether the condition is true before taking the matching action.
        arr[index] = -arr[index]; // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    System.out.println(Arrays.toString(arr)); // Prints the result to the console so the current state can be inspected.
    for (int i = 0; i < arr.length; i++) { // Repeats the loop body as long as the loop condition remains true.
      if (arr[i] > 0) { // Checks whether the condition is true before taking the matching action.
        retList.add(i + 1); // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    return retList; // Returns the computed value to the caller and exits the method.

  } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
