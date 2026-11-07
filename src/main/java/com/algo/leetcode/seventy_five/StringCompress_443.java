package com.algo.leetcode.seventy_five; // Declares the package so the class is organized under the correct Java namespace.

import org.junit.Assert; // Imports the classes needed to support this file's logic.

import java.util.Arrays; // Imports the classes needed to support this file's logic.
import java.util.HashMap; // Imports the classes needed to support this file's logic.
import java.util.LinkedHashMap; // Imports the classes needed to support this file's logic.
import java.util.concurrent.atomic.AtomicInteger; // Imports the classes needed to support this file's logic.

/**
 * Given an array of characters chars, compress it using the following algorithm:
 * <p>
 * Begin with an empty string s. For each group of consecutive repeating characters in chars:
 * <p>
 * If the group's length is 1, append the character to s.
 * Otherwise, append the character followed by the group's length.
 * The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.
 * <p>
 * After you are done modifying the input array, return the new length of the array.
 * <p>
 * You must write an algorithm that uses only constant extra space.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: chars = ['a','a','b','b','c','c','c']
 * Output: Return 6, and the first 6 characters of the input array should be: ['a','2','b','2','c','3']
 * Explanation: The groups are 'aa', 'bb', and 'ccc'. This compresses to 'a2b2c3'.
 * Example 2:
 * <p>
 * Input: chars = ['a']
 * Output: Return 1, and the first character of the input array should be: ['a']
 * Explanation: The only group is 'a', which remains uncompressed since it's a single character.
 * Example 3:
 * <p>
 * Input: chars = ['a','b','b','b','b','b','b','b','b','b','b','b','b']
 * Output: Return 4, and the first 4 characters of the input array should be: ['a','b','1','2'].
 * Explanation: The groups are 'a' and 'bbbbbbbbbbbb'. This compresses to 'ab12'.
 */
public class StringCompress_443 { // Defines the Java type that contains the related data and behavior.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

        StringCompress_443 s = new StringCompress_443(); // Stores the computed or supplied value in a variable for later use.
        char[] ch = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}; // Stores the computed or supplied value in a variable for later use.
        int out = s.compress(ch); // Stores the computed or supplied value in a variable for later use.
        System.out.println(ch); // Prints the result to the console so the current state can be inspected.
        System.out.println(out); // Prints the result to the console so the current state can be inspected.


        ch = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}; // Stores the computed or supplied value in a variable for later use.
        out = s.compress(ch); // Stores the computed or supplied value in a variable for later use.
        System.out.println(out); // Prints the result to the console so the current state can be inspected.

        ch = new char[]{'a'}; // Stores the computed or supplied value in a variable for later use.
        out = s.compress(ch); // Stores the computed or supplied value in a variable for later use.
        System.out.println(out); // Prints the result to the console so the current state can be inspected.


    } // Closes the current block and ends the active scope.

    // ["a","a","a","b","b","a","a"]
    public int compress(char[] chars) { // Defines the method that performs this unit of work for the class.
        int fIdx = 0; // Stores the computed or supplied value in a variable for later use.
        int count = 1; // Stores the computed or supplied value in a variable for later use.
        char prevChar; // Declares a variable to hold data needed by this method.
        for (int i = 0; i < chars.length; i++) { // Repeats the loop body as long as the loop condition remains true.
            prevChar = chars[i]; // Stores the computed or supplied value in a variable for later use.
            if (i + 1 < chars.length) { // Checks whether the condition is true before taking the matching action.
                if (prevChar == chars[i + 1]) { // Checks whether the condition is true before taking the matching action.
                    count++; // Executes the current statement to update state or trigger the required behavior.
                    continue; // Skips the rest of the current loop iteration and moves to the next one.
                } // Closes the current block and ends the active scope.
            } // Closes the current block and ends the active scope.
            if (count > 2) { // Checks whether the condition is true before taking the matching action.
                chars[fIdx++] = prevChar; // Executes the current statement to update state or trigger the required behavior.
                fIdx = convert(chars, count, fIdx); // Stores the computed or supplied value in a variable for later use.

            } else if (count == 2) { // Closes the current block and ends the active scope.
                chars[fIdx++] = prevChar; // Executes the current statement to update state or trigger the required behavior.
                fIdx = convert(chars, count, fIdx); // Stores the computed or supplied value in a variable for later use.
            } else { // Closes the current block and ends the active scope.
                chars[fIdx++] = prevChar; // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
            count = 1; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.

        System.out.println(Arrays.toString(chars)); // Prints the result to the console so the current state can be inspected.
        return fIdx; // Returns the computed value to the caller and exits the method.

    } // Closes the current block and ends the active scope.

    private int convert(char[] chars, int value, int fIdx) { // Defines the method that performs this unit of work for the class.
        String intString = String.valueOf(value); // Convert int to String // Carries out the current statement to support the program's logic.
        char[] charArray = intString.toCharArray(); // Convert String to char[] // Carries out the current statement to support the program's logic.

        // Printing each character in the char array
        for (char c : charArray) { // Repeats the loop body as long as the loop condition remains true.
            chars[fIdx++] = c; // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
        return fIdx; // Returns the computed value to the caller and exits the method.

    } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
