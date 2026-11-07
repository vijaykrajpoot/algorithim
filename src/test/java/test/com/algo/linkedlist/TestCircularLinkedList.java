package test.com.algo.linkedlist; // Declares the package so the class is organized under the correct Java namespace.

import java.util.stream.IntStream; // Imports the classes needed to support this file's logic.

import org.junit.Assert; // Imports the classes needed to support this file's logic.
import org.junit.Test; // Imports the classes needed to support this file's logic.

import com.algo.linkedlist.CircularLinkedList; // Imports the classes needed to support this file's logic.

public class TestCircularLinkedList { // Defines the Java type that contains the related data and behavior.

	CircularLinkedList cll = new CircularLinkedList(); // Stores the computed or supplied value in a variable for later use.

	@Test // Provides metadata for the Java element that follows.
	public void testCircularLinkedList() { // Defines the method that performs this unit of work for the class.
		IntStream.range(0, 10).forEach(i -> cll.add(++i)); // Executes the current statement to update state or trigger the required behavior.
		cll.printList(); // Executes the current statement to update state or trigger the required behavior.
		Assert.assertTrue(cll.isCircularLinkedList()); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
