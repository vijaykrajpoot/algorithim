package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Arrays; // Imports the classes needed to support this file's logic.
import java.util.HashMap; // Imports the classes needed to support this file's logic.
import java.util.List; // Imports the classes needed to support this file's logic.

/**
 * Two friends like to pool their money and go to the ice cream parlor. They always choose two distinct flavors and they spend all of their money.
 * <p>
 * Given a list of prices for the flavors of ice cream, select the two that will cost all of the money they have.
 * <p>
 * Example.
 * <p>
 * The two flavors that cost  and  meet the criteria. Using -based indexing, they are at indices  and .
 * <p>
 * Function Description
 * <p>
 * Complete the icecreamParlor function in the editor below.
 * <p>
 * icecreamParlor has the following parameter(s):
 * <p>
 * int m: the amount of money they have to spend
 * int cost[n]: the cost of each flavor of ice cream
 * Returns
 * <p>
 * int[2]: the indices of the prices of the two flavors they buy, sorted ascending
 * Input Format
 * <p>
 * The first line contains an integer, , the number of trips to the ice cream parlor. The next  sets of lines each describe a visit.
 * <p>
 * Each trip is described as follows:
 * <p>
 * The integer , the amount of money they have pooled.
 * The integer , the number of flavors offered at the time.
 * space-separated integers denoting the cost of each flavor: .
 * Note: The index within the cost array represents the flavor of the ice cream purchased.
 * <p>
 * Constraints
 * <p>
 * , ∀
 * There will always be a unique solution.
 */
public class IceCreamParlor { // Defines the Java type that contains the related data and behavior.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        List<Integer> aa = Arrays.asList(1, 4, 5, 3, 2); // Stores the computed or supplied value in a variable for later use.
        List<Integer> out = icecreamParlor(4, aa); // Stores the computed or supplied value in a variable for later use.
        System.out.println(out); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.


    public static List<Integer> icecreamParlor(int m, List<Integer> arr) { // Defines the method that performs this unit of work for the class.
        HashMap<Integer, Integer> hh = new HashMap<Integer, Integer>(); // Stores the computed or supplied value in a variable for later use.
        for (int i = 0; i < arr.size(); i++) { // Repeats the loop body as long as the loop condition remains true.
            int sum = m - arr.get(i); // Stores the computed or supplied value in a variable for later use.
            if (hh.containsKey(sum)) { // Checks whether the condition is true before taking the matching action.
                return Arrays.asList(i, hh.get(sum)); // Returns the computed value to the caller and exits the method.
            } else { // Closes the current block and ends the active scope.
                hh.put(arr.get(i)+1, i+1); // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.

        } // Closes the current block and ends the active scope.
        return List.of(); // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
