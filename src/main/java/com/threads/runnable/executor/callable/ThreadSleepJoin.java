package com.threads.runnable.executor.callable; // Declares the package so the class is organized under the correct Java namespace.

import java.time.LocalTime; // Imports the classes needed to support this file's logic.
import java.util.stream.IntStream; // Imports the classes needed to support this file's logic.

public class ThreadSleepJoin implements Runnable { // Defines the Java type that contains the related data and behavior.

	Object lock = new Object(); // Stores the computed or supplied value in a variable for later use.

	@Override // Provides metadata for the Java element that follows.
	public void run() { // Defines the method that performs this unit of work for the class.
		// IntStream.range(0, 1000).forEach(n -> {
		//
		// System.out.println(Thread.currentThread().getName() + "  " + n +
		// ": LocalTime.now():" + LocalTime.now());
		// try {
		// Thread.sleep(4000);
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// });
		System.out.println("Entered:" + Thread.currentThread().getName() + " : LocalTime.now():" + LocalTime.now()); // Prints the result to the console so the current state can be inspected.
		try { // Attempts the guarded logic and prepares for possible failure.
			Thread.sleep(4000); // Executes the current statement to update state or trigger the required behavior.
		} catch (Exception e) { // Closes the current block and ends the active scope.
			// TODO Auto-generated catch block
			e.printStackTrace(); // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
		System.out.println("Exiting:" + Thread.currentThread().getName() + ": LocalTime.now():" + LocalTime.now()); // Prints the result to the console so the current state can be inspected.
	} // Closes the current block and ends the active scope.

	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		System.out.println("Entered:" + Thread.currentThread().getName() + " : LocalTime.now():" + LocalTime.now()); // Prints the result to the console so the current state can be inspected.
		ThreadSleepJoin threadSleepJoin = new ThreadSleepJoin(); // Stores the computed or supplied value in a variable for later use.
		Thread t1 = new Thread(threadSleepJoin, "T1"); // Stores the computed or supplied value in a variable for later use.
		Thread t2 = new Thread(threadSleepJoin, "T2"); // Stores the computed or supplied value in a variable for later use.
		t1.start(); // Executes the current statement to update state or trigger the required behavior.
		t2.start(); // Executes the current statement to update state or trigger the required behavior.
		// start second thread after waiting for 2 seconds or if it's dead
		try { // Attempts the guarded logic and prepares for possible failure.
			t2.join(1000); // Executes the current statement to update state or trigger the required behavior.
		} catch (InterruptedException e) { // Closes the current block and ends the active scope.
			e.printStackTrace(); // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.

//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Exiting:" + Thread.currentThread().getName() + " : LocalTime.now():" + LocalTime.now()); // Prints the result to the console so the current state can be inspected.
		System.err.println(" T1 is Alive:" + t1.isAlive()); // Executes the current statement to update state or trigger the required behavior.
		System.err.println(" T2 is Alive:" + t2.isAlive()); // Executes the current statement to update state or trigger the required behavior.

	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
