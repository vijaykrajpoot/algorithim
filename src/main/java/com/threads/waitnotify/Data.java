package com.threads.waitnotify; // Declares the package so the class is organized under the correct Java namespace.

public class Data { // Defines the Java type that contains the related data and behavior.

	private String packet; // Declares a variable to hold data needed by this method.

	boolean transferInProgress = true; // Stores the computed or supplied value in a variable for later use.

	public synchronized void send(String packet) { // Carries out the current statement to support the program's logic.

		while (!transferInProgress) { // Keeps executing this block until the loop condition becomes false.
			try { // Attempts the guarded logic and prepares for possible failure.
				System.out.println("Wait() Start for Sender until transfer is done"); // Prints the result to the console so the current state can be inspected.
				wait(); // Executes the current statement to update state or trigger the required behavior.
			} catch (InterruptedException e) { // Closes the current block and ends the active scope.
				// TODO Auto-generated catch block
				e.printStackTrace(); // Executes the current statement to update state or trigger the required behavior.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.
		transferInProgress = false; // Stores the computed or supplied value in a variable for later use.
		this.packet = packet; // Stores the computed or supplied value in a variable for later use.
		notifyAll(); // Executes the current statement to update state or trigger the required behavior.

	} // Closes the current block and ends the active scope.

	public synchronized String receive() { // Carries out the current statement to support the program's logic.
		while (transferInProgress) { // Keeps executing this block until the loop condition becomes false.
			try { // Attempts the guarded logic and prepares for possible failure.
				System.out.println("Wait() Start for recever until transfer is done"); // Prints the result to the console so the current state can be inspected.
				wait(); // Executes the current statement to update state or trigger the required behavior.
			} catch (InterruptedException e) { // Closes the current block and ends the active scope.
				// TODO Auto-generated catch block
				e.printStackTrace(); // Executes the current statement to update state or trigger the required behavior.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.
		transferInProgress = true; // Stores the computed or supplied value in a variable for later use.
		notifyAll(); // Executes the current statement to update state or trigger the required behavior.
		return packet; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
