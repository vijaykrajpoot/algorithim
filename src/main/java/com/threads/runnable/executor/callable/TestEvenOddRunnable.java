package com.threads.runnable.executor.callable; // Declares the package so the class is organized under the correct Java namespace.

import java.util.concurrent.ExecutorService; // Imports the classes needed to support this file's logic.
import java.util.concurrent.Executors; // Imports the classes needed to support this file's logic.
import java.util.stream.IntStream; // Imports the classes needed to support this file's logic.

public class TestEvenOddRunnable { // Defines the Java type that contains the related data and behavior.
	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

		EvenOddNumberRunnable evenOddNumberRunnable100 = new EvenOddNumberRunnable(IntStream.range(1, 100).toArray()); // Stores the computed or supplied value in a variable for later use.
		EvenOddNumberRunnable evenOddNumberRunnable200 = new EvenOddNumberRunnable(IntStream.range(100, 200).toArray()); // Stores the computed or supplied value in a variable for later use.
		EvenOddNumberRunnable evenOddNumberRunnable300 = new EvenOddNumberRunnable(IntStream.range(300, 400).toArray()); // Stores the computed or supplied value in a variable for later use.

//		ExecutorService executorService=Executors.newSingleThreadExecutor();
//		executorService.execute(evenOddNumberRunnable);
//		
		
		ExecutorService executorServiceT=Executors.newFixedThreadPool(10); // Stores the computed or supplied value in a variable for later use.
		executorServiceT.execute(evenOddNumberRunnable100); // Executes the current statement to update state or trigger the required behavior.
		executorServiceT.execute(evenOddNumberRunnable200); // Executes the current statement to update state or trigger the required behavior.
		executorServiceT.execute(evenOddNumberRunnable300); // Executes the current statement to update state or trigger the required behavior.
		executorServiceT.shutdown(); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
