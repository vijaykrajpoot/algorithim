package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

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
public class FindMissingNumber { // Defines the Java type that contains the related data and behavior.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        int[] nums = {0, 2, 3, 1, 4}; // Stores the computed or supplied value in a variable for later use.
        System.out.println("Missing number: " + findMissingNumber(nums)); // Output: 5 // Prints the result to the console so the current state can be inspected.

//        int[] nums2 = {0, 1, 2, 4, 5, 6};
//        System.out.println("Missing number: " + findMissingNumber(nums2)); // Output: 3
//
//        int[] nums3 = {1, 3, 6, 4, 2, 5};
//        System.out.println("Missing number: " + findMissingNumber(nums3)); // Output: 0
    } // Closes the current block and ends the active scope.

    private static int findMissingNumber(int[] nums) { // Defines the method that performs this unit of work for the class.
        int n = nums.length; // Stores the computed or supplied value in a variable for later use.

        // 1. Create the auxiliary array of size n + 1
        // All elements default to false (unmarked)
        boolean[] marked = new boolean[n + 1]; // Stores the computed or supplied value in a variable for later use.

        // 2. Scan the original array and mark the found indices as true
        for (int num : nums) { // Repeats the loop body as long as the loop condition remains true.
            marked[num] = true; // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.

        // 3. Scan the auxiliary array to find the index that is still false
        for (int i = 0; i <= n; i++) { // Repeats the loop body as long as the loop condition remains true.
            if (!marked[i]) { // Checks whether the condition is true before taking the matching action.
                return i; // This is the missing number // Returns the computed value to the caller and exits the method.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.

        return -1; // Fallback, though the problem guarantees a missing number // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
