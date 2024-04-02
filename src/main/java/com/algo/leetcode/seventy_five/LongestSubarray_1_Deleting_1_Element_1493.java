package com.algo.leetcode.seventy_five;

import org.junit.Assert;

/**
 * Given a binary array nums, you should delete one element from it.
 * <p>
 * Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,0,1]
 * Output: 3
 * Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
 * Example 2:
 * <p>
 * Input: nums = [0,1,1,1,0,1,1,0,1]
 * Output: 5
 * Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
 * Example 3:
 * <p>
 * Input: nums = [1,1,1]
 * Output: 2
 * Explanation: You must delete one element.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * nums[i] is either 0 or 1.
 */
public class LongestSubarray_1_Deleting_1_Element_1493 {

    public static void main(String[] args) {
        LongestSubarray_1_Deleting_1_Element_1493 s = new LongestSubarray_1_Deleting_1_Element_1493();
        int result = 0;
        int[] arr = null;
        arr = new int[]{1, 1, 0, 1};
        result = s.longestSubarray(arr);
        Assert.assertEquals(3, result);
        arr = new int[]{1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1};
        result = s.longestSubarray(arr);
        Assert.assertEquals(result, 13);

        arr = new int[]{1, 1, 1};
        result = s.longestSubarray(arr);
        Assert.assertEquals(result, 2);

        arr = new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1};
        result = s.longestSubarray(arr);
        Assert.assertEquals(result, 5);

        arr = new int[]{};
        result = s.longestSubarray(arr);
        Assert.assertEquals(0, result);

        arr = new int[]{0};
        result = s.longestSubarray(arr);
        Assert.assertEquals(0, result);

        arr = new int[]{1};
        result = s.longestSubarray(arr);
        Assert.assertEquals(0, result);


    }

    public int longestSubarray(int[] nums) {
        int result = 0;
        int current = 0;
        int prev = 0;
        if (nums.length == 1) {
            if (nums[0] == 1 || nums[0] == 0) {
                return 0;
            }
        }
        // 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0,1,1,1,1,1,1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                current++; // Count the 1's
            } else {
                if (prev + current > result) {
                    result = prev + current;
                }
                prev = current; // Keep track of the prev 1's
                current = 0; // Make current= 0 so that after 0 it will have fresh 1's count
            }
        }
        if (prev + current > result) {
            result = prev + current;
        }

        if (current == nums.length && nums.length > 0) {
            return result - 1;
        }
        return result;

    }


}
