package com.algo.string.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindAFirstRecurringChracater {

  public static void main(String[] args) {
    System.out.println("First Recurring Chracter (solutuon1) - LALALAND: " + FindAFirstRecurringChracater.solutuon1("LALALAND"));
    System.out.println("First Recurring Chracter (solutuon2) - VIJAYKRAJPOOT: " + FindAFirstRecurringChracater.solutuon2("VIJAYKRAJPOOT"));
    System.out.println("First Recurring Chracter(solutuon1) - QWERTYUIOP : " + FindAFirstRecurringChracater.solutuon1("QWERTYUIOP"));
    System.out.println("First Recurring Chracter(solutuon2) - QWERTYUIOP : " + FindAFirstRecurringChracater.solutuon2("QWERTYUIOP"));
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


  /**
   * Using SET
   * 
   * @param str
   * @return
   */
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



  public static char solutuon3(String str) {

    boolean chArr[] = new boolean[256];

    for (int ch : str.toCharArray()) {
      if (!chArr[ch]) {
        chArr[ch] = true;
      } else {
        return (char) ch;
      }
    }
    return '\u0000';
  }

}
