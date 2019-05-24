package com.algo.sorting.search;

public class MergeSortedArray {

	public static int[] mergeArrays(int arr1[], int[] arr2) {

		// create a empty array of length of arr1+arr2
		int arr[] = new int[arr1.length + arr2.length];
		int idx = 0, idx1 = 0, idx2 = 0;
		
		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] <= arr2[idx2]) {
				arr[idx++] = arr1[idx1++];
			} else {
				arr[idx++] = arr2[idx2++];
			}
		}
		// Collect rest of the items from arr1
		while (idx1 < arr1.length) {
			arr[idx++] = arr1[idx1++];
		}
		
		// Collect rest of the items from arr2
		while (idx2 < arr2.length) {
			arr[idx++] = arr2[idx2++];
		}

		return arr;
	}

}