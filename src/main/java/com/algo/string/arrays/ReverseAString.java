package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

/**
 * Write a function that reverses a string. The input string is given as an array of characters char[]. Do not allocate extra space for another array, you must do this by modifying the input array
 * in-place with O(1) extra memory. You may assume all the characters consist of printable ascii characters.
 * 
 * @author Vijay
 *
 */
public class ReverseAString { // Defines the Java type that contains the related data and behavior.

	public void reverseString(char[] s) { // Defines the method that performs this unit of work for the class.
		int len = s.length; // Stores the computed or supplied value in a variable for later use.
		char temp = ' '; // Stores the computed or supplied value in a variable for later use.
		for (int i = 0, j = len - 1; i < len/2; i++, j--) { // Repeats the loop body as long as the loop condition remains true.
			temp = s[i]; // Stores the computed or supplied value in a variable for later use.
			s[i] = s[j]; // Executes the current statement to update state or trigger the required behavior.
			s[j] = temp; // Executes the current statement to update state or trigger the required behavior.
			
		} // Closes the current block and ends the active scope.

		for (int i = 0; i < s.length; i++) { // Repeats the loop body as long as the loop condition remains true.
			System.out.print(s[i] + ","); // Prints the value without moving to a new line.
		} // Closes the current block and ends the active scope.
	} // Closes the current block and ends the active scope.

	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		//char aa[] =new char[] {'h','e','l','l','o',};
		char aa[] =null; // Executes the current statement to update state or trigger the required behavior.
		new ReverseAString().reverseString(aa); // Creates a new object instance so the code can use that class's behavior.

	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
