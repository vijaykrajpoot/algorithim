package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

/**
 * Print String permutation
 * <p>
 * <p>
 * ABC ACB BAC BCA CAB CBA
 *
 * @author Vijay Kumar Rajput
 */
public class PermutationLogic2 { // Defines the Java type that contains the related data and behavior.

    // Collect result
    private StringBuilder result = new StringBuilder(); // Stores the computed or supplied value in a variable for later use.
    // Input data
    private String inputString; // Declares a variable to hold data needed by this method.
    // Keep tracked which character has been used or not.
    private boolean[] isUsed; // Declares a variable to hold data needed by this method.

    /**
     * @param inputString
     */
    public PermutationLogic2(String inputString) { // Defines the method that performs this unit of work for the class.
        this.inputString = inputString; // Stores the computed or supplied value in a variable for later use.
        isUsed = new boolean[inputString.length()]; // Stores the computed or supplied value in a variable for later use.
    } // Closes the current block and ends the active scope.

    /**
     * Permutation logic to print all permutation of string.
     * <p>
     * In case we need all the permutation of each character then comment first if condition in for loop.
     * <p>
     * * AAA AAB AAC ABA ABB ABC ACA ACB ACC BAA BAB BAC BBA BBB BBC BCA BCB BCC CAA CAB CAC CBA CBB CBC CCA CCB CCC
     */

    void printPermute() { // Defines the method that performs this unit of work for the class.

        if (result.length() == inputString.length()) { // Checks whether the condition is true before taking the matching action.
            print(result.toString().toCharArray()); // Executes the current statement to update state or trigger the required behavior.
            return; // Declares a variable to hold data needed by this method.
        } // Closes the current block and ends the active scope.

        for (int i = 0; i < inputString.length(); i++) { // Repeats the loop body as long as the loop condition remains true.
            if (isUsed[i] == true) { // Checks whether the condition is true before taking the matching action.
                continue; // Skips the rest of the current loop iteration and moves to the next one.
            } // Closes the current block and ends the active scope.
            result.append(inputString.charAt(i)); // Executes the current statement to update state or trigger the required behavior.
            isUsed[i] = true; // Executes the current statement to update state or trigger the required behavior.
            printPermute(); // Executes the current statement to update state or trigger the required behavior.
            isUsed[i] = false; // Executes the current statement to update state or trigger the required behavior.
            result.setLength(result.length() - 1); // Executes the current statement to update state or trigger the required behavior.

        } // Closes the current block and ends the active scope.

    } // Closes the current block and ends the active scope.

    private void print(char arr[]) { // Defines the method that performs this unit of work for the class.
        for (char ch : arr) { // Repeats the loop body as long as the loop condition remains true.
            System.out.print(ch); // Prints the value without moving to a new line.
        } // Closes the current block and ends the active scope.
        System.out.println(); // Prints the result to the console so the current state can be inspected.

    } // Closes the current block and ends the active scope.

    // Driver code
    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        String atoz = "abcd"; // Stores the computed or supplied value in a variable for later use.

        char ch[] = atoz.toCharArray(); // Executes the current statement to update state or trigger the required behavior.
        String permute = ""; // Stores the computed or supplied value in a variable for later use.
        for (int i = 0; i < ch.length; i++) { // Repeats the loop body as long as the loop condition remains true.
            if (i + ch.length > ch.length) { // Checks whether the condition is true before taking the matching action.
                return; // Declares a variable to hold data needed by this method.
            } // Closes the current block and ends the active scope.
            permute = atoz.substring(i, i + ch.length); // Stores the computed or supplied value in a variable for later use.
            PermutationLogic2 permutation2 = new PermutationLogic2(permute); // Stores the computed or supplied value in a variable for later use.
            permutation2.printPermute(); // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.

