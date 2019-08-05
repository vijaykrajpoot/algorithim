package com.algo.linkedlist.single;

public class LinkedList<T> {

  Node<T> firstNode;
  Node<T> currentNode;

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
    linkedList.add(10);
    linkedList.add(20);
    linkedList.add(30);
    linkedList.add(40);
    linkedList.displayList();

    LinkedList<String> strlinkedList = new LinkedList<>();

    strlinkedList.add("A");
    strlinkedList.add("B");
    strlinkedList.add("C");
    strlinkedList.add("D");
    strlinkedList.displayList();

  }

}
