package com.algo.string.arrays;

public class FindPairInSortedArray {


  public static void main(String[] args) {
    int arr[] = {5, 11, 15, 18, 20, 30, 1, 2, 3, 4};
    int sum = 16;

    System.out.println("isPairInSortedRotatedArray(arr, sum):" + isPairInSortedRotatedArray(arr, sum));
  }

  static boolean isPairInSortedRotatedArray(int arr[], int sum) {
    // find pivot point.
    int i = 0;
    for (i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        System.out.println("Pivot Index: " + i);
        break;
      }
    }

    int higherIdx = i;
    int lowIdx = (i + 1) % arr.length;
    System.out.println("higherIdx:" + higherIdx + " lowIdx:" + lowIdx);

    while (lowIdx != higherIdx) {
      System.out.println("arr[" + lowIdx + "]:" + arr[lowIdx] + " + arr[" + higherIdx + "]:" + arr[higherIdx] + " - Sum:" + (arr[lowIdx] + arr[higherIdx]) + " Sum:" + sum + " higherIdx:" + higherIdx
          + " lowIdx:" + lowIdx);
      if (arr[lowIdx] + arr[higherIdx] == sum) {
        System.out.println("Pair (" + (arr[lowIdx] + "," + arr[higherIdx]) + ")");
        return true;

      }

      if (arr[lowIdx] + arr[higherIdx] > sum) {
        higherIdx = (higherIdx - 1) % arr.length;
      } else {
        lowIdx = (lowIdx + 1) % arr.length;
      }

    }

    return false;

  }

}
