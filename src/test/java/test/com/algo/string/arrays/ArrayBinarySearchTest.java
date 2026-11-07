package test.com.algo.string.arrays; // Declares the package so the class is organized under the correct Java namespace.

import static org.junit.Assert.*; // Imports the classes needed to support this file's logic.

import java.util.stream.IntStream; // Imports the classes needed to support this file's logic.

import org.junit.Test; // Imports the classes needed to support this file's logic.

import com.algo.string.arrays.ArrayBinarySearch; // Imports the classes needed to support this file's logic.

public class ArrayBinarySearchTest { // Defines the Java type that contains the related data and behavior.

	@Test // Provides metadata for the Java element that follows.
	public void testSearch() { // Defines the method that performs this unit of work for the class.
		assertEquals(6,ArrayBinarySearch.search(IntStream.range(1, 10).toArray(),7)); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
	
	@Test // Provides metadata for the Java element that follows.
	public void testSearchWith1Element() { // Defines the method that performs this unit of work for the class.
		assertEquals(-1,ArrayBinarySearch.search(IntStream.range(1, 2).toArray(),7)); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
	
	@Test // Provides metadata for the Java element that follows.
	public void trueWhenSingleItem() { // Defines the method that performs this unit of work for the class.
		assertEquals(0,ArrayBinarySearch.search(IntStream.range(1, 2).toArray(),1)); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
