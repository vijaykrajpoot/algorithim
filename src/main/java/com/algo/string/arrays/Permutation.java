package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Arrays; // Imports the classes needed to support this file's logic.
import java.util.HashSet; // Imports the classes needed to support this file's logic.
import java.util.LinkedHashMap; // Imports the classes needed to support this file's logic.
import java.util.Map; // Imports the classes needed to support this file's logic.
import java.util.Set; // Imports the classes needed to support this file's logic.

public class Permutation { // Defines the Java type that contains the related data and behavior.

  static Set<String> setStr = new HashSet<>(); // Stores the computed or supplied value in a variable for later use.

  // Function to print all the permutations of str
  static void printPermutn(char str[], int count[], char result[], int level) { // Defines the method that performs this unit of work for the class.

    if (level == result.length) { // Checks whether the condition is true before taking the matching action.
      if (!setStr.add(Arrays.toString(result))) { // Checks whether the condition is true before taking the matching action.
        print(result); // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.
      print(result); // Executes the current statement to update state or trigger the required behavior.
      return; // Declares a variable to hold data needed by this method.
    } // Closes the current block and ends the active scope.
    for (int i = 0; i < str.length; i++) { // Repeats the loop body as long as the loop condition remains true.
      if (count[i] == 0) { // Checks whether the condition is true before taking the matching action.
        continue; // Skips the rest of the current loop iteration and moves to the next one.
      } // Closes the current block and ends the active scope.
      result[level] = str[i]; // Executes the current statement to update state or trigger the required behavior.
      count[i]--; // Executes the current statement to update state or trigger the required behavior.
      printPermutn(str, count, result, level + 1); // Executes the current statement to update state or trigger the required behavior.
      count[i]++; // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.
  } // Closes the current block and ends the active scope.

  static void print(char arr[]) { // Defines the method that performs this unit of work for the class.


    for (char ch : arr) { // Repeats the loop body as long as the loop condition remains true.
      System.out.print(ch); // Prints the value without moving to a new line.
    } // Closes the current block and ends the active scope.
    System.out.println(); // Prints the result to the console so the current state can be inspected.

  } // Closes the current block and ends the active scope.

  // Driver code
  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    String s = "abc"; // Stores the computed or supplied value in a variable for later use.

    Map<Character, Integer> hashMap = new LinkedHashMap<>(); // Stores the computed or supplied value in a variable for later use.

    for (char ch : s.toCharArray()) { // Repeats the loop body as long as the loop condition remains true.
      if (hashMap.containsKey(ch)) { // Checks whether the condition is true before taking the matching action.
        hashMap.put(ch, hashMap.get(ch) + 1); // Executes the current statement to update state or trigger the required behavior.
      } else { // Closes the current block and ends the active scope.
        hashMap.put(ch, 1); // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    char chaa[] = new char[hashMap.size()]; // Executes the current statement to update state or trigger the required behavior.
    int count[] = new int[hashMap.size()]; // Executes the current statement to update state or trigger the required behavior.

    int i = 0; // Stores the computed or supplied value in a variable for later use.
    for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) { // Repeats the loop body as long as the loop condition remains true.
      chaa[i] = entry.getKey(); // Executes the current statement to update state or trigger the required behavior.
      count[i] = entry.getValue(); // Executes the current statement to update state or trigger the required behavior.
      i++; // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.

    char[] result = new char[s.length()]; // Stores the computed or supplied value in a variable for later use.
    printPermutn(chaa, count, result, 0); // Executes the current statement to update state or trigger the required behavior.

    System.out.println("setStr.size():" + setStr.size()); // Prints the result to the console so the current state can be inspected.
  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
