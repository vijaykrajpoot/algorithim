package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

public class ArrayBinarySearch { // Defines the Java type that contains the related data and behavior.

    public static int search(int arr[], int num) { // Defines the method that performs this unit of work for the class.

        int lowerIdx = 0; // Stores the computed or supplied value in a variable for later use.
        int upperIdx = arr.length - 1; // Stores the computed or supplied value in a variable for later use.
        int midIdx = 0; // Stores the computed or supplied value in a variable for later use.
        int indexFound = -1; // Stores the computed or supplied value in a variable for later use.

        while (lowerIdx < upperIdx) { // Keeps executing this block until the loop condition becomes false.
            midIdx = (lowerIdx + upperIdx) / 2; // Stores the computed or supplied value in a variable for later use.
            if (arr[midIdx] == num) { // Checks whether the condition is true before taking the matching action.
                indexFound = midIdx; // Stores the computed or supplied value in a variable for later use.

            } // Closes the current block and ends the active scope.
            { // Opens a new block to group the related statements.
                if (arr[midIdx] > num) { // Checks whether the condition is true before taking the matching action.
                    upperIdx = midIdx - 1; // Stores the computed or supplied value in a variable for later use.
                } else { // Closes the current block and ends the active scope.
                    lowerIdx = midIdx + 1; // Stores the computed or supplied value in a variable for later use.
                } // Closes the current block and ends the active scope.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        return indexFound; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.


    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Executes the current statement to update state or trigger the required behavior.
        for(int a : arr){ // Carries out the current statement to support the program's logic.
            System.out.println(ArrayBinarySearch.search(arr, a)); // Prints the result to the console so the current state can be inspected.
        } // Closes the current block and ends the active scope.

    } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.













