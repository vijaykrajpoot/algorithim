package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Random; // Imports the classes needed to support this file's logic.

public class CharTest { // Defines the Java type that contains the related data and behavior.
	private static Random rand = new Random(); // Stores the computed or supplied value in a variable for later use.
	// r - 0-9
	// r - 10 -35
	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		StringBuilder shortURL = new StringBuilder(); // Stores the computed or supplied value in a variable for later use.
		for (int i = 0; i < 6; ++i) { // Repeats the loop body as long as the loop condition remains true.
			int r = rand.nextInt(62); // Stores the computed or supplied value in a variable for later use.
			if (r < 10) { // Checks whether the condition is true before taking the matching action.
				shortURL.append(r); // Executes the current statement to update state or trigger the required behavior.
			} else if (r < 36) { // Closes the current block and ends the active scope.
				System.out.println("(char) (r - 10 + 'a'):"+ ((char) (r - 10 + 'A'))); // Prints the result to the console so the current state can be inspected.
				shortURL.append((char) (r - 10 + 'A')); // Executes the current statement to update state or trigger the required behavior.
			} else { // Closes the current block and ends the active scope.
				System.out.println("(char) (r - 36 + 'a'):"+ ((char) (r - 36 + 'a'))); // Prints the result to the console so the current state can be inspected.
				shortURL.append((char) (r - 36 + 'A')); // Executes the current statement to update state or trigger the required behavior.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.
		System.err.println(shortURL.toString()); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
