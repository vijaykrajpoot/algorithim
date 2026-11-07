package com.algo.linkedlist.single; // Declares the package so the class is organized under the correct Java namespace.

import java.util.stream.IntStream; // Imports the classes needed to support this file's logic.


/**
 * 
 * 
 * Generic Single Linked List. Where current node is always point to current node :-) after
 * operation.
 * 
 * 
 *  // @formatter:off
 *   First List ==> A B C D E F G 
 *   
 *         DELETED 'D' ==> A B C E F G 
 *         DELETED 'A' ==> B C E F G 
 *         DELETED 'G' ==> B C E F 
 *         DELETED 'F' ==> B C E 
 *         DELETED 'C' ==> B E 
 *           ADDED 'X' ==> B E X 
 *           ADDED 'Y' ==> B E X Y 
 *           ADDED 'Z' ==> B E X Y Z 
 *   After +/- List ==> B E X Y Z 
 *       DELETED 'B' ==> E X Y Z 
 *       DELETED 'Y' ==> E X Z 
 *         ADDED 'R' ==> E X Z R 
 *   // @formatter:on
 *s
 * 
 * 
 * @author Vijay K Rajput
 *
 * @param <T>
 */
public class LinkedList<T> { // Defines the Java type that contains the related data and behavior.

  private Node<T> firstNode; // Declares a variable to hold data needed by this method.
  private Node<T> currentNode; // Declares a variable to hold data needed by this method.
  private Node<T> preNode = firstNode; // Stores the computed or supplied value in a variable for later use.

  /**
   * Insert and element in a list
   * 
   * @param data
   */
  public void add(T data) { // Defines the method that performs this unit of work for the class.
    if (firstNode == null) { // Checks whether the condition is true before taking the matching action.
      Node<T> node = new Node<T>(data); // Stores the computed or supplied value in a variable for later use.
      currentNode = node; // Stores the computed or supplied value in a variable for later use.
      firstNode = node; // Stores the computed or supplied value in a variable for later use.
    } else { // Closes the current block and ends the active scope.

      Node<T> node = new Node<T>(data); // Stores the computed or supplied value in a variable for later use.
    
      currentNode.next = node; // Stores the computed or supplied value in a variable for later use.
      currentNode = node; // Stores the computed or supplied value in a variable for later use.
    } // Closes the current block and ends the active scope.

  } // Closes the current block and ends the active scope.

  void deleteElement(T data) { // Defines the method that performs this unit of work for the class.
    currentNode = firstNode; // Stores the computed or supplied value in a variable for later use.
    preNode = firstNode; // Stores the computed or supplied value in a variable for later use.

    if (firstNode.data.equals(data)) { // Checks whether the condition is true before taking the matching action.
      firstNode = currentNode.next; // Stores the computed or supplied value in a variable for later use.
    } else { // Closes the current block and ends the active scope.
      while (currentNode != null) { // Keeps executing this block until the loop condition becomes false.
        if (currentNode.data.equals(data)) { // Checks whether the condition is true before taking the matching action.
          preNode.next = currentNode.next; // Stores the computed or supplied value in a variable for later use.
          // moved current to next after deleting current node
          currentNode = currentNode.next; // Stores the computed or supplied value in a variable for later use.
          break; // Exits the current loop or switch branch immediately.
        } else { // Closes the current block and ends the active scope.
          preNode = currentNode; // Stores the computed or supplied value in a variable for later use.
          currentNode = currentNode.next; // Stores the computed or supplied value in a variable for later use.
        } // Closes the current block and ends the active scope.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.
  } // Closes the current block and ends the active scope.



  public Node<T> findMiddleNodeLogic1() { // Defines the method that performs this unit of work for the class.
    int i = 0; // Stores the computed or supplied value in a variable for later use.
    Node<T> p1 = firstNode; // Stores the computed or supplied value in a variable for later use.
    Node<T> p2 = firstNode; // Stores the computed or supplied value in a variable for later use.

    while (p1 != null) { // Keeps executing this block until the loop condition becomes false.
      // System.out.println((i++) + " %2 = " + i++ % 2);
      if (i++ % 2 == 1) { // Checks whether the condition is true before taking the matching action.
        p1 = p1.next; // Stores the computed or supplied value in a variable for later use.
        p2 = p2.next; // Stores the computed or supplied value in a variable for later use.
      } else { // Closes the current block and ends the active scope.
        p1 = p1.next; // Stores the computed or supplied value in a variable for later use.
      } // Closes the current block and ends the active scope.
    } // Closes the current block and ends the active scope.

    return p2; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

  public Node<T> findMiddleNodeLogic2() { // Defines the method that performs this unit of work for the class.

    Node<T> node1 = firstNode; // Stores the computed or supplied value in a variable for later use.
    Node<T> node2 = firstNode; // Stores the computed or supplied value in a variable for later use.
    int i = 0; // Stores the computed or supplied value in a variable for later use.
    while (node1 != null) { // Keeps executing this block until the loop condition becomes false.
      if ((++i) % 2 == 0) { // Checks whether the condition is true before taking the matching action.
        node2 = node2.next; // Stores the computed or supplied value in a variable for later use.
      } // Closes the current block and ends the active scope.
      node1 = node1.next; // Stores the computed or supplied value in a variable for later use.
    } // Closes the current block and ends the active scope.

    return node2; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.


  public Node<T> findMiddleNodeLogic3() { // Defines the method that performs this unit of work for the class.
    Node<T> node1 = firstNode; // Stores the computed or supplied value in a variable for later use.
    Node<T> node2 = firstNode; // Stores the computed or supplied value in a variable for later use.
    boolean skip = false; // Stores the computed or supplied value in a variable for later use.

    while (node1 != null) { // Keeps executing this block until the loop condition becomes false.
      if (skip) { // Checks whether the condition is true before taking the matching action.
        node1 = node1.next; // Stores the computed or supplied value in a variable for later use.
        node2 = node2.next; // Stores the computed or supplied value in a variable for later use.
      } else { // Closes the current block and ends the active scope.
        node1 = node1.next; // Stores the computed or supplied value in a variable for later use.
      } // Closes the current block and ends the active scope.
      skip = !skip; // Stores the computed or supplied value in a variable for later use.
    } // Closes the current block and ends the active scope.
    return node2; // Returns the computed value to the caller and exits the method.
  } // Closes the current block and ends the active scope.

  public void displayList() { // Defines the method that performs this unit of work for the class.
    Node<T> currentNode = firstNode; // Stores the computed or supplied value in a variable for later use.
    while (currentNode != null) { // Keeps executing this block until the loop condition becomes false.
      System.out.print(currentNode.data + " "); // Prints the value without moving to a new line.
      currentNode = currentNode.next; // Stores the computed or supplied value in a variable for later use.
    } // Closes the current block and ends the active scope.
    System.out.println(); // Prints the result to the console so the current state can be inspected.
  } // Closes the current block and ends the active scope.

  public static void main(String[] args) { // Defines the method that performs this unit of work for the class.

    LinkedList<Integer> linkedList = new LinkedList<>(); // Stores the computed or supplied value in a variable for later use.
    IntStream.range(1, 10).forEach(i -> linkedList.add(i)); // Executes the current statement to update state or trigger the required behavior.
    linkedList.displayList(); // Executes the current statement to update state or trigger the required behavior.

    LinkedList<String> strlinkedList = new LinkedList<>(); // Stores the computed or supplied value in a variable for later use.

    strlinkedList.add("A"); // Executes the current statement to update state or trigger the required behavior.
    strlinkedList.add("B"); // Executes the current statement to update state or trigger the required behavior.
    strlinkedList.add("C"); // Executes the current statement to update state or trigger the required behavior.
    strlinkedList.add("D"); // Executes the current statement to update state or trigger the required behavior.
    strlinkedList.add("E"); // Executes the current statement to update state or trigger the required behavior.
    strlinkedList.add("F"); // Executes the current statement to update state or trigger the required behavior.
    strlinkedList.add("G"); // Executes the current statement to update state or trigger the required behavior.

    strlinkedList.displayList(); // Executes the current statement to update state or trigger the required behavior.

    strlinkedList.deleteElement("D"); // Executes the current statement to update state or trigger the required behavior.
    System.out.print("DELETED 'D' ==> "); // Prints the value without moving to a new line.
    strlinkedList.displayList(); // Executes the current statement to update state or trigger the required behavior.

    strlinkedList.deleteElement("A"); // Executes the current statement to update state or trigger the required behavior.
    System.out.print("DELETED 'A' ==> "); // Prints the value without moving to a new line.
    strlinkedList.displayList(); // Executes the current statement to update state or trigger the required behavior.

    strlinkedList.deleteElement("G"); // Executes the current statement to update state or trigger the required behavior.
    System.out.print("DELETED 'G' ==> "); // Prints the value without moving to a new line.
    strlinkedList.displayList(); // Executes the current statement to update state or trigger the required behavior.

    strlinkedList.deleteElement("F"); // Executes the current statement to update state or trigger the required behavior.
    System.out.print("DELETED 'F' ==> "); // Prints the value without moving to a new line.
    strlinkedList.displayList(); // Executes the current statement to update state or trigger the required behavior.

    strlinkedList.deleteElement("C"); // Executes the current statement to update state or trigger the required behavior.
    System.out.print("DELETED 'C' ==> "); // Prints the value without moving to a new line.
    strlinkedList.displayList(); // Executes the current statement to update state or trigger the required behavior.

    System.out.print("ADDED 'X' ==> "); // Prints the value without moving to a new line.
    strlinkedList.add("X"); // Executes the current statement to update state or trigger the required behavior.
    strlinkedList.displayList(); // Executes the current statement to update state or trigger the required behavior.
    System.out.print("ADDED 'Y' ==> "); // Prints the value without moving to a new line.
    strlinkedList.add("Y"); // Executes the current statement to update state or trigger the required behavior.
    strlinkedList.displayList(); // Executes the current statement to update state or trigger the required behavior.

    System.out.print("ADDED 'Z' ==> "); // Prints the value without moving to a new line.
    strlinkedList.add("Z"); // Executes the current statement to update state or trigger the required behavior.
    strlinkedList.displayList(); // Executes the current statement to update state or trigger the required behavior.

    strlinkedList.displayList(); // Executes the current statement to update state or trigger the required behavior.

    strlinkedList.deleteElement("B"); // Executes the current statement to update state or trigger the required behavior.
    System.out.print("DELETED 'B' ==> "); // Prints the value without moving to a new line.
    strlinkedList.displayList(); // Executes the current statement to update state or trigger the required behavior.


    strlinkedList.deleteElement("Y"); // Executes the current statement to update state or trigger the required behavior.
    System.out.print("DELETED 'Y' ==> "); // Prints the value without moving to a new line.
    strlinkedList.displayList(); // Executes the current statement to update state or trigger the required behavior.

    System.out.print("ADDED 'R' ==> "); // Prints the value without moving to a new line.
    strlinkedList.add("R"); // Executes the current statement to update state or trigger the required behavior.
    strlinkedList.displayList(); // Executes the current statement to update state or trigger the required behavior.

  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
