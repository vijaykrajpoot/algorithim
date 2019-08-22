package com.algo.string.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Permutation {

  static Set<String> setStr = new HashSet<>();

  // Function to print all the permutations of str
  static void printPermutn(char str[], int count[], char result[], int level) {

    if (level == result.length) {
      if (!setStr.add(Arrays.toString(result))) {
        print(result);
      }
      print(result);
      return;
    }
    for (int i = 0; i < str.length; i++) {
      if (count[i] == 0) {
        continue;
      }
      result[level] = str[i];
      count[i]--;
      printPermutn(str, count, result, level + 1);
      count[i]++;
    }
  }

  static void print(char arr[]) {


    for (char ch : arr) {
      System.out.print(ch);
    }
    System.out.println();

  }

  // Driver code
  public static void main(String[] args) {
    String s = "ABC";

    Map<Character, Integer> hashMap = new LinkedHashMap<>();

    for (char ch : s.toCharArray()) {
      if (hashMap.containsKey(ch)) {
        hashMap.put(ch, hashMap.get(ch) + 1);
      } else {
        hashMap.put(ch, 1);
      }
    }

    char chaa[] = new char[hashMap.size()];
    int count[] = new int[hashMap.size()];

    int i = 0;
    for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
      chaa[i] = entry.getKey();
      count[i] = entry.getValue();
      i++;
    }

    char[] result = new char[s.length()];
    printPermutn(chaa, count, result, 0);

    System.out.println("setStr.size():" + setStr.size());
  }

}
