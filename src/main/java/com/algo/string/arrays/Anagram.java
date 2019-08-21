package com.algo.string.arrays;

import java.util.Arrays;

/**
 * Write a method to decide if two strings are anagrams or not.
 * 
 * @author Vijay Kumar Rajput
 *
 */

public class Anagram {

  public static void main(String[] args) {
    System.out.flush();
    // System.out.println(Anagram.isAnagram("Dormito ry", "Dirty room"));


    Anagram.isAnagram1("Dormito ry", "Dirty room");

    Anagram.isAnagram1("ac", "bb");

    // for (int i = 0; i < str.length(); i++) {
    // System.err.println(((int)str.charAt(i)));
    // System.out.flush();
    // }


  }

  /**
   * 
   * Sort the strings and compare it. This will work as long as string length is equal.
   * 
   * @param str1
   * @param str2
   * @return
   */
  public static boolean isAnagram(String str1, String str2) {
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    // System.out.println("Arrays.toString(charArray1):" + Arrays.toString(charArray1));
    // System.out.println("Arrays.toString(charArray2):" + Arrays.toString(charArray2));

    if (Arrays.toString(charArray1).equals(Arrays.toString(charArray2)))
      return true;
    else
      return false;
  }

  /**
   * Wrong Implementations: Faild for ==>  str1=aa;str2=bc
   * @param str1
   * @param str2
   */
  public static void isAnagram1(String str1, String str2) {
    int sum1 = 0, sum2 = 0;
    for (int i = 0; i < str1.length(); i++) {
      sum1 += str1.charAt(i);
    }
    System.out.println(sum1);
    for (int i = 0; i < str2.length(); i++) {
      sum2 += str2.charAt(i);
    }
    System.out.println(sum2);

  }


}
