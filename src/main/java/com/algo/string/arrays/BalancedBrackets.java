package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Stack; // Imports the classes needed to support this file's logic.
import java.util.concurrent.ConcurrentNavigableMap; // Imports the classes needed to support this file's logic.

public class BalancedBrackets { // Defines the Java type that contains the related data and behavior.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        String string = isBalanced("{{[[(())]]}}"); // Stores the computed or supplied value in a variable for later use.
        System.out.println(string); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.


    public static String isBalanced(String s) { // Defines the method that performs this unit of work for the class.

        java.util.Stack<Character> stack = new Stack<>(); // Stores the computed or supplied value in a variable for later use.
        char poppedCh = ' '; // Stores the computed or supplied value in a variable for later use.
        for (int i = 0; i < s.length(); i++) { // Repeats the loop body as long as the loop condition remains true.
            char ch = s.charAt(i); // Stores the computed or supplied value in a variable for later use.
            if (ch == '{' || ch == '[' || ch == '(') { // Checks whether the condition is true before taking the matching action.
                stack.push(ch); // Executes the current statement to update state or trigger the required behavior.
                continue; // Skips the rest of the current loop iteration and moves to the next one.
            } else if (stack.isEmpty()) { // Closes the current block and ends the active scope.
                return "NO"; // Returns the computed value to the caller and exits the method.
            } // Closes the current block and ends the active scope.
            // closing
            if (ch == '}' || ch == ']' || ch == ')') { // Checks whether the condition is true before taking the matching action.
                poppedCh = stack.pop(); // Stores the computed or supplied value in a variable for later use.
                if (poppedCh != '{' && ch == '}') { // Checks whether the condition is true before taking the matching action.
                    return "NO"; // Returns the computed value to the caller and exits the method.
                } // Closes the current block and ends the active scope.
                if (poppedCh != '[' && ch == ']') { // Checks whether the condition is true before taking the matching action.
                    return "NO"; // Returns the computed value to the caller and exits the method.
                } // Closes the current block and ends the active scope.
                if (poppedCh != '(' && ch == ')') { // Checks whether the condition is true before taking the matching action.
                    return "NO"; // Returns the computed value to the caller and exits the method.
                } // Closes the current block and ends the active scope.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        if (stack.isEmpty()) { // Checks whether the condition is true before taking the matching action.
            return "YES"; // Returns the computed value to the caller and exits the method.
        } // Closes the current block and ends the active scope.
        return "NO"; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
