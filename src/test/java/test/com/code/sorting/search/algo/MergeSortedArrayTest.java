package test.com.code.sorting.search.algo; // Declares the package so the class is organized under the correct Java namespace.

import static org.junit.Assert.assertArrayEquals; // Imports the classes needed to support this file's logic.

import org.junit.Test; // Imports the classes needed to support this file's logic.

import com.algo.sorting.search.MergeSortedArray; // Imports the classes needed to support this file's logic.

public class MergeSortedArrayTest { // Defines the Java type that contains the related data and behavior.

	@Test // Provides metadata for the Java element that follows.
	public void testMergeArrays() { // Defines the method that performs this unit of work for the class.
		int testArray1[] = { 10, 30, 50, 70 }; // Executes the current statement to update state or trigger the required behavior.
		int testArray2[] = { 20, 40, 60, 80, 100, 110, 120 }; // Executes the current statement to update state or trigger the required behavior.
		int expectedArrray[] = { 10, 20, 30, 40, 50, 60, 70, 80, 100, 110, 120 }; // Executes the current statement to update state or trigger the required behavior.
		int mergedArray[] = MergeSortedArray.mergeArrays(testArray1, testArray2); // Executes the current statement to update state or trigger the required behavior.
		assertArrayEquals(expectedArrray, mergedArray); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void testMergeEvenArrays() { // Defines the method that performs this unit of work for the class.
		int testArray1[] = { 10, 30, 50, 70 }; // Executes the current statement to update state or trigger the required behavior.
		int testArray2[] = { 20, 40, 60, 80 }; // Executes the current statement to update state or trigger the required behavior.
		int expectedArrray[] = { 10, 20, 30, 40, 50, 60, 70, 80 }; // Executes the current statement to update state or trigger the required behavior.
		int mergedArray[] = MergeSortedArray.mergeArrays(testArray1, testArray2); // Executes the current statement to update state or trigger the required behavior.
		assertArrayEquals(expectedArrray, mergedArray); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void testMergeSortedWheenDuplicateItems() { // Defines the method that performs this unit of work for the class.
		int testArray1[] = { 10, 20, 30, 40 }; // Executes the current statement to update state or trigger the required behavior.
		int testArray2[] = { 10, 20, 30, 40 }; // Executes the current statement to update state or trigger the required behavior.
		int expectedArrray[] = { 10, 10, 20, 20, 30, 30, 40, 40 }; // Executes the current statement to update state or trigger the required behavior.
		int mergedArray[] = MergeSortedArray.mergeArrays(testArray1, testArray2); // Executes the current statement to update state or trigger the required behavior.
		assertArrayEquals(expectedArrray, mergedArray); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void testMergeSortedWheenNegativeItems() { // Defines the method that performs this unit of work for the class.
		int testArray1[] = { -30, -10, 20, 40 }; // Executes the current statement to update state or trigger the required behavior.
		int testArray2[] = { -40, -30, 10, 30 }; // Executes the current statement to update state or trigger the required behavior.
		int expectedArrray[] = { -40, -30, -30, -10, 10, 20, 30, 40 }; // Executes the current statement to update state or trigger the required behavior.
		int mergedArray[] = MergeSortedArray.mergeArrays(testArray1, testArray2); // Executes the current statement to update state or trigger the required behavior.
		assertArrayEquals(expectedArrray, mergedArray); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
