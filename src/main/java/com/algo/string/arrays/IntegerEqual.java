package com.algo.string.arrays;
import java.util.Random;


// Logic: processes the integer equal problem by transforming the input according to the algorithm and returning the required result.
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
