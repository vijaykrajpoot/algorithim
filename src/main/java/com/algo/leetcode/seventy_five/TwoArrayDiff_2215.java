package com.algo.leetcode.seventy_five; // Declares the package so the class is organized under the correct Java namespace.

import java.util.*; // Imports the classes needed to support this file's logic.
import java.util.stream.Collectors; // Imports the classes needed to support this file's logic.

/**
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 * <p>
 * answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
 * answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
 * Note that the integers in the lists may be returned in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,3], nums2 = [2,4,6]
 * Output: [[1,3],[4,6]]
 * Explanation:
 * For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
 * For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
 * Example 2:
 * <p>
 * Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
 * Output: [[3],[]]
 * Explanation:
 * For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
 * Every integer in nums2 is present in nums1. Therefore, answer[1] = [].
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums1.length, nums2.length <= 1000
 * -1000 <= nums1[i], nums2[i] <= 1000
 */
public class TwoArrayDiff_2215 { // Defines the Java type that contains the related data and behavior.
    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        int arr1[] = new int[]{1, 2, 3}; // Executes the current statement to update state or trigger the required behavior.
        int arr2[] = new int[]{2, 4, 6}; // Executes the current statement to update state or trigger the required behavior.
        TwoArrayDiff_2215 twoArrayDiff2215 = new TwoArrayDiff_2215(); // Stores the computed or supplied value in a variable for later use.
        List<List<Integer>>  result= twoArrayDiff2215.findDifference(arr1, arr2); // Stores the computed or supplied value in a variable for later use.
        System.out.println(result); // Prints the result to the console so the current state can be inspected.


    } // Closes the current block and ends the active scope.

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) { // Defines the method that performs this unit of work for the class.
        List<List<Integer>> lists = new ArrayList<>(); // Stores the computed or supplied value in a variable for later use.
        HashSet<Integer> set1 = new HashSet<>(Arrays.stream(nums1).boxed().collect(Collectors.toList())); // Stores the computed or supplied value in a variable for later use.
        HashSet<Integer> set2 = new HashSet<>(Arrays.stream(nums2).boxed().collect(Collectors.toList())); // Stores the computed or supplied value in a variable for later use.

        for (int num : nums1) { // Repeats the loop body as long as the loop condition remains true.
            set2.remove(num); // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
        for (int num : nums2) { // Repeats the loop body as long as the loop condition remains true.
            set1.remove(num); // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
        lists.add(new ArrayList<>(set1)); // Executes the current statement to update state or trigger the required behavior.
        lists.add(new ArrayList<>(set2)); // Executes the current statement to update state or trigger the required behavior.
        return lists; // Returns the computed value to the caller and exits the method.

    } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
