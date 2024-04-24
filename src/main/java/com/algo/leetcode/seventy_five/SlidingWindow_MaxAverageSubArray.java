package com.algo.leetcode.seventy_five;

/**
 * You are given an integer array nums consisting of n elements, and an integer k.
 * <p>
 * Find a contiguous subarray whose length is equal to k that has the maximum
 * average value and return this value. Any answer with a calculation error less than
 * 10-5 will be accepted.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 * Example 2:
 * <p>
 * Input: nums = [5], k = 1
 * Output: 5.00000
 */
public class SlidingWindow_MaxAverageSubArray {

    public static void main(String[] args) {

        SlidingWindow_MaxAverageSubArray maxAverageSubArray = new SlidingWindow_MaxAverageSubArray();
        int[] arr = new int[]{1, 12, -5, -6, 50, 3};
        double average = maxAverageSubArray.findMaxSubArray(arr, 4);
        System.out.println("Average:" + average);
    }

    double findMaxSubArray(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        double maxAvg = (double) sum / k;
        // 4 element sum is already there now use +1 element and removed the 1 element  [SLIDING window]
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            double curAvg = (double) sum / k;
            if (curAvg > maxAvg) {
                maxAvg = curAvg;
            }
        }
        return maxAvg;

    }

}
