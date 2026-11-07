package com.algo.leetcode.seventy_five; // Declares the package so the class is organized under the correct Java namespace.

import org.junit.Assert; // Imports the classes needed to support this file's logic.

import java.util.Arrays; // Imports the classes needed to support this file's logic.

/**
 * You are given an integer array nums and an integer k.
 * <p>
 * In one operation, you can pick two numbers from the array whose sum equals k and
 * remove them from the array.
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
public class MaxNumberKSumPair_1679 { // Defines the Java type that contains the related data and behavior.


    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        MaxNumberKSumPair_1679 maxNumberKSumPir1679 = new MaxNumberKSumPair_1679(); // Stores the computed or supplied value in a variable for later use.
        int operation=0; // Stores the computed or supplied value in a variable for later use.
        int[] arr = new int[]{1,2,3,4}; // Stores the computed or supplied value in a variable for later use.
//        operation = maxNumberKSumPir1679.maxOperations(arr, 4);
//        Assert.assertEquals(2, operation);
        operation = maxNumberKSumPir1679.maxOperations(arr, 5); // Stores the computed or supplied value in a variable for later use.
        Assert.assertEquals(2, operation); // Executes the current statement to update state or trigger the required behavior.

    } // Closes the current block and ends the active scope.

    // 1,3,3,3,4
    // 2,2,2,3,1,1,4,1 K=4
    // 2,2,2,3,1,1,4,1 K=4

    public int maxSum(int[] arr, int k) { // Defines the method that performs this unit of work for the class.
        int sum=0; // Stores the computed or supplied value in a variable for later use.
        int l1=0; // Stores the computed or supplied value in a variable for later use.
        for (int i = 0; i < arr.length; i++) { // Repeats the loop body as long as the loop condition remains true.
            sum=sum+arr[i]; // Stores the computed or supplied value in a variable for later use.
            if(sum==k){ // Carries out the current statement to support the program's logic.
                l1=i; // Stores the computed or supplied value in a variable for later use.
                break; // Exits the current loop or switch branch immediately.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
//
//        for(int j=l1;j<arr.length;j++){
//
//        }


    return -1; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.


    public int maxOperations(int[] arr, int k) { // Defines the method that performs this unit of work for the class.
        // 1,2,3,4, k = 5
        // 1,2,3,4,5,6,7 k=5
        Arrays.sort(arr); // Executes the current statement to update state or trigger the required behavior.
        int low = 0; // Stores the computed or supplied value in a variable for later use.
        int high = arr.length - 1; // Stores the computed or supplied value in a variable for later use.
        int count = 0; // Stores the computed or supplied value in a variable for later use.
        while (low < high) { // Keeps executing this block until the loop condition becomes false.
            int sum = arr[low] + arr[high]; // Stores the computed or supplied value in a variable for later use.
            if (sum == k) { // Checks whether the condition is true before taking the matching action.
                count++; // Executes the current statement to update state or trigger the required behavior.
                low++; // Executes the current statement to update state or trigger the required behavior.
                high--; // Executes the current statement to update state or trigger the required behavior.
            } else if (sum < k) { // Closes the current block and ends the active scope.
                low++; // Executes the current statement to update state or trigger the required behavior.
            } else { // Closes the current block and ends the active scope.
                high--; // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        return count; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
