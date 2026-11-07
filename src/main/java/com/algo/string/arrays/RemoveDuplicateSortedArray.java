package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

/**
 * Given an integer array nums sorted in non-decreasing order, remove all duplicates in-place so that each unique element appears only once.
 *
 * Return the number of unique elements in the array.
 *
 * If the number of unique elements be k, then,
 *
 * Change the array nums such that the first k elements of nums contain the unique values in the order that they were present originally.
 * The remaining elements, as well as the size of the array does not matter in terms of correctness.
 * The driver code will assess correctness by printing and checking only the first k elements of the modified array.
 * An array sorted in non-decreasing order is an array where every element to the right of an element is either equal to or greater in value than that element.
 *
 * Example 1:
 * Input: nums = [0, 0, 3, 3, 5, 6]
 *
 * Output: 4
 *
 * Explanation:
 *
 * Resulting array = [0, 3, 5, 6, _, _]
 *
 * There are 4 distinct elements in nums and the elements marked as _ can have any value.
 *
 * Example 2:
 * Input: nums = [-2, 2, 4, 4, 4, 4, 5, 5]
 *
 * Output: 4
 *
 * Explanation:
 *
 * Resulting array = [-2, 2, 4, 5, _, _, _, _]
 *
 * There are 4 distinct elements in nums and the elements marked as _ can have any value.
 */
public class RemoveDuplicateSortedArray { // Defines the Java type that contains the related data and behavior.
    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        int[] nums = {1,2,3,4,5,6,7,8,9}; // Stores the computed or supplied value in a variable for later use.
        int k = removeDuplicates(nums); // Stores the computed or supplied value in a variable for later use.
        System.out.println("Number of unique elements: " + k); // Prints the result to the console so the current state can be inspected.
        System.out.print("Modified array: "); // Prints the value without moving to a new line.
        for (int i = 0; i < nums.length; i++) { // Repeats the loop body as long as the loop condition remains true.
            System.out.print(nums[i] + " "); // Prints the value without moving to a new line.
        } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.
    public static int removeDuplicates(int[] nums) { // Defines the method that performs this unit of work for the class.
        if (nums == null || nums.length == 0) { // Checks whether the condition is true before taking the matching action.
            return 0; // Returns the computed value to the caller and exits the method.
        } // Closes the current block and ends the active scope.
        int i = 0; // Stores the computed or supplied value in a variable for later use.
        for (int j = 1; j < nums.length; j++) { // Repeats the loop body as long as the loop condition remains true.
            if (nums[i] != nums[j]) { // Checks whether the condition is true before taking the matching action.
                i++; // Executes the current statement to update state or trigger the required behavior.
                System.out.println("Index i=" + i+ " index j=" + j); // Prints the result to the console so the current state can be inspected.
                nums[i] = nums[j]; // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        return i + 1; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
