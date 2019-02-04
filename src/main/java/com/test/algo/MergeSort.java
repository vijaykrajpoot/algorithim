package com.test.algo;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		MergeSort mergeSort = new MergeSort();

		int arr[] = { 3, 8, 1, 44, -232, 6, 7, 9, 67, -89, 32, -1, 2 };
		System.out.println(Arrays.toString(mergeSort.mergesort(arr)));
	}

	public int[] mergesort(int arr[]) {

		if (arr.length <= 1) {
			return arr;
		}

		int arrLength = arr.length;
		int mid = arrLength / 2;
		int remLenth = arrLength - mid;

		int arr1[] = new int[mid];
		int arr2[] = new int[remLenth];
		System.arraycopy(arr, 0, arr1, 0, mid);
//		System.arraycopy(arr, mid, arr2, 0, remLenth);
//		System.out.println("Arr1:" + Arrays.toString(arr1));
//		System.out.println("Arr2:" + Arrays.toString(arr2));
		arr1 = mergesort(arr1);
		arr2 = mergesort(arr2);

		return merge(arr1, arr2);
	}

	private int[] merge(int[] arr1, int[] arr2) {
//		System.out.println("MArr1:" + Arrays.toString(arr1));
//		System.out.println("MArr2:" + Arrays.toString(arr2));
		int len1 = arr1.length;
		int len2 = arr2.length;
		int idx = 0, idx1 = 0, idx2 = 0;
		int arr[] = new int[len1 + len2];

		while (idx1 < len1 && idx2 < len2) {
			if (arr1[idx1] < arr2[idx2]) {
				arr[idx++] = arr1[idx1++];
			} else {
				arr[idx++] = arr2[idx2++];
			}
		}

		while (idx1 < len1) {
			arr[idx++] = arr1[idx1++];
		}
		while (idx2 < len2) {
			arr[idx++] = arr2[idx2++];
		}
//		System.out.println("==>ARR:" + Arrays.toString(arr));
		return arr;
	}

}
