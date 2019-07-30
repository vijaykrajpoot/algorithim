package com.algo.string.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindAFirstRecurringChracater {

  public static void main(String[] args) {

    System.out.println("First Recurring Chracter: " + FindAFirstRecurringChracater.solutuon1("VIJAYKRAJPOOT"));
    System.out.println("First Recurring Chracter: " + FindAFirstRecurringChracater.solutuon2("VIJAYKRAJPOOT"));


    System.out.println("First Recurring Chracter: " + FindAFirstRecurringChracater.solutuon1("QWERTYUIOP"));
    System.out.println("First Recurring Chracter: " + FindAFirstRecurringChracater.solutuon2("QWERTYUIOP"));

  }

  /**
   * Count using HashMap
   * 
   * @param str
   * @return
   */
  public static char solutuon1(String str) {

    Map<String, Integer> map = new HashMap<String, Integer>();
    char[] chArr = str.toCharArray();
    for (char ch : chArr) {
      if (map.get(String.valueOf(ch)) != null) {
        return ch;
      } else {
        map.put(String.valueOf(ch), 1);
      }
    }

    return '\u0000';
  }

  public static char solutuon2(String str) {
    HashSet<Character> charactersSet = new HashSet<>();
    char[] chArr = str.toCharArray();
    char chFound = '\u0000';
    for (char ch : chArr) {
      boolean isAdded = charactersSet.add(ch);
      if (!isAdded)
        return ch;;
    }

    return chFound;
  }
}
