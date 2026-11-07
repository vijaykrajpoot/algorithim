package parctice; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Arrays; // Imports the classes needed to support this file's logic.
import java.util.HashMap; // Imports the classes needed to support this file's logic.
import java.util.List; // Imports the classes needed to support this file's logic.
import java.util.Map; // Imports the classes needed to support this file's logic.

public class TwoSum3 { // Defines the Java type that contains the related data and behavior.
	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		int[] arr = {12, 5, 8, 6, 4, 8, 2, 3, 7, 13,10, 25}; // Stores the computed or supplied value in a variable for later use.
		int[] result = twoSum(arr, 25); // Stores the computed or supplied value in a variable for later use.
		System.out.println(Arrays.toString(result)); // Prints the result to the console so the current state can be inspected.
	} // Closes the current block and ends the active scope.

	private static int[] twoSum(int[] arr, int target) { // Defines the method that performs this unit of work for the class.
		for (int i = 0; i < arr.length; i++) { // Repeats the loop body as long as the loop condition remains true.
			int element = target - arr[i]; // Stores the computed or supplied value in a variable for later use.
			int idx = findItem(arr, element); // Stores the computed or supplied value in a variable for later use.
			if (idx > -1) { // Checks whether the condition is true before taking the matching action.
				return new int[]{i, idx}; // Returns the computed value to the caller and exits the method.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.
		List<Long> aa=null; // Stores the computed or supplied value in a variable for later use.
		aa.stream().mapToLong(Long::longValue).sum(); // Executes the current statement to update state or trigger the required behavior.
 		return new int[]{}; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

	private static int findItem(int[] arr, int element) { // Defines the method that performs this unit of work for the class.
		for (int i = 0; i < arr.length; i++) { // Repeats the loop body as long as the loop condition remains true.
			if (element == arr[i]) { // Checks whether the condition is true before taking the matching action.
				return i; // Returns the computed value to the caller and exits the method.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.
		return -1; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
