package com.algo.sorting.search;
import java.util.Arrays;
public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {-2,9, 8,10, 7, 6, 5,0, 4,-1, 3, 2, 1};
		InsertionSort insertionSort = new InsertionSort();
		int[] sortedArr = insertionSort.insertionSort(arr);
		System.out.println(Arrays.toString(sortedArr));
	}
	int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int selected = arr[i];      // Current element to insert
			int prev = i - 1;           // Start comparing with the previous element
			// Shift elements > selected to the right
			while (prev >= 0 && arr[prev] > selected) { // Keeps executing this block until the loop condition becomes false.
				arr[prev + 1] = arr[prev];  // Move larger elements forward
				prev--;                     // Move left in the sorted subarray
			}
			arr[prev + 1] = selected;  // Insert selected in its correct position
		}
		return arr;
	}
}