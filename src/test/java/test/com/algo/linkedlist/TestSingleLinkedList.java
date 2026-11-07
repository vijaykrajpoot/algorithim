package test.com.algo.linkedlist; // Declares the package so the class is organized under the correct Java namespace.

import java.util.stream.IntStream; // Imports the classes needed to support this file's logic.

import org.junit.Assert; // Imports the classes needed to support this file's logic.
import org.junit.Test; // Imports the classes needed to support this file's logic.

import com.algo.linkedlist.LinkedList; // Imports the classes needed to support this file's logic.

public class TestSingleLinkedList { // Defines the Java type that contains the related data and behavior.

	LinkedList ll = new LinkedList(); // Stores the computed or supplied value in a variable for later use.

	@Test // Provides metadata for the Java element that follows.
	public void createLinkedList() { // Defines the method that performs this unit of work for the class.
		IntStream.range(0, 10).forEach(i -> ll.add(++i)); // Executes the current statement to update state or trigger the required behavior.
		Assert.assertTrue(ll.size() == 10); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void findMidLinkedListLogic1() { // Defines the method that performs this unit of work for the class.
		IntStream.range(1, 10).forEach(i -> ll.add(i)); // Executes the current statement to update state or trigger the required behavior.
		ll.printList("findMidLinkedListLogic1:"); // Executes the current statement to update state or trigger the required behavior.
		Assert.assertTrue(ll.findMiddleNodeLogic1().data == 5); // Executes the current statement to update state or trigger the required behavior.
		
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void findMidLinkedListLogic2() { // Defines the method that performs this unit of work for the class.
		IntStream.range(1, 10).forEach(i -> ll.add(i)); // Executes the current statement to update state or trigger the required behavior.
		Assert.assertTrue(ll.findMiddleNodeLogic2().data == 5); // Executes the current statement to update state or trigger the required behavior.
		// ll.printList();
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void findMidWhen1ElementLog2() { // Defines the method that performs this unit of work for the class.
		IntStream.range(1, 2).forEach(i -> ll.add(i)); // Executes the current statement to update state or trigger the required behavior.
		ll.printList("findMidWhen1ElementLog2:"); // Executes the current statement to update state or trigger the required behavior.
		Assert.assertTrue(ll.findMiddleNodeLogic2().data == 1); // Executes the current statement to update state or trigger the required behavior.

	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void findMidWhen1ElementLog1() { // Defines the method that performs this unit of work for the class.
		IntStream.range(1, 2).forEach(i -> ll.add(i)); // Executes the current statement to update state or trigger the required behavior.
		ll.printList("findMidWhen1ElementLog1:"); // Executes the current statement to update state or trigger the required behavior.
		Assert.assertTrue(ll.findMiddleNodeLogic1().data == 1); // Executes the current statement to update state or trigger the required behavior.

	} // Closes the current block and ends the active scope.

	@Test(expected = IllegalStateException.class) // Provides metadata for the Java element that follows.
	public void findMidWhenZeroElementLogic2() { // Defines the method that performs this unit of work for the class.
		IntStream.range(1, 1).forEach(i -> ll.add(i)); // Executes the current statement to update state or trigger the required behavior.
		Assert.assertNotNull(ll.findMiddleNodeLogic2()); // Executes the current statement to update state or trigger the required behavior.
		// ll.printList();
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void findMidWhenListisEvenSizeLogic2() { // Defines the method that performs this unit of work for the class.
		IntStream.range(1, 11).forEach(i -> ll.add(i)); // Executes the current statement to update state or trigger the required behavior.
		// ll.printList();
		Assert.assertTrue(ll.findMiddleNodeLogic2().data == 5); // Executes the current statement to update state or trigger the required behavior.

	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void findMidWhenListisEvenSizeLogic1() { // Defines the method that performs this unit of work for the class.
		IntStream.range(1, 11).forEach(i -> ll.add(i)); // Executes the current statement to update state or trigger the required behavior.
		// ll.printList();
		Assert.assertTrue(ll.findMiddleNodeLogic1().data == 6); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void deleteANodeFromLinkedList() { // Defines the method that performs this unit of work for the class.
		IntStream.range(0, 10).forEach(i -> ll.add(++i)); // Executes the current statement to update state or trigger the required behavior.
		Assert.assertTrue(ll.size() == 10); // Executes the current statement to update state or trigger the required behavior.
		ll.printList("deleteANodeFromLinkedList:"); // Executes the current statement to update state or trigger the required behavior.
		ll.deleteNode(7); // Executes the current statement to update state or trigger the required behavior.
		ll.printList("deleteANodeFromLinkedList:"); // Executes the current statement to update state or trigger the required behavior.
		Assert.assertTrue(ll.size() == 9); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void deleteFirstNodeFromLinkedList() { // Defines the method that performs this unit of work for the class.
		IntStream.range(0, 10).forEach(i -> ll.add(++i)); // Executes the current statement to update state or trigger the required behavior.
		Assert.assertTrue(ll.size() == 10); // Executes the current statement to update state or trigger the required behavior.
		ll.printList("deleteANodeFromLinkedList:"); // Executes the current statement to update state or trigger the required behavior.
		ll.deleteNode(1); // Executes the current statement to update state or trigger the required behavior.
		ll.printList("deleteANodeFromLinkedList:"); // Executes the current statement to update state or trigger the required behavior.
		Assert.assertTrue(ll.size() == 9); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void deleteLastNodeFromLinkedList() { // Defines the method that performs this unit of work for the class.
		IntStream.range(0, 10).forEach(i -> ll.add(++i)); // Executes the current statement to update state or trigger the required behavior.
		Assert.assertTrue(ll.size() == 10); // Executes the current statement to update state or trigger the required behavior.
		ll.printList("deleteLastNodeFromLinkedList:"); // Executes the current statement to update state or trigger the required behavior.
		ll.deleteNode(10); // Executes the current statement to update state or trigger the required behavior.
		ll.printList("deleteLastNodeFromLinkedList:"); // Executes the current statement to update state or trigger the required behavior.
		Assert.assertTrue(ll.size() == 9); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void deleteNodeWhen2NodeInList() { // Defines the method that performs this unit of work for the class.
		IntStream.range(0, 2).forEach(i -> ll.add(++i)); // Executes the current statement to update state or trigger the required behavior.
		Assert.assertTrue(ll.size() == 2); // Executes the current statement to update state or trigger the required behavior.
		ll.printList("deleteNodeWhen2NodeInList:"); // Executes the current statement to update state or trigger the required behavior.
		ll.deleteNode(2); // Executes the current statement to update state or trigger the required behavior.
		ll.printList("deleteNodeWhen2NodeInList:"); // Executes the current statement to update state or trigger the required behavior.
		Assert.assertTrue(ll.size() == 1); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test(expected = IllegalStateException.class) // Provides metadata for the Java element that follows.
	public void deleteNodeFromEmptyNodeInList() { // Defines the method that performs this unit of work for the class.
		IntStream.range(0, 0).forEach(i -> ll.add(++i)); // Executes the current statement to update state or trigger the required behavior.
		Assert.assertTrue(ll.size() == 0); // Executes the current statement to update state or trigger the required behavior.
		ll.printList("deleteNodeFromEmptyNodeInList:"); // Executes the current statement to update state or trigger the required behavior.
		ll.deleteNode(2); // Executes the current statement to update state or trigger the required behavior.
		ll.printList("deleteNodeFromEmptyNodeInList:"); // Executes the current statement to update state or trigger the required behavior.
		Assert.assertTrue(ll.size() == 0); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void findSecondLargest() { // Defines the method that performs this unit of work for the class.
		int arr[] = { 104, 887, 524, 132, 75, 542, 311, 318, 459, 143 }; // Executes the current statement to update state or trigger the required behavior.
		for (int i = 0; i < arr.length; i++) { // Repeats the loop body as long as the loop condition remains true.
			ll.add(arr[i]); // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
		ll.printList("findSecondLargest:"); // Executes the current statement to update state or trigger the required behavior.
		System.out.println("ll.findSecondLargest():" + ll.findSecondLargest()); // Prints the result to the console so the current state can be inspected.
		Assert.assertTrue(ll.findSecondLargest() == 542); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void findSecondLargestWhenListIsSortedOrderByAscending() { // Defines the method that performs this unit of work for the class.

		IntStream.range(0, 100).forEach(i -> ll.add(++i)); // Executes the current statement to update state or trigger the required behavior.
		ll.printList("findSecondLargest:"); // Executes the current statement to update state or trigger the required behavior.
		Assert.assertTrue(ll.findSecondLargest() == 99); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void findSecondLargestWhenListIsSortedOrderByDescending() { // Defines the method that performs this unit of work for the class.
		for (int i = 100; i > 0; i--) { // Repeats the loop body as long as the loop condition remains true.
			ll.add(i); // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
		ll.printList("findSecondLargest:"); // Executes the current statement to update state or trigger the required behavior.
		Assert.assertTrue(ll.findSecondLargest() == 99); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void findSecondLargestWhenListHasNegativeAndPositiveInt() { // Defines the method that performs this unit of work for the class.
//		Random random=new Random();
//		IntStream.range(0, 10).forEach(i -> ll.add((random.nextInt(65536)-32768)));

		int arr[] = { 14522, 30884, -12306, 254, -21498, 25113, 16181, -28164, 24136, -25679 }; // Executes the current statement to update state or trigger the required behavior.
		for (int i = 0; i < arr.length; i++) { // Repeats the loop body as long as the loop condition remains true.
			ll.add(arr[i]); // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
		ll.printList("findSecondLargest:"); // Executes the current statement to update state or trigger the required behavior.
		System.out.println("ll.findSecondLargest():" + ll.findSecondLargest()); // Prints the result to the console so the current state can be inspected.
		Assert.assertTrue(ll.findSecondLargest() == 25113); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void findSecondLargestWhenListHasOnlyRandomNegativeInt() { // Defines the method that performs this unit of work for the class.
//		Random random=new Random();
//		IntStream.range(0, 10).forEach(i -> ll.add((random.nextInt(65536)-32768)));

		int arr[] = { -14522, -30884, -12306, -254, -21498, -25113, -16181, -28164, -24136, -25679 }; // Executes the current statement to update state or trigger the required behavior.
		for (int i = 0; i < arr.length; i++) { // Repeats the loop body as long as the loop condition remains true.
			ll.add(arr[i]); // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
		ll.printList("findSecondLargest:"); // Executes the current statement to update state or trigger the required behavior.
		System.out.println("ll.findSecondLargest():" + ll.findSecondLargest()); // Prints the result to the console so the current state can be inspected.
		Assert.assertTrue(ll.findSecondLargest() == -12306); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
