package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Arrays; // Imports the classes needed to support this file's logic.
import java.util.stream.IntStream; // Imports the classes needed to support this file's logic.
import java.util.stream.Stream; // Imports the classes needed to support this file's logic.

public class RotateArray { // Defines the Java type that contains the related data and behavior.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        int[] arr = IntStream.of(1, 2, 3, 4, 5, 8, 9).toArray(); // Stores the computed or supplied value in a variable for later use.
        RotateArray rotateArray = new RotateArray(); // Stores the computed or supplied value in a variable for later use.
        int result[] = rotateArray.rotateArray(arr, 1); // Executes the current statement to update state or trigger the required behavior.
        System.out.println(Arrays.toString(result)); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.


    int[] rotateArray(int[] arr, int rotation) { // Defines the method that performs this unit of work for the class.
        int rr = rotation % arr.length; // Stores the computed or supplied value in a variable for later use.
        for (int r = 1; r <= rr; r++) { // Repeats the loop body as long as the loop condition remains true.
            int t = arr[0]; // Stores the computed or supplied value in a variable for later use.
            for (int i = 0; i < arr.length - 1; i++) { // Repeats the loop body as long as the loop condition remains true.
                arr[i] = arr[i + 1]; // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
            arr[arr.length - 1] = t; // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
        return arr; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
