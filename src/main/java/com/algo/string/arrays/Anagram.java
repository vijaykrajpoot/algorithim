package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Arrays; // Imports the classes needed to support this file's logic.
import java.util.HashSet; // Imports the classes needed to support this file's logic.
import java.util.Set; // Imports the classes needed to support this file's logic.

/**
 * Write a method to decide if two strings are anagrams or not.
 * 
 * @author Vijay Kumar Rajput
 *
 */

public class Anagram { // Defines the Java type that contains the related data and behavior.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.


    System.out.println("Anagram.isAnagram1(Dormito ry, Dirty room):" + Anagram.isAnagram("parliament", "partialmen")); // Prints the result to the console so the current state can be inspected.
    System.out.println("Anagram.isAnagramSol2(ac, bb):" + Anagram.isAnagramSol2("ac", "bb")); // Prints the result to the console so the current state can be inspected.
    System.out.println("Anagram.isAnagramSol2(\"Dormito ry\", \"Dirty room\"):" + Anagram.isAnagramSol2("Dormito ry", "Dirty room")); // Prints the result to the console so the current state can be inspected.
    System.out.println("Anagram.isAnagramSol2(parliamentt, partialmen):" + Anagram.isAnagramSol3("parliamentt", "partialmen")); // Prints the result to the console so the current state can be inspected.
    System.out.println("Anagram.isAnagramSol3(\"Dormito ry\", \"Dirty room\"):" + Anagram.isAnagramSol3("Dormito ry", "Dirty room")); // Prints the result to the console so the current state can be inspected.
    System.out.println("Anagram.isAnagramSol3(waterbottle, erbottlewat):" + Anagram.isAnagramSol3("waterbottle", "erbottlewat")); // Prints the result to the console so the current state can be inspected.



  } // Closes the current block and ends the active scope.

  /**
   * 
   * Sort the strings and compare it. This will work as long as string length is equal.
   * 
   * @param str1
   * @param str2
   * @return
   */
  public static boolean isAnagram(String str1, String str2) { // Defines the method that performs this unit of work for the class.
    if (!(str1.length() == str2.length())) { // Checks whether the condition is true before taking the matching action.
      return false; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    char[] charArray1 = str1.toCharArray(); // Stores the computed or supplied value in a variable for later use.
    char[] charArray2 = str2.toCharArray(); // Stores the computed or supplied value in a variable for later use.
    Arrays.sort(charArray1); // Executes the current statement to update state or trigger the required behavior.
    Arrays.sort(charArray2); // Executes the current statement to update state or trigger the required behavior.
    if (Arrays.toString(charArray1).equals(Arrays.toString(charArray2))) // Checks whether the condition is true before taking the matching action.
      return true; // Returns the computed value to the caller and exits the method.
    else // Runs this branch when the previous conditional check is false.
      return false; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

  /**
   * Wrong Implementations: Faild for ==> str1=aa;str2=bc
   * 
   * @param str1
   * @param str2
   */
  public static void isAnagram1(String str1, String str2) { // Defines the method that performs this unit of work for the class.
    int sum1 = 0, sum2 = 0; // Stores the computed or supplied value in a variable for later use.

    for (int i = 0; i < str1.length(); i++) { // Repeats the loop body as long as the loop condition remains true.
      sum1 += str1.charAt(i); // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.
    System.out.println(sum1); // Prints the result to the console so the current state can be inspected.
    for (int i = 0; i < str2.length(); i++) { // Repeats the loop body as long as the loop condition remains true.
      sum2 += str2.charAt(i); // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.
    System.out.println(sum2); // Prints the result to the console so the current state can be inspected.

  } // Closes the current block and ends the active scope.

  /**
   * 
   * Based on ASCII value
   * 
   * @param str1
   * @param str2
   * @return
   */
  public static boolean isAnagramSol2(String str1, String str2) { // Defines the method that performs this unit of work for the class.

    boolean arr[] = new boolean[256]; // Executes the current statement to update state or trigger the required behavior.
    if (!(str1.length() == str2.length())) { // Checks whether the condition is true before taking the matching action.
      return false; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    for (char ch : str1.toCharArray()) { // Repeats the loop body as long as the loop condition remains true.
      arr[(int) ch] = true; // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.
    for (char ch : str2.toCharArray()) { // Repeats the loop body as long as the loop condition remains true.
      if (!arr[(int) ch]) { // Checks whether the condition is true before taking the matching action.
        return false; // Returns the computed value to the caller and exits the method.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.
    return true; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

  /**
   * Using set
   * 
   * @param str1
   * @param str2
   * @return
   */
  public static boolean isAnagramSol3(String str1, String str2) { // Defines the method that performs this unit of work for the class.

    Set<Character> charSet = new HashSet<Character>(); // Stores the computed or supplied value in a variable for later use.

    if (str1.length() != str2.length()) { // Checks whether the condition is true before taking the matching action.
      return false; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    for (char ch : str1.toCharArray()) { // Repeats the loop body as long as the loop condition remains true.
      charSet.add(ch); // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.

    for (char ch : str2.toCharArray()) { // Repeats the loop body as long as the loop condition remains true.
      if (charSet.add(ch)) { // Checks whether the condition is true before taking the matching action.
        return false; // Returns the computed value to the caller and exits the method.
      } // Closes the current block and ends the active scope.

    } // Closes the current block and ends the active scope.
    return true; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.


  
  

} // Closes the current block and ends the active scope.
