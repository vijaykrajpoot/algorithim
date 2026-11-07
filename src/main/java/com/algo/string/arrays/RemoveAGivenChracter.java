package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

/**
 * 
 * Write an efficient function that deletes characters from an ASCII string.
 * 
 * For example, given a str of "Battle of the Vowels: Hawaii vs. Grozny" and a remove of "aeiou",
 * the function should transform str to “Bttl f th Vwls: Hw vs. Grzny”.
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class RemoveAGivenChracter { // Defines the Java type that contains the related data and behavior.


  static String removeChractersFromString(String string, String removeStr) { // Defines the method that performs this unit of work for the class.

    StringBuilder builder = new StringBuilder(); // Stores the computed or supplied value in a variable for later use.

    boolean[] flag = new boolean[256]; // Stores the computed or supplied value in a variable for later use.

    for (char ch : removeStr.toCharArray()) { // Repeats the loop body as long as the loop condition remains true.
      flag[(int) ch] = true; // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.

    for (char ch : string.toCharArray()) { // Repeats the loop body as long as the loop condition remains true.
      if (!flag[(int) ch]) { // Checks whether the condition is true before taking the matching action.
        builder.append(ch); // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    return builder.toString(); // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

    System.out.println(removeChractersFromString("Battle of the Vowels: Hawaii vs. Grozny", "aeiou")); // Prints the result to the console so the current state can be inspected.


  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
