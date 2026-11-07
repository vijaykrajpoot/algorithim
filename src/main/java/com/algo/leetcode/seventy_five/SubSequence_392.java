package com.algo.leetcode.seventy_five; // Declares the package so the class is organized under the correct Java namespace.

import java.util.HashMap; // Imports the classes needed to support this file's logic.
import java.util.Stack; // Imports the classes needed to support this file's logic.

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * <p>
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
 * of the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 100
 * 0 <= t.length <= 104
 * s and t consist only of lowercase English letters.
 */
public class SubSequence_392 { // Defines the Java type that contains the related data and behavior.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        SubSequence_392 subSequence392 = new SubSequence_392(); // Stores the computed or supplied value in a variable for later use.
        boolean result=false; // Stores the computed or supplied value in a variable for later use.
        result = subSequence392.isSubsequence("abc", "ahbgdcdefg"); // Stores the computed or supplied value in a variable for later use.
        System.out.println("isSubsequence:" + result); // Prints the result to the console so the current state can be inspected.
//        result = subSequence392.isSubsequence("axc", "ahbgdc");
//        System.out.println("isSubsequence:" + result);
//        result = subSequence392.isSubsequence("acb", "ahbgdc");
//        System.out.println("isSubsequence:" + result);
//        result = subSequence392.isSubsequence("aaaaaa", "bbaaaas");
//        System.out.println("isSubsequence:" + result);


    } // Closes the current block and ends the active scope.

    public boolean isSubsequence(String s, String t) { // Defines the method that performs this unit of work for the class.
        if (s.isEmpty()) // Checks whether the condition is true before taking the matching action.
            return true; // Returns the computed value to the caller and exits the method.
        if (t.isEmpty()) // Checks whether the condition is true before taking the matching action.
            return false; // Returns the computed value to the caller and exits the method.

        System.out.println("Source :"+ s); // Prints the result to the console so the current state can be inspected.
        System.out.println("Target :"+ t); // Prints the result to the console so the current state can be inspected.

        int sourceLen = s.length(); // Stores the computed or supplied value in a variable for later use.
        int targetLen = t.length(); // Stores the computed or supplied value in a variable for later use.
        int sourceIdx = 0; // Stores the computed or supplied value in a variable for later use.

        for (int targetIdx = 0; targetIdx < targetLen; targetIdx++) { // Repeats the loop body as long as the loop condition remains true.
            if (t.charAt(targetIdx) == s.charAt(sourceIdx)) { // Checks whether the condition is true before taking the matching action.
                sourceIdx++; // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
            if (sourceIdx >=sourceLen) { // Checks whether the condition is true before taking the matching action.
                return true; // Returns the computed value to the caller and exits the method.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        return false; // Returns the computed value to the caller and exits the method.

    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
