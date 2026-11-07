package parctice; // Declares the package so the class is organized under the correct Java namespace.


/**
 * @author vkumar1 created on 4/26/21
 */
public class StringToInteger { // Defines the Java type that contains the related data and behavior.
    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        int intNum = stringToInteger("121212"); // Stores the computed or supplied value in a variable for later use.
        System.out.println(intNum); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.


    static int stringToInteger(String str) { // Defines the method that performs this unit of work for the class.
        int intNumber = 0; // Stores the computed or supplied value in a variable for later use.

        char[] chArr = str.toCharArray(); // Stores the computed or supplied value in a variable for later use.
        int multiplier = 10; // Stores the computed or supplied value in a variable for later use.
        for (char c : chArr) { // Repeats the loop body as long as the loop condition remains true.
            int number = c - '0'; // Stores the computed or supplied value in a variable for later use.
            intNumber = number + (multiplier * intNumber); // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.
        return intNumber; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
