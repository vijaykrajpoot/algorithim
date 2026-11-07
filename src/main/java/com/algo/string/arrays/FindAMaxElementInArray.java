package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Arrays; // Imports the classes needed to support this file's logic.
import java.util.Random; // Imports the classes needed to support this file's logic.

public class FindAMaxElementInArray { // Defines the Java type that contains the related data and behavior.

  private static int LIMIT = 10; // Stores the computed or supplied value in a variable for later use.


  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.


    System.out.println(); // Prints the result to the console so the current state can be inspected.

    long startTime = System.nanoTime(); // Stores the computed or supplied value in a variable for later use.
    int[] arr = getIntegerArray(); // Stores the computed or supplied value in a variable for later use.
    System.out.println("Array :" + Arrays.toString(arr) + "   Length:" + arr.length); // Prints the result to the console so the current state can be inspected.
    System.out.flush(); // Executes the current statement to update state or trigger the required behavior.
    int maxNumber = FindAMaxElementInArray.findMaxelementSolutuon1(arr); // Stores the computed or supplied value in a variable for later use.
    long endTime = System.nanoTime(); // Stores the computed or supplied value in a variable for later use.
    long duration = (endTime - startTime) / 1000000; // Stores the computed or supplied value in a variable for later use.
    System.out.println("findMaxElementSolutuon1: TimeSpend:" + duration + " maxNumber: " + maxNumber); // Prints the result to the console so the current state can be inspected.
    System.out.flush(); // Executes the current statement to update state or trigger the required behavior.
    // System.out.println("#######################");
    // System.out.flush();
    startTime = System.nanoTime(); // Stores the computed or supplied value in a variable for later use.
    FindAMaxElementInArray.findMaxelementSolutuon2(arr); // Executes the current statement to update state or trigger the required behavior.
    endTime = System.nanoTime(); // Stores the computed or supplied value in a variable for later use.
    duration = (endTime - startTime) / 1000000; // Stores the computed or supplied value in a variable for later use.
    System.out.println("findMaxelementSolutuon2 TimeSpend:" + duration + " maxNumber: " + maxNumber); // Prints the result to the console so the current state can be inspected.
    System.out.flush(); // Executes the current statement to update state or trigger the required behavior.
  } // Closes the current block and ends the active scope.



  private static int[] getIntegerArray() { // Defines the method that performs this unit of work for the class.
    Random random = new Random(); // Stores the computed or supplied value in a variable for later use.
    int[] arr = new int[LIMIT]; // Stores the computed or supplied value in a variable for later use.
    for (int i = 0; i < LIMIT; i++) { // Repeats the loop body as long as the loop condition remains true.
      int num = random.nextInt(100); // Stores the computed or supplied value in a variable for later use.
      // System.out.println("[" + i + "]:" + num);
      arr[i] = num; // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.
    return arr; // Returns the computed value to the caller and exits the method.

  } // Closes the current block and ends the active scope.

  /**
   * O(N)
   * 
   * @param arr
   * @return
   */
  public static int findMaxelementSolutuon1(int arr[]) { // Defines the method that performs this unit of work for the class.

    if (arr.length <= 0) { // Checks whether the condition is true before taking the matching action.
      return -1; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.
    int element = arr[0]; // Stores the computed or supplied value in a variable for later use.

    for (int num : arr) { // Repeats the loop body as long as the loop condition remains true.
      if (num > element) { // Checks whether the condition is true before taking the matching action.
        element = num; // Stores the computed or supplied value in a variable for later use.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.
    return element; // Returns the computed value to the caller and exits the method.

  } // Closes the current block and ends the active scope.

  /**
   * O(N2)
   * 
   * @param arr
   * @return
   */

  public static int findMaxelementSolutuon2(int arr[]) { // Defines the method that performs this unit of work for the class.
    int countJ = 0, countI = 0; // Stores the computed or supplied value in a variable for later use.
    if (arr.length <= 0) { // Checks whether the condition is true before taking the matching action.
      return -1; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.
    int i, j = 0; // Stores the computed or supplied value in a variable for later use.
    int len = arr.length - 1; // Stores the computed or supplied value in a variable for later use.

    boolean isMax = true; // Stores the computed or supplied value in a variable for later use.
    for (i = len; i > 0; i--) { // Repeats the loop body as long as the loop condition remains true.
      for (j = 0; j < len; j++) { // Repeats the loop body as long as the loop condition remains true.
        System.out.println("arr [j=" + j + "] :" + arr[j] + "   " + " arr[i=" + i + "]:" + arr[i]); // Prints the result to the console so the current state can be inspected.
        if (arr[j] > arr[i]) { // Checks whether the condition is true before taking the matching action.
          isMax = false; // Stores the computed or supplied value in a variable for later use.
          countJ++; // Executes the current statement to update state or trigger the required behavior.
          break; // Exits the current loop or switch branch immediately.
        } // Closes the current block and ends the active scope.
      } // Closes the current block and ends the active scope.
      countI++; // Executes the current statement to update state or trigger the required behavior.
      if (isMax) // Checks whether the condition is true before taking the matching action.
        break; // Exits the current loop or switch branch immediately.
    } // Closes the current block and ends the active scope.

    // System.out.flush();
    return arr[i]; // Returns the computed value to the caller and exits the method.

  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
