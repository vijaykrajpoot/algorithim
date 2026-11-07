package com.algo.leetcode.seventy_five; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Arrays; // Imports the classes needed to support this file's logic.
import java.util.stream.IntStream; // Imports the classes needed to support this file's logic.

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * <p>
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * <p>
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Example 2:
 * <p>
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 */
public class ArrayProductExceptSelf { // Defines the Java type that contains the related data and behavior.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

        int[] arr = IntStream.of(-1, 1, 0, -3, 3).toArray(); // Stores the computed or supplied value in a variable for later use.
        ArrayProductExceptSelf a = new ArrayProductExceptSelf(); // Stores the computed or supplied value in a variable for later use.
        arr = IntStream.of(3, 4, 6, 1, 2).toArray(); // Stores the computed or supplied value in a variable for later use.
        System.out.println(Arrays.toString(a.productExceptSelf(arr))); // Prints the result to the console so the current state can be inspected.


    } // Closes the current block and ends the active scope.


    public int[] productExceptSelf(int[] nums) { // Defines the method that performs this unit of work for the class.

        int[] result = new int[nums.length]; // Stores the computed or supplied value in a variable for later use.
        int[] left = new int[nums.length]; // Stores the computed or supplied value in a variable for later use.
        int[] right = new int[nums.length]; // Stores the computed or supplied value in a variable for later use.

        left[0] = 1; // Executes the current statement to update state or trigger the required behavior.
        right[nums.length - 1] = 1; // Executes the current statement to update state or trigger the required behavior.


        for (int i = 1; i < nums.length; i++) { // Repeats the loop body as long as the loop condition remains true.
            left[i] = left[i - 1] * nums[i - 1]; // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
        System.out.println(Arrays.toString(left)); // Prints the result to the console so the current state can be inspected.
        for (int i = nums.length - 2; i >=0 ; i--) { // Repeats the loop body as long as the loop condition remains true.
            right[i] = right[i + 1] * nums[i + 1]; // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
        System.out.println(Arrays.toString(right)); // Prints the result to the console so the current state can be inspected.
        for (int i = 0; i < nums.length ; i++) { // Repeats the loop body as long as the loop condition remains true.
            result[i] = left[i] * right[i]; // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.

        return result; // Returns the computed value to the caller and exits the method.


    } // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
