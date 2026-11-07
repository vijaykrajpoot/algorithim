package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Random; // Imports the classes needed to support this file's logic.

public class IntegerEqual { // Defines the Java type that contains the related data and behavior.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

    Random random=new Random(); // Stores the computed or supplied value in a variable for later use.
    
    for(int i =0;i<Long.MAX_VALUE;i++) { // Carries out the current statement to support the program's logic.
      IntegerEqual.isIntegerEqual(random.nextInt(), random.nextInt()); // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.
//    
//    System.out.println(" IntegerEqual.isIntegerEqual(12, 12):" + IntegerEqual.isIntegerEqual(random.nextInt(), random.nextInt()));
//    System.out.println(" IntegerEqual.isIntegerEqual(11, 12):" + IntegerEqual.isIntegerEqual(11, 12));
//
//
//
//    System.out.println(" IntegerEqual.isIntegerEqual(12, 12):" + IntegerEqual.isIntegerEqualSolution2(12, 12));
//    System.out.println(" IntegerEqual.isIntegerEqual(11, 12):" + IntegerEqual.isIntegerEqualSolution2(11, 12));
  } // Closes the current block and ends the active scope.

  public static boolean isIntegerEqual(int num1, int num2) { // Defines the method that performs this unit of work for the class.
    return ((num1 ^ num2) == 0) ? true : false; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

  public static boolean isIntegerEqualSolution2(int num1, int num2) { // Defines the method that performs this unit of work for the class.
    return ((num1 - num2) == 0) ? true : false; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
