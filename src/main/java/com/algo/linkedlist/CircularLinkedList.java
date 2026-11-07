package com.algo.linkedlist;
public class CircularLinkedList {
	Node start; // Declares a variable to hold data needed by this method.
	Node current; // Declares a variable to hold data needed by this method.

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
	public boolean isCircularLinkedList() {
		Node current = start;
		while (current.next != start) { // Keeps executing this block until the loop condition becomes false.
			current = current.next;
		}
		return current.next == start;
	}
	/**
	 * Show the list
	 */
	public void printList() {
		Node curret = start;
		System.out.print("List: "); // Prints the value without moving to a new line.
		while (curret.next != start) { // Keeps executing this block until the loop condition becomes false.
			System.out.print("=>" + curret.data); // Prints the value without moving to a new line.
			curret = curret.next;
		}
		System.out.println();
	}
}