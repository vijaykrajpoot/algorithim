package com.algo; // Declares the package so the class is organized under the correct Java namespace.

import java.time.Duration; // Imports the classes needed to support this file's logic.
import java.time.Instant; // Imports the classes needed to support this file's logic.

/**
 * 
 * Find a given number is Prime or not.
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class PrimeNumber { // Defines the Java type that contains the related data and behavior.


  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    int number = 1500450271; // Stores the computed or supplied value in a variable for later use.
    long stTime = Instant.now().toEpochMilli(); // Stores the computed or supplied value in a variable for later use.
    PrimeNumber.isPrime(number); // Executes the current statement to update state or trigger the required behavior.
    long endTime = Instant.now().toEpochMilli(); // Stores the computed or supplied value in a variable for later use.

    long timeElapsed = endTime - stTime; // Stores the computed or supplied value in a variable for later use.
    System.out.println(timeElapsed); // Prints the result to the console so the current state can be inspected.

    // System.out.println("PrimeNumber.isPrime(" + number + ") :" + PrimeNumber.isPrime(number));
    // number = 7;
    // System.out.println("PrimeNumber.isPrime(" + number + ") :" + PrimeNumber.isPrime(number));
    // number = 25;
    // System.out.println("PrimeNumber.isPrime(" + number + ") :" + PrimeNumber.isPrime(number));
    // number = 343;
    // System.out.println("PrimeNumber.isPrime(" + number + ") :" + PrimeNumber.isPrime(number));
    // number = 0;
    // System.out.println("PrimeNumber.isPrime(" + number + ") :" + PrimeNumber.isPrime(number));
    // number = 2;
    // System.out.println("PrimeNumber.isPrime(" + number + ") :" + PrimeNumber.isPrime(number));
    // number = 1;
    // System.out.println("PrimeNumber.isPrime(" + number + ") :" + PrimeNumber.isPrime(number));
    //
    // number = -23;
    // System.out.println("PrimeNumber.isPrime(" + number + ") :" + PrimeNumber.isPrime(number));
    //
    //
    // number = 29;
    // System.out.println("PrimeNumber.isPrime(" + number + ") :" + PrimeNumber.isPrime(number));

  } // Closes the current block and ends the active scope.

  static boolean isPrime(int numnber) { // Defines the method that performs this unit of work for the class.
    if (numnber <= 1) { // Checks whether the condition is true before taking the matching action.
      return false; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    for (int i = 2; i < Math.sqrt(numnber); i++) { // Repeats the loop body as long as the loop condition remains true.
      if (numnber % i == 0) { // Checks whether the condition is true before taking the matching action.
        return false; // Returns the computed value to the caller and exits the method.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.
    return true; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
