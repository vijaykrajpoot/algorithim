package parctice; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Arrays; // Imports the classes needed to support this file's logic.

public class TwoSum { // Defines the Java type that contains the related data and behavior.
    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        int[] arr = {12,5,8,6,4,8,2,3,7,10,25}; // Stores the computed or supplied value in a variable for later use.
        int[] result = twoSum(arr, 8); // Stores the computed or supplied value in a variable for later use.
        System.out.println(Arrays.toString(result)); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.

    static int[] twoSum(int[] arr, int target) { // Defines the method that performs this unit of work for the class.
        for (int i = 0; i < arr.length; i++) { // Repeats the loop body as long as the loop condition remains true.
            for (int j = i + 1; j < arr.length; j++) { // Repeats the loop body as long as the loop condition remains true.
                if (arr[i] + arr[j] == target) { // Checks whether the condition is true before taking the matching action.
                    return new int[]{i, j}; // Returns the computed value to the caller and exits the method.
                } // Closes the current block and ends the active scope.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        return null; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
