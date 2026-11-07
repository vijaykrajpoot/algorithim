package parctice; // Declares the package so the class is organized under the correct Java namespace.

import com.algo.string.arrays.ValidParentheses; // Imports the classes needed to support this file's logic.

import java.util.Stack; // Imports the classes needed to support this file's logic.

public class ValidBrackets { // Defines the Java type that contains the related data and behavior.

	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		ValidBrackets validator = new ValidBrackets(); // Stores the computed or supplied value in a variable for later use.
		System.out.println(validator.isValid("()")); // true // Prints the result to the console so the current state can be inspected.
		System.out.println(validator.isValid("()[]{}")); // true // Prints the result to the console so the current state can be inspected.
		System.out.println(validator.isValid("(]")); // false // Prints the result to the console so the current state can be inspected.
		System.out.println(validator.isValid("([)]")); // false // Prints the result to the console so the current state can be inspected.
		System.out.println(validator.isValid("{[]}")); // true // Prints the result to the console so the current state can be inspected.
	} // Closes the current block and ends the active scope.

	// [ ]
	public boolean isValid(String str) { // Defines the method that performs this unit of work for the class.
		char[] ch = str.toCharArray(); // Stores the computed or supplied value in a variable for later use.
		Stack<Character> charStack = new Stack<>(); // Stores the computed or supplied value in a variable for later use.
		for (char c : ch) { // Repeats the loop body as long as the loop condition remains true.
			if (c == '{' || c == '(' || c == '[') { // Checks whether the condition is true before taking the matching action.
				charStack.push(c); // Executes the current statement to update state or trigger the required behavior.
			} else if(charStack.isEmpty()){ // Closes the current block and ends the active scope.
				return false; // Returns the computed value to the caller and exits the method.
			}else if (c == ')' && charStack.pop() != '('){ // Closes the current block and ends the active scope.
				return false; // Returns the computed value to the caller and exits the method.
			}else if (c == '}' && charStack.pop() != '{'){ // Closes the current block and ends the active scope.
				return false; // Returns the computed value to the caller and exits the method.
			}else if (c == ']' && charStack.pop() != '['){ // Closes the current block and ends the active scope.
				return false; // Returns the computed value to the caller and exits the method.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.
		return charStack.isEmpty(); // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
