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

    System.out.println("Anagram.isAnagram:" + Anagram.isAnagram("Dormitory", "Dirtyroom"));

  }

  public static boolean isAnagram(String str1, String str2) {
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);
    
    // System.out.println("Arrays.toString(charArray1):"+Arrays.toString(charArray1));

    // System.out.println("Arrays.toString(charArray2):"+Arrays.toString(charArray2));
    
    if (Arrays.toString(charArray1).equals(Arrays.toString(charArray2)))
      return true;
    else
      return false;
  }



}
