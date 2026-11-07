package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

/**
 * 
 * 
 * Given a string, remove the vowels from the string and print the string without vowels.
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class RemoveAllVowels { // Defines the Java type that contains the related data and behavior.


  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

    System.out.println(RemoveAllVowels.removeVowels("VIJAYKRAJPOOT")); // Prints the result to the console so the current state can be inspected.

    System.out.println(RemoveAllVowels.removeVowels("what is your name ?")); // Prints the result to the console so the current state can be inspected.

    System.out.println(RemoveAllVowels.removeVowels("aeiouAEIOU")); // Prints the result to the console so the current state can be inspected.
  } // Closes the current block and ends the active scope.


  public static String removeVowels(String str) { // Defines the method that performs this unit of work for the class.

    boolean boolVowwels[] = new boolean[256]; // Executes the current statement to update state or trigger the required behavior.
    StringBuilder builder = new StringBuilder(); // Stores the computed or supplied value in a variable for later use.

    for (int ch : "aeiouAEIOU".toCharArray()) { // Repeats the loop body as long as the loop condition remains true.
      boolVowwels[ch] = true; // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.

    for (int ch : str.toCharArray()) { // Repeats the loop body as long as the loop condition remains true.
      if (!boolVowwels[ch]) { // Checks whether the condition is true before taking the matching action.
        builder.append((char) ch); // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    return builder.toString(); // Returns the computed value to the caller and exits the method.

  } // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
