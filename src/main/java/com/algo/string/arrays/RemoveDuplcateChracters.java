package com.algo.string.arrays;
/**
 * 
 * 
 * Design an algorithm and write code to remove the duplicate characters in a string without using
 * any additional buffer. NOTE: One or two additional variables are fine. An extra copy of the array
 * is not.
 * 
 * @author Vijay Kumar Rajput
 *
 */


// Logic: processes the remove duplcate chracters problem by transforming the input according to the algorithm and returning the required result.
public class RemoveDuplcateChracters {

  public static void main(String[] args) {
    System.out.println(removeDuplicate("abababa"));
  }
  /**
   * 
   * @param str
   * @return string after removing duplicate character
   */
  public static String removeDuplicate(String str) {
    boolean flag[] = new boolean[256];
    StringBuilder builder = new StringBuilder();
    if (str == null) {
      throw new IllegalArgumentException("Empty String");
    }
    for (int i = 0; i < str.length(); i++) {
      int ch = str.charAt(i);
      if (!flag[ch] == true) {
        builder.append(str.charAt(i));
        flag[ch] = true;
      }
    }

    return builder.toString();
  }
}
