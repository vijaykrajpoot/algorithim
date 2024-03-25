package com.algo.string.arrays;

/**
 * 
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a
 * method to rotate the image by 90 degrees. Can you do this in place?
 * 
 *
 * 

//@formatter:off
  10'  15  20  25'
  30   35  40  45
  50   55  60  65
  70'  75  80  85'
=========================
  25   15'  20  85
  30   35   40  45
  50'  55   60  65'
  10   75  '80  70
=========================
  25  45  20'  85
  '30  35  40  80
  15  55  60  '65
  10  75'  50  70
=========================
  25  45   65   85
  20  35'  40'  80
  15  55'  60'  75
  10  30   50   70
=========================
  25  45  65  85
  20  40  60  80
  15  35  55  75
  10  30  50  70
//@formatter:off
 * 
 * 
 * 
 * @author Vijay Kumar Rajput
 *
 */

public class RotateMatrix {

  public static void main(String[] args) {
    int matrix[][] = {
            {10, 15, 20, 25},
            {30, 35, 40, 45},
            {50, 55, 60, 65},
            {70, 75, 80, 85}
      };
    display(matrix);
    rotateMatrix(matrix, false);
  //  System.out.println("=========================");
  //  display(matrix);

  }

  public static void rotateMatrix(int matrix[][], boolean isClockWise) {

    int len = matrix.length;
    
    for (int row = 0; row < len; row++) {
      for (int col = row; col < len - row - 1; col++) {
        System.out.println("=========================");
        int temp = matrix[row][col];
        matrix[row][col] = matrix[col][len - 1 - row];
        matrix[col][len - 1 - row] = matrix[len - 1 - row][len - 1 - col];
        matrix[len - 1 - row][len - 1 - col] = matrix[len - 1 - col][row];
        matrix[len - 1 - col][row] = temp;
        display(matrix);
   
      }
    }

   

  }

  static void display(int matrix[][]) {

    int len = matrix.length;
    for (int row = 0; row < len; row++) {
      for (int col = 0; col < len; col++) {
        System.out.print("  " + matrix[row][col]);
      }
      System.out.print("\n");
    }


  }


}
