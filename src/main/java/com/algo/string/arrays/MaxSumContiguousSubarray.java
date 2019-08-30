package com.algo.string.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * Find the contiguous subarray within an array (containing at least one number) which has the
 * largest sum.
 * 
 * For example:
 * 
 * Given the array [-2,1,-3,4,-1,2,1,-5,4],
 * 
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * 
 * For this problem, return the maximum sum.
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class MaxSumContiguousSubarray {


  public static void main(String[] args) {
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    System.out.println("LaargestSum of " + Arrays.toString(arr) + " is " + findLargestSumOfSubArray(arr));

    int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println("LaargestSum of " + Arrays.toString(arr1) + " is " + findLargestSumOfSubArray(arr1));

    int[] arr2 = {-1, -2, -3, 4, -5, -6, -7, -8, -9};
    System.out.println("LaargestSum of " + Arrays.toString(arr2) + " is " + findLargestSumOfSubArray(arr2));

  }

  public static int findLargestSumOfSubArray(int[] arr) {

    List<Integer> subArray = new LinkedList<Integer>();
    int currentSum = 0;
    int finalSum = 0;

    for (int element : arr) {
      currentSum = currentSum + element;
      subArray.add(element);
      if (currentSum < 0) {
        currentSum = 0;
        subArray = new LinkedList<Integer>();
      } else if (finalSum < currentSum) {
        finalSum = currentSum;
      }
    }
    System.out.println(" =======> Arrays.toString(subArray.toArray()):" + Arrays.toString(subArray.toArray()));
    return finalSum;
  }

}
