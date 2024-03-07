package com.algo.string.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountPaintInArray {

  public static void main(String[] args) {
    int arr[] = {1, 1, 3, 1, 1, 0, 3, 4, 4, 4, 3, 1, 5, 6, 7, 2, 6, 8, 9, 1, 7};
    int noOfPairs = CountPaintInArray.countPair(arr);
    System.out.println("noOfPairs:" + noOfPairs);
  }

  public static int countPair(int arr[]) {
    int noOfPairs = 0;
    int noOfPairsOfEachElement = 0;

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
      // Formula based of Pattern
      noOfPairsOfEachElement = (count * (count - 1)) / 2;
      System.out.println("Nnumber Of Pairs of " + it.getKey() + " : " + noOfPairsOfEachElement);
      noOfPairs += noOfPairsOfEachElement;
    }
    return noOfPairs;
  }

}
