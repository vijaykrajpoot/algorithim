package com.algo.linkedlist.single;
/**
 * 
 * Generic Node
 * 
 * @author Vijay Kumar Rajput
 *
 * @param <T>
 */

public class Node<T> {
	T data; // Declares a variable to hold data needed by this method.

	Node<T> next; // Declares a variable to hold data needed by this method.

	public Node(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
}