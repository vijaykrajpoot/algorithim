package com.threads.waitnotify; // Declares the package so the class is organized under the correct Java namespace.

import java.util.concurrent.ExecutorService; // Imports the classes needed to support this file's logic.
import java.util.concurrent.Executors; // Imports the classes needed to support this file's logic.

public class MainApp { // Defines the Java type that contains the related data and behavior.
	
	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		Data data=new Data(); // Stores the computed or supplied value in a variable for later use.
		
		ExecutorService executorServiceSender=Executors.newFixedThreadPool(2); // Stores the computed or supplied value in a variable for later use.
		executorServiceSender.submit(new Sender(data)); // Executes the current statement to update state or trigger the required behavior.
		
		ExecutorService executorServiceRecever=Executors.newFixedThreadPool(2); // Stores the computed or supplied value in a variable for later use.
		executorServiceRecever.submit(new Receiver(data)); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
