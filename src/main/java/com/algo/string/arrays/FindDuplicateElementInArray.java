package com.algo.string.arrays;

/**
 * 
 * 
 * Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear
 * time using less than O(n) space and traversing the stream sequentially O(1) times.
 * 
 * @author Vijay Kumar Rajput
 *
 */


public class FindDuplicateElementInArray {

  public static void main(String[] args) {

    int arr[] = {3,4,1,4,1};
    FindDuplicateElementInArray.findDuplicate(arr);

  }

  static void findDuplicate(int arr[]) {

    for (int i = 0; i < arr.length; i++) {

      if (arr[Math.abs(arr[i])] >= 0) {
        arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
      } else {
        System.out.print(Math.abs(arr[i]) + " ");
      }


    }

  }

}
