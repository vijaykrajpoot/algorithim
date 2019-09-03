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

public class FactorsOfANumber {

  public static void main(String[] args) {
    List<Integer> ll = FactorsOfANumber.findFactors(100);

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
