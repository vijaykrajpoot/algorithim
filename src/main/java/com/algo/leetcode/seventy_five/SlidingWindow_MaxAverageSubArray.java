package com.algo.leetcode.seventy_five; // Declares the package so the class is organized under the correct Java namespace.

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
public class SlidingWindow_MaxAverageSubArray { // Defines the Java type that contains the related data and behavior.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

        SlidingWindow_MaxAverageSubArray maxAverageSubArray = new SlidingWindow_MaxAverageSubArray(); // Stores the computed or supplied value in a variable for later use.
        int[] arr = new int[]{1, 12, -5, -6, 50, 3}; // Stores the computed or supplied value in a variable for later use.
        double average = maxAverageSubArray.findMaxSubArray(arr, 4); // Stores the computed or supplied value in a variable for later use.
        System.out.println("Average:" + average); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.

    double findMaxSubArray(int[] arr, int k) { // Defines the method that performs this unit of work for the class.
        int sum = 0; // Stores the computed or supplied value in a variable for later use.
        for (int i = 0; i < k; i++) { // Repeats the loop body as long as the loop condition remains true.
            sum = sum + arr[i]; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.

        double maxAvg = (double) sum / k; // Stores the computed or supplied value in a variable for later use.
        // 4 element sum is already there now use +1 element and removed the 1 element  [SLIDING window]
        for (int i = k; i < arr.length; i++) { // Repeats the loop body as long as the loop condition remains true.
            sum = sum + arr[i] - arr[i - k]; // Stores the computed or supplied value in a variable for later use.
            double curAvg = (double) sum / k; // Stores the computed or supplied value in a variable for later use.
            if (curAvg > maxAvg) { // Checks whether the condition is true before taking the matching action.
                maxAvg = curAvg; // Stores the computed or supplied value in a variable for later use.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        return maxAvg; // Returns the computed value to the caller and exits the method.

    } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
