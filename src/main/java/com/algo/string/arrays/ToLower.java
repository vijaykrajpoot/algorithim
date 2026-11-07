package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

/**
 * 
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in
 * lowercase.
 * 
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class ToLower { // Defines the Java type that contains the related data and behavior.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    System.out.println(ToLower.toLower("Vijay$")); // Prints the result to the console so the current state can be inspected.
    System.out.println(ToLower.toLower("al&phaBET")); // Prints the result to the console so the current state can be inspected.
  } // Closes the current block and ends the active scope.
    

  public static String toLower(String str) { // Defines the method that performs this unit of work for the class.
    char ch[] = str.toCharArray(); // Executes the current statement to update state or trigger the required behavior.
    for (int i = 0; i < ch.length; i++) { // Repeats the loop body as long as the loop condition remains true.
      if ((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z')) { // Checks whether the condition is true before taking the matching action.
        if (!(ch[i] >= 'a' && ch[i] <= 'z')) { // Checks whether the condition is true before taking the matching action.
          ch[i] = (char) ((int) ch[i] + 32); // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.
    return new String(ch); // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
