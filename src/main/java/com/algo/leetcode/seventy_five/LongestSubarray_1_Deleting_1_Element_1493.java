package com.algo.leetcode.seventy_five; // Declares the package so the class is organized under the correct Java namespace.

import org.junit.Assert; // Imports the classes needed to support this file's logic.

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
public class LongestSubarray_1_Deleting_1_Element_1493 { // Defines the Java type that contains the related data and behavior.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        LongestSubarray_1_Deleting_1_Element_1493 s = new LongestSubarray_1_Deleting_1_Element_1493(); // Stores the computed or supplied value in a variable for later use.
        int result = 0; // Stores the computed or supplied value in a variable for later use.
        int[] arr = null; // Stores the computed or supplied value in a variable for later use.
        arr = new int[]{1, 1, 0, 1}; // Stores the computed or supplied value in a variable for later use.
        result = s.longestSubarray(arr); // Stores the computed or supplied value in a variable for later use.
        Assert.assertEquals(3, result); // Executes the current statement to update state or trigger the required behavior.
        arr = new int[]{1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1}; // Stores the computed or supplied value in a variable for later use.
        result = s.longestSubarray(arr); // Stores the computed or supplied value in a variable for later use.
        Assert.assertEquals(result, 13); // Executes the current statement to update state or trigger the required behavior.

        arr = new int[]{1, 1, 1}; // Stores the computed or supplied value in a variable for later use.
        result = s.longestSubarray(arr); // Stores the computed or supplied value in a variable for later use.
        Assert.assertEquals(result, 2); // Executes the current statement to update state or trigger the required behavior.

        arr = new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}; // Stores the computed or supplied value in a variable for later use.
        result = s.longestSubarray(arr); // Stores the computed or supplied value in a variable for later use.
        Assert.assertEquals(result, 5); // Executes the current statement to update state or trigger the required behavior.

        arr = new int[]{}; // Stores the computed or supplied value in a variable for later use.
        result = s.longestSubarray(arr); // Stores the computed or supplied value in a variable for later use.
        Assert.assertEquals(0, result); // Executes the current statement to update state or trigger the required behavior.

        arr = new int[]{0}; // Stores the computed or supplied value in a variable for later use.
        result = s.longestSubarray(arr); // Stores the computed or supplied value in a variable for later use.
        Assert.assertEquals(0, result); // Executes the current statement to update state or trigger the required behavior.

        arr = new int[]{1}; // Stores the computed or supplied value in a variable for later use.
        result = s.longestSubarray(arr); // Stores the computed or supplied value in a variable for later use.
        Assert.assertEquals(0, result); // Executes the current statement to update state or trigger the required behavior.


    } // Closes the current block and ends the active scope.

    public int longestSubarray(int[] nums) { // Defines the method that performs this unit of work for the class.
        int result = 0; // Stores the computed or supplied value in a variable for later use.
        int current = 0; // Stores the computed or supplied value in a variable for later use.
        int prev = 0; // Stores the computed or supplied value in a variable for later use.
        if (nums.length == 1) { // Checks whether the condition is true before taking the matching action.
            if (nums[0] == 1 || nums[0] == 0) { // Checks whether the condition is true before taking the matching action.
                return 0; // Returns the computed value to the caller and exits the method.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        // 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0,1,1,1,1,1,1
        for (int i = 0; i < nums.length; i++) { // Repeats the loop body as long as the loop condition remains true.
            if (nums[i] == 1) { // Checks whether the condition is true before taking the matching action.
                current++; // Count the 1's // Carries out the current statement to support the program's logic.
            } else { // Closes the current block and ends the active scope.
                if (prev + current > result) { // Checks whether the condition is true before taking the matching action.
                    result = prev + current; // Stores the computed or supplied value in a variable for later use.
                } // Closes the current block and ends the active scope.
                prev = current; // Keep track of the prev 1's // Carries out the current statement to support the program's logic.
                current = 0; // Make current= 0 so that after 0 it will have fresh 1's count // Carries out the current statement to support the program's logic.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        if (prev + current > result) { // Checks whether the condition is true before taking the matching action.
            result = prev + current; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.

        if (current == nums.length && nums.length > 0) { // Checks whether the condition is true before taking the matching action.
            return result - 1; // Returns the computed value to the caller and exits the method.
        } // Closes the current block and ends the active scope.
        return result; // Returns the computed value to the caller and exits the method.

    } // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
