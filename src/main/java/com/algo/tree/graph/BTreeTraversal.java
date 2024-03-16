package com.algo.tree.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;



public class BTreeTraversal {
	TreeNode root;

	public static void main(String[] args) {
		BTreeTraversal binaryTree = new BTreeTraversal();

		// Insert data into the binary tree
		binaryTree.root = new TreeNode(3);
		binaryTree.root.left = new TreeNode(9);
		binaryTree.root.left.left = null;
		binaryTree.root.left.right = null;
		binaryTree.root.right = new TreeNode(20);
		binaryTree.root.right.left = new TreeNode(15);
		binaryTree.root.right.right = new TreeNode(7);

		// Display the binary tree
		binaryTree.displayTree(binaryTree.root, 0);
		List<List<Integer>> result = binaryTree.bfs(binaryTree.root);
		System.out.println(result);


	}

	// Method to display the binary tree
	private void displayTree(TreeNode node, int level) {
		if (node == null)
			return;

		displayTree(node.right, level + 1);

		for (int i = 0; i < level; i++)
			System.out.print("\t\t");

		System.out.println(node.val);

		displayTree(node.left, level + 1);
	}


	public List<List<Integer>> bfs(TreeNode root) {
		List<List<Integer>> lists = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			int levelSize = queue.size(); // Get the size of the current level
			List<Integer> level = new ArrayList<>();
			for (int i = 0; i < levelSize; i++) {
				TreeNode treeNode = queue.poll();
				level.add(treeNode.val);
				if (treeNode.left != null) {
					queue.offer(treeNode.left);
				}
				if (treeNode.right != null) {
					queue.offer(treeNode.right);
				}
			}
			lists.add(level);
		}
		return lists;
	}


}
