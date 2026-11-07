package com.algo.linkedlist; // Declares the package so the class is organized under the correct Java namespace.

/**
 * Represent Single List List and it's operation
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class LinkedList { // Defines the Java type that contains the related data and behavior.

	private Node start; // Declares a variable to hold data needed by this method.
	private Node current; // Declares a variable to hold data needed by this method.
	private long size; // Declares a variable to hold data needed by this method.

	public long size() { // Defines the method that performs this unit of work for the class.
		return size; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

	/**
	 * Add Operation and current pointer always move to newly added node. No need to traverse whole list to add a new node
	 * 
	 * @param data
	 */
	public void add(int data) { // Defines the method that performs this unit of work for the class.
		Node node = new Node(data); // Stores the computed or supplied value in a variable for later use.
		size++; // Executes the current statement to update state or trigger the required behavior.
		if (start == null) { // Checks whether the condition is true before taking the matching action.
			start = node; // Stores the computed or supplied value in a variable for later use.
			current = node; // Stores the computed or supplied value in a variable for later use.
		} else { // Closes the current block and ends the active scope.
			current.next = node; // Stores the computed or supplied value in a variable for later use.
			current = node; // Stores the computed or supplied value in a variable for later use.
		} // Closes the current block and ends the active scope.

	} // Closes the current block and ends the active scope.

	/**
	 * Show the list
	 */
	public void printList(String listHeading) { // Defines the method that performs this unit of work for the class.
		Node curret = start; // Stores the computed or supplied value in a variable for later use.
		if (listHeading == null) // Checks whether the condition is true before taking the matching action.
			listHeading = "List:"; // Stores the computed or supplied value in a variable for later use.
		System.out.print(listHeading); // Prints the value without moving to a new line.
		while (curret != null) { // Keeps executing this block until the loop condition becomes false.
			System.out.print("-> " + curret.data); // Prints the value without moving to a new line.
			curret = curret.next; // Stores the computed or supplied value in a variable for later use.
		} // Closes the current block and ends the active scope.
		System.out.println(); // Prints the result to the console so the current state can be inspected.
	} // Closes the current block and ends the active scope.

	/**
	 * Find Middle node Logic#1 1) Every time move node1 and move node based on even/odd
	 * 
	 * @param Node:start
	 */

	public Node findMiddleNodeLogic1() { // Defines the method that performs this unit of work for the class.
		if (start == null) { // Checks whether the condition is true before taking the matching action.
			throw new IllegalStateException("Empty List"); // Raises an exception to signal an invalid or unexpected condition.
		} // Closes the current block and ends the active scope.
		Node node1 = start; // Stores the computed or supplied value in a variable for later use.
		Node node2 = start; // Stores the computed or supplied value in a variable for later use.
		int i = 0; // Stores the computed or supplied value in a variable for later use.
		// Here i=0 is very important because in case of even size of list
		// if we need to return Mid+1 i.e. 1-10 list return 6 then i must be 0 so that
		// node2.next will execute

		while (node1.next != null) { // Keeps executing this block until the loop condition becomes false.
			node1 = node1.next; // Stores the computed or supplied value in a variable for later use.
			if (((i++) % 2) == 0) // Checks whether the condition is true before taking the matching action.
				node2 = node2.next; // Stores the computed or supplied value in a variable for later use.
		} // Closes the current block and ends the active scope.
		return node2; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

	/**
	 * 
	 * Maintain 2 pointer and move pointer p1 based based on skip=true and move both pointer based on skip=false;
	 * 
	 * Each time pointer p1 move and p2 remains behind
	 * 
	 * @param start
	 * @return
	 */
	public Node findMiddleNodeLogic2() { // Defines the method that performs this unit of work for the class.
		if (start == null) { // Checks whether the condition is true before taking the matching action.
			throw new IllegalStateException("Empty List"); // Raises an exception to signal an invalid or unexpected condition.
		} // Closes the current block and ends the active scope.
		Node p1 = start, p2 = start; // Stores the computed or supplied value in a variable for later use.
		boolean skip = true; // Stores the computed or supplied value in a variable for later use.
		// if block is moving p1/p2 both pointers to return Mid+1 i.e. 1-10 list return
		// 6.
		// in case of even size of list
		// if we need number 5 in case of 1-10 list then make skip=false or move p1 & p2
		// in else block or change if(skip) to if(!skip) :-)
		while (p1.next != null) { // Keeps executing this block until the loop condition becomes false.
			if (!skip) { // Checks whether the condition is true before taking the matching action.
				p1 = p1.next; // Stores the computed or supplied value in a variable for later use.
				p2 = p2.next; // Stores the computed or supplied value in a variable for later use.
			} else { // Closes the current block and ends the active scope.
				p1 = p1.next; // Stores the computed or supplied value in a variable for later use.
			} // Closes the current block and ends the active scope.
			skip = !skip; // Stores the computed or supplied value in a variable for later use.
		} // Closes the current block and ends the active scope.
		return p2; // Returns the computed value to the caller and exits the method.

	} // Closes the current block and ends the active scope.

	public boolean deleteNode(int data) { // Defines the method that performs this unit of work for the class.
		if (start == null) { // Checks whether the condition is true before taking the matching action.
			throw new IllegalStateException("Empty List"); // Raises an exception to signal an invalid or unexpected condition.
		} // Closes the current block and ends the active scope.
		Node current = start; // Stores the computed or supplied value in a variable for later use.
		Node previous = start; // Stores the computed or supplied value in a variable for later use.

		if (start.data == data) { // Checks whether the condition is true before taking the matching action.
			start = start.next; // Stores the computed or supplied value in a variable for later use.
			size--; // Executes the current statement to update state or trigger the required behavior.
			return true; // Returns the computed value to the caller and exits the method.
		} // Closes the current block and ends the active scope.
		while (current != null) { // Keeps executing this block until the loop condition becomes false.
			if (current.data == data) { // Checks whether the condition is true before taking the matching action.
				previous.next = current.next; // Stores the computed or supplied value in a variable for later use.
                size--; // Executes the current statement to update state or trigger the required behavior.
				return true; // Returns the computed value to the caller and exits the method.

			} // Closes the current block and ends the active scope.
			previous = current; // Stores the computed or supplied value in a variable for later use.
			current = current.next; // Stores the computed or supplied value in a variable for later use.
		} // Closes the current block and ends the active scope.
		return false; // Returns the computed value to the caller and exits the method.

	} // Closes the current block and ends the active scope.

	public int findSecondLargest() { // Defines the method that performs this unit of work for the class.

		int first = Integer.MIN_VALUE; // Stores the computed or supplied value in a variable for later use.
		int second = Integer.MIN_VALUE; // Stores the computed or supplied value in a variable for later use.
		Node current = start; // Stores the computed or supplied value in a variable for later use.

		while (current != null) { // Keeps executing this block until the loop condition becomes false.
			if (current.data > first) { // Checks whether the condition is true before taking the matching action.
				second = first; // Stores the computed or supplied value in a variable for later use.
				first = current.data; // Stores the computed or supplied value in a variable for later use.
			} else { // Closes the current block and ends the active scope.
				// 104, 887, 524, 132, 75, 542, 311, 318, 459, 143
				// In this case since 887 is higher then second largest will always remain 104
				// So this else condition is required
				if (current.data > second) { // Checks whether the condition is true before taking the matching action.
					second = current.data; // Stores the computed or supplied value in a variable for later use.
				} // Closes the current block and ends the active scope.
			} // Closes the current block and ends the active scope.
			current = current.next; // Stores the computed or supplied value in a variable for later use.
		} // Closes the current block and ends the active scope.
		return second; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.
	/**
	 * 
	 * Merge with duplicate numbers in sorted order
	 * 
	 * @param l1
	 * @param l2
	 * @return
	 */
	LinkedList mergedLinkedList(LinkedList l1, LinkedList l2) { // Defines the method that performs this unit of work for the class.

		LinkedList mergedList = new LinkedList(); // Stores the computed or supplied value in a variable for later use.

		Node l1Current = l1.start; // Stores the computed or supplied value in a variable for later use.
		Node l2Current = l2.start; // Stores the computed or supplied value in a variable for later use.

		while (l1Current != null && l2Current != null) { // Keeps executing this block until the loop condition becomes false.
			if (l1Current.data <= l2Current.data) { // Checks whether the condition is true before taking the matching action.
				mergedList.add(l1Current.data); // Executes the current statement to update state or trigger the required behavior.
				l1Current = l1Current.next; // Stores the computed or supplied value in a variable for later use.
			} else if (l1Current.data >= l2Current.data) { // Closes the current block and ends the active scope.
				mergedList.add(l2Current.data); // Executes the current statement to update state or trigger the required behavior.
				l2Current = l2Current.next; // Stores the computed or supplied value in a variable for later use.
			} else if (l1Current.data == l2Current.data) { // Closes the current block and ends the active scope.
				mergedList.add(l2Current.data); // Executes the current statement to update state or trigger the required behavior.
				l1Current = l1Current.next; // Stores the computed or supplied value in a variable for later use.
				l2Current = l2Current.next; // Stores the computed or supplied value in a variable for later use.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.

		while (l1Current != null) { // Keeps executing this block until the loop condition becomes false.
			mergedList.add(l1Current.data); // Executes the current statement to update state or trigger the required behavior.
			l1Current = l1Current.next; // Stores the computed or supplied value in a variable for later use.
		} // Closes the current block and ends the active scope.

		while (l2Current != null) { // Keeps executing this block until the loop condition becomes false.
			mergedList.add(l2Current.data); // Executes the current statement to update state or trigger the required behavior.
			l2Current = l2Current.next; // Stores the computed or supplied value in a variable for later use.
		} // Closes the current block and ends the active scope.
		return mergedList; // Returns the computed value to the caller and exits the method.

	} // Closes the current block and ends the active scope.

	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		LinkedList linkedList = new LinkedList(); // Stores the computed or supplied value in a variable for later use.

		LinkedList l1 = new LinkedList(); // Stores the computed or supplied value in a variable for later use.
		l1.add(10); // Executes the current statement to update state or trigger the required behavior.
		l1.add(20); // Executes the current statement to update state or trigger the required behavior.
		l1.add(30); // Executes the current statement to update state or trigger the required behavior.
		l1.add(40); // Executes the current statement to update state or trigger the required behavior.
		l1.add(50); // Executes the current statement to update state or trigger the required behavior.
		l1.add(60); // Executes the current statement to update state or trigger the required behavior.
		l1.add(70); // Executes the current statement to update state or trigger the required behavior.
		l1.add(80); // Executes the current statement to update state or trigger the required behavior.
		l1.add(90); // Executes the current statement to update state or trigger the required behavior.
		l1.add(100); // Executes the current statement to update state or trigger the required behavior.
		Node n=l1.findMiddleNodeLogic2(); // Stores the computed or supplied value in a variable for later use.
		System.out.println("Middle Node:"+n.data); // Prints the result to the console so the current state can be inspected.
	
		
		LinkedList l2 = new LinkedList(); // Stores the computed or supplied value in a variable for later use.
		l2.add(5); // Executes the current statement to update state or trigger the required behavior.
		l2.add(10); // Executes the current statement to update state or trigger the required behavior.
		l2.add(20); // Executes the current statement to update state or trigger the required behavior.
		l2.add(40); // Executes the current statement to update state or trigger the required behavior.
		l2.add(60); // Executes the current statement to update state or trigger the required behavior.
		l2.add(80); // Executes the current statement to update state or trigger the required behavior.
		l2.add(300); // Executes the current statement to update state or trigger the required behavior.
		LinkedList mergedLL = linkedList.mergedLinkedList(l1, l2); // Stores the computed or supplied value in a variable for later use.
		Node node = mergedLL.start; // Stores the computed or supplied value in a variable for later use.
		while (node != null) { // Keeps executing this block until the loop condition becomes false.
			System.out.print("-> " + node.data); // Prints the value without moving to a new line.
			node = node.next; // Stores the computed or supplied value in a variable for later use.
		} // Closes the current block and ends the active scope.
		System.out.println(); // Prints the result to the console so the current state can be inspected.
		l2.printList(null); // Executes the current statement to update state or trigger the required behavior.
		l2.deleteNode(20); // Executes the current statement to update state or trigger the required behavior.
		l2.printList(null); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.