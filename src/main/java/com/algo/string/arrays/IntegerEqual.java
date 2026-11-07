package com.algo.string.arrays;
import java.util.Random;
// Logic: Solves the integer equal problem by processing the input data, applying the required algorithmic rule, and returning the expected result.


public class IntegerEqual {

  public static void main(String[] args) {
    Random random=new Random();
    for(int i =0;i<Long.MAX_VALUE;i++) {
      IntegerEqual.isIntegerEqual(random.nextInt(), random.nextInt());
    }
  }
  public static boolean isIntegerEqual(int num1, int num2) {
    return ((num1 ^ num2) == 0) ? true : false;
  }
  public static boolean isIntegerEqualSolution2(int num1, int num2) {
    return ((num1 - num2) == 0) ? true : false;
  }
}