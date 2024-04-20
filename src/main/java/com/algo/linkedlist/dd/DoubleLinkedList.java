package com.algo.linkedlist.dd;

public class DoubleLinkedList {

    Node start;
    Node current;

    void add(int data) {
        Node node = new Node(data);
        if (start == null) {
            start = node;
            current = node;
        } else {
            node.prev = current;
            current.next = node;
            current = node;
        }
    }

    void printBackward() {
        Node node = current;
        while (node != null) {
            System.out.print(node.data);
            System.out.print(" ");
            node = node.prev;
        }
        System.out.println();
    }

    void printForward() {

        Node node = start;
        while (node != null) {
            System.out.print(node.data);
            System.out.print(" ");
            node = node.next;
        }
        System.out.println();
    }

    boolean delete(int data) {
        boolean isDeleted = false;
        Node node = start;
        while (node != null) {
            if (node.data == data) {
                node.prev.next = node.next;
                isDeleted = true;
            }
            node = node.next;
        }
        return isDeleted;
    }

    boolean addAfter(int data, int newValue) {
        Node current = start;
        boolean isAdded = false;
        while (current != null) {
            if (current.data == data) {
                Node newNode = new Node(newValue);
                newNode.prev = current;
                newNode.next = current.next;
                current.next = newNode;
                isAdded = true;

            }
            current = current.next;
        }

        return isAdded;
    }

    void addBefore(int before, int data) {

        Node current = start;
        while (current != null) {
            if (current.data == before) {
                Node newNode = new Node(data);
                if (current.prev == null) {
                    current.prev=newNode;
                    newNode.next=current;
                } else {
                    newNode.prev = current.prev.next;
                    newNode.next = current;
                    current.prev.next = newNode;
                }
            }
            current = current.next;
        }


    }

    public static void main(String[] args) {
        DoubleLinkedList ddl = new DoubleLinkedList();
        for (int i = 10; i <= 100; i += 10) {
            ddl.add(i);
        }
        //  ddl.crate_cycle();
        ddl.printForward();

        ddl.printBackward();
        ddl.delete(50);
        ddl.printForward();
        ddl.addBefore(10, 9);
        ddl.addAfter(40, 50);
        ddl.printForward();
        ddl.addBefore(40, 35);
        ddl.printForward();


        System.out.println(ddl.has_cycle(ddl.start));

        ddl.addNodeAtLocation(1, 18);
        ddl.printForward();

    }

    void crate_cycle() {
        Node node = start;
        Node prevNode = null;
        Node cycleNode = null;
        while (node.next != null) {
            if (node.data == 10) {
                cycleNode = node;
            }
            node = node.next;
        }
        node.next = cycleNode;
    }

    void addNodeAtLocation(int position, int data) {
        Node current = start;
        if (position == 1) {
            Node newNode = new Node(data);
            newNode.next = start;
            start = newNode;
        }
        int curPos = 1;
        while (current != null) {
            if (curPos == position - 1) {
                Node newNode = new Node(data);
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            curPos++;
            current = current.next;
        }
    }


    boolean has_cycle(Node start) {
        Node slow = start;
        Node fast = start.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;

    }


}
