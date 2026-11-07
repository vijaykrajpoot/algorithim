package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.HashMap; // Imports the classes needed to support this file's logic.
import java.util.LinkedHashMap; // Imports the classes needed to support this file's logic.
import java.util.Map; // Imports the classes needed to support this file's logic.

/**
 * 
 * Write an efficient function to find the first nonrepeated character in a string. For instance,
 * the first nonrepeated character in “total” is 'o' and the first nonrepeated character in “teeter”
 * is 'r'. Discuss the efficiency of your algorithm.
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class FirstNonrepeatedCharacter { // Defines the Java type that contains the related data and behavior.

  public static void main(String str[]) { // Defines the method that performs this unit of work for the class.

    System.out.println(FirstNonrepeatedCharacter.findFirstNonRepeatedChracter("LALALAND")); // Prints the result to the console so the current state can be inspected.
    System.out.println(FirstNonrepeatedCharacter.findFirstNonRepeatedChracter("QWERTYUQ")); // Prints the result to the console so the current state can be inspected.

  } // Closes the current block and ends the active scope.

  public static char findFirstNonRepeatedChracter(String str) { // Defines the method that performs this unit of work for the class.

    HashMap<Character, Integer> hashMap = new LinkedHashMap<>(); // Stores the computed or supplied value in a variable for later use.

    for (int i = 0; i < str.length(); i++) { // Repeats the loop body as long as the loop condition remains true.
      char ch = str.charAt(i); // Stores the computed or supplied value in a variable for later use.
      if (hashMap.containsKey(ch)) { // Checks whether the condition is true before taking the matching action.
        hashMap.put(ch, hashMap.get(ch) + 1); // Executes the current statement to update state or trigger the required behavior.
      } else { // Closes the current block and ends the active scope.
        hashMap.put(ch, 1); // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.
    for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) { // Repeats the loop body as long as the loop condition remains true.
      if (entry.getValue() == 1) { // Checks whether the condition is true before taking the matching action.
        return entry.getKey(); // Returns the computed value to the caller and exits the method.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.
    throw new RuntimeException("There is no First Repeated Chracter"); // Raises an exception to signal an invalid or unexpected condition.
  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
