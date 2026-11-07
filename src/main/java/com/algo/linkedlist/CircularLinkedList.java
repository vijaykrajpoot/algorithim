package com.algo.linkedlist; // Declares the package so the class is organized under the correct Java namespace.

public class CircularLinkedList { // Defines the Java type that contains the related data and behavior.

	Node start; // Declares a variable to hold data needed by this method.
	Node current; // Declares a variable to hold data needed by this method.

	public void add(int data) { // Defines the method that performs this unit of work for the class.

		if (start == null) { // Checks whether the condition is true before taking the matching action.
			Node node = new Node(data); // Stores the computed or supplied value in a variable for later use.
			start = node; // Stores the computed or supplied value in a variable for later use.
			current = start; // Stores the computed or supplied value in a variable for later use.
		} else { // Closes the current block and ends the active scope.
			Node node = new Node(data); // Stores the computed or supplied value in a variable for later use.
			current.next = node; // Stores the computed or supplied value in a variable for later use.
			node.next = start; // Stores the computed or supplied value in a variable for later use.
			current = node; // Stores the computed or supplied value in a variable for later use.
		} // Closes the current block and ends the active scope.
	} // Closes the current block and ends the active scope.

	public boolean isCircularLinkedList() { // Defines the method that performs this unit of work for the class.
		Node current = start; // Stores the computed or supplied value in a variable for later use.
		while (current.next != start) { // Keeps executing this block until the loop condition becomes false.
			current = current.next; // Stores the computed or supplied value in a variable for later use.
		} // Closes the current block and ends the active scope.
		return current.next == start; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

	/**
	 * Show the list
	 */
	public void printList() { // Defines the method that performs this unit of work for the class.
		Node curret = start; // Stores the computed or supplied value in a variable for later use.
		System.out.print("List: "); // Prints the value without moving to a new line.
		while (curret.next != start) { // Keeps executing this block until the loop condition becomes false.
			System.out.print("=>" + curret.data); // Prints the value without moving to a new line.
			curret = curret.next; // Stores the computed or supplied value in a variable for later use.
		} // Closes the current block and ends the active scope.
		System.out.println(); // Prints the result to the console so the current state can be inspected.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
