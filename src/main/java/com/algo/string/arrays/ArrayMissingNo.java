package com.algo.string.arrays;

public class ArrayMissingNo {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 7, 6, 8, 10};
    int a = ArrayMissingNo.getMissingNo(arr);
    if (a < 0) {
      System.out.println("No Missing");
    } else {
      System.out.println("Missing No:" + a);
    }
  }

  public static int getMissingNo(int arr[]) {
    // TODO
    return -1;
  }
}
