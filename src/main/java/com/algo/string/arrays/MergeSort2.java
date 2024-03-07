package com.algo.string.arrays;

public class MergeSort2 {


  public static void main(String[] args) {
    int arr[] = {50, 30, 10, 80, 40,-1 , 90,-200};

    MergeSort mergeSort = new MergeSort();
    int[] m = mergeSort.mergeS(arr);

    for (int i = 0; i < m.length; i++) {
      System.out.print(m[i] + ",");
    }

  }

  int[] mergeS(int arr[]) {

    int len = arr.length;
    if (len <= 1) {
      return arr;

    } else {



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

    int len1 = arr1.length;
    int len2 = arr2.length;

    int arr[] = new int[len1 + len2];

    int idx1 = 0, idx2 = 0, idx = 0;

    while (idx1 < len1 && idx2 < len2) {



      if (arr1[idx1] < arr2[idx2]) {
        arr[idx++] = arr1[idx1++];
      } else {
        arr[idx++] = arr2[idx2++];
      }

      while (idx1 < len1) {
        arr[idx++] = arr1[idx1++];
      }

      while (idx2 < len2) {
        arr[idx++] = arr2[idx2++];
      }

    }
    return arr;

  }
}
