package com.algo.linkedlist;

/**
 * Represent Single List List and it's operation
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class LinkedList {

	private Node start;
	private Node current;
	private long size;

	public long size() {
		return size;
	}

	/**
	 * Add Operation and current pointer always move to newly added node. No need to traverse whole list to add a new node
	 * 
	 * @param data
	 */
	public void add(int data) {
		Node node = new Node(data);
		size++;
		if (start == null) {
			start = node;
			current = node;
		} else {
			current.next = node;
			current = node;
		}

	}

	/**
	 * Show the list
	 */
	public void printList(String listHeading) {
		Node curret = start;
		if (listHeading == null)
			listHeading = "List:";
		System.out.print(listHeading);
		while (curret != null) {
			System.out.print("-> " + curret.data);
			curret = curret.next;
		}
		System.out.println();
	}

	/**
	 * Find Middle node Logic#1 1) Every time move node1 and move node based on even/odd
	 * 
	 * @param Node:start
	 */

	public Node findMiddleNodeLogic1() {
		if (start == null) {
			throw new IllegalStateException("Empty List");
		}
		Node node1 = start;
		Node node2 = start;
		int i = 0;
		// Here i=0 is very important because in case of even size of list
		// if we need to return Mid+1 i.e. 1-10 list return 6 then i must be 0 so that
		// node2.next will execute

		while (node1.next != null) {
			node1 = node1.next;
			if (((i++) % 2) == 0)
				node2 = node2.next;
		}
		return node2;
	}

	/**
	 * 
	 * Maintain 2 pointer and move pointer p1 based based on skip=true and move both pointer based on skip=false;
	 * 
	 * Each time pointer p1 move and p2 remains behind
	 * 
	 * @param start
	 * @return
	 */
	public Node findMiddleNodeLogic2() {
		if (start == null) {
			throw new IllegalStateException("Empty List");
		}
		Node p1 = start, p2 = start;
		boolean skip = true;
		// if block is moving p1/p2 both pointers to return Mid+1 i.e. 1-10 list return
		// 6.
		// in case of even size of list
		// if we need number 5 in case of 1-10 list then make skip=false or move p1 & p2
		// in else block or change if(skip) to if(!skip) :-)
		while (p1.next != null) {
			if (!skip) {
				p1 = p1.next;
				p2 = p2.next;
			} else {
				p1 = p1.next;
			}
			skip = !skip;
		}
		return p2;

	}

	public boolean deleteNode(int data) {
		if (start == null) {
			throw new IllegalStateException("Empty List");
		}
		Node current = start;
		Node previous = start;

		if (start.data == data) {
			start = start.next;
			size--;
			return true;
		}
		while (current != null) {
			if (current.data == data) {
				previous.next = current.next;
				previous = current;
				size--;
				return true;

			}
			previous = current;
			current = current.next;
		}
		return false;

	}

	public int findSecondLargest() {

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		Node current = start;

		while (current != null) {
			if (current.data > first) {
				second = first;
				first = current.data;
			} else {
				// 104, 887, 524, 132, 75, 542, 311, 318, 459, 143
				// In this case since 887 is higher then second largest will always remain 104
				// So this else condition is required
				if (current.data > second) {
					second = current.data;
				}
			}
			current = current.next;
		}
		return second;
	}
	/**
	 * 
	 * Merge with duplicate numbers in sorted order
	 * 
	 * @param l1
	 * @param l2
	 * @return
	 */
	LinkedList mergedLinkedList(LinkedList l1, LinkedList l2) {

		LinkedList mergedList = new LinkedList();

		Node l1Current = l1.start;
		Node l2Current = l2.start;

		while (l1Current != null && l2Current != null) {
			if (l1Current.data <= l2Current.data) {
				mergedList.add(l1Current.data);
				l1Current = l1Current.next;
			} else if (l1Current.data >= l2Current.data) {
				mergedList.add(l2Current.data);
				l2Current = l2Current.next;
			} else if (l1Current.data == l2Current.data) {
				mergedList.add(l2Current.data);
				l1Current = l1Current.next;
				l2Current = l2Current.next;
			}
		}

		while (l1Current != null) {
			mergedList.add(l1Current.data);
			l1Current = l1Current.next;
		}

		while (l2Current != null) {
			mergedList.add(l2Current.data);
			l2Current = l2Current.next;
		}
		return mergedList;

	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();

		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(70);
		l1.add(80);
		l1.add(90);
		l1.add(100);
		Node n=l1.findMiddleNodeLogic2();
		System.out.println("Middle Node:"+n.data);
	
		
		LinkedList l2 = new LinkedList();
		l2.add(5);
		l2.add(10);
		l2.add(20);
		l2.add(40);
		l2.add(60);
		l2.add(80);
		l2.add(300);
		LinkedList mergedLL = linkedList.mergedLinkedList(l1, l2);
		Node node = mergedLL.start;
		while (node != null) {
			System.out.print("-> " + node.data);
			node = node.next;
		}
	}

}