package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

public class ReverseAnArray { // Defines the Java type that contains the related data and behavior.

	public static int[] reverseArray(int arr[]) { // Defines the method that performs this unit of work for the class.
		
		if (arr==null){ // Checks whether the condition is true before taking the matching action.
			throw new IllegalArgumentException("Emopty or Null Array"); // Raises an exception to signal an invalid or unexpected condition.
		} // Closes the current block and ends the active scope.
		
		for (int index = 0; index <= arr.length / 2 - 1; index++) { // Repeats the loop body as long as the loop condition remains true.
			int temp = arr[index]; // Stores the computed or supplied value in a variable for later use.
			arr[index] = arr[arr.length - index - 1]; // Executes the current statement to update state or trigger the required behavior.
			arr[arr.length - index - 1] = temp; // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
		return arr; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
