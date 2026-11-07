package com.algo.sorting.search; // Declares the package so the class is organized under the correct Java namespace.

public class SearchItemInRotatedArray { // Defines the Java type that contains the related data and behavior.
    public static int search(int[] arr, int target) { // Defines the method that performs this unit of work for the class.
        int left = 0; // Stores the computed or supplied value in a variable for later use.
        int right = arr.length - 1; // Stores the computed or supplied value in a variable for later use.
        // 50,56,57,58,59,70,80,90,95,|97|,98,99 |100| ,10,20,30,40
        while (left <= right) { // Keeps executing this block until the loop condition becomes false.
            int mid = left + (right - left) / 2; // Stores the computed or supplied value in a variable for later use.
            if (arr[mid] == target) { // Checks whether the condition is true before taking the matching action.
                return mid; // Returns the computed value to the caller and exits the method.
            } // Closes the current block and ends the active scope.
            // If left half is sorted
            if (arr[left] <= arr[mid]) { // Checks whether the condition is true before taking the matching action.
                if (arr[left] <= target && target < arr[mid]) { // Checks whether the condition is true before taking the matching action.
                    right = mid - 1; // Stores the computed or supplied value in a variable for later use.
                } else { // Closes the current block and ends the active scope.
                    left = mid + 1; // Stores the computed or supplied value in a variable for later use.
                } // Closes the current block and ends the active scope.
            } // Closes the current block and ends the active scope.
            // If right half is sorted
            else { // Runs this branch when the previous conditional check is false.
                if (arr[mid] < target && target <= arr[right]) { // Checks whether the condition is true before taking the matching action.
                    left = mid + 1; // Stores the computed or supplied value in a variable for later use.
                } else { // Closes the current block and ends the active scope.
                    right = mid - 1; // Stores the computed or supplied value in a variable for later use.
                } // Closes the current block and ends the active scope.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.

        return -1; // Returns the computed value to the caller and exits the method.

    } // Closes the current block and ends the active scope.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        int[] nums = {50, 56, 57, 58, 59, 70, 80, 90, 95, 97, 98, 99, 100, 10, 20, 30, 40}; // Stores the computed or supplied value in a variable for later use.
        for(int a:nums) { // Carries out the current statement to support the program's logic.
            System.out.println(search(nums, a)); // Output: 4 (index of the target element) // Prints the result to the console so the current state can be inspected.
        } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
