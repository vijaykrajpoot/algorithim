package test.com.code.stacks.queues.algo;

import java.util.EmptyStackException;

public class Stack<T> {

  private int top = -1;

  private T[] array;

  private int maxSize;

  @SuppressWarnings("unchecked")
  public Stack(int size) {
	  if (maxSize > 0) {
		  array = (T[]) new Object[size];
		} else {
			throw new IllegalArgumentException("Invalid Stack Size: Usage size>0");
		}
		maxSize = size;
  }

  public void push(T element) {
    if (top == maxSize) {
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

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>(50);
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
