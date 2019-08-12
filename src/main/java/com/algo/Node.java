package com.algo;
public class Node {

	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
	}

	public String toString() {
		return "{" + data + "} ";
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
}
