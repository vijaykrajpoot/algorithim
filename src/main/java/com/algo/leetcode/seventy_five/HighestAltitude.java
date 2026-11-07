package com.algo.leetcode.seventy_five; // Declares the package so the class is organized under the correct Java namespace.

/**
 * There is a biker going on a road trip.
 * The road trip consists of n + 1 points at different altitudes.
 * The biker starts his trip on point 0 with altitude equal 0.
 * <p>
 * You are given an integer array gain of length n where gain[i] is the net gain in
 * altitude between points i and i + 1 for all (0 <= i < n).
 * Return the highest altitude of a point.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: gain = [-5,1,5,0,-7]
 * Output: 1
 * Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
 * Example 2:
 * <p>
 * Input: gain = [-4,-3,-2,-1,4,3,2]
 * Output: 0
 * Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
 */
public class HighestAltitude { // Defines the Java type that contains the related data and behavior.
    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        int arr[] = new int[]{0,-4,-7,-9,-10,-6,-3,-1}; // Executes the current statement to update state or trigger the required behavior.
        HighestAltitude highestAltitude = new HighestAltitude(); // Stores the computed or supplied value in a variable for later use.
        int result = highestAltitude.largestAltitude(arr); // Stores the computed or supplied value in a variable for later use.
        System.out.println("result:" + result); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.

    public int largestAltitude(int[] gain) { // Defines the method that performs this unit of work for the class.
        int sum = 0; // Stores the computed or supplied value in a variable for later use.
        int result = 0; // Stores the computed or supplied value in a variable for later use.
        for (int i = 0; i < gain.length; i++) { // Repeats the loop body as long as the loop condition remains true.
            sum = sum + gain[i]; // Stores the computed or supplied value in a variable for later use.
            if (sum > result) { // Checks whether the condition is true before taking the matching action.
                result = sum; // Stores the computed or supplied value in a variable for later use.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        return result; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.


