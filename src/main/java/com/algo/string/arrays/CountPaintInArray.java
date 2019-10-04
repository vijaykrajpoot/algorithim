package com.algo.string.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountPaintInArray {

  public static void main(String[] args) {
    int arr[] = {1, 1, 3, 1, 1};
    int noOfPairs = CountPaintInArray.countPair(arr);
    System.out.println("noOfPairs:" + noOfPairs);

  }

  public static int countPair(int arr[]) {
    int noOfPairs = 0;
    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

    for (int element : arr) {
      if (hashMap.get(element) != null) {
        hashMap.put(element, hashMap.get(element) + 1);
      } else {
        hashMap.put(element, 1);
      }
    }

    System.out.println(hashMap);

    for (Map.Entry<Integer, Integer> it : hashMap.entrySet()) {
      int count = it.getValue();
      noOfPairs += (count * (count - 1)) / 2;
    }
    return noOfPairs;
  }

}
