package com.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * Write a program that outputs the string representation of numbers from 1 to n.
 * 
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of
 * five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class FizzBuzz {

  public static void main(String[] args) {
    List<String> list = FizzBuzz.fizzBuzz(15);
    System.out.println(Arrays.toString(list.toArray()));
  }

  public static List<String> fizzBuzz(int n) {
    List<String> ll = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        ll.add("FizzBuzz");
      } else if (i % 5 == 0) {
        ll.add("Buzz");
      } else if (i % 3 == 0) {
        ll.add("Fizz");
      } else {
        ll.add(String.valueOf(i));
      }
    }
    return ll;
  }

}
