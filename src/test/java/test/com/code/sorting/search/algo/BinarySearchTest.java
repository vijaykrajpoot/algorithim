package test.com.code.sorting.search.algo; // Declares the package so the class is organized under the correct Java namespace.

import static org.junit.Assert.assertFalse; // Imports the classes needed to support this file's logic.
import static org.junit.Assert.assertTrue; // Imports the classes needed to support this file's logic.

import org.junit.Test; // Imports the classes needed to support this file's logic.

import com.algo.string.arrays.BinarySearch; // Imports the classes needed to support this file's logic.

public class BinarySearchTest { // Defines the Java type that contains the related data and behavior.
	@Test(expected=IllegalArgumentException.class) // Provides metadata for the Java element that follows.
	public void testEmptyArray() { // Defines the method that performs this unit of work for the class.
		int arr[] = {}; // Executes the current statement to update state or trigger the required behavior.
		assertFalse(BinarySearch.search(arr, 100)); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void testSearchValidItemArray() { // Defines the method that performs this unit of work for the class.
		int arr[] = { 10, 20, 30, 40, 50 }; // Executes the current statement to update state or trigger the required behavior.
		assertTrue(BinarySearch.search(arr, 20)); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test  // Provides metadata for the Java element that follows.
	public void testItemNotFoundArray() { // Defines the method that performs this unit of work for the class.
		int arr[] = { 10, 20, 30, 40, 50 }; // Executes the current statement to update state or trigger the required behavior.
		assertFalse(BinarySearch.search(arr, 500)); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
	
	@Test  // Provides metadata for the Java element that follows.
	public void testSearchLastItem() { // Defines the method that performs this unit of work for the class.
		int arr[] = { 10, 20, 30, 40, 50 }; // Executes the current statement to update state or trigger the required behavior.
		assertTrue(BinarySearch.search(arr, 50)); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
	
	@Test  // Provides metadata for the Java element that follows.
	public void testSearchFirstItem() { // Defines the method that performs this unit of work for the class.
		int arr[] = { 10, 20, 30, 40, 50 }; // Executes the current statement to update state or trigger the required behavior.
		assertTrue(BinarySearch.search(arr, 10)); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
	
	@Test(expected=IllegalArgumentException.class) // Provides metadata for the Java element that follows.
	public void testSearchWhenInputIsNull() { // Defines the method that performs this unit of work for the class.
		int arr[] = null; // Executes the current statement to update state or trigger the required behavior.
		assertFalse(BinarySearch.search(arr, 50)); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
	
} // Closes the current block and ends the active scope.
