package com.algo.leetcode.seventy_five;
import java.util.Arrays;
import java.util.stream.IntStream;
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
public class ArrayProductExceptSelf { // Stores the logic for solving the “product of all elements except self” problem without division.

    public static void main(String[] args) {

        int[] arr = IntStream.of(-1, 1, 0, -3, 3).toArray(); // Creates a sample with zero and negative values to confirm the solution handles tricky edge cases.
        ArrayProductExceptSelf a = new ArrayProductExceptSelf();
        arr = IntStream.of(3, 4, 6, 1, 2).toArray(); // Replaces the initial sample with a cleaner dataset that makes the expected result easier to reason about.
        System.out.println(Arrays.toString(a.productExceptSelf(arr))); // Prints the final output to verify that each index contains the product of all other values.


    }
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length]; // Allocates the output array that will hold the final answer for every index.
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        right[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        } // Stops once every left-side product has been computed.
        System.out.println(Arrays.toString(left));
        for (int i = nums.length - 2; i >=0 ; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        } // Stops once every right-side product has been computed.
        System.out.println(Arrays.toString(right));
        for (int i = 0; i < nums.length ; i++) {
            result[i] = left[i] * right[i];
        } // Stops when every output slot has been filled with its correct product.

        return result;
    } // Closes the method after the output array has been prepared and returned.


}
