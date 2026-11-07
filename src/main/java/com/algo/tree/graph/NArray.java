package com.algo.tree.graph; // Declares the package so the class is organized under the correct Java namespace.

import java.util.ArrayList; // Imports the classes needed to support this file's logic.
import java.util.LinkedList; // Imports the classes needed to support this file's logic.
import java.util.List; // Imports the classes needed to support this file's logic.
import java.util.Queue; // Imports the classes needed to support this file's logic.

// Definition for a Node.
class MyNode { // Defines the Java type that contains the related data and behavior.
	public int val; // Declares a variable to hold data needed by this method.
	public List<MyNode> children; // Declares a variable to hold data needed by this method.

	public MyNode() { // Defines the method that performs this unit of work for the class.
	} // Closes the current block and ends the active scope.

	public MyNode(int _val) { // Defines the method that performs this unit of work for the class.
		val = _val; // Stores the computed or supplied value in a variable for later use.
	} // Closes the current block and ends the active scope.

	public MyNode(int _val, List<MyNode> _children) { // Defines the method that performs this unit of work for the class.
		val = _val; // Stores the computed or supplied value in a variable for later use.
		children = _children; // Stores the computed or supplied value in a variable for later use.
	} // Closes the current block and ends the active scope.
}; // Closes the current block and ends the active scope.

public class NArray { // Defines the Java type that contains the related data and behavior.

	public List<List<Integer>> levelOrder(MyNode root) { // Defines the method that performs this unit of work for the class.
		List<List<Integer>> result = new ArrayList<>();  //1 // Carries out the current statement to support the program's logic.
		Queue<MyNode> queue = new LinkedList<>();   //1 // Carries out the current statement to support the program's logic.
		queue.add(root); // add root // Carries out the current statement to support the program's logic.
		while (!queue.isEmpty()) { // Keeps executing this block until the loop condition becomes false.
			int levelSize = queue.size(); // Stores the computed or supplied value in a variable for later use.
			List<Integer> list = new ArrayList<>(); // Stores the computed or supplied value in a variable for later use.
			for (int i = 0; i < levelSize; i++) { // O(N) // Repeats the loop body as long as the loop condition remains true.
				MyNode node = queue.poll(); // Stores the computed or supplied value in a variable for later use.
				if (node == null) { // Checks whether the condition is true before taking the matching action.
					continue; // Skips the rest of the current loop iteration and moves to the next one.
				} // Closes the current block and ends the active scope.
				list.add(node.val); // Executes the current statement to update state or trigger the required behavior.
				// Add the child nodes to queue.
				for (MyNode myNode : node.children) {  //O(N) // Repeats the loop body as long as the loop condition remains true.
					queue.add(myNode); // Executes the current statement to update state or trigger the required behavior.
				} // Closes the current block and ends the active scope.
			} // Closes the current block and ends the active scope.
			if(list.size()>0) // Carries out the current statement to support the program's logic.
				result.add(list); // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
		return result; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
