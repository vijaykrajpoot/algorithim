package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

/**
 * 
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a
 * method to rotate the image by 90 degrees. Can you do this in place?
 * 
 *
 * 

//@formatter:off
  10'  15  20  25' // Carries out the current statement to support the program's logic.
  30   35  40  45 // Carries out the current statement to support the program's logic.
  50   55  60  65 // Carries out the current statement to support the program's logic.
  70'  75  80  85' // Carries out the current statement to support the program's logic.
========================= // Carries out the current statement to support the program's logic.
  25   15'  20  85 // Carries out the current statement to support the program's logic.
  30   35   40  45 // Carries out the current statement to support the program's logic.
  50'  55   60  65' // Carries out the current statement to support the program's logic.
  10   75  '80  70 // Carries out the current statement to support the program's logic.
========================= // Carries out the current statement to support the program's logic.
  25  45  20'  85 // Carries out the current statement to support the program's logic.
  '30  35  40  80 // Carries out the current statement to support the program's logic.
  15  55  60  '65 // Carries out the current statement to support the program's logic.
  10  75'  50  70 // Carries out the current statement to support the program's logic.
========================= // Carries out the current statement to support the program's logic.
  25  45   65   85 // Carries out the current statement to support the program's logic.
  20  35'  40'  80 // Carries out the current statement to support the program's logic.
  15  55'  60'  75 // Carries out the current statement to support the program's logic.
  10  30   50   70 // Carries out the current statement to support the program's logic.
========================= // Carries out the current statement to support the program's logic.
  25  45  65  85 // Carries out the current statement to support the program's logic.
  20  40  60  80 // Carries out the current statement to support the program's logic.
  15  35  55  75 // Carries out the current statement to support the program's logic.
  10  30  50  70 // Carries out the current statement to support the program's logic.
//@formatter:off
 * 
 * 
 * 
 * @author Vijay Kumar Rajput
 *
 */

public class RotateMatrix { // Defines the Java type that contains the related data and behavior.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    int matrix[][] = { // Carries out the current statement to support the program's logic.
            {10, 15, 20, 25}, // Opens a new block to group the related statements.
            {30, 35, 40, 45}, // Opens a new block to group the related statements.
            {50, 55, 60, 65}, // Opens a new block to group the related statements.
            {70, 75, 80, 85} // Opens a new block to group the related statements.
      }; // Closes the current block and ends the active scope.
    display(matrix); // Executes the current statement to update state or trigger the required behavior.
    rotateMatrix(matrix, false); // Executes the current statement to update state or trigger the required behavior.
  //  System.out.println("=========================");
  //  display(matrix);

  } // Closes the current block and ends the active scope.

  public static void rotateMatrix(int matrix[][], boolean isClockWise) { // Defines the method that performs this unit of work for the class.

    int len = matrix.length; // Stores the computed or supplied value in a variable for later use.
    
    for (int row = 0; row < len; row++) { // Repeats the loop body as long as the loop condition remains true.
      for (int col = row; col < len - row - 1; col++) { // Repeats the loop body as long as the loop condition remains true.
        System.out.println("========================="); // Prints the result to the console so the current state can be inspected.
        int temp = matrix[row][col]; // Stores the computed or supplied value in a variable for later use.
        matrix[row][col] = matrix[col][len - 1 - row]; // Executes the current statement to update state or trigger the required behavior.
        matrix[col][len - 1 - row] = matrix[len - 1 - row][len - 1 - col]; // Executes the current statement to update state or trigger the required behavior.
        matrix[len - 1 - row][len - 1 - col] = matrix[len - 1 - col][row]; // Executes the current statement to update state or trigger the required behavior.
        matrix[len - 1 - col][row] = temp; // Executes the current statement to update state or trigger the required behavior.
        display(matrix); // Executes the current statement to update state or trigger the required behavior.
   
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

   

  } // Closes the current block and ends the active scope.

  static void display(int matrix[][]) { // Defines the method that performs this unit of work for the class.

    int len = matrix.length; // Stores the computed or supplied value in a variable for later use.
    for (int row = 0; row < len; row++) { // Repeats the loop body as long as the loop condition remains true.
      for (int col = 0; col < len; col++) { // Repeats the loop body as long as the loop condition remains true.
        System.out.print("  " + matrix[row][col]); // Prints the value without moving to a new line.
      } // Closes the current block and ends the active scope.
      System.out.print("\n"); // Prints the value without moving to a new line.
    } // Closes the current block and ends the active scope.


  } // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
