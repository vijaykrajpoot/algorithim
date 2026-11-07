package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

/**
 * Assume you have given a non empty string of characters from A-Z. You will have to compress the characters in the given string if characters are repeating more than 2 time with number of repetition. If repeating characters are only two then no need to compress those characters. 
 * 
 * Example -1
 * XXXYYYZZZ = X3Y3Z3
 * 
 * Example -2
 * PPPPQQQMMPP=P4Q3MMPP
 * 
 * Example -3
 * ASDFGHJK=ASDFGHJK;
 */
public class Compress { // Defines the Java type that contains the related data and behavior.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

        System.out.println(compress("PPPPQQQMMPP")); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.

    static String compress(String str) { // Defines the method that performs this unit of work for the class.
        int counter = 1; // Stores the computed or supplied value in a variable for later use.
        char ch[] = str.toCharArray(); // Executes the current statement to update state or trigger the required behavior.
        char prevCh; // Declares a variable to hold data needed by this method.
        StringBuilder sb = new StringBuilder(); // Stores the computed or supplied value in a variable for later use.
        for (int i = 0; i < ch.length; i++) { // Repeats the loop body as long as the loop condition remains true.
            prevCh = ch[i]; // Stores the computed or supplied value in a variable for later use.
            if (i + 1 < ch.length) { // Checks whether the condition is true before taking the matching action.
                if (prevCh == ch[i + 1]) { // Checks whether the condition is true before taking the matching action.
                    counter++; // Executes the current statement to update state or trigger the required behavior.
                    continue; // Skips the rest of the current loop iteration and moves to the next one.
                } // Closes the current block and ends the active scope.
            } // Closes the current block and ends the active scope.
            if (counter > 2) { // Checks whether the condition is true before taking the matching action.
                sb.append(String.valueOf(prevCh)).append(String.valueOf(counter)); // Executes the current statement to update state or trigger the required behavior.
            } else if (counter == 2) { // Closes the current block and ends the active scope.
                sb.append(String.valueOf(prevCh)).append(String.valueOf(prevCh)); // Executes the current statement to update state or trigger the required behavior.
            } else { // Closes the current block and ends the active scope.
                sb.append(String.valueOf(prevCh)); // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
            counter = 1; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.
        return sb.toString(); // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
