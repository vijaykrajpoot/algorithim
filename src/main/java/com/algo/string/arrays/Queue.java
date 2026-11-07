package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

public class Queue { // Defines the Java type that contains the related data and behavior.
	private int maxSize; // Declares a variable to hold data needed by this method.
	private int arr[]; // Executes the current statement to update state or trigger the required behavior.
	int front = -1; // Stores the computed or supplied value in a variable for later use.
	int rear = -1; // Stores the computed or supplied value in a variable for later use.

	public Queue(int maxSize) { // Defines the method that performs this unit of work for the class.
		this.maxSize = maxSize; // Stores the computed or supplied value in a variable for later use.
		arr = new int[maxSize]; // Stores the computed or supplied value in a variable for later use.
	} // Closes the current block and ends the active scope.

	public void enQueue(int num) { // Defines the method that performs this unit of work for the class.
		if (rear == -1) { // Checks whether the condition is true before taking the matching action.
			front = 0; // Stores the computed or supplied value in a variable for later use.
			rear = 0; // Stores the computed or supplied value in a variable for later use.
			arr[rear] = num; // Executes the current statement to update state or trigger the required behavior.
		} else if (rear + 1 >= maxSize) { // Closes the current block and ends the active scope.
			throw new IndexOutOfBoundsException("OverFlow"); // Raises an exception to signal an invalid or unexpected condition.
		} else if (rear + 1 < maxSize) { // Closes the current block and ends the active scope.
			arr[++rear] = num; // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.

	} // Closes the current block and ends the active scope.

	public int deQueue() { // Defines the method that performs this unit of work for the class.

		if (isEmpty()) { // Checks whether the condition is true before taking the matching action.
			throw new IndexOutOfBoundsException("UnderFlow"); // Raises an exception to signal an invalid or unexpected condition.
		} else { // Closes the current block and ends the active scope.
			int element = arr[front]; // Stores the computed or supplied value in a variable for later use.
			if (rear == front) { // Checks whether the condition is true before taking the matching action.
				rear = -1; // Stores the computed or supplied value in a variable for later use.
				front = -1; // Stores the computed or supplied value in a variable for later use.
			} else { // Closes the current block and ends the active scope.
				front++; // Executes the current statement to update state or trigger the required behavior.
			} // Closes the current block and ends the active scope.

			return element; // Returns the computed value to the caller and exits the method.
		} // Closes the current block and ends the active scope.

	} // Closes the current block and ends the active scope.

	void show() { // Defines the method that performs this unit of work for the class.
		System.out.print("Elemnt:"); // Prints the value without moving to a new line.

		System.out.print("\nQueue = "); // Prints the value without moving to a new line.
		if (isEmpty()) { // Checks whether the condition is true before taking the matching action.
			System.out.println("Empty..."); // Prints the result to the console so the current state can be inspected.
		} // Closes the current block and ends the active scope.
		for (int i = front; i <= rear; i++) // Repeats the loop body as long as the loop condition remains true.
			System.out.print(arr[i] + " "); // Prints the value without moving to a new line.
		System.out.println(); // Prints the result to the console so the current state can be inspected.
	} // Closes the current block and ends the active scope.

	boolean isEmpty() { // Defines the method that performs this unit of work for the class.
		return front == -1; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		Queue queue = new Queue(5); // Stores the computed or supplied value in a variable for later use.
		queue.enQueue(10); // Executes the current statement to update state or trigger the required behavior.
		queue.enQueue(20); // Executes the current statement to update state or trigger the required behavior.
		queue.enQueue(30); // Executes the current statement to update state or trigger the required behavior.
		queue.enQueue(40); // Executes the current statement to update state or trigger the required behavior.
		queue.show(); // Executes the current statement to update state or trigger the required behavior.
		queue.deQueue(); // Executes the current statement to update state or trigger the required behavior.
		queue.deQueue(); // Executes the current statement to update state or trigger the required behavior.
		queue.enQueue(70); // Executes the current statement to update state or trigger the required behavior.
		// queue.enQueue(80);
		queue.show(); // Executes the current statement to update state or trigger the required behavior.
		 queue.deQueue(); // Executes the current statement to update state or trigger the required behavior.
		 queue.enQueue(50); // Executes the current statement to update state or trigger the required behavior.
		 queue.enQueue(70); // Executes the current statement to update state or trigger the required behavior.
		 queue.show(); // Executes the current statement to update state or trigger the required behavior.

	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
