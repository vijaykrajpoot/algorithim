package parctice;


import java.util.Stack;

public class BinarySearchTree {
	private Node root = null;

	public void insert(int data) {
		insertR(root, data);
	}

	void insertR(Node node, int data) {
		if (this.root == null) {
			this.root = new Node(data);

		} else {
			if (data < node.data) {
				if (node.left != null) {
					insertR(node.left, data);
				} else {
					node.left = new Node(data);
				}
			} else {
				if (node.right != null) {
					insertR(node.right, data);
				} else {
					node.right = new Node(data);
				}
			}
		}
	}


	public void printTree(Node node) {
		if (node != null) {

			printTree(node.left);
			System.out.println(node.data);
			printTree(node.right);


		}

	}

	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.insert(10);
		binarySearchTree.insert(20);
		binarySearchTree.insert(30);
		binarySearchTree.insert(40);
		binarySearchTree.insert(5);
		binarySearchTree.insert(4);
		binarySearchTree.insert(3);
		binarySearchTree.insert(50);
		binarySearchTree.insert(6);
		binarySearchTree.insert(8);
		binarySearchTree.insert(7);

		binarySearchTree.printTree(binarySearchTree.root);
	//	binarySearchTree.displayTree();
	}

	/**
	 * Copied Data Structures & Algorithms in Java by Robert Lafore
	 */
	public void displayTree() {
		Stack<Node> globalStack = new Stack<Node>();
		globalStack.push(root);
		int nBlanks = 50;
		boolean isRowEmpty = false;
		while (isRowEmpty == false) {
			Stack<Node> localStack = new Stack<>();
			isRowEmpty = true;
			for (int j = 0; j < nBlanks; j++)
				System.out.print(' ');
			while (globalStack.isEmpty() == false) {
				Node temp = globalStack.pop();
				if (temp != null) {
					System.out.print(temp.data);
					localStack.push(temp.left);
					localStack.push(temp.right);
					if (temp.left != null || temp.right != null)
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

}


class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}
}