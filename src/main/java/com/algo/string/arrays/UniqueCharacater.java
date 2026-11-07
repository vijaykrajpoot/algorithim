package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you can not
 * use additional data structures?
 * 
 * @author Vijay K Rajput
 *
 */
public class UniqueCharacater { // Defines the Java type that contains the related data and behavior.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    // System.out.println("Contains Unique Chracters: " + new
    // UniqueCharacater().containsUniqueChracter("WADI"));

    System.out.println("Contains Unique Chracters: " + new UniqueCharacater().isUniqueChars("QWERTYUIO")); // Prints the result to the console so the current state can be inspected.
  } // Closes the current block and ends the active scope.

  /**
   * 
   * based on asciiChar character array of 256
   * 
   * @param str
   * @return true if unique else false
   */
  public boolean isUniqueChars(String str) { // Defines the method that performs this unit of work for the class.
    boolean asciiChar[] = new boolean[256]; // Executes the current statement to update state or trigger the required behavior.
    for (int i = 0; i < str.length(); i++) { // Repeats the loop body as long as the loop condition remains true.
      int ch = str.charAt(i); // Stores the computed or supplied value in a variable for later use.
      if (asciiChar[ch]) { // Checks whether the condition is true before taking the matching action.
        return false; // Returns the computed value to the caller and exits the method.
      } else { // Closes the current block and ends the active scope.
        asciiChar[ch] = true; // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.
    return true; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.


  /**
   * 
   * Sort the array check each adjacent character
   * 
   * @param str
   * @return @return true if unique else false
   */
  public boolean containsUniqueChracter(String str) { // Defines the method that performs this unit of work for the class.
    char arr[] = str.toCharArray(); // Executes the current statement to update state or trigger the required behavior.
    char soretedArr[] = sortArray(arr); // Executes the current statement to update state or trigger the required behavior.
    // System.out.println("==>ARR:" + Arrays.toString(soretedArr));
    // System.out.println("==>ARR.Length:" + soretedArr.length);

    int i = 0, j = 0; // Stores the computed or supplied value in a variable for later use.
    for (i = 0; i < soretedArr.length; i++) { // Repeats the loop body as long as the loop condition remains true.
      j = i + 1; // Executes the current statement to update state or trigger the required behavior.
      if (j < soretedArr.length && (soretedArr[i] == soretedArr[j])) { // Checks whether the condition is true before taking the matching action.
        System.out.println("Matchd[" + soretedArr[i] + "]"); // Prints the result to the console so the current state can be inspected.
        return false; // Returns the computed value to the caller and exits the method.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    return true; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

  char[] sortArray(char arr[]) { // Defines the method that performs this unit of work for the class.
    return mergeS(arr); // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

  // Merge Sort. Dividing the elements in sub arrays and sending them for sort.

  char[] mergeS(char arr[]) { // Defines the method that performs this unit of work for the class.

    if (arr.length <= 1) { // Checks whether the condition is true before taking the matching action.
      return arr; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.
    int mid = arr.length / 2; // Stores the computed or supplied value in a variable for later use.
    int remLen = arr.length - mid; // Stores the computed or supplied value in a variable for later use.
    char arr1[] = new char[mid]; // Executes the current statement to update state or trigger the required behavior.
    char arr2[] = new char[remLen]; // Executes the current statement to update state or trigger the required behavior.
    System.arraycopy(arr, 0, arr1, 0, mid); // Executes the current statement to update state or trigger the required behavior.
    System.arraycopy(arr, mid, arr2, 0, remLen); // Executes the current statement to update state or trigger the required behavior.
    arr1 = mergeS(arr1); // Stores the computed or supplied value in a variable for later use.
    arr2 = mergeS(arr2); // Stores the computed or supplied value in a variable for later use.
    return mergeArray(arr1, arr2); // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

  // Sort the arrays
  char[] mergeArray(char[] arr1, char[] arr2) { // Defines the method that performs this unit of work for the class.

    int idx1 = 0; // Stores the computed or supplied value in a variable for later use.
    int idx2 = 0; // Stores the computed or supplied value in a variable for later use.
    int idx = 0; // Stores the computed or supplied value in a variable for later use.

    int len1 = arr1.length; // Stores the computed or supplied value in a variable for later use.
    int len2 = arr2.length; // Stores the computed or supplied value in a variable for later use.
    char arr[] = new char[len1 + len2]; // Executes the current statement to update state or trigger the required behavior.

    while (idx1 < len1 && idx2 < len2) { // Keeps executing this block until the loop condition becomes false.
      if ((int) arr1[idx1] < (int) arr2[idx2]) { // Checks whether the condition is true before taking the matching action.
        arr[idx++] = arr1[idx1++]; // Executes the current statement to update state or trigger the required behavior.
      } else { // Closes the current block and ends the active scope.
        arr[idx++] = arr2[idx2++]; // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    while (idx1 < len1) { // Keeps executing this block until the loop condition becomes false.
      arr[idx++] = arr1[idx1++]; // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.
    while (idx2 < len2) { // Keeps executing this block until the loop condition becomes false.
      arr[idx++] = arr2[idx2++]; // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.

    return arr; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
