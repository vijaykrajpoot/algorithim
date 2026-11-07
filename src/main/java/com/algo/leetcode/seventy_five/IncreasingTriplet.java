package com.algo.leetcode.seventy_five; // Declares the package so the class is organized under the correct Java namespace.

public class IncreasingTriplet { // Defines the Java type that contains the related data and behavior.
    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        int[] arr = new int[]{2, 1, 5, 0, 4, 6}; // Stores the computed or supplied value in a variable for later use.
        IncreasingTriplet increasingTriplet = new IncreasingTriplet(); // Stores the computed or supplied value in a variable for later use.
        boolean r = increasingTriplet.increasingTriplet(arr); // Stores the computed or supplied value in a variable for later use.
        System.out.println(r); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.

    public boolean increasingTriplet(int[] nums) { // Defines the method that performs this unit of work for the class.
        int first = Integer.MAX_VALUE; // Stores the computed or supplied value in a variable for later use.
        int second = Integer.MAX_VALUE; // Stores the computed or supplied value in a variable for later use.

        for (int i = 0; i < nums.length ; i++) { // Repeats the loop body as long as the loop condition remains true.
            if (nums[i] <= first) { // Checks whether the condition is true before taking the matching action.
                first = nums[i]; // Stores the computed or supplied value in a variable for later use.
            } else if (nums[i] <= second) { // Closes the current block and ends the active scope.
                second = nums[i]; // Stores the computed or supplied value in a variable for later use.
            } else { // Closes the current block and ends the active scope.
                return true; // Returns the computed value to the caller and exits the method.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        return false; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
