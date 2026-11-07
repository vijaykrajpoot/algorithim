package com.algo.sorting.search; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Arrays; // Imports the classes needed to support this file's logic.

public class SelectionSort { // Defines the Java type that contains the related data and behavior.
	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		int[] arr = {50, 10, 80, 90, -10, 70, 10, 20, 30}; // Stores the computed or supplied value in a variable for later use.
		selectionSort(arr); // Executes the current statement to update state or trigger the required behavior.
		System.out.println(Arrays.toString(arr)); // Prints the result to the console so the current state can be inspected.
	} // Closes the current block and ends the active scope.

	static void selectionSort(int[] arr) { // Defines the method that performs this unit of work for the class.
		for (int i = 0; i < arr.length; i++) { // Repeats the loop body as long as the loop condition remains true.
			int minIdx = i; // Stores the computed or supplied value in a variable for later use.
			for (int j = i + 1; j < arr.length; j++) { // Repeats the loop body as long as the loop condition remains true.
				if (arr[j] < arr[minIdx]) { // Checks whether the condition is true before taking the matching action.
					minIdx = j; // Stores the computed or supplied value in a variable for later use.
				} // Closes the current block and ends the active scope.
			} // Closes the current block and ends the active scope.
			int temp = arr[minIdx]; // Stores the computed or supplied value in a variable for later use.
			arr[minIdx] = arr[i]; // Executes the current statement to update state or trigger the required behavior.
			arr[i] = temp; // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
