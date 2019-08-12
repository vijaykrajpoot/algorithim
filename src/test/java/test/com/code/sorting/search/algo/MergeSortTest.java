package test.com.code.sorting.search.algo;

import org.junit.Assert;
import org.junit.Test;

import com.algo.sorting.search.MergeSort;

public class MergeSortTest {

	private MergeSort mergeSort = new MergeSort();

	@Test
	public void testMergesortWithValidArray() {
		int unsortedArray[] = { 3, 8, 1, 44, -232, 6, 7, 9, 67, -89, 32, -1, 2 };
		int sortedResultArray[] = mergeSort.mergeS(unsortedArray);
		int sortedArray[] = { -232, -89, -1, 1, 2, 3, 6, 7, 8, 9, 32, 44, 67 };
		Assert.assertArrayEquals(sortedResultArray, sortedArray);
	}

	@Test
	public void testMergesortWith2Element() {
		int unsortedArray[] = { 3, 8 };
		int sortedResultArray[] = mergeSort.mergeS(unsortedArray);
		int sortedArray[] = { 3, 8 };
		Assert.assertArrayEquals(sortedResultArray, sortedArray);
	}

	@Test
	public void testMergesortWith1Element() {
		int unsortedArray[] = { 3 };
		int sortedResultArray[] = mergeSort.mergeS(unsortedArray);
		int sortedArray[] = { 3 };
		Assert.assertArrayEquals(sortedResultArray, sortedArray);
	}

	@Test
	public void testMergesortWithZeroElement() {
		int unsortedArray[] = {};
		int sortedResultArray[] = mergeSort.mergeS(unsortedArray);
		int sortedArray[] = {};
		Assert.assertArrayEquals(sortedResultArray, sortedArray);
	}

	@Test
	public void testMergesortWithSameElement() {
		int unsortedArray[] = { 1, 1, 1, 1, 1, 1, 1, 1 };
		int sortedResultArray[] = mergeSort.mergeS(unsortedArray);
		int sortedArray[] = { 1, 1, 1, 1, 1, 1, 1, 1 };
		Assert.assertArrayEquals(sortedResultArray, sortedArray);
	}

	@Test
	public void testMergesortWithPyramidElements() {
		int unsortedArray[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10 };
		int sortedResultArray[] = mergeSort.mergeS(unsortedArray);
		int sortedArray[] = { -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Assert.assertArrayEquals(sortedResultArray, sortedArray);
	}

	@Test
	public void testMergesortWithReverseElements() {
		int unsortedArray[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int sortedResultArray[] = mergeSort.mergeS(unsortedArray);
		int sortedArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Assert.assertArrayEquals(sortedResultArray, sortedArray);
	}

	@Test
	public void testMergesortWithDulicatesElements() {
		int unsortedArray[] = { 10, 11, 24, -1, 9, 9, 10, -35, 28 };
		int sortedResultArray[] = mergeSort.mergeS(unsortedArray);
		int sortedArray[] = { -35, -1, 9, 9, 10, 10, 11, 24, 28 };
		Assert.assertArrayEquals(sortedResultArray, sortedArray);
	}

	@Test
	public void testMergesortAlreadyMergedElements() {
		int unsortedArray[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int sortedResultArray[] = mergeSort.mergeS(unsortedArray);
		int sortedArray[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100  };
		Assert.assertArrayEquals(sortedResultArray, sortedArray);
	}

}
