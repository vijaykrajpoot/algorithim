package com.algo.sorting.search; // Declares the package so the class is organized under the correct Java namespace.

public class MergeSortedArray { // Defines the Java type that contains the related data and behavior.

	public static int[] mergeArrays(int arr1[], int[] arr2) { // Defines the method that performs this unit of work for the class.

		// create a empty array of length of arr1+arr2
		int arr[] = new int[arr1.length + arr2.length]; // Executes the current statement to update state or trigger the required behavior.
		int idx = 0, idx1 = 0, idx2 = 0; // Stores the computed or supplied value in a variable for later use.
		
		while (idx1 < arr1.length && idx2 < arr2.length) { // Keeps executing this block until the loop condition becomes false.
			if (arr1[idx1] <= arr2[idx2]) { // Checks whether the condition is true before taking the matching action.
				arr[idx++] = arr1[idx1++]; // Executes the current statement to update state or trigger the required behavior.
			} else { // Closes the current block and ends the active scope.
				arr[idx++] = arr2[idx2++]; // Executes the current statement to update state or trigger the required behavior.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.
		// Collect rest of the items from arr1
		while (idx1 < arr1.length) { // Keeps executing this block until the loop condition becomes false.
			arr[idx++] = arr1[idx1++]; // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
		
		// Collect rest of the items from arr2
		while (idx2 < arr2.length) { // Keeps executing this block until the loop condition becomes false.
			arr[idx++] = arr2[idx2++]; // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.

		return arr; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.