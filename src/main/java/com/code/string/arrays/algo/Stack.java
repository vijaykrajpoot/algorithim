package com.code.string.arrays.algo;

public class Stack {

	int arr[];
	int stackCounter = -1;
	int maxSize = 0;

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		if (maxSize > 0) {
			arr = new int[maxSize];
		} else {
			throw new IllegalArgumentException("Invalid Stack Size: Usage size>0");
		}

	}

	public void push(int num) {
		arr[++stackCounter] = num;
	}

	public int pop() {
		return arr[stackCounter--];
	}

	public boolean isFull() {
		return stackCounter == maxSize - 1;
	}

	public boolean isEmpty() {
		return stackCounter == -1;
	}

	public static void main(String[] args) {
		Stack stack = new Stack(6);
		System.err.println("stack.isEmpty():" + stack.isEmpty());
		System.err.println("stack.isFull():" + stack.isFull());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		System.err.println("stack.isFull():" + stack.isFull());
		System.out.println("stack.pop():" + stack.pop());
		System.err.println("stack.isEmpty():" + stack.isEmpty());

		System.err.println("stack.isFull():" + stack.isFull());
	}
}
