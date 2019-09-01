package com.algo.string.arrays;

public class Arrays {
  int arr[][] = new int[20][20];

  public static void main(String[] args) {
    int arr[][] = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
    System.out.print("Actual :");
    Arrays.display(arr);

    System.out.print("Reverse&Flip:");
    Arrays.flipAndReverse(arr);
    Arrays.display(arr);

    System.out.println("############################################");

    int arr1[][] = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
    System.out.print("Actual :");
    Arrays.display(arr1);

    System.out.print("Reverse&Flip:");
    Arrays.flipAndReverse(arr1);
    Arrays.display(arr1);

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
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length / 2; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[i][arr[i].length - 1 - j];
        arr[i][arr[i].length - 1 - j] = temp;
      }
    }
    display(arr);
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
