package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Arrays; // Imports the classes needed to support this file's logic.
import java.util.HashMap; // Imports the classes needed to support this file's logic.
import java.util.List; // Imports the classes needed to support this file's logic.

public class ValidParentheses { // Defines the Java type that contains the related data and behavior.

	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		System.out.println(ValidParentheses.isValidParentheses(" [ ( [ { ( ) } ] ) ]")); // Prints the result to the console so the current state can be inspected.
	} // Closes the current block and ends the active scope.

	public static boolean isValidParentheses(String str) { // Defines the method that performs this unit of work for the class.
		Stack<Character> charStack = new Stack<>(); // Stores the computed or supplied value in a variable for later use.
		boolean isValid = true; // Stores the computed or supplied value in a variable for later use.
		List<Character> openingBrackets = Arrays.asList(new Character[] { '[', '{', '(' }); // Stores the computed or supplied value in a variable for later use.
		List<Character> closingBrackets = Arrays.asList(new Character[] { ']', '}', ')' }); // Stores the computed or supplied value in a variable for later use.

		HashMap<Character, Character> hashMap = new HashMap<Character, Character>(); // Stores the computed or supplied value in a variable for later use.
		hashMap.put('(', ')'); // Executes the current statement to update state or trigger the required behavior.
		hashMap.put('[', ']'); // Executes the current statement to update state or trigger the required behavior.
		hashMap.put('{', '}'); // Executes the current statement to update state or trigger the required behavior.
		hashMap.put(')', '('); // Executes the current statement to update state or trigger the required behavior.
		hashMap.put('}', '{'); // Executes the current statement to update state or trigger the required behavior.
		hashMap.put(']', '['); // Executes the current statement to update state or trigger the required behavior.

		for (char ch : str.toCharArray()) { // Repeats the loop body as long as the loop condition remains true.
			if (openingBrackets.contains(ch)) { // Checks whether the condition is true before taking the matching action.
				charStack.push(ch); // Executes the current statement to update state or trigger the required behavior.
			} else { // Closes the current block and ends the active scope.
				if (closingBrackets.contains(ch)) { // Checks whether the condition is true before taking the matching action.

					if (!charStack.isEmpty()) { // Checks whether the condition is true before taking the matching action.
						if (hashMap.get(charStack.pop()).equals(ch)) { // Checks whether the condition is true before taking the matching action.
							isValid = true; // Stores the computed or supplied value in a variable for later use.
						}else { // Closes the current block and ends the active scope.
							isValid = false; // Stores the computed or supplied value in a variable for later use.
							break; // Exits the current loop or switch branch immediately.
						} // Closes the current block and ends the active scope.
					} else { // Closes the current block and ends the active scope.
						isValid = false; // Stores the computed or supplied value in a variable for later use.
						break; // Exits the current loop or switch branch immediately.
					} // Closes the current block and ends the active scope.
				} // Closes the current block and ends the active scope.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.

		return charStack.isEmpty() && isValid; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
