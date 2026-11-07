package com.algo.leetcode.seventy_five; // Declares the package so the class is organized under the correct Java namespace.

/**
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
 * <p>
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 * Example 2:
 * <p>
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 * <p>
 * Input: str1 = "ABBCABBC", str2 = "ABBC"
 * Output: "AB"
 * <p>
 * Example 3:
 * <p>
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= str1.length, str2.length <= 1000
 * str1 and str2 consist of English uppercase letters.
 */
public class GreatestCommonDivisor { // Defines the Java type that contains the related data and behavior.
	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

		GreatestCommonDivisor gcd = new GreatestCommonDivisor(); // Stores the computed or supplied value in a variable for later use.
		String aa = gcd.gcdOfStrings("ABBCABBC", "ABBC"); // Stores the computed or supplied value in a variable for later use.
		System.out.println(aa); // Prints the result to the console so the current state can be inspected.

	} // Closes the current block and ends the active scope.

	public String gcdOfStrings(String str1, String str2) { // Defines the method that performs this unit of work for the class.
		if (!(str1 + str2).equals(str2 + str1)) { // Checks whether the condition is true before taking the matching action.
			return ""; // Returns the computed value to the caller and exits the method.
		} // Closes the current block and ends the active scope.
		int len1 = str1.length(); // Stores the computed or supplied value in a variable for later use.
		int len2 = str2.length(); // Stores the computed or supplied value in a variable for later use.
		int l = gcd(len1, len2); // Stores the computed or supplied value in a variable for later use.
		return str2.substring(0,l); // Returns the computed value to the caller and exits the method.

	} // Closes the current block and ends the active scope.

	private int gcd(int a, int b) { // Defines the method that performs this unit of work for the class.

		while (b != 0) { // Keeps executing this block until the loop condition becomes false.
			int temp = b; // Stores the computed or supplied value in a variable for later use.
			b = a % b; // Executes the current statement to update state or trigger the required behavior.
			a = temp; // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
		return a; // Returns the computed value to the caller and exits the method.

	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
