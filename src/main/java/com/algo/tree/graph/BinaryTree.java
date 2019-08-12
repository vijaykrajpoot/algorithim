package com.algo.tree.graph;

import java.util.Stack;

public class BinaryTree<T extends Comparable<T>> {

	private Node<T> root;

	public void insert(T data) {
		insertNode(getRoot(), data);
	}

	public Node<T> getRoot() {
		return root;
	}

	public void insertNode(Node<T> root, T data) {

		Node<T> node = new Node<T>(data);

		if (this.root == null) {
			this.root = node;
		} else {
			if (data.compareTo(root.data) < 0) {
				if (root.leftNode != null) {
					insertNode(root.leftNode, data);
				} else {
					root.leftNode = node;
				}
			} else if (data.compareTo(root.data) > 0) {
				if (root.rightNode != null) {
					insertNode(root.rightNode, data);
				} else {
					root.rightNode = node;
				}
			}
		}
	}

	/**
	 * Copied Data Structures & Algorithms in Java by Robert Lafore
	 */
	public void displayTree() {
		Stack<Node<T>> globalStack = new Stack<Node<T>>();
		globalStack.push(root);
		int nBlanks = 50;
		boolean isRowEmpty = false;
		while (isRowEmpty == false) {
			Stack<Node<T>> localStack = new Stack<Node<T>>();
			isRowEmpty = true;
			for (int j = 0; j < nBlanks; j++)
				System.out.print(' ');
			while (globalStack.isEmpty() == false) {
				Node<T> temp = globalStack.pop();
				if (temp != null) {
					System.out.print(temp.data);
					localStack.push(temp.leftNode);
					localStack.push(temp.rightNode);
					if (temp.leftNode != null || temp.rightNode != null)
						isRowEmpty = false;
				} else {
					System.out.print("##");
					localStack.push(null);
					localStack.push(null);
				}
				for (int j = 0; j < nBlanks * 2 - 2; j++)
					System.out.print(' ');
			} // end while globalStack not empty
			System.out.println();
			nBlanks /= 2;
			while (localStack.isEmpty() == false)
				globalStack.push(localStack.pop());
		} // end while isRowEmpty is false
	}

	public static void main(String[] args) {
		BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
		binaryTree.insert(25);
		binaryTree.insert(20);
		binaryTree.insert(10);
		binaryTree.insert(22);
		binaryTree.insert(5);
		binaryTree.insert(12);
		binaryTree.insert(1);
		binaryTree.insert(8);
		binaryTree.insert(15);
		binaryTree.insert(11);
		binaryTree.insert(22);
		binaryTree.insert(36);
		binaryTree.insert(30);
		binaryTree.insert(28);
		binaryTree.insert(40);
		binaryTree.insert(38);
		binaryTree.insert(48);
		binaryTree.insert(45);
		binaryTree.insert(50);
		binaryTree.displayTree();

	}

}

class Node<T extends Comparable<T>> {
	Node<T> leftNode;
	Node<T> rightNode;
	T data;

	public Node(T data) {
		this.data = data;
	}
}
