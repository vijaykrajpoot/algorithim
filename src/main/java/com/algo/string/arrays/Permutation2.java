package com.algo.string.arrays;

public class Permutation2 {

  private StringBuilder result = new StringBuilder();
  private String inputString;
  boolean[] isUsed;

  public Permutation2(String inputString) {
    this.inputString = inputString;
    isUsed = new boolean[inputString.length()];
  }

  // Function to print all the permutations of str
  void printPermute() {

    if (result.length() == inputString.length()) {
      print(result.toString().toCharArray());
      return;
    }

    for (int i = 0; i < inputString.length(); i++) {
      result.append(inputString.charAt(i));
      isUsed[i] = true;
      printPermute();
      isUsed[i] = false;
      result.setLength(result.length() - 1);

    }

  }

  static void print(char arr[]) {
    for (char ch : arr) {
      System.out.print(ch);
    }
    System.out.println();

  }

  // Driver code
  public static void main(String[] args) {

    Permutation2 permutation2 = new Permutation2("ABC");
    permutation2.printPermute();

  }

}
