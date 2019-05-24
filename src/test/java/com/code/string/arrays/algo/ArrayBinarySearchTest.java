package com.code.string.arrays.algo;

import static org.junit.Assert.*;

import java.util.stream.IntStream;

import org.junit.Test;

import com.code.string.arrays.algo.ArrayBinarySearch;

public class ArrayBinarySearchTest {

	@Test
	public void testSearch() {
		assertEquals(6,ArrayBinarySearch.search(IntStream.range(1, 10).toArray(),7));
	}
	
	@Test
	public void testSearchWith1Element() {
		assertEquals(-1,ArrayBinarySearch.search(IntStream.range(1, 2).toArray(),7));
	}
	
	@Test
	public void trueWhenSingleItem() {
		assertEquals(0,ArrayBinarySearch.search(IntStream.range(1, 2).toArray(),1));
	}

}
