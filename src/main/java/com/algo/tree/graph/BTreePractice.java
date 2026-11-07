package com.algo.tree.graph; // Declares the package so the class is organized under the correct Java namespace.

import java.util.*; // Imports the classes needed to support this file's logic.

public class BTreePractice { // Defines the Java type that contains the related data and behavior.
    TreeNode<Integer> root = null; // Stores the computed or supplied value in a variable for later use.

    void dfs(TreeNode<Integer> root) { // Defines the method that performs this unit of work for the class.
        if (root == null) { // Checks whether the condition is true before taking the matching action.
            return; // Declares a variable to hold data needed by this method.
        } // Closes the current block and ends the active scope.
        dfs(root.left); // Executes the current statement to update state or trigger the required behavior.
        System.out.print(root.val + " "); // Prints the value without moving to a new line.
        dfs(root.right); // Executes the current statement to update state or trigger the required behavior.

    } // Closes the current block and ends the active scope.

    public int getHeightBFS(TreeNode root) { // Defines the method that performs this unit of work for the class.

        if (root == null) { // Checks whether the condition is true before taking the matching action.
            return -1; // Returns the computed value to the caller and exits the method.
        } // Closes the current block and ends the active scope.
        Queue<TreeNode> queue = new LinkedList<>(); // Stores the computed or supplied value in a variable for later use.
        queue.offer(root); // Executes the current statement to update state or trigger the required behavior.
        int height = -1; // Stores the computed or supplied value in a variable for later use.
        while (!queue.isEmpty()) { // Keeps executing this block until the loop condition becomes false.
            int size = queue.size(); // Stores the computed or supplied value in a variable for later use.
            for (int i = 0; i < size; i++) { // Repeats the loop body as long as the loop condition remains true.
                if (root.left != null) { // Checks whether the condition is true before taking the matching action.
                    queue.offer(root.left); // Executes the current statement to update state or trigger the required behavior.
                } // Closes the current block and ends the active scope.
                if (root.right != null) { // Checks whether the condition is true before taking the matching action.
                    queue.offer(root.right); // Executes the current statement to update state or trigger the required behavior.
                } // Closes the current block and ends the active scope.
            } // Closes the current block and ends the active scope.
            height++; // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
        return height; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    public int getHeight(TreeNode root) { // Defines the method that performs this unit of work for the class.

        if (root == null) { // Checks whether the condition is true before taking the matching action.
            return 0; // Returns the computed value to the caller and exits the method.
        } // Closes the current block and ends the active scope.

        int leftHeight = getHeight(root.left); // Stores the computed or supplied value in a variable for later use.
        int rightHeight = getHeight(root.right); // Stores the computed or supplied value in a variable for later use.
        int maxHeight = 0; // Stores the computed or supplied value in a variable for later use.
        if (leftHeight >= rightHeight) { // Checks whether the condition is true before taking the matching action.
            maxHeight = leftHeight; // Stores the computed or supplied value in a variable for later use.
        } else { // Closes the current block and ends the active scope.
            maxHeight = rightHeight; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.
        return maxHeight + 1; // Returns the computed value to the caller and exits the method.

    } // Closes the current block and ends the active scope.

    public void displayTree() { // Defines the method that performs this unit of work for the class.
        Stack<TreeNode<Integer>> globalStack = new Stack<>(); // Stores the computed or supplied value in a variable for later use.
        globalStack.push(root); // Executes the current statement to update state or trigger the required behavior.
        int nBlanks = 50; // Stores the computed or supplied value in a variable for later use.
        boolean isRowEmpty = false; // Stores the computed or supplied value in a variable for later use.
        while (isRowEmpty == false) { // Keeps executing this block until the loop condition becomes false.
            Stack<TreeNode<Integer>> localStack = new Stack<>(); // Stores the computed or supplied value in a variable for later use.
            isRowEmpty = true; // Stores the computed or supplied value in a variable for later use.
            for (int j = 0; j < nBlanks; j++) // Repeats the loop body as long as the loop condition remains true.
                System.out.print(' '); // Prints the value without moving to a new line.
            while (globalStack.isEmpty() == false) { // Keeps executing this block until the loop condition becomes false.
                TreeNode<Integer> temp = globalStack.pop(); // Stores the computed or supplied value in a variable for later use.
                if (temp != null) { // Checks whether the condition is true before taking the matching action.
                    System.out.print(temp.val); // Prints the value without moving to a new line.
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

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        BTreePractice bt = new BTreePractice(); // Stores the computed or supplied value in a variable for later use.
        bt.insert(bt.root, 55); // Executes the current statement to update state or trigger the required behavior.
        bt.insert(bt.root, 20); // Executes the current statement to update state or trigger the required behavior.
        bt.insert(bt.root, 30); // Executes the current statement to update state or trigger the required behavior.
        bt.insert(bt.root, 40); // Executes the current statement to update state or trigger the required behavior.
        bt.insert(bt.root, 50); // Executes the current statement to update state or trigger the required behavior.
        bt.insert(bt.root, 60); // Executes the current statement to update state or trigger the required behavior.
        bt.insert(bt.root, 70); // Executes the current statement to update state or trigger the required behavior.
        bt.insert(bt.root, 80); // Executes the current statement to update state or trigger the required behavior.
        bt.insert(bt.root, 55); // Executes the current statement to update state or trigger the required behavior.
        bt.insert(bt.root, 56); // Executes the current statement to update state or trigger the required behavior.
        bt.insert(bt.root, 57); // Executes the current statement to update state or trigger the required behavior.
        bt.insert(bt.root, 75); // Executes the current statement to update state or trigger the required behavior.
        bt.insert(bt.root, 62); // Executes the current statement to update state or trigger the required behavior.
        bt.insert(bt.root, 63); // Executes the current statement to update state or trigger the required behavior.
        bt.insert(bt.root, 63); // Executes the current statement to update state or trigger the required behavior.
        bt.insert(bt.root, 19); // Executes the current statement to update state or trigger the required behavior.
        bt.insert(bt.root, 18); // Executes the current statement to update state or trigger the required behavior.
        bt.insert(bt.root, 17); // Executes the current statement to update state or trigger the required behavior.
        bt.displayTree(); // Executes the current statement to update state or trigger the required behavior.
        bt.dfs(bt.root); // Executes the current statement to update state or trigger the required behavior.
        List<List<Integer>> bfs = bt.bfs(bt.root); // Stores the computed or supplied value in a variable for later use.
        System.out.println(); // Prints the result to the console so the current state can be inspected.
        System.out.println(bfs); // Prints the result to the console so the current state can be inspected.

//        System.out.println("Tree Height:" + bt.getHeight(bt.root));
//        List<List<Integer>> bfs = bt.bfs(bt.root);
//        System.out.println(bfs);
//
//        bfs = bt.zigzagLevelOrder(bt.root);
//        System.out.println(bfs);

    } // Closes the current block and ends the active scope.

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) { // Defines the method that performs this unit of work for the class.
        List<List<Integer>> result = new ArrayList(); // Stores the computed or supplied value in a variable for later use.
        Queue<TreeNode> q = new LinkedList<>(); // Stores the computed or supplied value in a variable for later use.
        boolean skip = false; // Stores the computed or supplied value in a variable for later use.
        q.add(root); // Executes the current statement to update state or trigger the required behavior.
        while (!q.isEmpty()) { // Keeps executing this block until the loop condition becomes false.
            int qSize = q.size(); // Stores the computed or supplied value in a variable for later use.
            List<Integer> list = new ArrayList(); // Stores the computed or supplied value in a variable for later use.
            for (int i = 0; i < qSize; i++) { // Repeats the loop body as long as the loop condition remains true.
                TreeNode node = q.poll(); // Stores the computed or supplied value in a variable for later use.
                if (node == null) { // Checks whether the condition is true before taking the matching action.
                    continue; // Skips the rest of the current loop iteration and moves to the next one.
                } // Closes the current block and ends the active scope.
                list.add(node.val); // Executes the current statement to update state or trigger the required behavior.
                if (node.left != null) { // Checks whether the condition is true before taking the matching action.
                    if (skip) { // Checks whether the condition is true before taking the matching action.
                        q.add(node.left); // Executes the current statement to update state or trigger the required behavior.
                    } else { // Closes the current block and ends the active scope.
                        q.add(node.right); // Executes the current statement to update state or trigger the required behavior.
                    } // Closes the current block and ends the active scope.
                } // Closes the current block and ends the active scope.

                if (node.right != null) { // Checks whether the condition is true before taking the matching action.
                    if (skip) { // Checks whether the condition is true before taking the matching action.
                        q.add(node.right); // Executes the current statement to update state or trigger the required behavior.
                    } else { // Closes the current block and ends the active scope.
                        q.add(node.left); // Executes the current statement to update state or trigger the required behavior.
                    } // Closes the current block and ends the active scope.
                } // Closes the current block and ends the active scope.
                skip = !skip; // Stores the computed or supplied value in a variable for later use.
            } // Closes the current block and ends the active scope.
            if (list.size() > 0) // Checks whether the condition is true before taking the matching action.
                result.add(list); // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
        return result; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.


    List<List<Integer>> bfs(TreeNode<Integer> root) { // Defines the method that performs this unit of work for the class.
        List<List<Integer>> bfs = new ArrayList<>(); // Stores the computed or supplied value in a variable for later use.
        Queue<TreeNode<Integer>> queue = new LinkedList<>(); // Stores the computed or supplied value in a variable for later use.
        queue.add(root); // Executes the current statement to update state or trigger the required behavior.

        while (!queue.isEmpty()) { // Keeps executing this block until the loop condition becomes false.
            List<Integer> values = new ArrayList<>(); // Stores the computed or supplied value in a variable for later use.
            int s = queue.size(); // Stores the computed or supplied value in a variable for later use.
            for (int i = 0; i < s; i++) { // Repeats the loop body as long as the loop condition remains true.
                TreeNode<Integer> treeNode = queue.poll(); // Stores the computed or supplied value in a variable for later use.
                values.add(treeNode.val); // Executes the current statement to update state or trigger the required behavior.
                if (treeNode.left != null) { // Checks whether the condition is true before taking the matching action.
                    queue.offer(treeNode.left); // Executes the current statement to update state or trigger the required behavior.
                } // Closes the current block and ends the active scope.
                if (treeNode.right != null) { // Checks whether the condition is true before taking the matching action.
                    queue.offer(treeNode.right); // Executes the current statement to update state or trigger the required behavior.
                } // Closes the current block and ends the active scope.
            } // Closes the current block and ends the active scope.
            bfs.add(values); // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
        return bfs; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    void insert(TreeNode<Integer> root, int value) { // Defines the method that performs this unit of work for the class.

        if (this.root == null) { // Checks whether the condition is true before taking the matching action.
            this.root = new TreeNode<>(value); // Stores the computed or supplied value in a variable for later use.
            return; // Declares a variable to hold data needed by this method.
        } // Closes the current block and ends the active scope.

        if (value < root.val) { // Checks whether the condition is true before taking the matching action.
            if (root.left == null) { // Checks whether the condition is true before taking the matching action.
                root.left = new TreeNode(value); // Stores the computed or supplied value in a variable for later use.
            } else { // Closes the current block and ends the active scope.
                insert(root.left, value); // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
        } else { // Closes the current block and ends the active scope.
            if (root.right == null) { // Checks whether the condition is true before taking the matching action.
                root.right = new TreeNode(value); // Stores the computed or supplied value in a variable for later use.
            } else { // Closes the current block and ends the active scope.
                insert(root.right, value); // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
