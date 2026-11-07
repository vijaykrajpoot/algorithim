package com.threads.waitnotify; // Declares the package so the class is organized under the correct Java namespace.

import java.util.concurrent.ThreadLocalRandom; // Imports the classes needed to support this file's logic.

public class Sender implements Runnable { // Defines the Java type that contains the related data and behavior.
	private Data data; // Declares a variable to hold data needed by this method.
	
	public Sender(Data data) { // Defines the method that performs this unit of work for the class.
		this.data=data; // Stores the computed or supplied value in a variable for later use.
	} // Closes the current block and ends the active scope.
	
	@Override // Provides metadata for the Java element that follows.
	public void run() { // Defines the method that performs this unit of work for the class.
		System.err.println("Sender==>Thread.currentThread().getName():"+Thread.currentThread().getName()); // Executes the current statement to update state or trigger the required behavior.
		String packets []={ // Carries out the current statement to support the program's logic.
				"1","2","3","4","5","6","7","8",";" // Carries out the current statement to support the program's logic.
		}; // Closes the current block and ends the active scope.
		for(String packet:packets){ // Carries out the current statement to support the program's logic.
			System.err.println("Sending: Packet:"+packet); // Executes the current statement to update state or trigger the required behavior.
			data.send(packet); // Executes the current statement to update state or trigger the required behavior.
			try { // Attempts the guarded logic and prepares for possible failure.
				 Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000)); // Executes the current statement to update state or trigger the required behavior.
			} catch (InterruptedException e) { // Closes the current block and ends the active scope.
				Thread.currentThread().interrupt();  // Executes the current statement to update state or trigger the required behavior.
                System.err.println("Thread interrupted"+e.getMessage());  // Executes the current statement to update state or trigger the required behavior.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.
	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
