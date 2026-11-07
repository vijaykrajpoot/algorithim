package com.threads.runnable; // Declares the package so the class is organized under the correct Java namespace.

public class EvenOddNumber implements Runnable { // Defines the Java type that contains the related data and behavior.
	private int[] arr; // Declares a variable to hold data needed by this method.

	public EvenOddNumber(int[] arr) { // Defines the method that performs this unit of work for the class.
		this.arr = arr; // Stores the computed or supplied value in a variable for later use.
	} // Closes the current block and ends the active scope.

	@Override // Provides metadata for the Java element that follows.
	public void run() { // Defines the method that performs this unit of work for the class.
		for (int i : arr) { // Repeats the loop body as long as the loop condition remains true.
			if (i % 2 == 0) // Checks whether the condition is true before taking the matching action.
				System.err.println("Even:"+i); // Executes the current statement to update state or trigger the required behavior.
			else // Runs this branch when the previous conditional check is false.
				System.err.println("Odd:"+i); // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
