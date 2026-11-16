package com.algo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 
 * Find all the factors of a given number
 * 
 * @author Vijay Kumar Rajput
 *
 */



// Logic: processes the factors of a number problem by transforming the input according to the algorithm and returning the required result.
public class FactorsOfANumber {

  public static void main(String[] args) {
    List<Integer> ll = FactorsOfANumber.findFactors(100000);
    System.out.println(Arrays.toString(ll.toArray()));
  }
  static List<Integer> findFactors(int number) {
    List<Integer> factorList = new ArrayList<Integer>();
    for (int i = 1; i <= number; i++) {
      if ((number % i) == 0) {
        factorList.add(i);
      }
    }
    return factorList;
  }
}
