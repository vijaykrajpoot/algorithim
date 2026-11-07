package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Stack; // Imports the classes needed to support this file's logic.

public class BracketsMatcher { // Defines the Java type that contains the related data and behavior.

	public static boolean isBracketsBalanced(String str) { // Defines the method that performs this unit of work for the class.
		if (str == null || str.length() == 0) // Checks whether the condition is true before taking the matching action.
			throw new IllegalArgumentException("Invalid Input"); // Raises an exception to signal an invalid or unexpected condition.
		Stack<Character> stack = new Stack<Character>(); // Stores the computed or supplied value in a variable for later use.

		for (int i = 0; i < str.length(); i++) { // Repeats the loop body as long as the loop condition remains true.
			char ch = str.charAt(i); // Stores the computed or supplied value in a variable for later use.
			if (ch == '(' || ch == '{' || ch == '[') { // Checks whether the condition is true before taking the matching action.
				stack.push(ch); // Executes the current statement to update state or trigger the required behavior.
			} else if (stack.isEmpty()) { // Closes the current block and ends the active scope.
				return false; // Returns the computed value to the caller and exits the method.
			} else if (ch == ')' && stack.pop() != '(') { // Closes the current block and ends the active scope.
				return false; // Returns the computed value to the caller and exits the method.
			} else if (ch == '}' && stack.pop() != '{') { // Closes the current block and ends the active scope.
				return false; // Returns the computed value to the caller and exits the method.
			} else if (ch == ']' && stack.pop() != '[') { // Closes the current block and ends the active scope.
				return false; // Returns the computed value to the caller and exits the method.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.
		return stack.isEmpty(); // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		System.out.println(BracketsMatcher.isBracketsBalanced("([])")); // Prints the result to the console so the current state can be inspected.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
