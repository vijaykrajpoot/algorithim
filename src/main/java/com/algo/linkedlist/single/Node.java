package com.algo.linkedlist.single; // Declares the package so the class is organized under the correct Java namespace.

/**
 * 
 * Generic Node
 * 
 * @author Vijay Kumar Rajput
 *
 * @param <T>
 */

public class Node<T> { // Defines the Java type that contains the related data and behavior.

	T data; // Declares a variable to hold data needed by this method.

	Node<T> next; // Declares a variable to hold data needed by this method.

	public Node(T data) { // Defines the method that performs this unit of work for the class.
		this.data = data; // Stores the computed or supplied value in a variable for later use.
	} // Closes the current block and ends the active scope.

	public T getData() { // Defines the method that performs this unit of work for the class.
		return data; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
