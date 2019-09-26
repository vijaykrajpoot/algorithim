package com.algo;

public class StringToInteger {
  
  /**
   * 
   * 
   * Lower index to higher index using pow function 
   * 
   * @param str
   * @return long
   */
  public static long convertToIntSol1(String str) {
    long finalNumber = 0;
    int len = str.length();
    for (int i = 0; i < len; i++) {
      int num = str.charAt(i) - '0';
      finalNumber = (long) (finalNumber + (num * Math.pow(10, (len - 1 - i))));
    }
    return finalNumber;
  }
  
  /**
   * 
   * From higer index to lower index
   * 
   * @param str
   * @return long
   */
  
  public static long convertToIntSol2(String str) {
    long finalNumber = 0;
    int len = str.length();
    int multiplyer = 1;
    for (int i = len - 1; i >= 0; i--) {
      int num = str.charAt(i) - 48;
      System.out.println("num:"+num);
      finalNumber = finalNumber + (num * multiplyer);
      System.out.println("finalNumber:"+finalNumber);
      multiplyer = multiplyer * 10;
    }

    return finalNumber;
  }


/**
 * 
 * From lower index ----> higher index
 * 
 * 
 * @param str
 * @return long
 */
  public static long convertToIntSol3(String str) {

    boolean isNegative = false;
    long finalNumber = 0;

    int index = 0;
    if (str.charAt(0) == '-') {
      isNegative = true;
      index++;
    }

    for (int i = index; i < str.length(); i++) {
      finalNumber = finalNumber * 10;
      finalNumber = finalNumber + (str.charAt(i) - '0');
    }

    if (isNegative) {
      finalNumber = -finalNumber;
    }
    return finalNumber;
  }

  public static void main(String[] args) {
    System.out.println(convertToIntSol1("12345"));

    System.out.println(convertToIntSol2("123456"));

    System.out.println(convertToIntSol3("-87654332"));
  }
}
