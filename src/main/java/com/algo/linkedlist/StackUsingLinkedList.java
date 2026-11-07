package com.algo.linkedlist; // Declares the package so the class is organized under the correct Java namespace.

public class StackUsingLinkedList { // Defines the Java type that contains the related data and behavior.
    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

        Stack stack = new Stack(); // Stores the computed or supplied value in a variable for later use.
        System.out.println("stack.isEmpty:" + stack.isEmpty()); // Prints the result to the console so the current state can be inspected.
        stack.push(10); // Executes the current statement to update state or trigger the required behavior.
        stack.push(20); // Executes the current statement to update state or trigger the required behavior.
        stack.push(30); // Executes the current statement to update state or trigger the required behavior.
        stack.push(40); // Executes the current statement to update state or trigger the required behavior.
        stack.push(50); // Executes the current statement to update state or trigger the required behavior.
        stack.push(150); // Executes the current statement to update state or trigger the required behavior.
        System.out.println("stack.isEmpty:" + stack.isEmpty()); // Prints the result to the console so the current state can be inspected.
        System.out.println("Show====>"); // Prints the result to the console so the current state can be inspected.
        stack.show(); // Executes the current statement to update state or trigger the required behavior.
        System.out.println("Show Reverse====>"); // Prints the result to the console so the current state can be inspected.
        stack.reverseShow(); // Executes the current statement to update state or trigger the required behavior.
        System.out.println("Top:" + stack.top()); // Prints the result to the console so the current state can be inspected.
        System.out.println("Pop:" + stack.pop()); // Prints the result to the console so the current state can be inspected.
        System.out.println("Pop:" + stack.pop()); // Prints the result to the console so the current state can be inspected.
        System.out.println("Pop:" + stack.pop()); // Prints the result to the console so the current state can be inspected.
        System.out.println("Top:" + stack.top()); // Prints the result to the console so the current state can be inspected.
        System.out.println("Show====>"); // Prints the result to the console so the current state can be inspected.
        stack.show(); // Executes the current statement to update state or trigger the required behavior.

    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.


class LinkedListX { // Defines the Java type that contains the related data and behavior.
    NodeX start; // Declares a variable to hold data needed by this method.
    NodeX current; // Declares a variable to hold data needed by this method.

    void add(int data) { // Defines the method that performs this unit of work for the class.
        NodeX node = new NodeX(data); // Stores the computed or supplied value in a variable for later use.
        if (start == null) { // Checks whether the condition is true before taking the matching action.
            start = node; // Stores the computed or supplied value in a variable for later use.
            current = node; // Stores the computed or supplied value in a variable for later use.
        } else { // Closes the current block and ends the active scope.
            node.prev = current; // Stores the computed or supplied value in a variable for later use.
            current.next = node; // Stores the computed or supplied value in a variable for later use.
            current = node; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    void show() { // Defines the method that performs this unit of work for the class.
        NodeX current = start; // Stores the computed or supplied value in a variable for later use.
        while (current != null) { // Keeps executing this block until the loop condition becomes false.
            System.out.print(current.data); // Prints the value without moving to a new line.
            if (current.next != null) { // Checks whether the condition is true before taking the matching action.
                System.out.print(" -> "); // Prints the value without moving to a new line.
            } // Closes the current block and ends the active scope.
            current = current.next; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    void reverseShow() { // Defines the method that performs this unit of work for the class.
        NodeX node = current; // Stores the computed or supplied value in a variable for later use.
        while (node != null) { // Keeps executing this block until the loop condition becomes false.
            System.out.print(node.data); // Prints the value without moving to a new line.
            if (node.prev != null) { // Checks whether the condition is true before taking the matching action.
                System.out.print(" -> "); // Prints the value without moving to a new line.
            } // Closes the current block and ends the active scope.

            node = node.prev; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    void deleteAsPop() { // Defines the method that performs this unit of work for the class.
        if (current != null) { // Checks whether the condition is true before taking the matching action.
            current = current.prev; // Stores the computed or supplied value in a variable for later use.
            current.next=null; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.

class NodeX { // Defines the Java type that contains the related data and behavior.
    NodeX next; // Declares a variable to hold data needed by this method.
    NodeX prev; // Declares a variable to hold data needed by this method.
    int data; // Declares a variable to hold data needed by this method.

    public NodeX(int data) { // Defines the method that performs this unit of work for the class.
        this.data = data; // Stores the computed or supplied value in a variable for later use.
    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.

class Stack { // Defines the Java type that contains the related data and behavior.
    LinkedListX linkedListX; // Declares a variable to hold data needed by this method.

    public Stack() { // Defines the method that performs this unit of work for the class.
        this.linkedListX = new LinkedListX(); // Stores the computed or supplied value in a variable for later use.
    } // Closes the current block and ends the active scope.

    int pop() { // Defines the method that performs this unit of work for the class.
        if (!isEmpty()) { // Checks whether the condition is true before taking the matching action.
            int item= linkedListX.current.data; // Stores the computed or supplied value in a variable for later use.
            linkedListX.deleteAsPop(); // Executes the current statement to update state or trigger the required behavior.
            return item; // Returns the computed value to the caller and exits the method.
        } // Closes the current block and ends the active scope.
        return -1; // Returns the computed value to the caller and exits the method.

    } // Closes the current block and ends the active scope.

    int top() { // Defines the method that performs this unit of work for the class.
        if (!isEmpty()) { // Checks whether the condition is true before taking the matching action.
            return  linkedListX.current.data; // Returns the computed value to the caller and exits the method.

        } else { // Closes the current block and ends the active scope.
            return -1; // Returns the computed value to the caller and exits the method.
        } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    void push(int num) { // Defines the method that performs this unit of work for the class.
        linkedListX.add(num); // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.

    boolean isEmpty() { // Defines the method that performs this unit of work for the class.
        return linkedListX.start == null; // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    void show() { // Defines the method that performs this unit of work for the class.
        linkedListX.show(); // Executes the current statement to update state or trigger the required behavior.
        System.out.println(); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.

    void reverseShow() { // Defines the method that performs this unit of work for the class.
        linkedListX.reverseShow(); // Executes the current statement to update state or trigger the required behavior.
        System.out.println(); // Prints the result to the console so the current state can be inspected.
    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.