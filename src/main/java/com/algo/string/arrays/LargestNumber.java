package com.algo.string.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * Given a list of non negative integers, arrange them such that they form the largest number.
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class LargestNumber {


  public static void main(String[] args) {
    int arr[] = {3, 59,30, 34,95, 5, 9};
    System.out.println("LargestNumber.formLargestNumber(arr):"+LargestNumber.formLargestNumber(arr));

  }

  public static String formLargestNumber(int arr[]) {

    String[] strArr = new String[arr.length];

    for (int i = 0; i < arr.length; i++) {
      strArr[i] = String.valueOf(arr[i]);
    }

    System.out.println("Before Sorting: " + Arrays.toString(strArr));
    // Sort higer number like 95
    Arrays.sort(strArr, new Comparator<String>() {
      public int compare(String o1, String o2) {
        System.err.println((o2 + o1) + "-" + (o1 + o2) + "==>" + (o2 + o1).compareTo(o1 + o2));
        return (o2 + o1).compareTo(o1 + o2);
      };
    });
    
    
    StringBuilder builder = new StringBuilder();
    System.out.println("After Sorting: " + Arrays.toString(strArr));
    for (String st : strArr) {
      builder.append(st);
    }

    System.out.println(builder.toString());
    return builder.toString();

  }


}

