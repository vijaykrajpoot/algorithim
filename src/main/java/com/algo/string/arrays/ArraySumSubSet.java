package com.algo.string.arrays;

import java.util.HashMap;

/**
 * find all the pairs of two integers in an unsorted array that sum up to a given S.
 * 
 * For example, if the array is [3, 5, 2, -4, 8, 11] and the sum is 7, your program should return
 * [[11, -4], [2, 5]] because 11 + -4 = 7 and 2 + 5 = 7.
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class ArraySumSubSet {

  public static void main(String[] args) {

    int arr[] = {10, 20, 30, 40, 50, 60};
    int sum = 50;
    printSumSubset(arr, sum);

    System.out.println("==========================");
    int arr1[] = {3, 5, 2, -4, 8, 11};
    printSumSubset(arr1, 7);


  }

  /**
   * 
   * Add Item to Hashmap and see of the difference of that number from sum is there in that array or
   * not.
   * 
   * @param arr
   * @param sum
   */
  static void printSumSubset(int arr[], int sum) {

    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    for (int i : arr) {
      hashMap.put(i, i);
    }
    for (int i = 0; i < arr.length; i++) {
      int temp = sum - arr[i];
      if (hashMap.containsValue(temp)) {
        System.out.println("(" + arr[i] + "," + temp + ")");
        // Removed element to avoid same pair in different order
        hashMap.remove(arr[i]);
      }
    }
  }
}
