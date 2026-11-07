package com.algo; // Declares the package so the class is organized under the correct Java namespace.

import java.util.ArrayList; // Imports the classes needed to support this file's logic.
import java.util.List; // Imports the classes needed to support this file's logic.

public class PrefixMatcher { // Defines the Java type that contains the related data and behavior.
     public static boolean isPrefix(String str, String prefix) { // Defines the method that performs this unit of work for the class.
        return str.startsWith(prefix); // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.
    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

        List<String> strings = new ArrayList<>(); // Stores the computed or supplied value in a variable for later use.
        strings.add("abc"); // Executes the current statement to update state or trigger the required behavior.
        strings.add("ab"); // Executes the current statement to update state or trigger the required behavior.
        strings.add("bc"); // Executes the current statement to update state or trigger the required behavior.
        strings.add("abc hello"); // Executes the current statement to update state or trigger the required behavior.

        for (int i = 0; i < strings.size(); i++) { // Repeats the loop body as long as the loop condition remains true.
            String currentString = strings.get(i); // Stores the computed or supplied value in a variable for later use.
            for (int j = 0; j < strings.size(); j++) { // Repeats the loop body as long as the loop condition remains true.
                if (i != j) { // Avoid comparing a string with itself // Checks whether the condition is true before taking the matching action.
                    String otherString = strings.get(j); // Stores the computed or supplied value in a variable for later use.
                    if (isPrefix(otherString, currentString)) { // Checks whether the condition is true before taking the matching action.
                        strings.remove(currentString); // Executes the current statement to update state or trigger the required behavior.
                        i--; // Decrement i to account for the removed string // Carries out the current statement to support the program's logic.
                        break; // Exit the inner loop since we've removed the string // Exits the current loop or switch branch immediately.
                    } // Closes the current block and ends the active scope.
                } // Closes the current block and ends the active scope.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        System.out.println("strings:"+ strings); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
