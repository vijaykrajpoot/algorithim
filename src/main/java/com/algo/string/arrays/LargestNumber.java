package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Arrays; // Imports the classes needed to support this file's logic.
import java.util.Comparator; // Imports the classes needed to support this file's logic.
import java.util.List; // Imports the classes needed to support this file's logic.

/**
 * 
 * Given a list of non negative integers, arrange them such that they form the largest number.
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class LargestNumber { // Defines the Java type that contains the related data and behavior.


  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    int arr[] = {3, 30, 34, 5, 9}; // Executes the current statement to update state or trigger the required behavior.
    System.out.println("LargestNumber.formLargestNumber(arr):" + LargestNumber.formLargestNumber(arr)); // Prints the result to the console so the current state can be inspected.
    int arr1[] = {0, 0, 0, 0, 0}; // Executes the current statement to update state or trigger the required behavior.
    System.out.println("LargestNumber.formLargestNumber(arr):" + LargestNumber.formLargestNumber(arr1)); // Prints the result to the console so the current state can be inspected.



  } // Closes the current block and ends the active scope.

  public static String formLargestNumber(int arr[]) { // Defines the method that performs this unit of work for the class.

    String[] strArr = new String[arr.length]; // Stores the computed or supplied value in a variable for later use.

    for (int i = 0; i < arr.length; i++) { // Repeats the loop body as long as the loop condition remains true.
      strArr[i] = String.valueOf(arr[i]); // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.

    System.out.println("Before Sorting: " + Arrays.toString(strArr)); // Prints the result to the console so the current state can be inspected.
    // Sort higer number like 95
    Arrays.sort(strArr, new Comparator<String>() { // Carries out the current statement to support the program's logic.
      public int compare(String o1, String o2) { // Defines the method that performs this unit of work for the class.
        System.err.println((o2 + o1) + "-" + (o1 + o2) + "==>" + (o2 + o1).compareTo(o1 + o2)); // Executes the current statement to update state or trigger the required behavior.
        return (o2 + o1).compareTo(o1 + o2); // Returns the computed value to the caller and exits the method.
      }; // Closes the current block and ends the active scope.
    }); // Closes the current block and ends the active scope.


    StringBuilder builder = new StringBuilder(); // Stores the computed or supplied value in a variable for later use.
    // System.out.println("After Sorting: " + Arrays.toString(strArr));
    boolean isAllZero = true; // Stores the computed or supplied value in a variable for later use.
    for (String st : strArr) { // Repeats the loop body as long as the loop condition remains true.
      if (isAllZero && st.equals("0")) { // Checks whether the condition is true before taking the matching action.
        isAllZero = true; // Stores the computed or supplied value in a variable for later use.
      } else { // Closes the current block and ends the active scope.
        isAllZero = false; // Stores the computed or supplied value in a variable for later use.
      } // Closes the current block and ends the active scope.
      builder.append(st); // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.
    if (isAllZero) { // Checks whether the condition is true before taking the matching action.
      return "0"; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.
    System.out.println(builder.toString()); // Prints the result to the console so the current state can be inspected.
    return builder.toString(); // Returns the computed value to the caller and exits the method.

  } // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.

