package com.algo.tree.graph; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Stack; // Imports the classes needed to support this file's logic.

public class BinaryTree<T extends Comparable<T>> { // Defines the Java type that contains the related data and behavior.

	private Node<T> root; // Declares a variable to hold data needed by this method.

	public void insert(T data) { // Defines the method that performs this unit of work for the class.
		insertNode(getRoot(), data); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	public Node<T> getRoot() { // Defines the method that performs this unit of work for the class.
		return root; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

	public void insertNode(Node<T> root, T data) { // Defines the method that performs this unit of work for the class.
		Node<T> node = new Node<T>(data); // Stores the computed or supplied value in a variable for later use.
		if (this.root == null) { // Checks whether the condition is true before taking the matching action.
			this.root = node; // Stores the computed or supplied value in a variable for later use.
		} else { // Closes the current block and ends the active scope.
			if (data.compareTo(root.data) < 0) { // Checks whether the condition is true before taking the matching action.
				if (root.leftNode != null) { // Checks whether the condition is true before taking the matching action.
					insertNode(root.leftNode, data); // Executes the current statement to update state or trigger the required behavior.
				} else { // Closes the current block and ends the active scope.
					root.leftNode = node; // Stores the computed or supplied value in a variable for later use.
				} // Closes the current block and ends the active scope.
			} else if (data.compareTo(root.data) > 0) { // Closes the current block and ends the active scope.
				if (root.rightNode != null) { // Checks whether the condition is true before taking the matching action.
					insertNode(root.rightNode, data); // Executes the current statement to update state or trigger the required behavior.
				} else { // Closes the current block and ends the active scope.
					root.rightNode = node; // Stores the computed or supplied value in a variable for later use.
				} // Closes the current block and ends the active scope.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.
	} // Closes the current block and ends the active scope.

	/**
	 * Copied Data Structures & Algorithms in Java by Robert Lafore
	 */
	public void displayTree() { // Defines the method that performs this unit of work for the class.
		Stack<Node<T>> globalStack = new Stack<Node<T>>(); // Stores the computed or supplied value in a variable for later use.
		globalStack.push(root); // Executes the current statement to update state or trigger the required behavior.
		int nBlanks = 50; // Stores the computed or supplied value in a variable for later use.
		boolean isRowEmpty = false; // Stores the computed or supplied value in a variable for later use.
		while (isRowEmpty == false) { // Keeps executing this block until the loop condition becomes false.
			Stack<Node<T>> localStack = new Stack<Node<T>>(); // Stores the computed or supplied value in a variable for later use.
			isRowEmpty = true; // Stores the computed or supplied value in a variable for later use.
			for (int j = 0; j < nBlanks; j++) // Repeats the loop body as long as the loop condition remains true.
				System.out.print(' '); // Prints the value without moving to a new line.
			while (globalStack.isEmpty() == false) { // Keeps executing this block until the loop condition becomes false.
				Node<T> temp = globalStack.pop(); // Stores the computed or supplied value in a variable for later use.
				if (temp != null) { // Checks whether the condition is true before taking the matching action.
					System.out.print(temp.data); // Prints the value without moving to a new line.
					localStack.push(temp.leftNode); // Executes the current statement to update state or trigger the required behavior.
					localStack.push(temp.rightNode); // Executes the current statement to update state or trigger the required behavior.
					if (temp.leftNode != null || temp.rightNode != null) // Checks whether the condition is true before taking the matching action.
						isRowEmpty = false; // Stores the computed or supplied value in a variable for later use.
				} else { // Closes the current block and ends the active scope.
					System.out.print("##"); // Prints the value without moving to a new line.
					localStack.push(null); // Executes the current statement to update state or trigger the required behavior.
					localStack.push(null); // Executes the current statement to update state or trigger the required behavior.
				} // Closes the current block and ends the active scope.
				for (int j = 0; j < nBlanks * 2 - 2; j++) // Repeats the loop body as long as the loop condition remains true.
					System.out.print(' '); // Prints the value without moving to a new line.
			} // end while globalStack not empty // Closes the current block and ends the active scope.
			System.out.println(); // Prints the result to the console so the current state can be inspected.
			nBlanks /= 2; // Executes the current statement to update state or trigger the required behavior.
			while (localStack.isEmpty() == false) // Keeps executing this block until the loop condition becomes false.
				globalStack.push(localStack.pop()); // Executes the current statement to update state or trigger the required behavior.
		} // end while isRowEmpty is false // Closes the current block and ends the active scope.
	} // Closes the current block and ends the active scope.

	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		BinaryTree<Integer> binaryTree = new BinaryTree<Integer>(); // Stores the computed or supplied value in a variable for later use.
		binaryTree.insert(25); // Executes the current statement to update state or trigger the required behavior.
		binaryTree.insert(20); // Executes the current statement to update state or trigger the required behavior.
		binaryTree.insert(10); // Executes the current statement to update state or trigger the required behavior.
		binaryTree.insert(22); // Executes the current statement to update state or trigger the required behavior.
		binaryTree.insert(5); // Executes the current statement to update state or trigger the required behavior.
		binaryTree.insert(12); // Executes the current statement to update state or trigger the required behavior.
		binaryTree.insert(1); // Executes the current statement to update state or trigger the required behavior.
		binaryTree.insert(8); // Executes the current statement to update state or trigger the required behavior.
		binaryTree.insert(15); // Executes the current statement to update state or trigger the required behavior.
		binaryTree.insert(11); // Executes the current statement to update state or trigger the required behavior.
		binaryTree.insert(22); // Executes the current statement to update state or trigger the required behavior.
		binaryTree.insert(36); // Executes the current statement to update state or trigger the required behavior.
		binaryTree.insert(30); // Executes the current statement to update state or trigger the required behavior.
		binaryTree.insert(28); // Executes the current statement to update state or trigger the required behavior.
		binaryTree.insert(40); // Executes the current statement to update state or trigger the required behavior.
		binaryTree.insert(38); // Executes the current statement to update state or trigger the required behavior.
		binaryTree.insert(48); // Executes the current statement to update state or trigger the required behavior.
		binaryTree.insert(45); // Executes the current statement to update state or trigger the required behavior.
		binaryTree.insert(50); // Executes the current statement to update state or trigger the required behavior.
		binaryTree.displayTree(); // Executes the current statement to update state or trigger the required behavior.

	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.

class Node<T extends Comparable<T>> { // Defines the Java type that contains the related data and behavior.
	Node<T> leftNode; // Declares a variable to hold data needed by this method.
	Node<T> rightNode; // Declares a variable to hold data needed by this method.
	T data; // Declares a variable to hold data needed by this method.

	public Node(T data) { // Defines the method that performs this unit of work for the class.
		this.data = data; // Stores the computed or supplied value in a variable for later use.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
