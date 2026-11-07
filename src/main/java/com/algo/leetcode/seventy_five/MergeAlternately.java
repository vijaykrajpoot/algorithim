package com.algo.leetcode.seventy_five; // Declares the package so the class is organized under the correct Java namespace.
// 1768. Merge Strings Alternately
/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. // Carries out the current statement to support the program's logic.
If a string is longer than the other, append the additional letters onto the end of the merged string. // Carries out the current statement to support the program's logic.

Return the merged string. // Carries out the current statement to support the program's logic.

Example 1: // Carries out the current statement to support the program's logic.

Input: word1 = "abc", word2 = "pqr" // Carries out the current statement to support the program's logic.
Output: "apbqcr" // Carries out the current statement to support the program's logic.
Explanation: The merged string will be merged as so: // Carries out the current statement to support the program's logic.
word1:  a   b   c // Carries out the current statement to support the program's logic.
word2:    p   q   r // Carries out the current statement to support the program's logic.
merged: a p b q c r // Carries out the current statement to support the program's logic.

Example 2: // Carries out the current statement to support the program's logic.
Input: word1 = "ab", word2 = "pqrs" // Carries out the current statement to support the program's logic.
Output: "apbqrs" // Carries out the current statement to support the program's logic.
Explanation: Notice that as word2 is longer, "rs" is appended to the end. // Carries out the current statement to support the program's logic.
word1:  a   b // Carries out the current statement to support the program's logic.
word2:    p   q   r   s // Carries out the current statement to support the program's logic.
merged: a p b q   r   s // Carries out the current statement to support the program's logic.

Example 3: // Carries out the current statement to support the program's logic.
Input: word1 = "abcd", word2 = "pq" // Carries out the current statement to support the program's logic.
Output: "apbqcd" // Carries out the current statement to support the program's logic.

Explanation: Notice that as word1 is longer, "cd" is appended to the end. // Carries out the current statement to support the program's logic.
word1:  a   b   c   d // Carries out the current statement to support the program's logic.
word2:    p   q // Carries out the current statement to support the program's logic.
merged: a p b q c   d // Carries out the current statement to support the program's logic.

Constraints: // Carries out the current statement to support the program's logic.
		1 <= word1.length, word2.length <= 100 // Carries out the current statement to support the program's logic.
word1 and word2 consist of lowercase English letters.*/ // Carries out the current statement to support the program's logic.

public class MergeAlternately { // Defines the Java type that contains the related data and behavior.

	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		MergeAlternately solution = new MergeAlternately(); // Stores the computed or supplied value in a variable for later use.
		String word1 = "abcd"; // Stores the computed or supplied value in a variable for later use.
		String word2 = "pq"; // Stores the computed or supplied value in a variable for later use.
		String mergedString = solution.mergeAlternately(word1, word2); // Stores the computed or supplied value in a variable for later use.
		System.out.println("mergedString:"+ mergedString); // Prints the result to the console so the current state can be inspected.
	} // Closes the current block and ends the active scope.

	public String mergeAlternately(String word1, String word2) { // Defines the method that performs this unit of work for the class.

		char[] arr1 = word1.toCharArray(); // Stores the computed or supplied value in a variable for later use.
		char[] arr2 = word2.toCharArray(); // Stores the computed or supplied value in a variable for later use.
		int idx1 = 0; // Stores the computed or supplied value in a variable for later use.
		int idx2 = 0; // Stores the computed or supplied value in a variable for later use.
		int idx = 0; // Stores the computed or supplied value in a variable for later use.
		int len1 = arr1.length; // Stores the computed or supplied value in a variable for later use.
		int len2 = arr2.length; // Stores the computed or supplied value in a variable for later use.
		char[] arr = new char[len1 + len2]; // Stores the computed or supplied value in a variable for later use.
		boolean skip = false; // Stores the computed or supplied value in a variable for later use.
		while (idx1 < len1 && idx2 < len2) { // Keeps executing this block until the loop condition becomes false.
			if (!skip) { // Checks whether the condition is true before taking the matching action.
				arr[idx++] = arr1[idx1++]; // Executes the current statement to update state or trigger the required behavior.
			} else { // Closes the current block and ends the active scope.
				arr[idx++] = arr2[idx2++]; // Executes the current statement to update state or trigger the required behavior.
			} // Closes the current block and ends the active scope.
			skip = !skip; // Stores the computed or supplied value in a variable for later use.
		} // Closes the current block and ends the active scope.
		while (idx1 < len1) { // Keeps executing this block until the loop condition becomes false.
			arr[idx++] = arr1[idx1++]; // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
		while (idx2 < len2) { // Keeps executing this block until the loop condition becomes false.
			arr[idx++] = arr2[idx2++]; // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
		return new String(arr); // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
