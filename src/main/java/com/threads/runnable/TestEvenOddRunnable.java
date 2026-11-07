package com.threads.runnable; // Declares the package so the class is organized under the correct Java namespace.

import java.util.stream.IntStream; // Imports the classes needed to support this file's logic.

public class TestEvenOddRunnable { // Defines the Java type that contains the related data and behavior.
	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

		EvenOddNumber evenOddNumber = new EvenOddNumber(IntStream.range(1, 100).toArray()); // Stores the computed or supplied value in a variable for later use.
		Thread t1 = new Thread(evenOddNumber); // Stores the computed or supplied value in a variable for later use.
		t1.start(); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
