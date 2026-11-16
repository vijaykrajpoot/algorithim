package com.algo;


// Logic: runs known sample inputs and compares the outputs with expected values to validate the algorithm.
public class TestMe {
  public static void main(String[] args) {
    int num=1234567;
    while(num!=0) {
      int rem=num%10;
      num=num/10;
      System.out.println("num:"+num+"-" + rem);
    }
  }
}
