package com.algo; // Declares the package so the class is organized under the correct Java namespace.

public class SquareRoot { // Defines the Java type that contains the related data and behavior.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

    System.out.println(SquareRoot.squareRoot(100.00)); // Prints the result to the console so the current state can be inspected.
  } // Closes the current block and ends the active scope.

  static double squareRoot(double number) { // Defines the method that performs this unit of work for the class.
    if(number==0 || number==1) { // Carries out the current statement to support the program's logic.
      return number; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.
  
    for( int i=0;i<number;i++) { // Carries out the current statement to support the program's logic.
      
        if(i*i==number) { // Carries out the current statement to support the program's logic.
          return i; // Returns the computed value to the caller and exits the method.
        } // Closes the current block and ends the active scope.
      
    } // Closes the current block and ends the active scope.
    return 0; // Returns the computed value to the caller and exits the method.
    
  } // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
