package com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Scanner; // Imports the classes needed to support this file's logic.
import java.util.Stack; // Imports the classes needed to support this file's logic.

class StackQ { // Defines the Java type that contains the related data and behavior.
    Stack<Integer> s1 = new Stack<>(); // Stores the computed or supplied value in a variable for later use.
    Stack<Integer> s2 = new Stack<>(); // Stores the computed or supplied value in a variable for later use.


    public void enqueue(int value) { // Defines the method that performs this unit of work for the class.
        s1.push(value); // Executes the current statement to update state or trigger the required behavior.
    } // Closes the current block and ends the active scope.

    public int dequeue() { // Defines the method that performs this unit of work for the class.
        if (s2.isEmpty()) { // Checks whether the condition is true before taking the matching action.
            while (!s1.isEmpty()) { // Keeps executing this block until the loop condition becomes false.
                s2.push(s1.pop()); // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        if (s2.isEmpty()) { // Checks whether the condition is true before taking the matching action.
            return -1; // Returns the computed value to the caller and exits the method.
        } // Closes the current block and ends the active scope.
      return   s2.pop(); // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.

    public int peek() { // Defines the method that performs this unit of work for the class.
        if (s2.isEmpty()) { // Checks whether the condition is true before taking the matching action.
            while (!s1.isEmpty()) { // Keeps executing this block until the loop condition becomes false.
                s2.push(s1.pop()); // Executes the current statement to update state or trigger the required behavior.
            } // Closes the current block and ends the active scope.
        } // Closes the current block and ends the active scope.
        if (s2.isEmpty()) { // Checks whether the condition is true before taking the matching action.
            return -1; // Returns the computed value to the caller and exits the method.
        } // Closes the current block and ends the active scope.
        return s2.peek(); // Returns the computed value to the caller and exits the method.
    } // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.

public class QueueWithTwoStack { // Defines the Java type that contains the related data and behavior.
    public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
        Scanner scanner = new Scanner(System.in); // Stores the computed or supplied value in a variable for later use.
        StackQ stackQ = new StackQ(); // Stores the computed or supplied value in a variable for later use.
        int q = scanner.nextInt(); // Stores the computed or supplied value in a variable for later use.
        while (q > 0) { // Keeps executing this block until the loop condition becomes false.
            int in = scanner.nextInt(); // Stores the computed or supplied value in a variable for later use.
            System.out.println("In==> " + in); // Prints the result to the console so the current state can be inspected.
            if (in == 1) { // Checks whether the condition is true before taking the matching action.
                in = scanner.nextInt(); // Stores the computed or supplied value in a variable for later use.
                System.out.println("EQ==> q: " + in); // Prints the result to the console so the current state can be inspected.
                stackQ.enqueue(in); // Executes the current statement to update state or trigger the required behavior.
            } else if (in == 2) { // Closes the current block and ends the active scope.
                System.out.println("DQ==> q: " + in); // Prints the result to the console so the current state can be inspected.
                int element = stackQ.dequeue(); // Stores the computed or supplied value in a variable for later use.
                System.out.println("DQ:" + element); // Prints the result to the console so the current state can be inspected.
            } else { // Closes the current block and ends the active scope.
                System.out.println("PEEK==> " + in); // Prints the result to the console so the current state can be inspected.
                System.out.println(stackQ.peek()); // Prints the result to the console so the current state can be inspected.
            } // Closes the current block and ends the active scope.
            q--; // Executes the current statement to update state or trigger the required behavior.

        } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.




