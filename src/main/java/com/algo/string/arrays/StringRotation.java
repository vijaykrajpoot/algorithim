package com.algo.string.arrays;

/**
 * 
 * Assume you have a method isSubstring which checks if one word is a substring of another. Given
 * two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to
 * isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).
 * 
 * @author Vijay Kumar Rajput
 *
 */

public class StringRotation {

  public static void main(String[] args) {

    System.out.println("isRotation:" + isRotation("waterbottle", "erbottlewat"));
    System.out.println("isRotation:" + isRotation("apple", "pleap"));


  }

  static boolean isRotation(String st1, String st2) {

    if (st1 == null || st2 == null) {
      return false;
    }

    if (st1.length() != st2.length()) {
      return false;
    }

    String string = st1.concat(st1);
    // System.out.println("string:" + string);
    int index = string.indexOf(st2);


    return index >= 0;
  }

}
