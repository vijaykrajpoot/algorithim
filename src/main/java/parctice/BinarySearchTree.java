package parctice; // Declares the package so the class is organized under the correct Java namespace.


import com.algo.tree.graph.TreeNode; // Imports the classes needed to support this file's logic.

import java.util.Stack; // Imports the classes needed to support this file's logic.

public class BinarySearchTree { // Defines the Java type that contains the related data and behavior.
	private Node root = null; // Stores the computed or supplied value in a variable for later use.

	public void insert(int data) { // Defines the method that performs this unit of work for the class.
		insertR(root, data); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	void insertR(Node node, int data) { // Defines the method that performs this unit of work for the class.
		if (this.root == null) { // Checks whether the condition is true before taking the matching action.
			this.root = new Node(data); // Stores the computed or supplied value in a variable for later use.

		} else { // Closes the current block and ends the active scope.
			if (data < node.data) { // Checks whether the condition is true before taking the matching action.
				if (node.left != null) { // Checks whether the condition is true before taking the matching action.
					insertR(node.left, data); // Executes the current statement to update state or trigger the required behavior.
				} else { // Closes the current block and ends the active scope.
					node.left = new Node(data); // Stores the computed or supplied value in a variable for later use.
				} // Closes the current block and ends the active scope.
			} else { // Closes the current block and ends the active scope.
				if (node.right != null) { // Checks whether the condition is true before taking the matching action.
					insertR(node.right, data); // Executes the current statement to update state or trigger the required behavior.
				} else { // Closes the current block and ends the active scope.
					node.right = new Node(data); // Stores the computed or supplied value in a variable for later use.
				} // Closes the current block and ends the active scope.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.
	} // Closes the current block and ends the active scope.


	public void printTree(Node node) { // Defines the method that performs this unit of work for the class.
		if (node != null) { // Checks whether the condition is true before taking the matching action.
			printTree(node.left); // Executes the current statement to update state or trigger the required behavior.
			System.out.println(node.data); // Prints the result to the console so the current state can be inspected.
			printTree(node.right); // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.

	} // Closes the current block and ends the active scope.
	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		BinarySearchTree binarySearchTree = new BinarySearchTree(); // Stores the computed or supplied value in a variable for later use.
		binarySearchTree.insert(10); // Executes the current statement to update state or trigger the required behavior.
		binarySearchTree.insert(20); // Executes the current statement to update state or trigger the required behavior.
		binarySearchTree.insert(30); // Executes the current statement to update state or trigger the required behavior.
		binarySearchTree.insert(40); // Executes the current statement to update state or trigger the required behavior.
		binarySearchTree.insert(5); // Executes the current statement to update state or trigger the required behavior.
		binarySearchTree.insert(4); // Executes the current statement to update state or trigger the required behavior.
		binarySearchTree.insert(3); // Executes the current statement to update state or trigger the required behavior.
		binarySearchTree.insert(50); // Executes the current statement to update state or trigger the required behavior.
		binarySearchTree.insert(6); // Executes the current statement to update state or trigger the required behavior.
		binarySearchTree.insert(8); // Executes the current statement to update state or trigger the required behavior.
		binarySearchTree.insert(7); // Executes the current statement to update state or trigger the required behavior.

		binarySearchTree.printTree(binarySearchTree.root); // Executes the current statement to update state or trigger the required behavior.
	//	binarySearchTree.displayTree();
	} // Closes the current block and ends the active scope.

	/**
	 * Copied Data Structures & Algorithms in Java by Robert Lafore
	 */
	public void displayTree() { // Defines the method that performs this unit of work for the class.
		Stack<Node> globalStack = new Stack<Node>(); // Stores the computed or supplied value in a variable for later use.
		globalStack.push(root); // Executes the current statement to update state or trigger the required behavior.
		int nBlanks = 50; // Stores the computed or supplied value in a variable for later use.
		boolean isRowEmpty = false; // Stores the computed or supplied value in a variable for later use.
		while (isRowEmpty == false) { // Keeps executing this block until the loop condition becomes false.
			Stack<Node> localStack = new Stack<>(); // Stores the computed or supplied value in a variable for later use.
			isRowEmpty = true; // Stores the computed or supplied value in a variable for later use.
			for (int j = 0; j < nBlanks; j++) // Repeats the loop body as long as the loop condition remains true.
				System.out.print(' '); // Prints the value without moving to a new line.
			while (globalStack.isEmpty() == false) { // Keeps executing this block until the loop condition becomes false.
				Node temp = globalStack.pop(); // Stores the computed or supplied value in a variable for later use.
				if (temp != null) { // Checks whether the condition is true before taking the matching action.
					System.out.print(temp.data); // Prints the value without moving to a new line.
					localStack.push(temp.left); // Executes the current statement to update state or trigger the required behavior.
					localStack.push(temp.right); // Executes the current statement to update state or trigger the required behavior.
					if (temp.left != null || temp.right != null) // Checks whether the condition is true before taking the matching action.
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

} // Closes the current block and ends the active scope.


class Node { // Defines the Java type that contains the related data and behavior.
	int data; // Declares a variable to hold data needed by this method.
	Node left; // Declares a variable to hold data needed by this method.
	Node right; // Declares a variable to hold data needed by this method.

	public Node(int data) { // Defines the method that performs this unit of work for the class.
		this.data = data; // Stores the computed or supplied value in a variable for later use.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.