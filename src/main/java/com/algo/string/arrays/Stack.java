package com.algo.string.arrays;
import java.util.EmptyStackException;
public class Stack<T> {
	private int top = -1;
	private final T[] array;
	private final int maxSize=200;
	@SuppressWarnings("unchecked")
	public Stack() {
        array = (T[]) new Object[maxSize];
    }
	public void push(T element) {
		if (top == maxSize-1) {
			throw new StackOverflowError("Stack is Over Flowed");
		}
		array[++top] = element;
	}
	public T pop() {
		if (top == -1) {
			throw new EmptyStackException();
		}
		return array[top--];
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println("stack.pop():" + stack.pop());
		System.out.println("stack.pop():" + stack.pop());
		System.out.println("stack.pop():" + stack.pop());
		System.out.println("stack.pop():" + stack.pop());
		System.out.println("stack.pop():" + stack.pop());
	}
}