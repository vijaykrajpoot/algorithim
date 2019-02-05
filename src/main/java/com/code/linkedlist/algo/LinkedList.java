package com.code.linkedlist.algo;

public class LinkedList {

	Node start;
	Node current;

	void add(int data) {
		Node node = new Node(data);

		if (start == null) {
			start = node;
			current = node;
		} else {
			current.next = node;
			current = node;
		}

	}

	void printList() {
		Node curret = start;
		while (curret != null) {
			System.out.print("->" + curret.data);
			curret = curret.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		linkedList.add(60);
		linkedList.add(70);
		linkedList.add(80);
		linkedList.add(90);
		linkedList.add(100);
		linkedList.add(200);
		Node node = linkedList.findMidLogic2(linkedList.start);
		System.out.println("Middle Node:" + node.data);
	}

	void findMiddleNode(Node start) {
		Node node1 = start;
		Node node2 = start;
		int i = 0;
		while (node1.next != null) {
			node1 = node1.next;
			if (((i++) % 2) == 0)
				node2 = node2.next;
		}
		System.out.println(node2.data);
	}

	public Node findMidLogic2(Node start) {

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
