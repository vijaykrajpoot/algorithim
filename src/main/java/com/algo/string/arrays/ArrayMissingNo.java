package com.algo.string.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMissingNo {
  public static void main(String[] args) {
    int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
    List<Integer> ll = ArrayMissingNo.getMissingNo(arr);
    if (ll.size() <= 0) {
      System.out.println("No Missing");
    } else {
      System.out.println("Missing Nos:" + Arrays.toString(ll.toArray()));
    }
  }

  public static List<Integer> getMissingNo(int arr[]) {
    System.out.println("arr.length:"+arr.length);
    List<Integer> retList = new ArrayList<Integer>(arr.length);

    for (int i = 0; i < arr.length; i++) {
      int index = Math.abs(arr[i]) - 1;
      System.out.println("Index:" + index);
      if (arr[index] > 0) {
        arr[index] = -arr[index];
      }
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        retList.add(i + 1);
      }
    }

    return retList;

  }
}
