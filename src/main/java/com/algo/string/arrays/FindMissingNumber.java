package com.algo.string.arrays;
/**
 * Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), return the only number missing from the array within this range.
 *
 * Example 1:
 * Input: nums = [0, 2, 3, 1, 4]
 *
 * Output: 5
 *
 * Explanation:
 *
 * nums contains 0, 1, 2, 3, 4 thus leaving 5 as the only missing number in the range [0, 5]
 *
 * Example 2:
 * Input: nums = [0, 1, 2, 4, 5, 6]
 *
 * Output: 3
 *
 * Explanation:
 *
 * nums contains 0, 1, 2, 4, 5, 6 thus leaving 3 as the only missing number in the range [0, 6]
 *
 * Example 3:
 * Input: nums = [1, 3, 6, 4, 2, 5]
 *
 * Output:
 * 0
 */


// Logic: creates a boolean marker array the size of the expected range, marks every value that appears, and returns the first index that stays false because that index is the missing number.
public class FindMissingNumber {

    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 1, 4};
        System.out.println("Missing number: " + findMissingNumber(nums));
    }
    private static int findMissingNumber(int[] nums) {
        int n = nums.length;
        boolean[] marked = new boolean[n + 1];
        for (int num : nums) {
            marked[num] = true;
        }
        for (int i = 0; i <= n; i++) {
            if (!marked[i]) {
                return i;
            }
        }
        return -1;
    }
}
