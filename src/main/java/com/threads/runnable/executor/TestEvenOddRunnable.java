package com.threads.runnable.executor; // Declares the package so the class is organized under the correct Java namespace.

import java.time.LocalTime; // Imports the classes needed to support this file's logic.
import java.util.concurrent.ExecutionException; // Imports the classes needed to support this file's logic.
import java.util.concurrent.ExecutorService; // Imports the classes needed to support this file's logic.
import java.util.concurrent.Executors; // Imports the classes needed to support this file's logic.
import java.util.concurrent.Future; // Imports the classes needed to support this file's logic.
import java.util.stream.IntStream; // Imports the classes needed to support this file's logic.

public class TestEvenOddRunnable { // Defines the Java type that contains the related data and behavior.
	public static void main(String[] args) throws InterruptedException, ExecutionException { // Carries out the current statement to support the program's logic.

		EvenOddNumberRunnable evenOddNumberRunnable100 = new EvenOddNumberRunnable(IntStream.range(1, 100).toArray()); // Stores the computed or supplied value in a variable for later use.
		EvenOddNumberRunnable evenOddNumberRunnable200 = new EvenOddNumberRunnable(IntStream.range(100, 200).toArray()); // Stores the computed or supplied value in a variable for later use.
		EvenOddNumberRunnable evenOddNumberRunnable300 = new EvenOddNumberRunnable(IntStream.range(200, 300).toArray()); // Stores the computed or supplied value in a variable for later use.
		EvenOddNumberRunnable evenOddNumberRunnable400 = new EvenOddNumberRunnable(IntStream.range(300, 400).toArray()); // Stores the computed or supplied value in a variable for later use.

		// ExecutorService executorService=Executors.newSingleThreadExecutor();
		// executorService.execute(evenOddNumberRunnable);
		//

		ExecutorService executorServiceT = Executors.newFixedThreadPool(10); // Stores the computed or supplied value in a variable for later use.
		Future<String> future1 = executorServiceT.submit(evenOddNumberRunnable100); // Stores the computed or supplied value in a variable for later use.
		System.out.println(LocalTime.now() + "::" + future1.get()); // Prints the result to the console so the current state can be inspected.

		Future<String> future2 = executorServiceT.submit(evenOddNumberRunnable200); // Stores the computed or supplied value in a variable for later use.
		System.out.println(LocalTime.now() + "::" + future2.get()); // Prints the result to the console so the current state can be inspected.

		Future<String> future3 = executorServiceT.submit(evenOddNumberRunnable300); // Stores the computed or supplied value in a variable for later use.
		System.out.println(LocalTime.now() + "::" + future3.get()); // Prints the result to the console so the current state can be inspected.

		Future<String> future4 = executorServiceT.submit(evenOddNumberRunnable400); // Stores the computed or supplied value in a variable for later use.
		System.out.println(LocalTime.now() + "::" + future4.get()); // Prints the result to the console so the current state can be inspected.

		// System.out.println( LocalTime.now()+"::"+future1.get());
		// System.out.println( LocalTime.now()+"::"+future2.get());
		// System.out.println( LocalTime.now()+"::"+future3.get());
		// System.out.println( LocalTime.now()+"::"+future4.get());

		executorServiceT.shutdown(); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
