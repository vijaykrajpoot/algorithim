package com.algo.leetcode.seventy_five; // Declares the package so the class is organized under the correct Java namespace.

/**
 * https://leetcode.com/problems/find-pivot-index/description/
 * Given an array of integers nums, calculate the pivot index of this array.
 *
 * The pivot index is the index where the sum of all the numbers strictly to the left of
 * the index is equal to the sum of all the numbers strictly to the index's right.
 *
 * If the index is on the left edge of the array, then the left sum is 0 because there are
 * no elements to the left. This also applies to the right edge of the array.
 *
 * Return the leftmost pivot index. If no such index exists, return -1.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,7,3,6,5,6]
 * Output: 3
 * Explanation:
 * The pivot index is 3.
 * Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
 * Right sum = nums[4] + nums[5] = 5 + 6 = 11
 * Example 2:
 *
 * Input: nums = [1,2,3]
 * Output: -1
 * Explanation:
 * There is no index that satisfies the conditions in the problem statement.
 * Example 3:
 *
 * Input: nums = [2,1,-1]
 * Output: 0
 * Explanation:
 * The pivot index is 0.
 * Left sum = 0 (no elements to the left of index 0)
 * Right sum = nums[1] + nums[2] = 1 + -1 = 0
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -1000 <= nums[i] <= 1000
 */
public class PivotIndex_724 { // Defines the Java type that contains the related data and behavior.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        PivotIndex_724 pivotIndex724 = new PivotIndex_724(); // Stores the computed or supplied value in a variable for later use.
        int[] arr = new int[]{2,1,-1}; // Stores the computed or supplied value in a variable for later use.
        int result=pivotIndex724.pivotIndex(arr); // Stores the computed or supplied value in a variable for later use.
        System.out.println(result); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.

    public int pivotIndex(int[] nums) { // Defines the method that performs this unit of work for the class.
        int leftSum = 0; // Stores the computed or supplied value in a variable for later use.
        int rightSum = 0; // Stores the computed or supplied value in a variable for later use.
        for (int i = 0; i < nums.length; i++) { // Repeats the loop body as long as the loop condition remains true.
            if (i > 0) { // Checks whether the condition is true before taking the matching action.
                leftSum = calcSum(nums, 0, i - 1); // Stores the computed or supplied value in a variable for later use.
            } // Closes the current block and ends the active scope.

            rightSum = calcSum(nums, i+1 , nums.length-1); // Stores the computed or supplied value in a variable for later use.

            if (leftSum == rightSum) { // Checks whether the condition is true before taking the matching action.
                return i; // Returns the computed value to the caller and exits the method.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        return -1; // Returns the computed value to the caller and exits the method.

    } // Closes the current block and ends the active scope.

    int calcSum(int[] arr, int startIdx, int endIdx) { // Defines the method that performs this unit of work for the class.
        int sum = 0; // Stores the computed or supplied value in a variable for later use.
        while (startIdx <= endIdx) { // Keeps executing this block until the loop condition becomes false.
            sum = sum + arr[startIdx]; // Stores the computed or supplied value in a variable for later use.
            startIdx++; // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
        return sum; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
