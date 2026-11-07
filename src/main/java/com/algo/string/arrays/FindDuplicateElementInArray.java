package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

/**
 * Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear
 * time using less than O(n) space and traversing the stream sequentially O(1) times.
 *
 * @author Vijay Kumar Rajput
 */


public class FindDuplicateElementInArray { // Defines the Java type that contains the related data and behavior.

	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

		int arr[] = {3, 4, 1, 20, 14}; // Executes the current statement to update state or trigger the required behavior.
		FindDuplicateElementInArray.findDuplicate(arr); // Executes the current statement to update state or trigger the required behavior.

	} // Closes the current block and ends the active scope.

	static void findDuplicate(int arr[]) { // Defines the method that performs this unit of work for the class.
		int n = arr.length; // Stores the computed or supplied value in a variable for later use.

		for (int i = 0; i < n; i++) { // Repeats the loop body as long as the loop condition remains true.
			int index = (arr[i] % n) - 1; // Calculate index properly // Carries out the current statement to support the program's logic.
			if (arr[index] >= n) { // Checks whether the condition is true before taking the matching action.
				System.out.println("Duplicate element found: " + (index + 1)); // Prints the result to the console so the current state can be inspected.
			} else { // Closes the current block and ends the active scope.
				arr[index] += n; // Mark the element as visited // Carries out the current statement to support the program's logic.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.
	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.


