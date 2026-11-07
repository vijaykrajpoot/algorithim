package com.threads.runnable.executor; // Declares the package so the class is organized under the correct Java namespace.

import java.util.concurrent.Callable; // Imports the classes needed to support this file's logic.

public class EvenOddNumberRunnable implements Callable<String> { // Defines the Java type that contains the related data and behavior.
	private int[] arr; // Declares a variable to hold data needed by this method.

	public EvenOddNumberRunnable(int[] arr) { // Defines the method that performs this unit of work for the class.
		this.arr = arr; // Stores the computed or supplied value in a variable for later use.
	} // Closes the current block and ends the active scope.

	@Override // Provides metadata for the Java element that follows.
	public String call() throws Exception { // Carries out the current statement to support the program's logic.
		System.out.println("Thread.currentThread().getName():" + Thread.currentThread().getName()); // Prints the result to the console so the current state can be inspected.
		for (int i : arr) { // Repeats the loop body as long as the loop condition remains true.
			if (i % 2 == 0) // Checks whether the condition is true before taking the matching action.
				System.err.println("Even:" + i); // Executes the current statement to update state or trigger the required behavior.
			else // Runs this branch when the previous conditional check is false.
				System.err.println("Odd:" + i); // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
		return "Done"; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
