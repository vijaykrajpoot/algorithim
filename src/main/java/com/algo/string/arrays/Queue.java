package com.algo.string.arrays;
public class Queue {
	private int maxSize; // Declares a variable to hold data needed by this method.
	private int arr[];
	int front = -1;
	int rear = -1;
	public Queue(int maxSize) {
		this.maxSize = maxSize;
		arr = new int[maxSize];
	}
	public void enQueue(int num) {
		if (rear == -1) {
			front = 0;
			rear = 0;
			arr[rear] = num;
		} else if (rear + 1 >= maxSize) {
			throw new IndexOutOfBoundsException("OverFlow"); // Raises an exception to signal an invalid or unexpected condition.
		} else if (rear + 1 < maxSize) {
			arr[++rear] = num;
		}
	}
	public int deQueue() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("UnderFlow"); // Raises an exception to signal an invalid or unexpected condition.
		} else {
			int element = arr[front];
			if (rear == front) {
				rear = -1;
				front = -1;
			} else {
				front++;
			}
			return element;
		}
	}
	void show() {
		System.out.print("Elemnt:"); // Prints the value without moving to a new line.

		System.out.print("\nQueue = "); // Prints the value without moving to a new line.
		if (isEmpty()) {
			System.out.println("Empty...");
		}
		for (int i = front; i <= rear; i++)
			System.out.print(arr[i] + " "); // Prints the value without moving to a new line.
		System.out.println();
	}
	boolean isEmpty() {
		return front == -1;
	}
	public static void main(String[] args) {
		Queue queue = new Queue(5);
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.show();
		queue.deQueue();
		queue.deQueue();
		queue.enQueue(70);
		// queue.enQueue(80);
		queue.show();
		 queue.deQueue();
		 queue.enQueue(50);
		 queue.enQueue(70);
		 queue.show();
	}
}