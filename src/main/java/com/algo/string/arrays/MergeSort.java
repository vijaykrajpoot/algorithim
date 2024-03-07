package com.algo.string.arrays;

public class MergeSort {

  public MergeSort() {
    // TODO Auto-generated constructor stub
  }

  public static void p(int result[]) {


    System.out.println();
    for (int j = 0; j < result.length; j++) {
      System.out.print(result[j] + " , ");
    }
    System.out.println();
  }

  public static void main(String[] args) {

    MergeSort mergeSort = new MergeSort();
    int arr[] = {1, 9, 8, 7, 6,5,2};
    p(arr);
    arr = mergeSort.mergeS(arr);
    p(arr);

  }

  int[] mergeS(int arr[]) {
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
      return merge(arr1, arr2);
    }

  }

  int[] merge(int arr1[], int arr2[]) {
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
