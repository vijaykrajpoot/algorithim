package com.algo.string.arrays;

import java.util.*;

/**
 * 3 Sum
 * Given an integer array arr of size n, find all magic triplets in it.
 * <p>
 * Magic triplet is a group of three numbers whose sum is zero.
 * <p>
 * Note that magic triplets may or may not be made of consecutive numbers in arr.
 * <p>
 * Example
 * {
 * "arr": [10, 3, -4, 1, -6, 9]
 * }
 * Output:
 * <p>
 * ["10,-4,-6", "3,-4,1"]
 */


// Logic: accumulates values across the collection to compute the total or product required by the problem.
public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 10, 10, 3, -4, 1, 1, 1, 1, 1, -6, 9, -9, -9, -9, -9, -9, -9};
        ThreeSum threeSum = new ThreeSum();

        System.out.println(threeSum.threeSum(arr));
    }

    List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> threeSumList = new ArrayList<>();
        Arrays.sort(arr);
        int len = arr.length - 1;

        for (int i = 0; i < len; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = len;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    threeSumList.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;

                    while (left < right && arr[left] == arr[left - 1]) {
                        left++;
                    }
                    while (left < right && arr[right] == arr[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return threeSumList;
    }

}

