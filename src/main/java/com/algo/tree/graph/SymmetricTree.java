package com.algo.tree.graph; // Declares the package so the class is organized under the correct Java namespace.


/*
Given a binary tree, check whether it is a mirror of itself i.e. symmetric around its centre. // Carries out the current statement to support the program's logic.

Example One // Carries out the current statement to support the program's logic.
Tree // Carries out the current statement to support the program's logic.
https://aaronice.gitbook.io/lintcode/trees/symmetric-tree // Carries out the current statement to support the program's logic.

https://aaronice.gitbook.io/lintcode/trees/symmetric-tree // Carries out the current statement to support the program's logic.
*/


import java.util.LinkedList; // Imports the classes needed to support this file's logic.
import java.util.Queue; // Imports the classes needed to support this file's logic.

public class SymmetricTree { // Defines the Java type that contains the related data and behavior.

    static Boolean check_if_symmetric(TreeNode root) { // Defines the method that performs this unit of work for the class.
        if (root == null) { // Checks whether the condition is true before taking the matching action.
            return true; // Returns the computed value to the caller and exits the method.
        } // Closes the current block and ends the active scope.

        Queue<TreeNode> queue = new LinkedList<>(); // Stores the computed or supplied value in a variable for later use.
        queue.add(root); // Executes the current statement to update state or trigger the required behavior.
        while (!queue.isEmpty()) { // Keeps executing this block until the loop condition becomes false.
            int qSize = queue.size(); // Stores the computed or supplied value in a variable for later use.
            Object[] nodeArr = queue.toArray(); // Stores the computed or supplied value in a variable for later use.
            for (int idx = 0; idx < qSize / 2; idx++) { // Repeats the loop body as long as the loop condition remains true.
                if (((TreeNode) nodeArr[idx]).val != ((TreeNode) nodeArr[qSize - idx - 1]).val) { // Checks whether the condition is true before taking the matching action.
                    return false; // Returns the computed value to the caller and exits the method.
                } // Closes the current block and ends the active scope.
            } // Closes the current block and ends the active scope.
            for (int i = 0; i < qSize; i++) { // Repeats the loop body as long as the loop condition remains true.
                TreeNode treeNode = queue.poll(); // Stores the computed or supplied value in a variable for later use.
                if (treeNode == null) { // Checks whether the condition is true before taking the matching action.
                    continue; // Skips the rest of the current loop iteration and moves to the next one.
                } // Closes the current block and ends the active scope.
                if (treeNode.left != null) { // Checks whether the condition is true before taking the matching action.
                    queue.add(treeNode.left); // Executes the current statement to update state or trigger the required behavior.
                } // Closes the current block and ends the active scope.
                if (treeNode.right != null) { // Checks whether the condition is true before taking the matching action.
                    queue.add(treeNode.right); // Executes the current statement to update state or trigger the required behavior.
                } // Closes the current block and ends the active scope.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        // Write your code here.
        return true; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
