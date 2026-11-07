package com.algo; // Declares the package so the class is organized under the correct Java namespace.

public class StringToInteger { // Defines the Java type that contains the related data and behavior.
  
  /**
   * 
   * 
   * Lower index to higher index using pow function 
   * 
   * @param str
   * @return long
   */
  public static long convertToIntSol1(String str) { // Defines the method that performs this unit of work for the class.
    long finalNumber = 0; // Stores the computed or supplied value in a variable for later use.
    int len = str.length(); // Stores the computed or supplied value in a variable for later use.
    for (int i = 0; i < len; i++) { // Repeats the loop body as long as the loop condition remains true.
      int num = str.charAt(i) - '0'; // Stores the computed or supplied value in a variable for later use.
      finalNumber = (long) (finalNumber + (num * Math.pow(10, (len - 1 - i)))); // Stores the computed or supplied value in a variable for later use.
    } // Closes the current block and ends the active scope.
    return finalNumber; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.
  
  /**
   * 
   * From higer index to lower index
   * 
   * @param str
   * @return long
   */
  
  public static long convertToIntSol2(String str) { // Defines the method that performs this unit of work for the class.
    long finalNumber = 0; // Stores the computed or supplied value in a variable for later use.
    int len = str.length(); // Stores the computed or supplied value in a variable for later use.
    int multiplyer = 1; // Stores the computed or supplied value in a variable for later use.
    for (int i = len - 1; i >= 0; i--) { // Repeats the loop body as long as the loop condition remains true.
      int num = str.charAt(i) - 48; // Stores the computed or supplied value in a variable for later use.
      System.out.println("num:"+num); // Prints the result to the console so the current state can be inspected.
      finalNumber = finalNumber + (num * multiplyer); // Stores the computed or supplied value in a variable for later use.
      System.out.println("finalNumber:"+finalNumber); // Prints the result to the console so the current state can be inspected.
      multiplyer = multiplyer * 10; // Stores the computed or supplied value in a variable for later use.
    } // Closes the current block and ends the active scope.

    return finalNumber; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.


/**
 * 
 * From lower index ----> higher index
 * 
 * 
 * @param str
 * @return long
 */
  public static long convertToIntSol3(String str) { // Defines the method that performs this unit of work for the class.

    boolean isNegative = false; // Stores the computed or supplied value in a variable for later use.
    long finalNumber = 0; // Stores the computed or supplied value in a variable for later use.

    int index = 0; // Stores the computed or supplied value in a variable for later use.
    if (str.charAt(0) == '-') { // Checks whether the condition is true before taking the matching action.
      isNegative = true; // Stores the computed or supplied value in a variable for later use.
      index++; // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.

    for (int i = index; i < str.length(); i++) { // Repeats the loop body as long as the loop condition remains true.
      finalNumber = finalNumber * 10; // Stores the computed or supplied value in a variable for later use.
      finalNumber = finalNumber + (str.charAt(i) - '0'); // Stores the computed or supplied value in a variable for later use.
    } // Closes the current block and ends the active scope.

    if (isNegative) { // Checks whether the condition is true before taking the matching action.
      finalNumber = -finalNumber; // Stores the computed or supplied value in a variable for later use.
    } // Closes the current block and ends the active scope.
    return finalNumber; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    System.out.println(convertToIntSol1("12345")); // Prints the result to the console so the current state can be inspected.

    System.out.println(convertToIntSol2("123456")); // Prints the result to the console so the current state can be inspected.

    System.out.println(convertToIntSol3("-87654332")); // Prints the result to the console so the current state can be inspected.
  } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
