package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

public class FindPairInSortedArray { // Defines the Java type that contains the related data and behavior.


  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    int arr[] = {5, 11, 15, 18, 20, 30, 1, 2, 3, 4}; // Executes the current statement to update state or trigger the required behavior.
    int sum = 16; // Stores the computed or supplied value in a variable for later use.

    System.out.println("isPairInSortedRotatedArray(arr, sum):" + isPairInSortedRotatedArray(arr, sum)); // Prints the result to the console so the current state can be inspected.
  } // Closes the current block and ends the active scope.

  static boolean isPairInSortedRotatedArray(int arr[], int sum) { // Defines the method that performs this unit of work for the class.
    // find pivot point.
    int i = 0; // Stores the computed or supplied value in a variable for later use.
    for (i = 0; i < arr.length - 1; i++) { // Repeats the loop body as long as the loop condition remains true.
      if (arr[i] > arr[i + 1]) { // Checks whether the condition is true before taking the matching action.
        System.out.println("Pivot Index: " + i); // Prints the result to the console so the current state can be inspected.
        break; // Exits the current loop or switch branch immediately.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    int higherIdx = i; // Stores the computed or supplied value in a variable for later use.
    int lowIdx = (i + 1) % arr.length; // Stores the computed or supplied value in a variable for later use.
    System.out.println("higherIdx:" + higherIdx + " lowIdx:" + lowIdx); // Prints the result to the console so the current state can be inspected.

    while (lowIdx != higherIdx) { // Keeps executing this block until the loop condition becomes false.
      System.out.println("arr[" + lowIdx + "]:" + arr[lowIdx] + " + arr[" + higherIdx + "]:" + arr[higherIdx] + " - Sum:" + (arr[lowIdx] + arr[higherIdx]) + " Sum:" + sum + " higherIdx:" + higherIdx // Prints the result to the console so the current state can be inspected.
          + " lowIdx:" + lowIdx); // Executes the current statement to update state or trigger the required behavior.
      if (arr[lowIdx] + arr[higherIdx] == sum) { // Checks whether the condition is true before taking the matching action.
        System.out.println("Pair (" + (arr[lowIdx] + "," + arr[higherIdx]) + ")"); // Prints the result to the console so the current state can be inspected.
        return true; // Returns the computed value to the caller and exits the method.

      } // Closes the current block and ends the active scope.

      if (arr[lowIdx] + arr[higherIdx] > sum) { // Checks whether the condition is true before taking the matching action.
        higherIdx = (higherIdx - 1) % arr.length; // Stores the computed or supplied value in a variable for later use.
      } else { // Closes the current block and ends the active scope.
        lowIdx = (lowIdx + 1) % arr.length; // Stores the computed or supplied value in a variable for later use.
      } // Closes the current block and ends the active scope.

    } // Closes the current block and ends the active scope.

    return false; // Returns the computed value to the caller and exits the method.

  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
