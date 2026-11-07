package com.algo.leetcode.seventy_five; // Declares the package so the class is organized under the correct Java namespace.

import org.mockito.internal.matchers.Find; // Imports the classes needed to support this file's logic.

/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * <p>
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * <p>
 * Return the maximum amount of water a container can store.
 * <p>
 * Notice that you may not slant the container.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 * Example 2:
 * <p>
 * Input: height = [1,1]
 * Output: 1
 * <p>
 * <p>
 * Constraints:
 * <p>
 * n == height.length
 * 2 <= n <= 105
 * 0 <= height[i] <= 104
 * <p>
 * https://leetcode.com/problems/container-with-most-water/description/?envType=study-plan-v2&envId=leetcode-75
 */
public class ContainerWithMostWater_11 { // Defines the Java type that contains the related data and behavior.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        ContainerWithMostWater_11 containerWithMostWater11 = new ContainerWithMostWater_11(); // Stores the computed or supplied value in a variable for later use.
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}; // Stores the computed or supplied value in a variable for later use.
        int area = containerWithMostWater11.maxArea(height); // Stores the computed or supplied value in a variable for later use.
        System.out.println(area); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.

    public int maxArea(int[] height) { // Defines the method that performs this unit of work for the class.
        int left = 0; // Stores the computed or supplied value in a variable for later use.
        int right = height.length - 1; // Stores the computed or supplied value in a variable for later use.
        int maxArea = 0; // Stores the computed or supplied value in a variable for later use.
        while (left < right) { // Keeps executing this block until the loop condition becomes false.
            int area = Math.min(height[left], height[right]) * (right - left); // Stores the computed or supplied value in a variable for later use.
            if (area > maxArea) { // Checks whether the condition is true before taking the matching action.
                maxArea = area; // Stores the computed or supplied value in a variable for later use.
            } // Closes the current block and ends the active scope.

            if (height[left] < height[right]) { // Checks whether the condition is true before taking the matching action.
                left++; // Executes the current statement to update state or trigger the required behavior.
            } else { // Closes the current block and ends the active scope.
                right--; // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        return maxArea; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
