package com.algo.sorting.search;
import java.util.Arrays;
// Logic: Reorders the collection so elements appear in the required priority or ascending order.


public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {-2,9, 8,10, 7, 6, 5,0, 4,-1, 3, 2, 1};
		InsertionSort insertionSort = new InsertionSort();
		int[] sortedArr = insertionSort.insertionSort(arr);
		System.out.println(Arrays.toString(sortedArr));
	}
	int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int selected = arr[i];
			int prev = i - 1;
			while (prev >= 0 && arr[prev] > selected) {
				arr[prev + 1] = arr[prev];
				prev--;
			}
			arr[prev + 1] = selected;
		}
		return arr;
	}
}