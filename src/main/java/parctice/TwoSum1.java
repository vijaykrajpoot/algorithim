package parctice; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Arrays; // Imports the classes needed to support this file's logic.
import java.util.HashMap; // Imports the classes needed to support this file's logic.
import java.util.Map; // Imports the classes needed to support this file's logic.

public class TwoSum1 { // Defines the Java type that contains the related data and behavior.
    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        int[] arr = {1, 4, 5, 3, 2}; // Stores the computed or supplied value in a variable for later use.
        int[] result = twoSum(arr, 4); // Stores the computed or supplied value in a variable for later use.
        System.out.println(Arrays.toString(result)); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.

    public static int[] twoSum(int[] nums, int target) { // Defines the method that performs this unit of work for the class.

        HashMap<Integer, Integer> hashMap = new HashMap<>(); // Stores the computed or supplied value in a variable for later use.
        for (int i = 0; i < nums.length; i++) { // Repeats the loop body as long as the loop condition remains true.

            int r = target - nums[i]; // Stores the computed or supplied value in a variable for later use.
            if (hashMap.containsKey(r)) { // Checks whether the condition is true before taking the matching action.
                return new int[]{hashMap.get(r), i}; // Returns the computed value to the caller and exits the method.
            } // Closes the current block and ends the active scope.
            hashMap.put(nums[i], i + 1); // Executes the current statement to update state or trigger the required behavior.
            System.out.println(hashMap); // Prints the result to the console so the current state can be inspected.
        } // Closes the current block and ends the active scope.
        throw new IllegalArgumentException("No Two Sum Solution"); // Raises an exception to signal an invalid or unexpected condition.
    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.


