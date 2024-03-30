package com.algo.leetcode.seventy_five;

import java.util.Arrays;
import java.util.HashMap;

/**
 * You are given an integer array nums and an integer k.
 * <p>
 * In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
 * <p>
 * Return the maximum number of operations you can perform on the array.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4], k = 5
 * Output: 2
 * Explanation: Starting with nums = [1,2,3,4]:
 * - Remove numbers 1 and 4, then nums = [2,3]
 * - Remove numbers 2 and 3, then nums = []
 * There are no more pairs that sum up to 5, hence a total of 2 operations.
 * Example 2:
 * <p>
 * Input: nums = [3,1,3,4,3], k = 6
 * Output: 1
 * Explanation: Starting with nums = [3,1,3,4,3]:
 * - Remove the first two 3's, then nums = [1,4,3]
 * There are no more pairs that sum up to 6, hence a total of 1 operation.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 109
 * 1 <= k <= 109
 */
public class MaxNumberKSumPir_1679 {


    public static void main(String[] args) {
        MaxNumberKSumPir_1679 maxNumberKSumPir1679 = new MaxNumberKSumPir_1679();
        int[] arr = new int[]{2,2,2,3,1,1,4,1};
        //4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4 k=2
        // 2,2,2,3,1,1,4,1 k=2
        //Arrays.sort(arr);
        int operation = maxNumberKSumPir1679.maxOperations1(arr, 4);
        System.out.println("operation:" + operation);
    }

    // 1,3,3,3,4
    // 2,2,2,3,1,1,4,1 K=4
    // 2,2,2,3,1,1,4,1 K=4
    
    public int maxOperations(int[] arr, int k) {
        // 1,2,3,4, k = 5
        // 1,2,3,4,5,6,7 k=5
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        int count = 0;
        while (low < high) {
            int num1 = arr[low];
            int num2 = arr[high];
            int sum = num1 + num2;

            if (sum == k) {
                count++;
                low++;
                high--;
                continue;
            } else if (sum < k) {
                low++;
            } else {
                high--;
            }
        }
        return count;
    }


}
