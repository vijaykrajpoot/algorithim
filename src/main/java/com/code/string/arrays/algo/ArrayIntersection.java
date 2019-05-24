package com.code.string.arrays.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIntersection {

	static int[] findIntersection(int arr1[], int arr2[]) {
		int[] result = null;

		if (arr1 == null || arr2 == null) {
			throw new IllegalArgumentException("Invalid Input");
		}

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		List<Integer> arrList = new ArrayList<Integer>();
		for (int i = 0; i < arr1.length; i++) {

			if (Arrays.binarySearch(arr2, arr1[i]) > -1) {
				arrList.add(arr1[i]);
			}

		}

		int idx = 0;
		result = new int[arrList.size()];
		for (int i : arrList) {
			result[idx++] = i;
		}
		return result;
	}

	public static void main(String[] args) {
		int arr1[] = {4};
		int arr2[] = { 2, 2, 2, 1 };
		int arr[] = findIntersection(arr1, arr2);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}