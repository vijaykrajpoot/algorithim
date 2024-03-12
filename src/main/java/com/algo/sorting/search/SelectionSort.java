package com.algo.sorting.search;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {50, 10, 80, 90, -10, 70, 10, 20, 30};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIdx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
	}
}
