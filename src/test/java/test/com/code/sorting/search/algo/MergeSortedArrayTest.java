package test.com.code.sorting.search.algo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.code.sorting.search.algo.MergeSortedArray;

public class MergeSortedArrayTest {

	@Test
	public void testMergeArrays() {
		int testArray1[] = { 10, 30, 50, 70 };
		int testArray2[] = { 20, 40, 60, 80, 100, 110, 120 };
		int expectedArrray[] = { 10, 20, 30, 40, 50, 60, 70, 80, 100, 110, 120 };
		int mergedArray[] = MergeSortedArray.mergeArrays(testArray1, testArray2);
		assertArrayEquals(expectedArrray, mergedArray);
	}

	@Test
	public void testMergeEvenArrays() {
		int testArray1[] = { 10, 30, 50, 70 };
		int testArray2[] = { 20, 40, 60, 80 };
		int expectedArrray[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int mergedArray[] = MergeSortedArray.mergeArrays(testArray1, testArray2);
		assertArrayEquals(expectedArrray, mergedArray);
	}

	@Test
	public void testMergeSortedWheenDuplicateItems() {
		int testArray1[] = { 10, 20, 30, 40 };
		int testArray2[] = { 10, 20, 30, 40 };
		int expectedArrray[] = { 10, 10, 20, 20, 30, 30, 40, 40 };
		int mergedArray[] = MergeSortedArray.mergeArrays(testArray1, testArray2);
		assertArrayEquals(expectedArrray, mergedArray);
	}

	@Test
	public void testMergeSortedWheenNegativeItems() {
		int testArray1[] = { -30, -10, 20, 40 };
		int testArray2[] = { -40, -30, 10, 30 };
		int expectedArrray[] = { -40, -30, -30, -10, 10, 20, 30, 40 };
		int mergedArray[] = MergeSortedArray.mergeArrays(testArray1, testArray2);
		assertArrayEquals(expectedArrray, mergedArray);
	}
}
