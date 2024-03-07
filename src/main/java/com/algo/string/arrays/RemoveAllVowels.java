package com.algo.string.arrays;

/**
 * 
 * 
 * Given a string, remove the vowels from the string and print the string without vowels.
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class RemoveAllVowels {


  public static void main(String[] args) {

    System.out.println(RemoveAllVowels.removeVowels("VIJAYKRAJPOOT"));

    System.out.println(RemoveAllVowels.removeVowels("what is your name ?"));

    System.out.println(RemoveAllVowels.removeVowels("aeiouAEIOU"));
  }


  public static String removeVowels(String str) {

    boolean boolVowwels[] = new boolean[256];
    StringBuilder builder = new StringBuilder();

    for (int ch : "aeiouAEIOU".toCharArray()) {
      boolVowwels[ch] = true;
    }

    for (int ch : str.toCharArray()) {
      if (!boolVowwels[ch]) {
        builder.append((char) ch);
      }
    }

    return builder.toString();

  }


}
