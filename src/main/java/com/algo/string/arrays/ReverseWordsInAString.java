package com.algo.string.arrays;

/**
 * 
 * Write a function that reverses the order of the words in a string. For example, your function
 * should transform the string "Do or do not, there is no try." to "try. no is there not, do or Do".
 * Assume that all words are space delimited and treat punctuation the same as letters.
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class ReverseWordsInAString {

  public static void main(String[] args) {
    String st = "Do or do not, there is no try.";
    String rString = reverseAString(st);
    System.out.println("oString.length():" + st.length());
    System.out.println("rString.length():" + rString.length());;
    System.out.println("oString:" + st);
    System.out.println("rString:" + rString);
  }

  public static String reverseAString(String str) {
    String resversedString = reverseMe(str);

    int stIndex = 0;
    String rrString = "";
    int i = 0;
    for (i = 0; i < resversedString.length(); i++) {
      char ch = resversedString.charAt(i);
      System.out.println("ch:" + ch);
      if (ch == ' ') {
        rrString = rrString + reverseMe(resversedString.substring(stIndex, i)) + ch;
        stIndex = i;
      }
    }
    // Exit from loop after i == string length and reverse last string
    if (i == resversedString.length()) {
      rrString = rrString + reverseMe(resversedString.substring(stIndex, str.length()));;
    }



    return rrString;

  }

  private static String reverseMe(String str) {
    char[] ch = str.toCharArray();
    for (int i = 0; i < str.length() / 2; i++) {
      char temp = ch[i];
      ch[i] = ch[str.length() - 1 - i];
      ch[str.length() - 1 - i] = temp;
    }
    return new String(ch);
  }



}
