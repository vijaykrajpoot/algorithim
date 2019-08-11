package com.algo.linkedlist.single;

import java.util.stream.IntStream;

/**
 * 
 * 
 * Generic Single Linked List
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
  void add(T data) {
    if (firstNode == null) {
      Node<T> node = new Node<T>();
      node.data = data;
      currentNode = node;
      firstNode = node;
    } else {

      Node<T> node = new Node<T>();
      node.data = data;
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



  void displayList() {
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
  }

}
