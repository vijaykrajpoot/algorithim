package com.algo.sorting.search; // Declares the package so the class is organized under the correct Java namespace.

import java.util.ArrayList; // Imports the classes needed to support this file's logic.
import java.util.Arrays; // Imports the classes needed to support this file's logic.

public class EvenOddSegregate { // Defines the Java type that contains the related data and behavior.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

        ArrayList<Integer> integers = new ArrayList<>(); // Stores the computed or supplied value in a variable for later use.
        integers.add(1); // Executes the current statement to update state or trigger the required behavior.
        integers.add(2); // Executes the current statement to update state or trigger the required behavior.
        integers.add(3); // Executes the current statement to update state or trigger the required behavior.
        integers.add(4); // Executes the current statement to update state or trigger the required behavior.
        integers.add(5); // Executes the current statement to update state or trigger the required behavior.
        integers.add(6); // Executes the current statement to update state or trigger the required behavior.
        integers.add(7); // Executes the current statement to update state or trigger the required behavior.
        integers.add(8); // Executes the current statement to update state or trigger the required behavior.
        integers.add(9); // Executes the current statement to update state or trigger the required behavior.
        integers.add(10); // Executes the current statement to update state or trigger the required behavior.
        System.out.println(integers); // Prints the result to the console so the current state can be inspected.
        integers= segregate_evens_and_odds(integers); // Stores the computed or supplied value in a variable for later use.


    } // Closes the current block and ends the active scope.

    static ArrayList<Integer> segregate_evens_and_odds(ArrayList<Integer> numbers) { // Defines the method that performs this unit of work for the class.
        // Write your code here.
        int left = 0; // Stores the computed or supplied value in a variable for later use.
        int right = numbers.size() - 1; // Stores the computed or supplied value in a variable for later use.
        while (left < right) { // Keeps executing this block until the loop condition becomes false.
            int leftNum = numbers.get(left); // Stores the computed or supplied value in a variable for later use.
            int rightNum = numbers.get(right); // Stores the computed or supplied value in a variable for later use.
            if (leftNum % 2 != 0) { // Checks whether the condition is true before taking the matching action.
                if (rightNum % 2 == 0) { // Checks whether the condition is true before taking the matching action.
                    int temp = numbers.get(right); // Stores the computed or supplied value in a variable for later use.
                    numbers.set(right, numbers.get(left)); // Executes the current statement to update state or trigger the required behavior.
                    numbers.set(left, temp); // Executes the current statement to update state or trigger the required behavior.
                    left++; // Executes the current statement to update state or trigger the required behavior.
                } // Closes the current block and ends the active scope.
                right--; // Executes the current statement to update state or trigger the required behavior.
            } else  { // Closes the current block and ends the active scope.
                left++; // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        System.out.println(numbers); // Prints the result to the console so the current state can be inspected.
        return numbers; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
