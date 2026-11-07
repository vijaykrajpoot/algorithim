package com.algo.sorting.search; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Arrays; // Imports the classes needed to support this file's logic.

public class InsertionSort { // Defines the Java type that contains the related data and behavior.

	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		int[] arr = {-2,9, 8,10, 7, 6, 5,0, 4,-1, 3, 2, 1}; // Stores the computed or supplied value in a variable for later use.
		InsertionSort insertionSort = new InsertionSort(); // Stores the computed or supplied value in a variable for later use.

		int[] sortedArr = insertionSort.insertionSort(arr); // Stores the computed or supplied value in a variable for later use.
		System.out.println(Arrays.toString(sortedArr)); // Prints the result to the console so the current state can be inspected.
	} // Closes the current block and ends the active scope.

	int[] insertionSort(int[] arr) { // Defines the method that performs this unit of work for the class.
		for (int i = 1; i < arr.length; i++) { // Repeats the loop body as long as the loop condition remains true.
			int selected = arr[i];      // Current element to insert // Carries out the current statement to support the program's logic.
			int prev = i - 1;           // Start comparing with the previous element // Carries out the current statement to support the program's logic.
			// Shift elements > selected to the right
			while (prev >= 0 && arr[prev] > selected) { // Keeps executing this block until the loop condition becomes false.
				arr[prev + 1] = arr[prev];  // Move larger elements forward // Carries out the current statement to support the program's logic.
				prev--;                     // Move left in the sorted subarray // Carries out the current statement to support the program's logic.
			} // Closes the current block and ends the active scope.
			arr[prev + 1] = selected;  // Insert selected in its correct position // Carries out the current statement to support the program's logic.
		} // Closes the current block and ends the active scope.
		return arr; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
