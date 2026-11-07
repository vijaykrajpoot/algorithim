package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Arrays; // Imports the classes needed to support this file's logic.
import java.util.HashMap; // Imports the classes needed to support this file's logic.
import java.util.Map; // Imports the classes needed to support this file's logic.

public class CountRecurringCharacter { // Defines the Java type that contains the related data and behavior.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

    CountRecurringCharacter.solutuon1("VIJAYKRAJPOOT").entrySet().forEach(entry -> { // Carries out the current statement to support the program's logic.
      System.out.println(entry.getKey() + "-" + entry.getValue()); // Prints the result to the console so the current state can be inspected.
    }); // Closes the current block and ends the active scope.

    System.out.println("##############"); // Prints the result to the console so the current state can be inspected.

    CountRecurringCharacter.solutuon2("VIJAYKRAJPOOT").entrySet().forEach(entry -> { // Carries out the current statement to support the program's logic.
      System.out.println(entry.getKey() + "-" + entry.getValue()); // Prints the result to the console so the current state can be inspected.
    }); // Closes the current block and ends the active scope.

  } // Closes the current block and ends the active scope.

  /**
   * Count using HashMap
   * 
   * @param str
   * @return
   */
  public static Map<String, Integer> solutuon1(String str) { // Carries out the current statement to support the program's logic.

    Map<String, Integer> map = new HashMap<String, Integer>(); // Stores the computed or supplied value in a variable for later use.
    char[] chArr = str.toCharArray(); // Stores the computed or supplied value in a variable for later use.
    for (char ch : chArr) { // Repeats the loop body as long as the loop condition remains true.
      if (map.get(String.valueOf(ch)) != null) { // Checks whether the condition is true before taking the matching action.
        map.put(String.valueOf(ch), map.get(String.valueOf(ch)) + 1); // Executes the current statement to update state or trigger the required behavior.
      } else { // Closes the current block and ends the active scope.
        map.put(String.valueOf(ch), 1); // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    return map; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

  public static Map<String, Integer> solutuon2(String str) { // Carries out the current statement to support the program's logic.

    Map<String, Integer> map = new HashMap<String, Integer>(); // Stores the computed or supplied value in a variable for later use.
    char[] chArr = str.toCharArray(); // Stores the computed or supplied value in a variable for later use.
    int count = 0; // Stores the computed or supplied value in a variable for later use.
    Arrays.sort(chArr); // Executes the current statement to update state or trigger the required behavior.
    char prevCh = chArr[0]; // Stores the computed or supplied value in a variable for later use.
    for (char ch : chArr) { // Repeats the loop body as long as the loop condition remains true.
      if (ch == prevCh) { // Checks whether the condition is true before taking the matching action.
        count++; // Executes the current statement to update state or trigger the required behavior.
        if (map.get(String.valueOf(ch)) != null) { // Checks whether the condition is true before taking the matching action.
          map.put(String.valueOf(ch), map.get(String.valueOf(ch)) + 1); // Executes the current statement to update state or trigger the required behavior.
        } else { // Closes the current block and ends the active scope.
          map.put(String.valueOf(ch), 1); // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
        continue; // Skips the rest of the current loop iteration and moves to the next one.
      } else { // Closes the current block and ends the active scope.
        map.put(String.valueOf(ch), 1); // Executes the current statement to update state or trigger the required behavior.
        count = 0; // Stores the computed or supplied value in a variable for later use.
        prevCh = ch; // Stores the computed or supplied value in a variable for later use.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    return map; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
