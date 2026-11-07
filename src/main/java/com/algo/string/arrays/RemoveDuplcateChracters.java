package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

/**
 * 
 * 
 * Design an algorithm and write code to remove the duplicate characters in a string without using
 * any additional buffer. NOTE: One or two additional variables are fine. An extra copy of the array
 * is not.
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class RemoveDuplcateChracters { // Defines the Java type that contains the related data and behavior.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    System.out.println(removeDuplicate("abababa")); // Prints the result to the console so the current state can be inspected.
  } // Closes the current block and ends the active scope.

  /**
   * 
   * @param str
   * @return string after removing duplicate character
   */
  public static String removeDuplicate(String str) { // Defines the method that performs this unit of work for the class.

    boolean flag[] = new boolean[256]; // Executes the current statement to update state or trigger the required behavior.
    StringBuilder builder = new StringBuilder(); // Stores the computed or supplied value in a variable for later use.
    if (str == null) { // Checks whether the condition is true before taking the matching action.
      throw new IllegalArgumentException("Empty String"); // Raises an exception to signal an invalid or unexpected condition.
    } // Closes the current block and ends the active scope.

    for (int i = 0; i < str.length(); i++) { // Repeats the loop body as long as the loop condition remains true.
      int ch = str.charAt(i); // Stores the computed or supplied value in a variable for later use.
      if (!flag[ch] == true) { // Checks whether the condition is true before taking the matching action.
        builder.append(str.charAt(i)); // Executes the current statement to update state or trigger the required behavior.
        flag[ch] = true; // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    // for (char ch : str.toCharArray()) {
    // if (!flag[(int) ch]) {
    // builder.append(ch);
    // flag[(int) ch] = true;
    // } else {
    // flag[(int) ch] = true;
    // }
    // }

    return builder.toString(); // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
