package parctice; // Declares the package so the class is organized under the correct Java namespace.

import java.util.HashMap; // Imports the classes needed to support this file's logic.
import java.util.Map; // Imports the classes needed to support this file's logic.

public class BaseX { // Defines the Java type that contains the related data and behavior.

    public static Map<Integer, String> generateTable(int base) { // Carries out the current statement to support the program's logic.
        Map<Integer, String> table = new HashMap<>(); // Stores the computed or supplied value in a variable for later use.
        for (int i = 0; i < base; i++) { // Repeats the loop body as long as the loop condition remains true.
            String binary = Integer.toBinaryString(i); // Stores the computed or supplied value in a variable for later use.
            String paddedBinary = String.format("%10s", binary).replace(' ', '0'); // Stores the computed or supplied value in a variable for later use.
            table.put(i, paddedBinary); // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
        return table; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    public static void printTable(Map<Integer, String> table) { // Defines the method that performs this unit of work for the class.
        for (Map.Entry<Integer, String> entry : table.entrySet()) { // Repeats the loop body as long as the loop condition remains true.
            int value = entry.getKey(); // Stores the computed or supplied value in a variable for later use.
            String binary = entry.getValue(); // Stores the computed or supplied value in a variable for later use.
            char symbol = (char) value; // Stores the computed or supplied value in a variable for later use.
            System.out.println(symbol + ": " + binary); // Prints the result to the console so the current state can be inspected.
        } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        Map<Integer, String> table = generateTable(64); // Stores the computed or supplied value in a variable for later use.
        printTable(table); // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
