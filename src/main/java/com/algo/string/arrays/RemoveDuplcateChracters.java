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
public class RemoveDuplcateChracters {

  public static void main(String[] args) {
    System.out.println(removeDuplicate("VIJAY KUMAR RAJPOOT"));
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

    // for (char ch : str.toCharArray()) {
    // if (!flag[(int) ch]) {
    // builder.append(ch);
    // flag[(int) ch] = true;
    // } else {
    // flag[(int) ch] = true;
    // }
    // }

    return builder.toString();
  }

}
