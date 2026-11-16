package com.algo.string.arrays;


// Logic: swaps values from the ends toward the center until the full sequence is inverted.
public class ReverseAnArray {

	public static int[] reverseArray(int arr[]) {
		if (arr==null){
			throw new IllegalArgumentException("Emopty or Null Array");
		}
		for (int index = 0; index <= arr.length / 2 - 1; index++) {
			int temp = arr[index];
			arr[index] = arr[arr.length - index - 1];
			arr[arr.length - index - 1] = temp;
		}
		return arr;
	}
}
