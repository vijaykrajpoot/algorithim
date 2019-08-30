package com.algo.string.arrays;

import java.util.Arrays;

/**
 * 
 * 
 * You are given a read only array of n integers from 1 to n.
 * 
 * Each integer appears exactly once except A which appears twice and B which is missing.
 * 
 * Return A and B.
 * 
 * Note: Your algorithm should have a linear runtime complexity. Could you implement it without
 * using extra memory?
 * 
 * Note that in your output A should precede B.
 * 
 * 
 * Input:[3 1 2 5 3]
 * 
 * Output:[3, 4]
 * 
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class FindRepeatAndMissingNo {


  public static void main(String[] args) {

    int arr[] = {4, 3, 6, 2, 1, 1};
    int[] arrResult = findAndRepeat(arr);

    for (int i : arrResult) {
      System.out.println(i);
    }

  }

  public static int[] findAndRepeat(int arr[]) {
    int[] retArr = new int[2];
    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {

      if (i < arr.length - 1 && arr[i + 1] - arr[i] == 0) {
        retArr[0] = arr[i];
      }

      if (i < arr.length - 1 && arr[i + 1] - arr[i] == 2) {
        retArr[1] = arr[i] + 1;
      }
    }

    System.out.println("Missing:" + retArr[1] + "  Repeat:" + retArr[0]);

    return retArr;

  }


}
