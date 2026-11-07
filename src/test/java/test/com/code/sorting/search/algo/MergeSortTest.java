package test.com.code.sorting.search.algo; // Declares the package so the class is organized under the correct Java namespace.

import org.junit.Assert; // Imports the classes needed to support this file's logic.
import org.junit.Test; // Imports the classes needed to support this file's logic.

import com.algo.sorting.search.MergeSort; // Imports the classes needed to support this file's logic.

public class MergeSortTest { // Defines the Java type that contains the related data and behavior.

	private MergeSort mergeSort = new MergeSort(); // Stores the computed or supplied value in a variable for later use.

	@Test // Provides metadata for the Java element that follows.
	public void testMergesortWithValidArray() { // Defines the method that performs this unit of work for the class.
		int unsortedArray[] = { 3, 8, 1, 44, -232, 6, 7, 9, 67, -89, 32, -1, 2 }; // Executes the current statement to update state or trigger the required behavior.
		int sortedResultArray[] = mergeSort.mergeS(unsortedArray); // Executes the current statement to update state or trigger the required behavior.
		int sortedArray[] = { -232, -89, -1, 1, 2, 3, 6, 7, 8, 9, 32, 44, 67 }; // Executes the current statement to update state or trigger the required behavior.
		Assert.assertArrayEquals(sortedResultArray, sortedArray); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void testMergesortWith2Element() { // Defines the method that performs this unit of work for the class.
		int unsortedArray[] = { 3, 8 }; // Executes the current statement to update state or trigger the required behavior.
		int sortedResultArray[] = mergeSort.mergeS(unsortedArray); // Executes the current statement to update state or trigger the required behavior.
		int sortedArray[] = { 3, 8 }; // Executes the current statement to update state or trigger the required behavior.
		Assert.assertArrayEquals(sortedResultArray, sortedArray); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void testMergesortWith1Element() { // Defines the method that performs this unit of work for the class.
		int unsortedArray[] = { 3 }; // Executes the current statement to update state or trigger the required behavior.
		int sortedResultArray[] = mergeSort.mergeS(unsortedArray); // Executes the current statement to update state or trigger the required behavior.
		int sortedArray[] = { 3 }; // Executes the current statement to update state or trigger the required behavior.
		Assert.assertArrayEquals(sortedResultArray, sortedArray); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void testMergesortWithZeroElement() { // Defines the method that performs this unit of work for the class.
		int unsortedArray[] = {}; // Executes the current statement to update state or trigger the required behavior.
		int sortedResultArray[] = mergeSort.mergeS(unsortedArray); // Executes the current statement to update state or trigger the required behavior.
		int sortedArray[] = {}; // Executes the current statement to update state or trigger the required behavior.
		Assert.assertArrayEquals(sortedResultArray, sortedArray); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void testMergesortWithSameElement() { // Defines the method that performs this unit of work for the class.
		int unsortedArray[] = { 1, 1, 1, 1, 1, 1, 1, 1 }; // Executes the current statement to update state or trigger the required behavior.
		int sortedResultArray[] = mergeSort.mergeS(unsortedArray); // Executes the current statement to update state or trigger the required behavior.
		int sortedArray[] = { 1, 1, 1, 1, 1, 1, 1, 1 }; // Executes the current statement to update state or trigger the required behavior.
		Assert.assertArrayEquals(sortedResultArray, sortedArray); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void testMergesortWithPyramidElements() { // Defines the method that performs this unit of work for the class.
		int unsortedArray[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10 }; // Executes the current statement to update state or trigger the required behavior.
		int sortedResultArray[] = mergeSort.mergeS(unsortedArray); // Executes the current statement to update state or trigger the required behavior.
		int sortedArray[] = { -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Executes the current statement to update state or trigger the required behavior.
		Assert.assertArrayEquals(sortedResultArray, sortedArray); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void testMergesortWithReverseElements() { // Defines the method that performs this unit of work for the class.
		int unsortedArray[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }; // Executes the current statement to update state or trigger the required behavior.
		int sortedResultArray[] = mergeSort.mergeS(unsortedArray); // Executes the current statement to update state or trigger the required behavior.
		int sortedArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Executes the current statement to update state or trigger the required behavior.
		Assert.assertArrayEquals(sortedResultArray, sortedArray); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void testMergesortWithDulicatesElements() { // Defines the method that performs this unit of work for the class.
		int unsortedArray[] = { 10, 11, 24, -1, 9, 9, 10, -35, 28 }; // Executes the current statement to update state or trigger the required behavior.
		int sortedResultArray[] = mergeSort.mergeS(unsortedArray); // Executes the current statement to update state or trigger the required behavior.
		int sortedArray[] = { -35, -1, 9, 9, 10, 10, 11, 24, 28 }; // Executes the current statement to update state or trigger the required behavior.
		Assert.assertArrayEquals(sortedResultArray, sortedArray); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void testMergesortAlreadyMergedElements() { // Defines the method that performs this unit of work for the class.
		int unsortedArray[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 }; // Executes the current statement to update state or trigger the required behavior.
		int sortedResultArray[] = mergeSort.mergeS(unsortedArray); // Executes the current statement to update state or trigger the required behavior.
		int sortedArray[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100  }; // Executes the current statement to update state or trigger the required behavior.
		Assert.assertArrayEquals(sortedResultArray, sortedArray); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
