package com.algo.linkedlist.single;
/**
 * 
 * Generic Node
 * 
 * @author Vijay Kumar Rajput
 *
 * @param <T>
 */

// Logic: processes the node problem by transforming the input according to the algorithm and returning the required result.
public class Node

<T> {
	T data;
	Node<T> next;
	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}
}
