package com.algo.string.arrays;

/**
 * 
 * Write an efficient function that deletes characters from an ASCII string.
 * 
 * For example, given a str of "Battle of the Vowels: Hawaii vs. Grozny" and a remove of "aeiou",
 * the function should transform str to “Bttl f th Vwls: Hw vs. Grzny”.
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class RemoveAGivenChracter {


  static String removeChractersFromString(String string, String removeStr) {

    StringBuilder builder = new StringBuilder();

    boolean[] flag = new boolean[256];

    for (char ch : removeStr.toCharArray()) {
      flag[(int) ch] = true;
    }

    for (char ch : string.toCharArray()) {
      if (!flag[(int) ch]) {
        builder.append(ch);
      }
    }

    return builder.toString();
  }

  public static void main(String[] args) {

    System.out.println(removeChractersFromString("Battle of the Vowels: Hawaii vs. Grozny", "aeiou"));


  }

}
