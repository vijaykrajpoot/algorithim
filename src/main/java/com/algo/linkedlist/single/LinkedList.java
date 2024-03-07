package com.algo.linkedlist.single;

import java.util.stream.IntStream;


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
public class LinkedList<T> {

  private Node<T> firstNode;
  private Node<T> currentNode;
  private Node<T> preNode = firstNode;

  /**
   * Insert and element in a list
   * 
   * @param data
   */
  public void add(T data) {
    if (firstNode == null) {
      Node<T> node = new Node<T>(data);
      currentNode = node;
      firstNode = node;
    } else {

      Node<T> node = new Node<T>(data);
    
      currentNode.next = node;
      currentNode = node;
    }

  }

  void deleteElement(T data) {
    currentNode = firstNode;
    preNode = firstNode;

    if (firstNode.data.equals(data)) {
      firstNode = currentNode.next;
    } else {
      while (currentNode != null) {
        if (currentNode.data.equals(data)) {
          preNode.next = currentNode.next;
          // moved current to next after deleting current node
          currentNode = currentNode.next;
          break;
        } else {
          preNode = currentNode;
          currentNode = currentNode.next;
        }
      }
    }
  }



  public Node<T> findMiddleNodeLogic1() {
    int i = 0;
    Node<T> p1 = firstNode;
    Node<T> p2 = firstNode;

    while (p1 != null) {
      // System.out.println((i++) + " %2 = " + i++ % 2);
      if (i++ % 2 == 1) {
        p1 = p1.next;
        p2 = p2.next;
      } else {
        p1 = p1.next;
      }
    }

    return p2;
  }

  public Node<T> findMiddleNodeLogic2() {

    Node<T> node1 = firstNode;
    Node<T> node2 = firstNode;
    int i = 0;
    while (node1 != null) {
      if ((++i) % 2 == 0) {
        node2 = node2.next;
      }
      node1 = node1.next;
    }

    return node2;
  }


  public Node<T> findMiddleNodeLogic3() {
    Node<T> node1 = firstNode;
    Node<T> node2 = firstNode;
    boolean skip = false;

    while (node1 != null) {
      if (skip) {
        node1 = node1.next;
        node2 = node2.next;
      } else {
        node1 = node1.next;
      }
      skip = !skip;
    }
    return node2;
  }

  public void displayList() {
    Node<T> currentNode = firstNode;
    while (currentNode != null) {
      System.out.print(currentNode.data + " ");
      currentNode = currentNode.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {

    LinkedList<Integer> linkedList = new LinkedList<>();
    IntStream.range(1, 10).forEach(i -> linkedList.add(i));
    linkedList.displayList();

    LinkedList<String> strlinkedList = new LinkedList<>();

    strlinkedList.add("A");
    strlinkedList.add("B");
    strlinkedList.add("C");
    strlinkedList.add("D");
    strlinkedList.add("E");
    strlinkedList.add("F");
    strlinkedList.add("G");

    strlinkedList.displayList();

    strlinkedList.deleteElement("D");
    System.out.print("DELETED 'D' ==> ");
    strlinkedList.displayList();

    strlinkedList.deleteElement("A");
    System.out.print("DELETED 'A' ==> ");
    strlinkedList.displayList();

    strlinkedList.deleteElement("G");
    System.out.print("DELETED 'G' ==> ");
    strlinkedList.displayList();

    strlinkedList.deleteElement("F");
    System.out.print("DELETED 'F' ==> ");
    strlinkedList.displayList();

    strlinkedList.deleteElement("C");
    System.out.print("DELETED 'C' ==> ");
    strlinkedList.displayList();

    System.out.print("ADDED 'X' ==> ");
    strlinkedList.add("X");
    strlinkedList.displayList();
    System.out.print("ADDED 'Y' ==> ");
    strlinkedList.add("Y");
    strlinkedList.displayList();

    System.out.print("ADDED 'Z' ==> ");
    strlinkedList.add("Z");
    strlinkedList.displayList();

    strlinkedList.displayList();

    strlinkedList.deleteElement("B");
    System.out.print("DELETED 'B' ==> ");
    strlinkedList.displayList();


    strlinkedList.deleteElement("Y");
    System.out.print("DELETED 'Y' ==> ");
    strlinkedList.displayList();

    System.out.print("ADDED 'R' ==> ");
    strlinkedList.add("R");
    strlinkedList.displayList();

  }

}
