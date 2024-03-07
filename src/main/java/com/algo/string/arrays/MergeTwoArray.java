package com.algo.string.arrays;

/**
 * 
 * Merge two given sorted array in a Single Array.
 * 
 * 
 * @author Vijay K Rajput
 *
 */
public class MergeTwoArray {

  public static void main(String[] args) {
    int[] arr1 = {1, 90};
    int[] arr2 = {-1, 3, 5, 7, 9, 23, 56};
    mergeArray(arr1, arr2);
  }

  static void mergeArray(int arr1[], int arr2[]) {
    int idx1 = 0, idx2 = 0, idx = 0;
    int arr3[] = new int[arr1.length + arr2.length];
    while (idx1 < arr1.length && idx2 < arr2.length) {
      if (arr1[idx1] < arr2[idx2]) {
        arr3[idx++] = arr1[idx1++];
      } else {
        arr3[idx++] = arr2[idx2++];
      }
    }

    for (int i = 0; i < arr3.length; i++) {
      System.out.print(arr3[i] + ",");
    }
    while (idx1 < arr1.length) {
      arr3[idx++] = arr1[idx1++];
    }
    System.out.println();
    for (int i = 0; i < arr3.length; i++) {
      System.out.print(arr3[i] + ",");
    }
    System.out.println();
    while (idx2 < arr2.length) {
      arr3[idx++] = arr2[idx2++];
    }

    for (int i = 0; i < arr3.length; i++) {
      System.out.print(arr3[i] + ",");
    }
  }

}
