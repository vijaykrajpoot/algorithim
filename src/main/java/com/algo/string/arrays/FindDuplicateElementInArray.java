package com.algo.string.arrays;

/**
 * Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear
 * time using less than O(n) space and traversing the stream sequentially O(1) times.
 *
 * @author Vijay Kumar Rajput
 */


public class FindDuplicateElementInArray {

	public static void main(String[] args) {

		int arr[] = {3, 4, 1, 20, 14};
		FindDuplicateElementInArray.findDuplicate(arr);

	}

	static void findDuplicate(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int index = (arr[i] % n) - 1; // Calculate index properly
			if (arr[index] >= n) {
				System.out.println("Duplicate element found: " + (index + 1));
			} else {
				arr[index] += n; // Mark the element as visited
			}
		}
	}

}


