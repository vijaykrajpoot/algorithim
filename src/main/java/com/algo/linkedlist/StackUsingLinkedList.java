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
    NodeX start;
    NodeX current;

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
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
    }

    void reverseShow() {
        NodeX node = current;
        while (node != null) {
            System.out.print(node.data);
            if (node.prev != null) {
                System.out.print(" -> ");
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
    NodeX next;
    NodeX prev;
    int data;

    public NodeX(int data) {
        this.data = data;
    }
}

class Stack {
    LinkedListX linkedListX;

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