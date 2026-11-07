package com.algo.sorting.search; // Declares the package so the class is organized under the correct Java namespace.

import java.util.ArrayList; // Imports the classes needed to support this file's logic.
import java.util.Iterator; // Imports the classes needed to support this file's logic.

/**
 * First array has n positive numbers, and they are sorted in the non-descending order.
 * <p>
 * Second array has 2n numbers: first n are also positive and sorted in the same way but the last n are all zeroes.
 * <p>
 * Merge the first array into the second and return the latter. You should get 2n positive integers sorted in the non-descending order.
 * <p>
 * Example
 * {
 * "first": [1, 3, 5],
 * "second": [2, 4, 6, 0, 0, 0]
 * }
 * Output:
 * <p>
 * [1, 2, 3, 4, 5, 6]
 */
public class MergedSortedArrayToAnotherArray { // Defines the Java type that contains the related data and behavior.
    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        ArrayList<Integer> first = new ArrayList<>(); // Stores the computed or supplied value in a variable for later use.
        first.add(2); // Executes the current statement to update state or trigger the required behavior.

        ArrayList<Integer> second = new ArrayList<>(); // Stores the computed or supplied value in a variable for later use.
        second.add(1); // Executes the current statement to update state or trigger the required behavior.
        second.add(0); // Executes the current statement to update state or trigger the required behavior.

        merge_one_into_another(first, second); // Executes the current statement to update state or trigger the required behavior.


    } // Closes the current block and ends the active scope.

    static ArrayList<Integer> merge_one_into_another(ArrayList<Integer> first, ArrayList<Integer> second) { // Defines the method that performs this unit of work for the class.
        int idx1 = 0; // Stores the computed or supplied value in a variable for later use.
        int idx2 = 0; // Stores the computed or supplied value in a variable for later use.
        while (idx1 < first.size()) { // Keeps executing this block until the loop condition becomes false.
            if (idx2 >= second.size()  || first.get(idx1) <=second.get(idx2)) { // Checks whether the condition is true before taking the matching action.
                second.add(idx2++, first.get(idx1++)); // Executes the current statement to update state or trigger the required behavior.
            } else { // Closes the current block and ends the active scope.
                idx2++; // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        second.removeIf(integer -> integer == 0); // Executes the current statement to update state or trigger the required behavior.
        System.out.println(second); // Prints the result to the console so the current state can be inspected.
        return second; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
