package com.algo.leetcode.seventy_five;

import org.junit.Assert;

import java.util.Arrays;

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
public class MaxNumberKSumPair_1679 {


    public static void main(String[] args) {
        MaxNumberKSumPair_1679 maxNumberKSumPir1679 = new MaxNumberKSumPair_1679();
        int operation=0;
        int[] arr = new int[]{1,2,3,4};
//        operation = maxNumberKSumPir1679.maxOperations(arr, 4);
//        Assert.assertEquals(2, operation);
        operation = maxNumberKSumPir1679.maxOperations(arr, 5);
        Assert.assertEquals(2, operation);

    }

    // 1,3,3,3,4
    // 2,2,2,3,1,1,4,1 K=4
    // 2,2,2,3,1,1,4,1 K=4

    public int maxSum(int[] arr, int k) {
        int sum=0;
        int l1=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            if(sum==k){
                l1=i;
                break;
            }
        }

        for(int j=l1;j<arr.length;j++){

        }


    return -1;
    }


    public int maxOperations(int[] arr, int k) {
        // 1,2,3,4, k = 5
        // 1,2,3,4,5,6,7 k=5
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        int count = 0;
        while (low < high) {
            int sum = arr[low] + arr[high];
            if (sum == k) {
                count++;
                low++;
                high--;
            } else if (sum < k) {
                low++;
            } else {
                high--;
            }
        }
        return count;
    }


}
