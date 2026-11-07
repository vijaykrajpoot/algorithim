package com.algo.linkedlist.dd; // Declares the package so the class is organized under the correct Java namespace.

public class DoubleLinkedList { // Defines the Java type that contains the related data and behavior.

    Node start; // Declares a variable to hold data needed by this method.
    Node current; // Declares a variable to hold data needed by this method.

    void add(int data) { // Defines the method that performs this unit of work for the class.
        Node node = new Node(data); // Stores the computed or supplied value in a variable for later use.
        if (start == null) { // Checks whether the condition is true before taking the matching action.
            start = node; // Stores the computed or supplied value in a variable for later use.
            current = node; // Stores the computed or supplied value in a variable for later use.
        } else { // Closes the current block and ends the active scope.
            node.prev = current; // Stores the computed or supplied value in a variable for later use.
            current.next = node; // Stores the computed or supplied value in a variable for later use.
            current = node; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    void printBackward() { // Defines the method that performs this unit of work for the class.
        Node node = current; // Stores the computed or supplied value in a variable for later use.
        while (node != null) { // Keeps executing this block until the loop condition becomes false.
            System.out.print(node.data); // Prints the value without moving to a new line.
            System.out.print(" "); // Prints the value without moving to a new line.
            node = node.prev; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.
        System.out.println(); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.

    void printForward() { // Defines the method that performs this unit of work for the class.

        Node node = start; // Stores the computed or supplied value in a variable for later use.
        while (node != null) { // Keeps executing this block until the loop condition becomes false.
            System.out.print(node.data); // Prints the value without moving to a new line.
            System.out.print(" "); // Prints the value without moving to a new line.
            node = node.next; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.
        System.out.println(); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.

    boolean delete(int data) { // Defines the method that performs this unit of work for the class.
        boolean isDeleted = false; // Stores the computed or supplied value in a variable for later use.
        Node node = start; // Stores the computed or supplied value in a variable for later use.
        while (node != null) { // Keeps executing this block until the loop condition becomes false.
            if (node.data == data) { // Checks whether the condition is true before taking the matching action.
                node.prev.next = node.next; // Stores the computed or supplied value in a variable for later use.
                isDeleted = true; // Stores the computed or supplied value in a variable for later use.
            } // Closes the current block and ends the active scope.
            node = node.next; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.
        return isDeleted; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    boolean addAfter(int data, int newValue) { // Defines the method that performs this unit of work for the class.
        Node current = start; // Stores the computed or supplied value in a variable for later use.
        boolean isAdded = false; // Stores the computed or supplied value in a variable for later use.
        while (current != null) { // Keeps executing this block until the loop condition becomes false.
            if (current.data == data) { // Checks whether the condition is true before taking the matching action.
                Node newNode = new Node(newValue); // Stores the computed or supplied value in a variable for later use.
                newNode.prev = current; // Stores the computed or supplied value in a variable for later use.
                newNode.next = current.next; // Stores the computed or supplied value in a variable for later use.
                current.next = newNode; // Stores the computed or supplied value in a variable for later use.
                isAdded = true; // Stores the computed or supplied value in a variable for later use.

            } // Closes the current block and ends the active scope.
            current = current.next; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.

        return isAdded; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    void addBefore(int before, int data) { // Defines the method that performs this unit of work for the class.

        Node current = start; // Stores the computed or supplied value in a variable for later use.
        while (current != null) { // Keeps executing this block until the loop condition becomes false.
            if (current.data == before) { // Checks whether the condition is true before taking the matching action.
                Node newNode = new Node(data); // Stores the computed or supplied value in a variable for later use.
                if (current.prev == null) { // Checks whether the condition is true before taking the matching action.
                    current.prev=newNode; // Stores the computed or supplied value in a variable for later use.
                    newNode.next=current; // Stores the computed or supplied value in a variable for later use.
                } else { // Closes the current block and ends the active scope.
                    newNode.prev = current.prev.next; // Stores the computed or supplied value in a variable for later use.
                    newNode.next = current; // Stores the computed or supplied value in a variable for later use.
                    current.prev.next = newNode; // Stores the computed or supplied value in a variable for later use.
                } // Closes the current block and ends the active scope.
            } // Closes the current block and ends the active scope.
            current = current.next; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.


    } // Closes the current block and ends the active scope.

    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        DoubleLinkedList ddl = new DoubleLinkedList(); // Stores the computed or supplied value in a variable for later use.
        for (int i = 10; i <= 100; i += 10) { // Repeats the loop body as long as the loop condition remains true.
            ddl.add(i); // Executes the current statement to update state or trigger the required behavior.
        } // Closes the current block and ends the active scope.
        //  ddl.crate_cycle();
        ddl.printForward(); // Executes the current statement to update state or trigger the required behavior.

        ddl.printBackward(); // Executes the current statement to update state or trigger the required behavior.
        ddl.delete(50); // Executes the current statement to update state or trigger the required behavior.
        ddl.printForward(); // Executes the current statement to update state or trigger the required behavior.
        ddl.addBefore(10, 9); // Executes the current statement to update state or trigger the required behavior.
        ddl.addAfter(40, 50); // Executes the current statement to update state or trigger the required behavior.
        ddl.printForward(); // Executes the current statement to update state or trigger the required behavior.
        ddl.addBefore(40, 35); // Executes the current statement to update state or trigger the required behavior.
        ddl.printForward(); // Executes the current statement to update state or trigger the required behavior.


        System.out.println(ddl.has_cycle(ddl.start)); // Prints the result to the console so the current state can be inspected.

        ddl.addNodeAtLocation(1, 18); // Executes the current statement to update state or trigger the required behavior.
        ddl.printForward(); // Executes the current statement to update state or trigger the required behavior.

    } // Closes the current block and ends the active scope.

    void crate_cycle() { // Defines the method that performs this unit of work for the class.
        Node node = start; // Stores the computed or supplied value in a variable for later use.
        Node prevNode = null; // Stores the computed or supplied value in a variable for later use.
        Node cycleNode = null; // Stores the computed or supplied value in a variable for later use.
        while (node.next != null) { // Keeps executing this block until the loop condition becomes false.
            if (node.data == 10) { // Checks whether the condition is true before taking the matching action.
                cycleNode = node; // Stores the computed or supplied value in a variable for later use.
            } // Closes the current block and ends the active scope.
            node = node.next; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.
        node.next = cycleNode; // Stores the computed or supplied value in a variable for later use.
    } // Closes the current block and ends the active scope.

    void addNodeAtLocation(int position, int data) { // Defines the method that performs this unit of work for the class.
        Node current = start; // Stores the computed or supplied value in a variable for later use.
        if (position == 1) { // Checks whether the condition is true before taking the matching action.
            Node newNode = new Node(data); // Stores the computed or supplied value in a variable for later use.
            newNode.next = start; // Stores the computed or supplied value in a variable for later use.
            start = newNode; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.
        int curPos = 1; // Stores the computed or supplied value in a variable for later use.
        while (current != null) { // Keeps executing this block until the loop condition becomes false.
            if (curPos == position - 1) { // Checks whether the condition is true before taking the matching action.
                Node newNode = new Node(data); // Stores the computed or supplied value in a variable for later use.
                newNode.next = current.next; // Stores the computed or supplied value in a variable for later use.
                current.next = newNode; // Stores the computed or supplied value in a variable for later use.
                break; // Exits the current loop or switch branch immediately.
            } // Closes the current block and ends the active scope.
            curPos++; // Executes the current statement to update state or trigger the required behavior.
            current = current.next; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.


    boolean has_cycle(Node start) { // Defines the method that performs this unit of work for the class.
        Node slow = start; // Stores the computed or supplied value in a variable for later use.
        Node fast = start.next; // Stores the computed or supplied value in a variable for later use.

        while (fast != null && fast.next != null) { // Keeps executing this block until the loop condition becomes false.
            if (slow == fast) { // Checks whether the condition is true before taking the matching action.
                return true; // Returns the computed value to the caller and exits the method.
            } // Closes the current block and ends the active scope.
            slow = slow.next; // Stores the computed or supplied value in a variable for later use.
            fast = fast.next.next; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.

        return false; // Returns the computed value to the caller and exits the method.

    } // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
