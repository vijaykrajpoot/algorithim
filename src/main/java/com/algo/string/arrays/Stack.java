package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.EmptyStackException; // Imports the classes needed to support this file's logic.

public class Stack<T> { // Defines the Java type that contains the related data and behavior.

	private int top = -1; // Stores the computed or supplied value in a variable for later use.

	private final T[] array; // Declares a variable to hold data needed by this method.

	private final int maxSize=200; // Stores the computed or supplied value in a variable for later use.

	@SuppressWarnings("unchecked") // Provides metadata for the Java element that follows.
	public Stack() { // Defines the method that performs this unit of work for the class.
        array = (T[]) new Object[maxSize]; // Stores the computed or supplied value in a variable for later use.
    } // Closes the current block and ends the active scope.

	public void push(T element) { // Defines the method that performs this unit of work for the class.
		if (top == maxSize-1) { // Checks whether the condition is true before taking the matching action.
			throw new StackOverflowError("Stack is Over Flowed"); // Raises an exception to signal an invalid or unexpected condition.
		} // Closes the current block and ends the active scope.
		array[++top] = element; // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	public T pop() { // Defines the method that performs this unit of work for the class.
		if (top == -1) { // Checks whether the condition is true before taking the matching action.
			throw new EmptyStackException(); // Raises an exception to signal an invalid or unexpected condition.
		} // Closes the current block and ends the active scope.
		return array[top--]; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

	public boolean isEmpty() { // Defines the method that performs this unit of work for the class.
		return top == -1; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		Stack<Integer> stack = new Stack<>(); // Stores the computed or supplied value in a variable for later use.
		stack.push(10); // Executes the current statement to update state or trigger the required behavior.
		stack.push(20); // Executes the current statement to update state or trigger the required behavior.
		stack.push(30); // Executes the current statement to update state or trigger the required behavior.
		stack.push(40); // Executes the current statement to update state or trigger the required behavior.
		stack.push(50); // Executes the current statement to update state or trigger the required behavior.
		System.out.println("stack.pop():" + stack.pop()); // Prints the result to the console so the current state can be inspected.
		System.out.println("stack.pop():" + stack.pop()); // Prints the result to the console so the current state can be inspected.
		System.out.println("stack.pop():" + stack.pop()); // Prints the result to the console so the current state can be inspected.
		System.out.println("stack.pop():" + stack.pop()); // Prints the result to the console so the current state can be inspected.
		System.out.println("stack.pop():" + stack.pop()); // Prints the result to the console so the current state can be inspected.

	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
