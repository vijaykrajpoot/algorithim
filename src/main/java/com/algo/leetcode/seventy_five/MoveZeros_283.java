package com.algo.leetcode.seventy_five; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Arrays; // Imports the classes needed to support this file's logic.

/**
 * https://leetcode.com/problems/move-zeroes/description/
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 */
public class MoveZeros_283 { // Defines the Java type that contains the related data and behavior.
    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        MoveZeros_283 moveZeros283 = new MoveZeros_283(); // Stores the computed or supplied value in a variable for later use.
        int[] arr = new int[]{0, 0, 0, 1,0, 1,2,3,4,5,6,0}; // Stores the computed or supplied value in a variable for later use.
        moveZeros283.moveZeroes1(arr); // Executes the current statement to update state or trigger the required behavior.
        System.out.println(Arrays.toString(arr)); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.

    public void moveZeroes1(int[] nums) { // Defines the method that performs this unit of work for the class.
        int k = 0; // Stores the computed or supplied value in a variable for later use.
        for (int i = 0; i < nums.length;i++ ) { // Repeats the loop body as long as the loop condition remains true.
            if (nums[i] != 0) { // Checks whether the condition is true before taking the matching action.
                nums[k] = nums[i]; // Executes the current statement to update state or trigger the required behavior.
                k++; // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        for (int j = k; j < nums.length; j++) { // Repeats the loop body as long as the loop condition remains true.
                 nums[j] = 0; // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    public void moveZeroes(int[] nums) { // Defines the method that performs this unit of work for the class.
        int j = 0; // Stores the computed or supplied value in a variable for later use.
        int val = 0; // Stores the computed or supplied value in a variable for later use.
        for (int i = 0; i < nums.length && j < nums.length; ) { // Repeats the loop body as long as the loop condition remains true.
            if (nums[i] == 0) { // Checks whether the condition is true before taking the matching action.
                while (nums[j++] != 0 & j < nums.length) { // Keeps executing this block until the loop condition becomes false.
                    continue; // Skips the rest of the current loop iteration and moves to the next one.
                } // Closes the current block and ends the active scope.
                if (j < nums.length && nums[j] != 0) { // Checks whether the condition is true before taking the matching action.
                    val = nums[j]; // Stores the computed or supplied value in a variable for later use.
                    nums[j] = 0; // Executes the current statement to update state or trigger the required behavior.
                    nums[i] = val; // Executes the current statement to update state or trigger the required behavior.
                } // Closes the current block and ends the active scope.
            } else { // Closes the current block and ends the active scope.
                i++; // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.

        } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
