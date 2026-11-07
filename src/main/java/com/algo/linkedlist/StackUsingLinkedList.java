package com.algo.linkedlist;
public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("stack.isEmpty:" + stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(150);
        System.out.println("stack.isEmpty:" + stack.isEmpty());
        System.out.println("Show====>");
        stack.show();
        System.out.println("Show Reverse====>");
        stack.reverseShow();
        System.out.println("Top:" + stack.top());
        System.out.println("Pop:" + stack.pop());
        System.out.println("Pop:" + stack.pop());
        System.out.println("Pop:" + stack.pop());
        System.out.println("Top:" + stack.top());
        System.out.println("Show====>");
        stack.show();
    }
}
class LinkedListX {
    NodeX start; // Declares a variable to hold data needed by this method.
    NodeX current; // Declares a variable to hold data needed by this method.

    void add(int data) {
        NodeX node = new NodeX(data);
        if (start == null) {
            start = node;
            current = node;
        } else {
            node.prev = current;
            current.next = node;
            current = node;
        }
    }
    void show() {
        NodeX current = start;
        while (current != null) { // Keeps executing this block until the loop condition becomes false.
            System.out.print(current.data); // Prints the value without moving to a new line.
            if (current.next != null) {
                System.out.print(" -> "); // Prints the value without moving to a new line.
            }
            current = current.next;
        }
    }
    void reverseShow() {
        NodeX node = current;
        while (node != null) { // Keeps executing this block until the loop condition becomes false.
            System.out.print(node.data); // Prints the value without moving to a new line.
            if (node.prev != null) {
                System.out.print(" -> "); // Prints the value without moving to a new line.
            }
            node = node.prev;
        }
    }
    void deleteAsPop() {
        if (current != null) {
            current = current.prev;
            current.next=null;
        }
    }
}
class NodeX {
    NodeX next; // Declares a variable to hold data needed by this method.
    NodeX prev; // Declares a variable to hold data needed by this method.
    int data; // Declares a variable to hold data needed by this method.

    public NodeX(int data) {
        this.data = data;
    }
}
class Stack {
    LinkedListX linkedListX; // Declares a variable to hold data needed by this method.

    public Stack() {
        this.linkedListX = new LinkedListX();
    }
    int pop() {
        if (!isEmpty()) {
            int item= linkedListX.current.data;
            linkedListX.deleteAsPop();
            return item;
        }
        return -1;
    }
    int top() {
        if (!isEmpty()) {
            return  linkedListX.current.data;
        } else {
            return -1;
        }
    }
    void push(int num) {
        linkedListX.add(num);
    }
    boolean isEmpty() {
        return linkedListX.start == null;
    }
    void show() {
        linkedListX.show();
        System.out.println();
    }
    void reverseShow() {
        linkedListX.reverseShow();
        System.out.println();
    }
}