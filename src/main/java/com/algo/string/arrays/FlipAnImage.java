package com.algo.string.arrays;

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
public class FlipAnImage {
  int arr[][] = new int[20][20];

  public static void main(String[] args) {
    int arr[][] = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
    System.out.print("Actual :");
    FlipAnImage.display(arr);

    System.out.print("Reverse&Flip:");
    FlipAnImage.flipAndReverse(arr);
    FlipAnImage.display(arr);

    System.out.println("############################################");

    int arr1[][] = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
    System.out.print("Actual :");
    FlipAnImage.display(arr1);

    System.out.print("Reverse&Flip:");
    FlipAnImage.flipAndReverse(arr1);
    FlipAnImage.display(arr1);

  }

  public static void display(int arr[][]) {
    System.out.print("[ ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print("[");
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.print("]");
    }
    System.out.println("]");
    System.out.flush();
  }

  static void flipAndReverse(int arr[][]) {
    // reverse
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length / 2; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[i][arr[i].length - 1 - j];
        arr[i][arr[i].length - 1 - j] = temp;
      }
    }
    display(arr);
    // flip
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == 0) {
          arr[i][j] = 1;
        } else {
          arr[i][j] = 0;
        }
      }
    }
  }
}
