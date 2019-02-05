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
	private long size;

	public long size() {
		return size;
	}

	/**
	 * Add Operation and current pointer always move to newly added node. No need to
	 * traverse whole list to add a new node
	 * 
	 * @param data
	 */
	public void add(int data) {
		Node node = new Node(data);
		size++;
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
	public void printList(String listHeading) {
		Node curret = start;
		if (listHeading == null)
			listHeading = "List:";
		System.out.print(listHeading);
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

	public Node findMiddleNodeLogic1() {
		if (start == null) {
			throw new IllegalStateException("Empty List");
		}
		Node node1 = start;
		Node node2 = start;
		int i = 0;
		// Here i=0 is very important because in case of even size of list
		// if we need to return Mid+1 i.e. 1-10 list return 6 then i must be 0 so that
		// node2.next will execute

		while (node1.next != null) {
			node1 = node1.next;
			if (((i++) % 2) == 0)
				node2 = node2.next;
		}
		return node2;
	}

	/**
	 * 
	 * Maintain 2 pointer and move pointer p1 based based on skip=true and move both
	 * pointer based on skip=false;
	 * 
	 * Each time pointer p1 move and p2 remains behind
	 * 
	 * @param start
	 * @return
	 */
	public Node findMiddleNodeLogic2() {
		if (start == null) {
			throw new IllegalStateException("Empty List");
		}
		Node p1 = start, p2 = start;
		boolean skip = true;
		// if block is moving p1/p2 both pointers to return Mid+1 i.e. 1-10 list return
		// 6.
		// in case of even size of list
		// if we need number 5 in case of 1-10 list then make skip=false or move p1 & p2
		// in else block.
		while (p1.next != null) {
			if (skip) {
				p1 = p1.next;
				p2 = p2.next;
			} else {
				p1 = p1.next;
			}
			skip = !skip;
		}
		return p2;

	}

	public boolean deleteNode(int data) {
		if (start == null) {
			throw new IllegalStateException("Empty List");
		}
		Node current = start;
		Node previous = start;
		
		if(start.data==data) {
			start=start.next;
			size--;
			return true;
		}
		while (current != null) {
			if (current.data == data) {
				previous.next = current.next;
				previous = current;
				size--;
				return true;
				
			}
			previous = current;
			current = current.next;
		}
		return false;

	}

}
