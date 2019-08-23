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
    System.out.println("st.length():" + st.length());
    System.out.println("rString.length()):" + rString.length());;
    System.out.println("rString:"+rString);
  }

  public static String reverseAString(String str) {
    String resversedString = reverseMe(str);

    int stIndex = 0;
    int endIndex = 0;
    String rrString = "";
    for (char ch : resversedString.toCharArray()) {

      endIndex++;
      if (ch== ' ' ) {
        rrString = rrString + reverseMe(resversedString.substring(stIndex, endIndex - 1)) + ch;
        stIndex = endIndex;
      }
      if (endIndex >= resversedString.length()) {
        rrString = rrString + reverseMe(resversedString.substring(stIndex, str.length()));;
      }
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
