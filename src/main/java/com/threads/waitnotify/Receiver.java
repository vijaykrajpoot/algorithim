package com.threads.waitnotify; // Declares the package so the class is organized under the correct Java namespace.

import java.util.concurrent.ThreadLocalRandom; // Imports the classes needed to support this file's logic.

public class Receiver implements Runnable { // Defines the Java type that contains the related data and behavior.
	private Data data; // Declares a variable to hold data needed by this method.

	public Receiver(Data data) { // Defines the method that performs this unit of work for the class.
		this.data = data; // Stores the computed or supplied value in a variable for later use.
	} // Closes the current block and ends the active scope.

	@Override // Provides metadata for the Java element that follows.
	public void run() { // Defines the method that performs this unit of work for the class.
		System.err.println("Receiver Start:==>Thread.currentThread().getName():" + Thread.currentThread().getName()); // Executes the current statement to update state or trigger the required behavior.
		for (String packet = data.receive(); !packet.equals(";"); packet = data.receive()) { // Repeats the loop body as long as the loop condition remains true.
			System.out.println("Received:" + packet); // Prints the result to the console so the current state can be inspected.
			try { // Attempts the guarded logic and prepares for possible failure.
				Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000)); // Executes the current statement to update state or trigger the required behavior.
			} catch (InterruptedException e) { // Closes the current block and ends the active scope.
				Thread.currentThread().interrupt(); // Executes the current statement to update state or trigger the required behavior.
				System.err.println("Thread interrupted" + e.getMessage()); // Executes the current statement to update state or trigger the required behavior.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.
		System.err.println("Receiver Exiting:==>Thread.currentThread().getName():" + Thread.currentThread().getName()); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
