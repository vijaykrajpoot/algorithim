package com.algo.leetcode.seventy_five; // Declares the package so the class is organized under the correct Java namespace.

import java.util.HashSet; // Imports the classes needed to support this file's logic.

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 * <p>
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases,
 * more than once.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "hello"
 * Output: "holle"
 * Example 2:
 * <p>
 * Input: s = "leetcode"
 * Output: "leotcede"
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 3 * 105
 * s consist of printable ASCII characters.
 */
public class ReverseVowelsOfAString { // Defines the Java type that contains the related data and behavior.
    HashSet<Character> hashSet = new HashSet<>(); // Stores the computed or supplied value in a variable for later use.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        ReverseVowelsOfAString reverseVowelsOfAString = new ReverseVowelsOfAString(); // Stores the computed or supplied value in a variable for later use.
        reverseVowelsOfAString.prepareVowelSet(); // Executes the current statement to update state or trigger the required behavior.
        String rev = reverseVowelsOfAString.reverseVowels("leetcode"); // Stores the computed or supplied value in a variable for later use.
        System.out.println(rev); // Prints the result to the console so the current state can be inspected.


    } // Closes the current block and ends the active scope.

    public String reverseVowels(String s) { // Defines the method that performs this unit of work for the class.
        int stIdx = 0; // Stores the computed or supplied value in a variable for later use.
        int endIdx = s.length() - 1; // Stores the computed or supplied value in a variable for later use.
        char[] charArray = s.toCharArray(); // Stores the computed or supplied value in a variable for later use.

        while (stIdx < endIdx) { // Keeps executing this block until the loop condition becomes false.
            if (isVowel(s.charAt(stIdx)) && isVowel(s.charAt(endIdx))) { // Checks whether the condition is true before taking the matching action.
                // Swap
                char temp = charArray[stIdx]; // Stores the computed or supplied value in a variable for later use.
                charArray[stIdx] = charArray[endIdx]; // Executes the current statement to update state or trigger the required behavior.
                charArray[endIdx] = temp; // Executes the current statement to update state or trigger the required behavior.
            } else if (!isVowel(s.charAt(stIdx))) { // Closes the current block and ends the active scope.
                stIdx++; // Executes the current statement to update state or trigger the required behavior.
                continue; // Skips the rest of the current loop iteration and moves to the next one.
            } else if (!isVowel(s.charAt(endIdx))) { // Closes the current block and ends the active scope.
                endIdx--; // Executes the current statement to update state or trigger the required behavior.
                continue; // Skips the rest of the current loop iteration and moves to the next one.
            } // Closes the current block and ends the active scope.
            stIdx++; // Executes the current statement to update state or trigger the required behavior.
            endIdx--; // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
        return new String(charArray); // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    boolean isVowel(char ch) { // Defines the method that performs this unit of work for the class.
        return hashSet.contains(ch); // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    void prepareVowelSet() { // Defines the method that performs this unit of work for the class.
        char[] v = {'A', 'a', 'e', 'E', 'o', 'O', 'i', 'I', 'u', 'U'}; // Stores the computed or supplied value in a variable for later use.
        for (char c : v) { // Repeats the loop body as long as the loop condition remains true.
            this.hashSet.add(c); // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
