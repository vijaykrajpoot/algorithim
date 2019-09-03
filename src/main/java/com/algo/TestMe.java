package com.algo;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMe {


  public static void main(String[] args) {
    int r = 3, c = 4;
    int sum = 0;
    ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();

    for (int i = 0; i < r; i++) {
      ArrayList<Integer> b = new ArrayList<Integer>();
      for (int j = 0; j < c; j++) {
        sum += 1;
        b.add(sum);
      }
      A.add(b);

    }

    System.out.println(Arrays.toString(A.toArray()));
    ArrayList<ArrayList<Integer>> B = performOps(A);
    System.out.println(Arrays.toString(B.toArray()));
    for (int i = 0; i < B.size(); i++) {
      for (int j = 0; j < B.get(i).size(); j++) {
        System.out.print(B.get(i).get(j) + " ");
      }
    }


  }

  static ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
    ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
    for (int i = 0; i < A.size(); i++) {
      B.add(new ArrayList<Integer>());

      for (int j = 0; j < A.get(i).size(); j++) {
        B.get(i).add(0);
      }

      for (int j = 0; j < A.get(i).size(); j++) {
        B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
      }
    }
    return B;
  }


}
