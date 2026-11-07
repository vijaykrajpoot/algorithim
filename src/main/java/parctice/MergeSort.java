package parctice; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Arrays; // Imports the classes needed to support this file's logic.

public class MergeSort { // Defines the Java type that contains the related data and behavior.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        int[] arr = {10, 100, 40, 60, 30, 70, 60, 30, 80, 50}; // Stores the computed or supplied value in a variable for later use.
        int[] sortedArray = mergeSort(arr); // Stores the computed or supplied value in a variable for later use.
        System.out.println("Sorted:" + Arrays.toString(sortedArray)); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.


    static int[] mergeSort(int[] arr) { // Defines the method that performs this unit of work for the class.

        int length = arr.length; // Stores the computed or supplied value in a variable for later use.

        if (length <= 1) { // Checks whether the condition is true before taking the matching action.
            return arr; // Returns the computed value to the caller and exits the method.
        } else { // Closes the current block and ends the active scope.
            int mid = length / 2; // Stores the computed or supplied value in a variable for later use.
            int remLength = length - mid; // Stores the computed or supplied value in a variable for later use.
            // Create auxiliary array

            int[] arr1 = new int[mid]; // Stores the computed or supplied value in a variable for later use.
            int[] arr2 = new int[remLength]; // Stores the computed or supplied value in a variable for later use.

            // Copy the element

            System.arraycopy(arr, 0, arr1, 0, mid); // Executes the current statement to update state or trigger the required behavior.
            System.arraycopy(arr, mid, arr2, 0, remLength); // Executes the current statement to update state or trigger the required behavior.

            arr1 = mergeSort(arr1); // Stores the computed or supplied value in a variable for later use.
            arr2 = mergeSort(arr2); // Stores the computed or supplied value in a variable for later use.

            return mergeArray(arr1, arr2); // Returns the computed value to the caller and exits the method.
        } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    static int[] mergeArray(int[] arr1, int[] arr2) { // Defines the method that performs this unit of work for the class.

        int l1 = arr1.length; // Stores the computed or supplied value in a variable for later use.
        int l2 = arr2.length; // Stores the computed or supplied value in a variable for later use.
        int idx = 0; // Stores the computed or supplied value in a variable for later use.
        int idx1 = 0; // Stores the computed or supplied value in a variable for later use.
        int idx2 = 0; // Stores the computed or supplied value in a variable for later use.
        int[] arr = new int[l1 + l2]; // Stores the computed or supplied value in a variable for later use.

        while (idx1 < l1 && idx2 < l2) { // Keeps executing this block until the loop condition becomes false.
            if (arr1[idx1] < arr2[idx2]) { // Checks whether the condition is true before taking the matching action.
                arr[idx++] = arr1[idx1++]; // Executes the current statement to update state or trigger the required behavior.
            } else { // Closes the current block and ends the active scope.
                arr[idx++] = arr2[idx2++]; // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.

        while (idx1 < l1) { // Keeps executing this block until the loop condition becomes false.
            arr[idx++] = arr1[idx1++]; // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.


        while (idx2 < l2) { // Keeps executing this block until the loop condition becomes false.
            arr[idx++] = arr2[idx2++]; // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.

        return arr; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.

