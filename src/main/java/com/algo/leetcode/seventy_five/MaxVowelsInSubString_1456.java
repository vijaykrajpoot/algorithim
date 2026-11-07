package com.algo.leetcode.seventy_five; // Declares the package so the class is organized under the correct Java namespace.

/**
 * Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
 * <p>
 * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abciiidef", k = 3
 * Output: 3
 * Explanation: The substring "iii" contains 3 vowel letters.
 * Example 2:
 * <p>
 * Input: s = "aeiou", k = 2
 * Output: 2
 * Explanation: Any substring of length 2 contains 2 vowels.
 * Example 3:
 * <p>
 * Input: s = "leetcode", k = 3
 * Output: 2
 * Explanation: "lee", "eet" and "ode" contain 2 vowels.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 105
 * s consists of lowercase English letters.
 * 1 <= k <= s.length
 */

import java.util.*; // Imports the classes needed to support this file's logic.


class MaxVowelsInSubString_1456 { // Defines the Java type that contains the related data and behavior.
    HashSet<Character> hashSet = new HashSet<>(); // Stores the computed or supplied value in a variable for later use.
    List<Character> aa = Arrays.asList('a', 'e', 'i', 'o', 'u'); // Stores the computed or supplied value in a variable for later use.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        String st = "leetcode"; // Stores the computed or supplied value in a variable for later use.
        int k = 2; // Stores the computed or supplied value in a variable for later use.
        MaxVowelsInSubString_1456 maxVowelsInSubString1456 = new MaxVowelsInSubString_1456(); // Stores the computed or supplied value in a variable for later use.
        int result = maxVowelsInSubString1456.maxVowelSolution1(st, k); // Stores the computed or supplied value in a variable for later use.
        System.out.println(result); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.

    public int maxVowelSolution2(String s, int k) { // Defines the method that performs this unit of work for the class.
        int count = 0; // Stores the computed or supplied value in a variable for later use.
        for (int i = 0; i < k; i++) { // Repeats the loop body as long as the loop condition remains true.
            if (isV(s.charAt(i))) { // Checks whether the condition is true before taking the matching action.
                count++; // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        int maxV = count; // Stores the computed or supplied value in a variable for later use.
        for (int i = k; i < s.length(); i++) { // Repeats the loop body as long as the loop condition remains true.
            if (isV(s.charAt(i))) { // Checks whether the condition is true before taking the matching action.
                count++; // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
            if (isV(s.charAt(i - k))) { // Checks whether the condition is true before taking the matching action.
                count--; // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.

        if (maxV > count) { // Checks whether the condition is true before taking the matching action.
            maxV = count; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.
        return maxV; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    private boolean isV(char c) { // Defines the method that performs this unit of work for the class.
        return hashSet.contains(c); // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    public int maxVowelSolution1(String s, int k) { // Defines the method that performs this unit of work for the class.
        int maxVcCount = 0; // Stores the computed or supplied value in a variable for later use.
        hashSet.addAll(aa); // Executes the current statement to update state or trigger the required behavior.
        for (int i = 0; i < s.length(); i++) { // Repeats the loop body as long as the loop condition remains true.
            if (i + k <= s.length()) { // Checks whether the condition is true before taking the matching action.
                String st = s.substring(i, i + k); // Stores the computed or supplied value in a variable for later use.
                int c = countVW(st); // Stores the computed or supplied value in a variable for later use.
                if (c > maxVcCount) { // Checks whether the condition is true before taking the matching action.
                    maxVcCount = c; // Stores the computed or supplied value in a variable for later use.
                } // Closes the current block and ends the active scope.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        return maxVcCount; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    int countVW(String st) { // Defines the method that performs this unit of work for the class.
        int count = 0; // Stores the computed or supplied value in a variable for later use.
        for (int i = 0; i < st.length(); i++) { // Repeats the loop body as long as the loop condition remains true.
            if (hashSet.contains(st.charAt(i))) { // Checks whether the condition is true before taking the matching action.
                count++; // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        return count; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
