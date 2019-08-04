package com.algo.string.arrays;

import java.util.Arrays;
import java.util.Random;

public class FindAMaxElementInArray {

  private static int LIMIT = 10;


  public static void main(String[] args) {


    System.out.println();

    long startTime = System.nanoTime();
    int[] arr = getIntegerArray();
    System.out.println("Array :" + Arrays.toString(arr) + "   Length:"+ arr.length);
    System.out.flush();
    int maxNumber = FindAMaxElementInArray.findMaxelementSolutuon1(arr);
    long endTime = System.nanoTime();
    long duration = (endTime - startTime) / 1000000;
    System.out.println("findMaxElementSolutuon1: TimeSpend:" + duration + " maxNumber: " + maxNumber);
    System.out.flush();
    System.out.println("#######################");
    System.out.flush();
    startTime = System.nanoTime();
    FindAMaxElementInArray.findMaxelementSolutuon2(arr);
    endTime = System.nanoTime();
    duration = (endTime - startTime) / 1000000;
    System.out.println("findMaxelementSolutuon2 TimeSpend:" + duration + " maxNumber: " + maxNumber);
    System.out.flush();
  }



  private static int[] getIntegerArray() {
    Random random = new Random();
    int[] arr = new int[LIMIT];
    for (int i = 0; i < LIMIT; i++) {
      int num = random.nextInt(100);
      // System.out.println("[" + i + "]:" + num);
      arr[i] = num;
    }
    return arr;

  }

  /**
   * O(N)
   * 
   * @param arr
   * @return
   */
  public static int findMaxelementSolutuon1(int arr[]) {

    if (arr.length <= 0) {
      return -1;
    }
    int element = arr[0];

    for (int num : arr) {
      if (num > element) {
        element = num;
      }
    }
    return element;

  }

  /**
   * O(N2)
   * 
   * @param arr
   * @return
   */

  public static int findMaxelementSolutuon2(int arr[]) {
    int countJ = 0, countI = 0;
    if (arr.length <= 0) {
      return -1;
    }
    int i, j = 0;
    int len = arr.length - 1;

    boolean isMax = true;
    for (i = len; i > 0; i--) {
      for (j = 0; j < len; j++) {
        if (arr[j] > arr[i]) {
          System.err.println("arr[" + j + "] :" + arr[j] + ":" + "arr[" + i + "]:" + arr[i]);
          System.err.flush();
          isMax = false;
          countJ++;
          break;
        }
      }
      countI++;
      if (isMax)
        break;
    }

    System.out.flush();
    return arr[i];

  }

}
