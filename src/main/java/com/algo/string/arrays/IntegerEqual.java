package com.algo.string.arrays;

import java.util.Random;

public class IntegerEqual {

  public static void main(String[] args) {

    Random random=new Random();
    
    for(int i =0;i<Long.MAX_VALUE;i++) {
      IntegerEqual.isIntegerEqual(random.nextInt(), random.nextInt());
    }
//    
//    System.out.println(" IntegerEqual.isIntegerEqual(12, 12):" + IntegerEqual.isIntegerEqual(random.nextInt(), random.nextInt()));
//    System.out.println(" IntegerEqual.isIntegerEqual(11, 12):" + IntegerEqual.isIntegerEqual(11, 12));
//
//
//
//    System.out.println(" IntegerEqual.isIntegerEqual(12, 12):" + IntegerEqual.isIntegerEqualSolution2(12, 12));
//    System.out.println(" IntegerEqual.isIntegerEqual(11, 12):" + IntegerEqual.isIntegerEqualSolution2(11, 12));
  }

  public static boolean isIntegerEqual(int num1, int num2) {
    return ((num1 ^ num2) == 0) ? true : false;
  }

  public static boolean isIntegerEqualSolution2(int num1, int num2) {
    return ((num1 - num2) == 0) ? true : false;
  }

}
