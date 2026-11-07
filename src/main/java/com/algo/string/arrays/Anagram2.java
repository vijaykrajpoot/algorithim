package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

public class Anagram2 { // Defines the Java type that contains the related data and behavior.

	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		String s1="dormitory"; // Stores the computed or supplied value in a variable for later use.
		String s2="dirty room"; // Stores the computed or supplied value in a variable for later use.
		boolean result = isAnagram(s1, s2); // Stores the computed or supplied value in a variable for later use.
		if (result) { // Checks whether the condition is true before taking the matching action.
			System.out.println("Test case Success: " + s1 + " and " + s2 + " should be detected as anagrams."); // Prints the result to the console so the current state can be inspected.
		}else{ // Closes the current block and ends the active scope.
			System.err.println("Test case Failed: " + s1 + " and " + s2 + " should not be detected as anagrams."); // Executes the current statement to update state or trigger the required behavior.

		} // Closes the current block and ends the active scope.

	} // Closes the current block and ends the active scope.

	static boolean isAnagram(String actualString, String targetString) { // Defines the method that performs this unit of work for the class.
		boolean result = false; // Stores the computed or supplied value in a variable for later use.
		char[] sourceArr = actualString.toCharArray(); // Stores the computed or supplied value in a variable for later use.
		char[] tArr = targetString.toCharArray(); // Stores the computed or supplied value in a variable for later use.
		StringBuilder sb = new StringBuilder(); // Stores the computed or supplied value in a variable for later use.
		for (char c : tArr) { // Repeats the loop body as long as the loop condition remains true.
			if (c == ' ') // Checks whether the condition is true before taking the matching action.
				continue; // Skips the rest of the current loop iteration and moves to the next one.
			int index = actualString.indexOf(c); // Stores the computed or supplied value in a variable for later use.
			if (index > -1) { // Checks whether the condition is true before taking the matching action.
				result = true; // Stores the computed or supplied value in a variable for later use.
			//	System.out.println("sourceArr[" + index + "]:" + sourceArr[index]);
				sb.append(sourceArr[index]); // Executes the current statement to update state or trigger the required behavior.
			}else{ // Closes the current block and ends the active scope.
				result =false; // Stores the computed or supplied value in a variable for later use.
				break; // Exits the current loop or switch branch immediately.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.
		System.out.println(sb.toString()); // Prints the result to the console so the current state can be inspected.
		return result; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
