package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.HashMap; // Imports the classes needed to support this file's logic.
import java.util.HashSet; // Imports the classes needed to support this file's logic.
import java.util.Map; // Imports the classes needed to support this file's logic.

public class FindAFirstRecurringChracater { // Defines the Java type that contains the related data and behavior.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    System.out.println("First Recurring Chracter (solutuon1) - LALALAND: " + FindAFirstRecurringChracater.solutuon1("LALALAND")); // Prints the result to the console so the current state can be inspected.
    System.out.println("First Recurring Chracter (solutuon2) - VIJAYKRAJPOOT: " + FindAFirstRecurringChracater.solutuon2("VIJAYKRAJPOOT")); // Prints the result to the console so the current state can be inspected.
    System.out.println("First Recurring Chracter(solutuon1) - QWERTYUIOP : " + FindAFirstRecurringChracater.solutuon1("QWERTYUIOP")); // Prints the result to the console so the current state can be inspected.
    System.out.println("First Recurring Chracter(solutuon2) - QWERTYUIOP : " + FindAFirstRecurringChracater.solutuon2("QWERTYUIOP")); // Prints the result to the console so the current state can be inspected.
  } // Closes the current block and ends the active scope.


  /**
   * Count using HashMap
   * 
   * @param str
   * @return
   */
  public static char solutuon1(String str) { // Defines the method that performs this unit of work for the class.

    Map<String, Integer> map = new HashMap<String, Integer>(); // Stores the computed or supplied value in a variable for later use.
    char[] chArr = str.toCharArray(); // Stores the computed or supplied value in a variable for later use.
    for (char ch : chArr) { // Repeats the loop body as long as the loop condition remains true.
      if (map.get(String.valueOf(ch)) != null) { // Checks whether the condition is true before taking the matching action.
        return ch; // Returns the computed value to the caller and exits the method.
      } else { // Closes the current block and ends the active scope.
        map.put(String.valueOf(ch), 1); // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    return '\u0000'; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.


  /**
   * Using SET
   * 
   * @param str
   * @return
   */
  public static char solutuon2(String str) { // Defines the method that performs this unit of work for the class.
    HashSet<Character> charactersSet = new HashSet<>(); // Stores the computed or supplied value in a variable for later use.
    char[] chArr = str.toCharArray(); // Stores the computed or supplied value in a variable for later use.
    char chFound = '\u0000'; // Stores the computed or supplied value in a variable for later use.
    for (char ch : chArr) { // Repeats the loop body as long as the loop condition remains true.
      boolean isAdded = charactersSet.add(ch); // Stores the computed or supplied value in a variable for later use.
      if (!isAdded) // Checks whether the condition is true before taking the matching action.
        return ch;; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    return chFound; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.



  public static char solutuon3(String str) { // Defines the method that performs this unit of work for the class.

    boolean chArr[] = new boolean[256]; // Executes the current statement to update state or trigger the required behavior.

    for (int ch : str.toCharArray()) { // Repeats the loop body as long as the loop condition remains true.
      if (!chArr[ch]) { // Checks whether the condition is true before taking the matching action.
        chArr[ch] = true; // Executes the current statement to update state or trigger the required behavior.
      } else { // Closes the current block and ends the active scope.
        return (char) ch; // Returns the computed value to the caller and exits the method.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.
    return '\u0000'; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
