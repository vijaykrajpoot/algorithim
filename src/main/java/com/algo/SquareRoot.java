package com.algo;

public class SquareRoot {

  public static void main(String[] args) {

    System.out.println(SquareRoot.squareRoot(100.00));
  }

  static double squareRoot(double number) {
    if(number==0 || number==1) {
      return number;
    }
  
    for( int i=0;i<number;i++) {
      
        if(i*i==number) {
          return i;
        }
      
    }
    return 0;
    
  }


}
