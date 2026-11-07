package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

/**
 * Assume you have a method isSubstring which checks if one word is a substring of another. Given
 * two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to
 * isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).
 *
 * @author Vijay Kumar Rajput
 */

public class StringRotation { // Defines the Java type that contains the related data and behavior.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

        System.out.println("isRotation:" + isRotation("waterbottle", "erbottlewat")); // Prints the result to the console so the current state can be inspected.
        System.out.println("isRotation:" + isRotation("apple", "pleap")); // Prints the result to the console so the current state can be inspected.


    } // Closes the current block and ends the active scope.

    static boolean isRotation(String st1, String st2) { // Defines the method that performs this unit of work for the class.

        if (st1 == null || st2 == null) { // Checks whether the condition is true before taking the matching action.
            return false; // Returns the computed value to the caller and exits the method.
        } // Closes the current block and ends the active scope.

        if (st1.length() != st2.length()) { // Checks whether the condition is true before taking the matching action.
            return false; // Returns the computed value to the caller and exits the method.
        } // Closes the current block and ends the active scope.

        String string = st1.concat(st1); // Stores the computed or supplied value in a variable for later use.
        System.out.println("S1:" + st1); // Prints the result to the console so the current state can be inspected.
        System.out.println("S2:" + st2); // Prints the result to the console so the current state can be inspected.
        System.out.println("S1S1:" + string); // Prints the result to the console so the current state can be inspected.
        int index = string.indexOf(st2); // Stores the computed or supplied value in a variable for later use.


        return index >= 0; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
