package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.HashMap; // Imports the classes needed to support this file's logic.
import java.util.Map; // Imports the classes needed to support this file's logic.

public class CountPaintInArray { // Defines the Java type that contains the related data and behavior.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    int arr[] = {1, 1, 3, 1, 1, 0, 3, 4, 4, 4, 3, 1, 5, 6, 7, 2, 6, 8, 9, 1, 7}; // Executes the current statement to update state or trigger the required behavior.
    int noOfPairs = CountPaintInArray.countPair(arr); // Stores the computed or supplied value in a variable for later use.
    System.out.println("noOfPairs:" + noOfPairs); // Prints the result to the console so the current state can be inspected.
  } // Closes the current block and ends the active scope.

  public static int countPair(int arr[]) { // Defines the method that performs this unit of work for the class.
    int noOfPairs = 0; // Stores the computed or supplied value in a variable for later use.
    int noOfPairsOfEachElement = 0; // Stores the computed or supplied value in a variable for later use.

    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>(); // Stores the computed or supplied value in a variable for later use.

    for (int element : arr) { // Repeats the loop body as long as the loop condition remains true.
      if (hashMap.get(element) != null) { // Checks whether the condition is true before taking the matching action.
        hashMap.put(element, hashMap.get(element) + 1); // Executes the current statement to update state or trigger the required behavior.
      } else { // Closes the current block and ends the active scope.
        hashMap.put(element, 1); // Executes the current statement to update state or trigger the required behavior.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    System.out.println(hashMap); // Prints the result to the console so the current state can be inspected.

    for (Map.Entry<Integer, Integer> it : hashMap.entrySet()) { // Repeats the loop body as long as the loop condition remains true.
      int count = it.getValue(); // Stores the computed or supplied value in a variable for later use.
      // Formula based of Pattern
      noOfPairsOfEachElement = (count * (count - 1)) / 2; // Stores the computed or supplied value in a variable for later use.
      System.out.println("Nnumber Of Pairs of " + it.getKey() + " : " + noOfPairsOfEachElement); // Prints the result to the console so the current state can be inspected.
      noOfPairs += noOfPairsOfEachElement; // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.
    return noOfPairs; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
