package com.algo.sorting.search;

import java.util.Arrays;

public class MergeSort {

	public MergeSort() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		int arr[] = {3, 2, 1, 44, -232, 6, 7, 9, 67, -89, 32, -1, 12};
		System.out.println(Arrays.toString(arr));
		arr = mergeSort.mergeS(arr);
		System.out.println(Arrays.toString(arr));

	}

	public int[] mergeS(int arr[]) {
		System.out.println("Incoming Array:" + Arrays.toString(arr));
		int len = arr.length;
		if (len <= 1)
			return arr;
		else {
			int mid = len / 2;
			int remLen = len - mid;
			int arr1[] = new int[mid];
			int arr2[] = new int[remLen];
			System.arraycopy(arr, 0, arr1, 0, mid);
			System.arraycopy(arr, mid, arr2, 0, remLen);
			arr1 = mergeS(arr1);
			arr2 = mergeS(arr2);

			int[] mArray = merge(arr1, arr2);
			System.out.println("mArray:" + Arrays.toString(mArray));
			return mArray;
		}

	}

	private int[] merge(int arr1[], int arr2[]) {
		int l1 = arr1.length;
		int l2 = arr2.length;
		int idx = 0, idx1 = 0, idx2 = 0;
		int arr[] = new int[l1 + l2];
		while (idx1 < l1 && idx2 < l2) {
			if (arr1[idx1] < arr2[idx2])
				arr[idx++] = arr1[idx1++];
			else
				arr[idx++] = arr2[idx2++];
		}

		while (idx2 < l2) {
			arr[idx++] = arr2[idx2++];
		}

		while (idx1 < l1) {
			arr[idx++] = arr1[idx1++];
		}


		return arr;
	}
}
