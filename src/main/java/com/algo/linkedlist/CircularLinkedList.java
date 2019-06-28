package com.algo.linkedlist;

public class CircularLinkedList {

	Node start;
	Node current;

	public void add(int data) {

		if (start == null) {
			Node node = new Node(data);
			start = node;
			current = start;
		} else {
			Node node = new Node(data);
			current.next = node;
			node.next = start;
			current = node;
		}
	}

	public boolean isCicrularLinkedList() {
		Node current = start;
		while (current.next != start) {
			current = current.next;
		}
		return current.next == start;
	}

	/**
	 * Show the list
	 */
	public void printList() {
		Node curret = start;
		System.out.print("List: ");
		while (curret.next != start) {
			System.out.print("=>" + curret.data);
			curret = curret.next;
		}
		System.out.println();
	}
}
