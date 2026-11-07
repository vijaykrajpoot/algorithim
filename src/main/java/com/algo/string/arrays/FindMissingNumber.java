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
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 1, 4};
        System.out.println("Missing number: " + findMissingNumber(nums)); // Output: 5
//        int[] nums2 = {0, 1, 2, 4, 5, 6};
//        System.out.println("Missing number: " + findMissingNumber(nums2)); // Output: 3
//        int[] nums3 = {1, 3, 6, 4, 2, 5};
//        System.out.println("Missing number: " + findMissingNumber(nums3)); // Output: 0
    }
    private static int findMissingNumber(int[] nums) {
        int n = nums.length;
        // 1. Create the auxiliary array of size n + 1
        // All elements default to false (unmarked)
        boolean[] marked = new boolean[n + 1];
        // 2. Scan the original array and mark the found indices as true
        for (int num : nums) {
            marked[num] = true;
        }
        // 3. Scan the auxiliary array to find the index that is still false
        for (int i = 0; i <= n; i++) {
            if (!marked[i]) {
                return i; // This is the missing number
            }
        }
        return -1; // Fallback, though the problem guarantees a missing number
    }
}