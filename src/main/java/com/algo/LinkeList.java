package com.algo;

public class LinkeList {

	Node first, current;

	void insert(int data) {
		if (first == null) {
			first = new Node(data);
			current = first;
		} else {
			Node node = new Node(data);
			current.next = node;
			current = node;
		}
	}

	void print() {
		Node current = first;
		while (current != null) {
			System.out.print(current.getData() + "==>");
			current = current.next;
		}
		System.out.println();
	}

	public Node findMid() {
		Node p1 = first, p2 = first;
		int i = 0;
		System.out.println(" P1:" + p1.getData() + "/" + "P2:" + p2.getData());
		while (p1.next != null) {
			if (i == 0) {
				p1 = p1.next;
				System.out.println("i:" + i + " P1:" + p1.getData() + "/" + "P2:" + p2.getData());
				i = 1;
			} else {

				p1 = p1.next;
				p2 = p2.next;
				System.out.println("i:" + i + " P1:" + p1.getData() + "/" + "P2:" + p2.getData());

				i = 0;
			}
		}
		return p2;
	}

	void deleteMid() {

		Node p1 = first, p2 = first;
		Node prev = null;
		int pass = 0;

		while (p1.next != null) {
			print();
			if (pass == 0) {
				p1 = p1.next;
				pass = 1;
			} else {
				prev = p2;
				p1 = p1.next;
				p2 = p2.next;
				pass = 0;

			}
		}
		System.out.println("Mid=" + p2.getData());
		if (prev != null) {
			System.out.println("Prev=" + prev.getData());
			prev.next = p2.next;
		}

	}

	public static void main(String[] args) {
		LinkeList linkeList = new LinkeList();
		linkeList.insert(10);
		linkeList.insert(20);
		linkeList.insert(30);
		linkeList.insert(40);
		linkeList.insert(50);
		linkeList.insert(60);
		linkeList.insert(70);
		linkeList.insert(80);
		linkeList.insert(90);
		linkeList.insert(100);
		linkeList.insert(110);
		linkeList.insert(120);
		linkeList.insert(130);
		linkeList.insert(140);
		linkeList.insert(150);
		linkeList.insert(160);
		linkeList.insert(170);
		linkeList.print();
		Node node = linkeList.findMid();
		// System.out.println("Middle:" + node.getData());
		// linkeList.deleteMid();
		linkeList.print();

	}
}
