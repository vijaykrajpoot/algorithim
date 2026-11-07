package com.algo; // Declares the package so the class is organized under the correct Java namespace.

public class TestMe { // Defines the Java type that contains the related data and behavior.


  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
    
    int num=1234567; // Stores the computed or supplied value in a variable for later use.
    
    while(num!=0) { // Carries out the current statement to support the program's logic.
      int rem=num%10; // Stores the computed or supplied value in a variable for later use.
      num=num/10; // Stores the computed or supplied value in a variable for later use.
      System.out.println("num:"+num+"-" + rem); // Prints the result to the console so the current state can be inspected.
      
    } // Closes the current block and ends the active scope.
    
    
  } // Closes the current block and ends the active scope.
  


} // Closes the current block and ends the active scope.
