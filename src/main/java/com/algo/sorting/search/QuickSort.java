package com.algo.sorting.search; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Arrays; // Imports the classes needed to support this file's logic.


public class QuickSort { // Defines the Java type that contains the related data and behavior.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        QuickSort qs = new QuickSort(); // Stores the computed or supplied value in a variable for later use.
        int[] arr = {3, 10,2, -1, 44, -232, 1, 6, 7,-90, 9, -67, -89, 6, 32, -1, -12}; // Stores the computed or supplied value in a variable for later use.
        //int[] arr = {10, 5, 8, 9, 3, 6, 15, 12, 16, 6};

        System.out.println(Arrays.toString(arr)); // Prints the result to the console so the current state can be inspected.
        qs.quickSort(arr, 0, arr.length - 1); // Executes the current statement to update state or trigger the required behavior.
        System.out.println(Arrays.toString(arr)); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.

    void quickSort(int[] arr, int low, int high) { // Defines the method that performs this unit of work for the class.
        if (low < high) { // Checks whether the condition is true before taking the matching action.
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high); // Stores the computed or supplied value in a variable for later use.
            System.out.println("Pivot Index:" + pivotIndex); // Prints the result to the console so the current state can be inspected.
            // Recursively sort the left and right subarrays
            quickSort(arr, low, pivotIndex - 1); // Executes the current statement to update state or trigger the required behavior.
            quickSort(arr, pivotIndex + 1, high); // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    int partition(int[] arr, int low, int high) { // Defines the method that performs this unit of work for the class.
        int pivot = arr[high]; // Stores the computed or supplied value in a variable for later use.
        int i = low - 1; // Stores the computed or supplied value in a variable for later use.
        for (int j = low; j < high; j++) { // Repeats the loop body as long as the loop condition remains true.
            // If current element is < pivot, move it to the left section
            if (arr[j] < pivot) { // Checks whether the condition is true before taking the matching action.
                i++; // Executes the current statement to update state or trigger the required behavior.
                swap(arr, i, j);  // Swap elements at i and j // Carries out the current statement to support the program's logic.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        swap(arr, i + 1, high);  // Swap elements at i and j // Carries out the current statement to support the program's logic.
        return i + 1; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    void swap(int[] arr, int i, int j) { // Defines the method that performs this unit of work for the class.
        int temp = arr[i]; // Stores the computed or supplied value in a variable for later use.
        arr[i] = arr[j]; // Executes the current statement to update state or trigger the required behavior.
        arr[j] = temp; // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
