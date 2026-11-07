package com.algo.tree.graph; // Declares the package so the class is organized under the correct Java namespace.

import java.util.ArrayList; // Imports the classes needed to support this file's logic.
import java.util.LinkedList; // Imports the classes needed to support this file's logic.
import java.util.List; // Imports the classes needed to support this file's logic.
import java.util.Queue; // Imports the classes needed to support this file's logic.

public class BTreeZigZag { // Defines the Java type that contains the related data and behavior.

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) { // Defines the method that performs this unit of work for the class.
		List<List<Integer>> result=new ArrayList(); // Stores the computed or supplied value in a variable for later use.
		Queue<TreeNode> q=new LinkedList<>(); // Stores the computed or supplied value in a variable for later use.
		boolean skip=false; // Stores the computed or supplied value in a variable for later use.
		q.add(root); // Executes the current statement to update state or trigger the required behavior.
		while(!q.isEmpty()){ // Carries out the current statement to support the program's logic.
			int qSize=q.size(); // Stores the computed or supplied value in a variable for later use.
			List<Integer> list=new ArrayList(); // Stores the computed or supplied value in a variable for later use.
			for( int i = 0;i<qSize; i++ ){ // Carries out the current statement to support the program's logic.
				TreeNode node=q.poll(); // Stores the computed or supplied value in a variable for later use.
				if(node==null){ // Carries out the current statement to support the program's logic.
					continue; // Skips the rest of the current loop iteration and moves to the next one.
				} // Closes the current block and ends the active scope.
				list.add(node.val); // Executes the current statement to update state or trigger the required behavior.
				if(node.left!=null){ // Carries out the current statement to support the program's logic.
					if(skip){ // Carries out the current statement to support the program's logic.
						q.add(node.left); // Executes the current statement to update state or trigger the required behavior.
					}else{ // Closes the current block and ends the active scope.
						q.add(node.right); // Executes the current statement to update state or trigger the required behavior.
					} // Closes the current block and ends the active scope.
				} // Closes the current block and ends the active scope.

				if(node.right!=null){ // Carries out the current statement to support the program's logic.
					if(skip){ // Carries out the current statement to support the program's logic.
						q.add(node.right); // Executes the current statement to update state or trigger the required behavior.
					}else{ // Closes the current block and ends the active scope.
						q.add(node.left); // Executes the current statement to update state or trigger the required behavior.
					} // Closes the current block and ends the active scope.
				} // Closes the current block and ends the active scope.
				skip=!skip; // Stores the computed or supplied value in a variable for later use.
			} // Closes the current block and ends the active scope.
			if(list.size()>0) // Carries out the current statement to support the program's logic.
				result.add(list); // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
		return result; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
