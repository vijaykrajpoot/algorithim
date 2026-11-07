package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

/**
 * 
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the
 * resulting image.
 * 
 * To flip an image horizontally means that each row of the image is reversed. For example, flipping
 * [1, 1, 0] horizontally results in [0, 1, 1].
 * 
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example,
 * inverting [0, 1, 1] results in [1, 0, 0].
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class FlipAnImage { // Defines the Java type that contains the related data and behavior.
  int arr[][] = new int[20][20]; // Executes the current statement to update state or trigger the required behavior.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    int arr[][] = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}}; // Executes the current statement to update state or trigger the required behavior.
    System.out.print("Actual :"); // Prints the value without moving to a new line.
    FlipAnImage.display(arr); // Executes the current statement to update state or trigger the required behavior.

    System.out.print("Reverse&Flip:"); // Prints the value without moving to a new line.
    FlipAnImage.flipAndReverse(arr); // Executes the current statement to update state or trigger the required behavior.
    FlipAnImage.display(arr); // Executes the current statement to update state or trigger the required behavior.

    System.out.println("############################################"); // Prints the result to the console so the current state can be inspected.

    int arr1[][] = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}}; // Executes the current statement to update state or trigger the required behavior.
    System.out.print("Actual :"); // Prints the value without moving to a new line.
    FlipAnImage.display(arr1); // Executes the current statement to update state or trigger the required behavior.

    System.out.print("Reverse&Flip:"); // Prints the value without moving to a new line.
    FlipAnImage.flipAndReverse(arr1); // Executes the current statement to update state or trigger the required behavior.
    FlipAnImage.display(arr1); // Executes the current statement to update state or trigger the required behavior.

  } // Closes the current block and ends the active scope.

  public static void display(int arr[][]) { // Defines the method that performs this unit of work for the class.
    System.out.print("[ "); // Prints the value without moving to a new line.
    for (int i = 0; i < arr.length; i++) { // Repeats the loop body as long as the loop condition remains true.
      System.out.print("["); // Prints the value without moving to a new line.
      for (int j = 0; j < arr[i].length; j++) { // Repeats the loop body as long as the loop condition remains true.
        System.out.print(arr[i][j] + " "); // Prints the value without moving to a new line.
      } // Closes the current block and ends the active scope.
      System.out.print("]"); // Prints the value without moving to a new line.
    } // Closes the current block and ends the active scope.
    System.out.println("]"); // Prints the result to the console so the current state can be inspected.
    System.out.flush(); // Executes the current statement to update state or trigger the required behavior.
  } // Closes the current block and ends the active scope.

  static void flipAndReverse(int arr[][]) { // Defines the method that performs this unit of work for the class.
    // reverse
    for (int i = 0; i < arr.length; i++) { // Repeats the loop body as long as the loop condition remains true.
      for (int j = 0; j < arr[i].length / 2; j++) { // Repeats the loop body as long as the loop condition remains true.
        int temp = arr[i][j]; // Stores the computed or supplied value in a variable for later use.
        arr[i][j] = arr[i][arr[i].length - 1 - j]; // Executes the current statement to update state or trigger the required behavior.
        arr[i][arr[i].length - 1 - j] = temp; // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.
    display(arr); // Executes the current statement to update state or trigger the required behavior.
    // flip
    for (int i = 0; i < arr.length; i++) { // Repeats the loop body as long as the loop condition remains true.
      for (int j = 0; j < arr[i].length; j++) { // Repeats the loop body as long as the loop condition remains true.
        if (arr[i][j] == 0) { // Checks whether the condition is true before taking the matching action.
          arr[i][j] = 1; // Executes the current statement to update state or trigger the required behavior.
        } else { // Closes the current block and ends the active scope.
          arr[i][j] = 0; // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.
  } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
