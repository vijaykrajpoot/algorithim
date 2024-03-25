package com.algo.sorting.search;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		InsertionSort insertionSort = new InsertionSort();

		int[] sortedArr = insertionSort.insertionSort(arr);
		System.out.println(Arrays.toString(sortedArr));
		sortedArr = insertionSort.iSort(arr);
		System.out.println(Arrays.toString(sortedArr));
	}

	int[] insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int next = i - 1;
			while (next >= 0 && arr[next] > temp) {
				arr[next + 1] = arr[next];
				next--;
			}
			arr[next + 1] = temp;
		}
		return arr;
	}

	int [] iSort (int [] arr){
		for(int i =0;i<arr.length-1;i++){
			for(int j=i+1; j<=arr.length-1; j++){
				if(arr[i]>arr[j]){
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		return arr;
	}


}
