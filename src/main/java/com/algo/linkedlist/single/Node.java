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

	T data;

	Node<T> next;

	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

}
