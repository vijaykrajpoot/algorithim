package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.HashMap; // Imports the classes needed to support this file's logic.

public class FirstUniqueCharacterIndex { // Defines the Java type that contains the related data and behavior.

	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

		System.out.println("FirstUniqueCharacter:" + FirstUniqueCharacterIndex.findFirstUniqueChracterIndex("LALALAND")); // Prints the result to the console so the current state can be inspected.

	} // Closes the current block and ends the active scope.

	public static int findFirstUniqueChracterIndex(String str) { // Defines the method that performs this unit of work for the class.
		int idx = 0; // Stores the computed or supplied value in a variable for later use.
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>(); // Stores the computed or supplied value in a variable for later use.
		for (Character ch : str.toCharArray()) { // Repeats the loop body as long as the loop condition remains true.
			if (!hashMap.containsKey(ch)) { // Checks whether the condition is true before taking the matching action.
				hashMap.put(ch, idx); // Executes the current statement to update state or trigger the required behavior.
			} else { // Closes the current block and ends the active scope.
				hashMap.put(ch, -1); // Executes the current statement to update state or trigger the required behavior.
			} // Closes the current block and ends the active scope.
			idx++; // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.

		System.out.println(hashMap); // Prints the result to the console so the current state can be inspected.
		int minVal = Integer.MAX_VALUE; // Stores the computed or supplied value in a variable for later use.

		for (char ch : hashMap.keySet()) { // Repeats the loop body as long as the loop condition remains true.
			if (hashMap.get(ch) > -1 && hashMap.get(ch) < minVal) { // Checks whether the condition is true before taking the matching action.
				minVal = hashMap.get(ch); // Stores the computed or supplied value in a variable for later use.
			} // Closes the current block and ends the active scope.
			System.out.println("minVal:" + minVal); // Prints the result to the console so the current state can be inspected.
		} // Closes the current block and ends the active scope.

		return minVal == Integer.MAX_VALUE ? -1 : minVal; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
