package parctice; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Arrays; // Imports the classes needed to support this file's logic.

public class TwoSum2 { // Defines the Java type that contains the related data and behavior.
    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        int[] arr = new int[]{10,20,30,40,50,60,70,80,90,100}; // Stores the computed or supplied value in a variable for later use.
        TwoSum2 twoSum2 = new TwoSum2(); // Stores the computed or supplied value in a variable for later use.
        System.out.println(Arrays.toString(twoSum2.twoSum(arr, 70))); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.

    public int[] twoSum(int[] arr, int target) { // Defines the method that performs this unit of work for the class.
        Arrays.sort(arr); // Executes the current statement to update state or trigger the required behavior.
        int leftIdx = 0; // Stores the computed or supplied value in a variable for later use.
        int rightIdx = arr.length - 1; // Stores the computed or supplied value in a variable for later use.
        // 1,2,3,4,5,6,7,8,9 =13
        //10
        while (leftIdx < rightIdx) { // Keeps executing this block until the loop condition becomes false.
            int sum = arr[leftIdx] + arr[rightIdx]; // Stores the computed or supplied value in a variable for later use.
            if (sum == target) { // Checks whether the condition is true before taking the matching action.
                System.out.println(leftIdx + "," + rightIdx); // Prints the result to the console so the current state can be inspected.
                return new int []{leftIdx, rightIdx}; // Returns the computed value to the caller and exits the method.
            } else { // Closes the current block and ends the active scope.
                if (sum < target) { // Checks whether the condition is true before taking the matching action.
                    leftIdx++; // Executes the current statement to update state or trigger the required behavior.
                } else { // Closes the current block and ends the active scope.
                    rightIdx--; // Executes the current statement to update state or trigger the required behavior.
                } // Closes the current block and ends the active scope.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        return new int[0]; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
