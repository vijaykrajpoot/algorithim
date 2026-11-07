package com.algo.leetcode.seventy_five; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Arrays; // Imports the classes needed to support this file's logic.

/**
 * Given an input string s, reverse the order of the words.
 * <p>
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * <p>
 * Return a string of the words in reverse order concatenated by a single space.
 * <p>
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 * Example 2:
 * <p>
 * Input: s = "  hello world  "
 * Output: "world hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 * Example 3:
 * <p>
 * Input: s = "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
public class ReverseWords { // Defines the Java type that contains the related data and behavior.
    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        String str = "the   sky  is   blue"; // Stores the computed or supplied value in a variable for later use.
        //    trim(str.toCharArray());
        // System.out.println("After Trim:" + str);
        char[] charArray = str.toCharArray(); // Stores the computed or supplied value in a variable for later use.
        System.out.println("Original String: " + str); // Prints the result to the console so the current state can be inspected.
        str = reverseWords(charArray); // Stores the computed or supplied value in a variable for later use.
        System.out.println("Reverse String : " + str); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.


    public static String reverseWords(char[] str) { // Defines the method that performs this unit of work for the class.
        int start = 0; // Stores the computed or supplied value in a variable for later use.
        int end = str.length - 1; // Stores the computed or supplied value in a variable for later use.
        reverseIt(str, 0, end); // Executes the current statement to update state or trigger the required behavior.
        System.out.println("Reversed St:" + Arrays.toString(str)); // Prints the result to the console so the current state can be inspected.
        for (int i = 0; i < str.length; i++) { // Repeats the loop body as long as the loop condition remains true.
            if (str[i] == ' ') { // Checks whether the condition is true before taking the matching action.
                reverseIt(str, start, i - 1); // Executes the current statement to update state or trigger the required behavior.
                start = i + 1; // Stores the computed or supplied value in a variable for later use.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        // reverse the last word
        reverseIt(str, start, end); // Executes the current statement to update state or trigger the required behavior.
        trim(str); // Executes the current statement to update state or trigger the required behavior.
        return new String(str); // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    static void reverseIt(char[] ch, int start, int end) { // Defines the method that performs this unit of work for the class.
        for (int i = start; i <= end; i++, end--) { // Repeats the loop body as long as the loop condition remains true.
            char temp = ch[i]; // Stores the computed or supplied value in a variable for later use.
            ch[i] = ch[end]; // Executes the current statement to update state or trigger the required behavior.
            ch[end] = temp; // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.

    } // Closes the current block and ends the active scope.

    void removeExtraSpaces(char[] ch) { // Defines the method that performs this unit of work for the class.
        int space = 0; // Stores the computed or supplied value in a variable for later use.
        for (int i = 0; i < ch.length; i++) { // Repeats the loop body as long as the loop condition remains true.
            if (ch[i] == ' ') { // Checks whether the condition is true before taking the matching action.
                space++; // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.

    } // Closes the current block and ends the active scope.

    static void trim(char[] arr) { // Defines the method that performs this unit of work for the class.
        int left = 0; // Stores the computed or supplied value in a variable for later use.
        int right = arr.length - 1; // Stores the computed or supplied value in a variable for later use.

        // Trim leading spaces
        while (left <= right && arr[left] == ' ') { // Keeps executing this block until the loop condition becomes false.
            left++; // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.

        // Trim trailing spaces
        while (right >= left && arr[right] == ' ') { // Keeps executing this block until the loop condition becomes false.
            right--; // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.

        int writeIndex = 0; // Stores the computed or supplied value in a variable for later use.
        boolean spaceFound = false; // Stores the computed or supplied value in a variable for later use.

        // Copy non-space characters to the beginning of the array
        for (int i = left; i <= right; i++) { // Repeats the loop body as long as the loop condition remains true.
            char c = arr[i]; // Stores the computed or supplied value in a variable for later use.
            if (c != ' ') { // Checks whether the condition is true before taking the matching action.
                arr[writeIndex++] = c; // Executes the current statement to update state or trigger the required behavior.
                spaceFound = false; // Stores the computed or supplied value in a variable for later use.
            } else if (!spaceFound) { // Closes the current block and ends the active scope.
                arr[writeIndex++] = c; // Executes the current statement to update state or trigger the required behavior.
                spaceFound = true; // Stores the computed or supplied value in a variable for later use.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.

        // Resize array if necessary
        if (writeIndex < arr.length) { // Checks whether the condition is true before taking the matching action.
            arr = Arrays.copyOf(arr, writeIndex); // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.

        // System.out.println("Trimmed: " + Arrays.toString(arr));
    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
