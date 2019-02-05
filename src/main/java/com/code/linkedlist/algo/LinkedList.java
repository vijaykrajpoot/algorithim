package com.code.linkedlist.algo;

/**
 * Represent Single List List and it's operation
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class LinkedList {

	private Node start;
	private Node current;

	/**
	 * Add Operation and current pointer always move to newly added node. No need to
	 * traverse whole list to add a new node
	 * 
	 * @param data
	 */
	public void add(int data) {
		Node node = new Node(data);

		if (start == null) {
			start = node;
			current = node;
		} else {
			current.next = node;
			current = node;
		}

	}

	/**
	 * Show the list
	 */
	void printList() {
		Node curret = start;
		while (curret != null) {
			System.out.print("->" + curret.data);
			curret = curret.next;
		}
		System.out.println();
	}

	/**
	 * Find Middle node Logic#1 1) Every time move node1 and move node based on
	 * even/odd
	 * 
	 * @param Node:start
	 */

	public Node findMiddleNodeLogic1(Node start) {
		Node node1 = start;
		Node node2 = start;
		int i = 0;
		while (node1.next != null) {
			node1 = node1.next;
			if (((i++) % 2) == 0)
				node2 = node2.next;
		}
		return node2;
	}
	
	/**
	 * 
	 * Maintain 2 pointer and move pointer p1 based based on skip=true and move both pointer based on skip=false;
	 * 
	 * Each time pointer p1 move and p2 remains behind
	 *  
	 * @param start
	 * @return
	 */
	public Node findMiddleNodeLogic2(Node start) {

		Node p1 = start, p2 = start;
		boolean skip = true;
		while (p1.next != null) {
			if (skip) {
				p1 = p1.next;
				skip = !skip;
			} else {
				p1 = p1.next;
				p2 = p2.next;
				skip = !skip;
			}
		}
		return p2;

	}
}
