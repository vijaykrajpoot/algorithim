package com.algo.string.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Write a method to decide if two strings are anagrams or not.
 * 
 * @author Vijay Kumar Rajput
 *
 */

public class Anagram {

  public static void main(String[] args) {


    System.out.println("Anagram.isAnagram1(Dormito ry, Dirty room):" + Anagram.isAnagram("parliament", "partialmen"));
    System.out.println("Anagram.isAnagramSol2(ac, bb):" + Anagram.isAnagramSol2("ac", "bb"));
    System.out.println("Anagram.isAnagramSol2(\"Dormito ry\", \"Dirty room\"):" + Anagram.isAnagramSol2("Dormito ry", "Dirty room"));
    System.out.println("Anagram.isAnagramSol2(ac, bb):" + Anagram.isAnagramSol3("parliament", "partialmen"));
    System.out.println("Anagram.isAnagramSol3(\"Dormito ry\", \"Dirty room\"):" + Anagram.isAnagramSol3("Dormito ry", "Dirty room"));
    
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
    if (Arrays.toString(charArray1).equals(Arrays.toString(charArray2)))
      return true;
    else
      return false;
  }

  /**
   * Wrong Implementations: Faild for ==> str1=aa;str2=bc
   * 
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

  /**
   * 
   * Based on ASCII value
   * 
   * @param str1
   * @param str2
   * @return
   */
  public static boolean isAnagramSol2(String str1, String str2) {

    boolean arr[] = new boolean[256];
    
    for (char ch : str1.toCharArray()) {
      arr[(int) ch] = true;
    }
    for (char ch : str2.toCharArray()) {
      if (!arr[(int) ch]) {
        return false;
      }
    }
    return true;
  }

  /**
   * Using set
   * 
   * @param str1
   * @param str2
   * @return
   */
  public static boolean isAnagramSol3(String str1, String str2) {

    Set<Character> charSet = new HashSet<Character>();

    for (char ch : str1.toCharArray()) {
      charSet.add(ch);
    }

    for (char ch : str2.toCharArray()) {
      if (charSet.add(ch)) {
        return false;
      }

    }
    return true;
  }



}
