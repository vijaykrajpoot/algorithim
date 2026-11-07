package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.ArrayList; // Imports the classes needed to support this file's logic.
import java.util.Arrays; // Imports the classes needed to support this file's logic.
import java.util.List; // Imports the classes needed to support this file's logic.

public class ArrayIntersection { // Defines the Java type that contains the related data and behavior.

	static int[] findIntersection(int arr1[], int arr2[]) { // Defines the method that performs this unit of work for the class.
		int[] result = null; // Stores the computed or supplied value in a variable for later use.

		if (arr1 == null || arr2 == null) { // Checks whether the condition is true before taking the matching action.
			throw new IllegalArgumentException("Invalid Input"); // Raises an exception to signal an invalid or unexpected condition.
		} // Closes the current block and ends the active scope.

		Arrays.sort(arr1); // Executes the current statement to update state or trigger the required behavior.
		Arrays.sort(arr2); // Executes the current statement to update state or trigger the required behavior.
		List<Integer> arrList = new ArrayList<Integer>(); // Stores the computed or supplied value in a variable for later use.
		for (int i = 0; i < arr1.length; i++) { // Repeats the loop body as long as the loop condition remains true.

			if (Arrays.binarySearch(arr2, arr1[i]) > -1) { // Checks whether the condition is true before taking the matching action.
				arrList.add(arr1[i]); // Executes the current statement to update state or trigger the required behavior.
			} // Closes the current block and ends the active scope.

		} // Closes the current block and ends the active scope.

		int idx = 0; // Stores the computed or supplied value in a variable for later use.
		result = new int[arrList.size()]; // Stores the computed or supplied value in a variable for later use.
		for (int i : arrList) { // Repeats the loop body as long as the loop condition remains true.
			result[idx++] = i; // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
		return result; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		int arr1[] = {1}; // Executes the current statement to update state or trigger the required behavior.
		int arr2[] = { 2, 2, 2, 1 }; // Executes the current statement to update state or trigger the required behavior.
		int arr[] = findIntersection(arr1, arr2); // Executes the current statement to update state or trigger the required behavior.

		for (int i = 0; i < arr.length; i++) { // Repeats the loop body as long as the loop condition remains true.
			System.out.println(arr[i] + " "); // Prints the result to the console so the current state can be inspected.
		} // Closes the current block and ends the active scope.
	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.