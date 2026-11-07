package com.algo.leetcode.seventy_five; // Declares the package so the class is organized under the correct Java namespace.

import java.math.BigInteger; // Imports the classes needed to support this file's logic.
import java.util.ArrayList; // Imports the classes needed to support this file's logic.
import java.util.Arrays; // Imports the classes needed to support this file's logic.

public class Sample { // Defines the Java type that contains the related data and behavior.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

        // Create a sample string that we want to reverse.
        String name = "ruchi arya"; // Stores the computed or supplied value in a variable for later use.
        // Print the length of the string to confirm its size before reversing.
        System.out.println("Length:" + name.length()); // Prints the result to the console so the current state can be inspected.
        // Set the last index of the string so the loop can swap from the end toward the start.
        int len = name.length() - 1; // Stores the computed or supplied value in a variable for later use.
        // Convert the string into a character array so individual characters can be swapped in place.
        char[] ch = name.toCharArray(); // Stores the computed or supplied value in a variable for later use.
        // Loop through the first half of the array and swap each character with its mirror from the end.
        for (int i = 0, j = len; i < len / 2; i++, j--) { // Repeats the loop body as long as the loop condition remains true.
            // Save the character at the front index before overwriting it.
            char temp = ch[i]; // Stores the computed or supplied value in a variable for later use.
            // Put the character from the end into the front position.
            ch[i] = ch[j]; // Executes the current statement to update state or trigger the required behavior.
            // Place the saved front character into the end position to complete the swap.
            ch[j] = temp; // Executes the current statement to update state or trigger the required behavior.

        } // Closes the current block and ends the active scope.
        // Print the original string to show it was not changed in the variable itself.
        System.out.println("Original String : " + name); // Prints the result to the console so the current state can be inspected.
        // Print the reversed character array as the reversed string result.
        System.out.println("Reverse String  : " + new String(ch)); // Prints the result to the console so the current state can be inspected.

    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
