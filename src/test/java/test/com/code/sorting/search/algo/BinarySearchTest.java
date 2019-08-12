package test.com.code.sorting.search.algo;

import org.junit.Test;

import com.algo.string.arrays.BinarySearch;

import static org.junit.Assert.*;

public class BinarySearchTest {
	@Test(expected=IllegalArgumentException.class)
	public void testEmptyArray() {
		int arr[] = {};
		assertFalse(BinarySearch.search(arr, 100));
	}

	@Test
	public void testSearchValidItemArray() {
		int arr[] = { 10, 20, 30, 40, 50 };
		assertTrue(BinarySearch.search(arr, 20));
	}

	@Test 
	public void testItemNotFoundArray() {
		int arr[] = { 10, 20, 30, 40, 50 };
		assertFalse(BinarySearch.search(arr, 500));
	}
	
	@Test 
	public void testSearchLastItem() {
		int arr[] = { 10, 20, 30, 40, 50 };
		assertTrue(BinarySearch.search(arr, 50));
	}
	
	@Test 
	public void testSearchFirstItem() {
		int arr[] = { 10, 20, 30, 40, 50 };
		assertTrue(BinarySearch.search(arr, 10));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSearchWhenInputIsNull() {
		int arr[] = null;
		assertFalse(BinarySearch.search(arr, 50));
	}
	
}
