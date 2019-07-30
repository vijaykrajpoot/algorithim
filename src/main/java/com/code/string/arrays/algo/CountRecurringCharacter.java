package com.code.string.arrays.algo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountRecurringCharacter {

  public static void main(String[] args) {

    CountRecurringCharacter.solutuon1("VIJAYKRAJPOOT").entrySet().forEach(entry -> {
      System.out.println(entry.getKey() + "-" + entry.getValue());
    });

    System.out.println("##############");

    CountRecurringCharacter.solutuon2("VIJAYKRAJPOOT").entrySet().forEach(entry -> {
      System.out.println(entry.getKey() + "-" + entry.getValue());
    });

  }

  /**
   * Count using HashMap
   * 
   * @param str
   * @return
   */
  public static Map<String, Integer> solutuon1(String str) {

    Map<String, Integer> map = new HashMap<String, Integer>();
    char[] chArr = str.toCharArray();
    for (char ch : chArr) {
      if (map.get(String.valueOf(ch)) != null) {
        map.put(String.valueOf(ch), map.get(String.valueOf(ch)) + 1);
      } else {
        map.put(String.valueOf(ch), 1);
      }
    }

    return map;
  }

  public static Map<String, Integer> solutuon2(String str) {

    Map<String, Integer> map = new HashMap<String, Integer>();
    char[] chArr = str.toCharArray();
    int count = 0;
    Arrays.sort(chArr);
    char prevCh = chArr[0];
    for (char ch : chArr) {
      if (ch == prevCh) {
        count++;
        if (map.get(String.valueOf(ch)) != null) {
          map.put(String.valueOf(ch), map.get(String.valueOf(ch)) + 1);
        } else {
          map.put(String.valueOf(ch), 1);
        }
        continue;
      } else {
        map.put(String.valueOf(ch), 1);
        count = 0;
        prevCh = ch;
      }
    }

    return map;
  }

}
