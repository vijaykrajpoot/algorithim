package com.algo.tree.graph; // Declares the package so the class is organized under the correct Java namespace.

import java.util.ArrayList; // Imports the classes needed to support this file's logic.
import java.util.LinkedList; // Imports the classes needed to support this file's logic.
import java.util.List; // Imports the classes needed to support this file's logic.
import java.util.Queue; // Imports the classes needed to support this file's logic.
import java.util.TreeMap; // Imports the classes needed to support this file's logic.


public class BTreeTraversal { // Defines the Java type that contains the related data and behavior.
    TreeNode root; // Declares a variable to hold data needed by this method.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        BTreeTraversal binaryTree = new BTreeTraversal(); // Stores the computed or supplied value in a variable for later use.

        // Insert data into the binary tree
        binaryTree.root = new TreeNode(3); // Stores the computed or supplied value in a variable for later use.
        binaryTree.root.left = new TreeNode(9); // Stores the computed or supplied value in a variable for later use.
        binaryTree.root.left.left = null; // Stores the computed or supplied value in a variable for later use.
        binaryTree.root.left.right = null; // Stores the computed or supplied value in a variable for later use.
        binaryTree.root.right = new TreeNode(20); // Stores the computed or supplied value in a variable for later use.
        binaryTree.root.right.left = new TreeNode(15); // Stores the computed or supplied value in a variable for later use.
        binaryTree.root.right.right = new TreeNode(7); // Stores the computed or supplied value in a variable for later use.

        // Display the binary tree
        binaryTree.displayTree(binaryTree.root, 0); // Executes the current statement to update state or trigger the required behavior.
        List<List<Integer>> result = binaryTree.bfs(binaryTree.root); // Stores the computed or supplied value in a variable for later use.
        System.out.println(result); // Prints the result to the console so the current state can be inspected.


    } // Closes the current block and ends the active scope.

    // Method to display the binary tree
    private void displayTree(TreeNode node, int level) { // Defines the method that performs this unit of work for the class.
        if (node == null) // Checks whether the condition is true before taking the matching action.
            return; // Declares a variable to hold data needed by this method.

        displayTree(node.right, level + 1); // Executes the current statement to update state or trigger the required behavior.
        for (int i = 0; i < level; i++) { // Repeats the loop body as long as the loop condition remains true.
            System.out.print("\t\t"); // Prints the value without moving to a new line.
        } // Closes the current block and ends the active scope.
        System.out.println(node.val); // Prints the result to the console so the current state can be inspected.
        displayTree(node.left, level + 1); // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.


    public List<List<Integer>> bfs(TreeNode root) { // Defines the method that performs this unit of work for the class.
        List<List<Integer>> Values = new ArrayList<>(); // Stores the computed or supplied value in a variable for later use.
        Queue<TreeNode> queue = new LinkedList<>(); // Stores the computed or supplied value in a variable for later use.
        queue.offer(root); // Executes the current statement to update state or trigger the required behavior.
        while (!queue.isEmpty()) { // Keeps executing this block until the loop condition becomes false.
            int size = queue.size(); // Get the size of the current level // Carries out the current statement to support the program's logic.
            List<Integer> nodeValues = new ArrayList<>(); // Stores the computed or supplied value in a variable for later use.
            for (int i = 0; i < size; i++) { // Repeats the loop body as long as the loop condition remains true.
                TreeNode treeNode = queue.poll(); // Stores the computed or supplied value in a variable for later use.
                nodeValues.add(treeNode.val); // Executes the current statement to update state or trigger the required behavior.
                if (treeNode.left != null) { // Checks whether the condition is true before taking the matching action.
                    queue.offer(treeNode.left); // Executes the current statement to update state or trigger the required behavior.
                } // Closes the current block and ends the active scope.
                if (treeNode.right != null) { // Checks whether the condition is true before taking the matching action.
                    queue.offer(treeNode.right); // Executes the current statement to update state or trigger the required behavior.
                } // Closes the current block and ends the active scope.
            } // Closes the current block and ends the active scope.
            Values.add(nodeValues); // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
        return Values; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
