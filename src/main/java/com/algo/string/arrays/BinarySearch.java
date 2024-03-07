package com.algo.string.arrays;

public class BinarySearch {

  public static boolean search(int arr[], int num) {
    if (arr == null || arr.length == 0) {
      throw new IllegalArgumentException("Input is Empty || Null");
    }
    return s(arr, num, 0, arr.length) > -1;
  }

  private static int s(int arr[], int num, int start, int length) {
    int mid = (start + length) / 2;
    int idx = -1;

    if (mid < 0 || mid >= length)
      return idx;

    if (arr[mid] == num)
      return mid;

    if (arr[mid] > num) {
      idx = s(arr, num, 0, mid);
    } else {
      idx = s(arr, num, mid + 1, length);
    }

    return idx;
  }

  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(ArrayBinarySearch.search(arr, -2));
  }
}
