package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

/**
 * 
 * Write a function that reverses the order of the words in a string. For example, your function
 * should transform the string "Do or do not, there is no try." to "try. no is there not, do or Do".
 * Assume that all words are space delimited and treat punctuation the same as letters.
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class ReverseWordsInAString { // Defines the Java type that contains the related data and behavior.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    String st = "Do or do not, there is no try."; // Stores the computed or supplied value in a variable for later use.
    String rString = reverseAString(st); // Stores the computed or supplied value in a variable for later use.
    System.out.println("oString:" + st); // Prints the result to the console so the current state can be inspected.
    System.out.println("rString:" + rString); // Prints the result to the console so the current state can be inspected.
  } // Closes the current block and ends the active scope.

  public static String reverseAString(String str) { // Defines the method that performs this unit of work for the class.
    String resversedString = reverseMe(str); // Stores the computed or supplied value in a variable for later use.
    System.out.println("resversedString:" + resversedString); // Prints the result to the console so the current state can be inspected.
    int stIndex = 0; // Stores the computed or supplied value in a variable for later use.
    int endIndex = 0; // Stores the computed or supplied value in a variable for later use.
    String rrString = ""; // Stores the computed or supplied value in a variable for later use.
    for (char ch : resversedString.toCharArray()) { // Repeats the loop body as long as the loop condition remains true.
      endIndex++; // Executes the current statement to update state or trigger the required behavior.
      if (ch == ' ') { // Checks whether the condition is true before taking the matching action.
        rrString = rrString + reverseMe(resversedString.substring(stIndex, endIndex - 1)) + ch; // Stores the computed or supplied value in a variable for later use.
        stIndex = endIndex; // Stores the computed or supplied value in a variable for later use.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    // Exit from loop after endIndex == string length and reverse last string
    if (endIndex >= resversedString.length()) { // Checks whether the condition is true before taking the matching action.
      rrString = rrString + reverseMe(resversedString.substring(stIndex, resversedString.length()));; // Stores the computed or supplied value in a variable for later use.
    } // Closes the current block and ends the active scope.
    return rrString; // Returns the computed value to the caller and exits the method.

  } // Closes the current block and ends the active scope.

  private static String reverseMe(String str) { // Defines the method that performs this unit of work for the class.
    char[] ch = str.toCharArray(); // Stores the computed or supplied value in a variable for later use.

    for (int i = 0; i < str.length() / 2; i++) { // Repeats the loop body as long as the loop condition remains true.
      char temp = ch[i]; // Stores the computed or supplied value in a variable for later use.
      ch[i] = ch[str.length() - 1 - i]; // Executes the current statement to update state or trigger the required behavior.
      ch[str.length() - 1 - i] = temp; // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.
 //   System.out.println("str:" + str + ":ch.len:" + ch.length + "  :String(ch):" + new String(ch));
    return new String(ch); // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.



} // Closes the current block and ends the active scope.
