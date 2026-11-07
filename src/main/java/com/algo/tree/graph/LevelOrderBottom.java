package com.algo.tree.graph; // Declares the package so the class is organized under the correct Java namespace.



import java.util.ArrayList; // Imports the classes needed to support this file's logic.
import java.util.LinkedList; // Imports the classes needed to support this file's logic.
import java.util.List; // Imports the classes needed to support this file's logic.
import java.util.Queue; // Imports the classes needed to support this file's logic.

//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

public class LevelOrderBottom { // Defines the Java type that contains the related data and behavior.

    public List<Integer> rightSideView(TreeNode root) { // Defines the method that performs this unit of work for the class.
        Queue<TreeNode> q = new LinkedList<>(); // Stores the computed or supplied value in a variable for later use.
        List<Integer> result = new ArrayList<>(); // Stores the computed or supplied value in a variable for later use.
        q.add(root); // Executes the current statement to update state or trigger the required behavior.
        while (!q.isEmpty()) { // Keeps executing this block until the loop condition becomes false.
            int qSize = q.size(); // Stores the computed or supplied value in a variable for later use.
            TreeNode lastElement = null; // Stores the computed or supplied value in a variable for later use.
            for (TreeNode treeNode : q) { // Repeats the loop body as long as the loop condition remains true.
                lastElement = treeNode; // Stores the computed or supplied value in a variable for later use.
            } // Closes the current block and ends the active scope.
            if (lastElement != null) { // Checks whether the condition is true before taking the matching action.
                result.add(lastElement.val); // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
            for (int i = 0; i < qSize; i++) { // Repeats the loop body as long as the loop condition remains true.
                TreeNode node = q.poll(); // Stores the computed or supplied value in a variable for later use.
                if (node == null) // Checks whether the condition is true before taking the matching action.
                    continue; // Skips the rest of the current loop iteration and moves to the next one.
                if (node.left != null) { // Checks whether the condition is true before taking the matching action.
                    q.add(node.left); // Executes the current statement to update state or trigger the required behavior.
                } // Closes the current block and ends the active scope.
                if (node.right != null) { // Checks whether the condition is true before taking the matching action.
                    q.add(node.right); // Executes the current statement to update state or trigger the required behavior.
                } // Closes the current block and ends the active scope.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        return result; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
