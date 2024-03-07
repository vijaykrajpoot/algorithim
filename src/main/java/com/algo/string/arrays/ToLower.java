package com.algo.string.arrays;

/**
 * 
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in
 * lowercase.
 * 
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class ToLower {

  public static void main(String[] args) {
    System.out.println(ToLower.toLower("Vijay$"));
    System.out.println(ToLower.toLower("al&phaBET"));
  }
    

  public static String toLower(String str) {
    char ch[] = str.toCharArray();
    for (int i = 0; i < ch.length; i++) {
      if ((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z')) {
        if (!(ch[i] >= 'a' && ch[i] <= 'z')) {
          ch[i] = (char) ((int) ch[i] + 32);
        }
      }
    }
    return new String(ch);
  }

}
