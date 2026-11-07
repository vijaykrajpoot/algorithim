package com.algo.string.arrays;
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
// Logic: Reorders the collection so elements appear in the required priority or ascending order.


public class RemoveDuplicateSortedArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int k = removeDuplicates(nums);
        System.out.println("Number of unique elements: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                System.out.println("Index i=" + i+ " index j=" + j);
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}