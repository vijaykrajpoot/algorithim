package com.algo.string.arrays;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you can not
 * use additional data structures?
 * 
 * @author Vijay K Rajput
 *
 */
public class UniqueCharacater {

  public static void main(String[] args) {
    System.out
        .println("Contains Unique Chracters: " + new UniqueCharacater().containsUniqueChracter("WADI"));
  }

  public boolean containsUniqueChracter(String str) {
    char arr[] = str.toCharArray();
    char soretedArr[] = sortArray(arr);
    // System.out.println("==>ARR:" + Arrays.toString(soretedArr));
    // System.out.println("==>ARR.Length:" + soretedArr.length);

    int i = 0, j = 0;
    for (i = 0; i < soretedArr.length; i++) {
      j = i + 1;
      if (j < soretedArr.length && (soretedArr[i] == soretedArr[j])) {
        System.out.println("Matchd[" + soretedArr[i] + "]");
        return false;
      }
    }

    return true;
  }

  char[] sortArray(char arr[]) {
    return mergeS(arr);
  }

  // Merge Sort. Dividing the elements in sub arrays and sending them for sort.

  char[] mergeS(char arr[]) {

    if (arr.length <= 1) {
      return arr;
    }
    int mid = arr.length / 2;
    int remLen = arr.length - mid;
    char arr1[] = new char[mid];
    char arr2[] = new char[remLen];
    System.arraycopy(arr, 0, arr1, 0, mid);
    System.arraycopy(arr, mid, arr2, 0, remLen);
    arr1 = mergeS(arr1);
    arr2 = mergeS(arr2);
    return mergeArray(arr1, arr2);
  }

  // Sort the arrays
  char[] mergeArray(char[] arr1, char[] arr2) {

    int idx1 = 0;
    int idx2 = 0;
    int idx = 0;

    int len1 = arr1.length;
    int len2 = arr2.length;
    char arr[] = new char[len1 + len2];

    while (idx1 < len1 && idx2 < len2) {
      if ((int) arr1[idx1] < (int) arr2[idx2]) {
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

    return arr;
  }
}
