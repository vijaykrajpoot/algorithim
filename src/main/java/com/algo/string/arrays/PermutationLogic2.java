package com.algo.string.arrays;

/**
 * 
 * Print String permutation
 * 
 * 
 * ABC ACB BAC BCA CAB CBA
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class PermutationLogic2 {
  
  // Collect result
  private StringBuilder result = new StringBuilder();
  // Input data
  private String inputString;
  // Keep tracked which character has been used or not.
  private boolean[] isUsed;


  /**
   * 
   * @param inputString
   */
  public PermutationLogic2(String inputString) {
    this.inputString = inputString;
    isUsed = new boolean[inputString.length()];
  }

  /**
   * 
   * Permutation logic to print all permutation of string.
   * 
   * In case we need all the permutation of each character then comment first if condition in for
   * loop.
   * 
   * * AAA AAB AAC ABA ABB ABC ACA ACB ACC BAA BAB BAC BBA BBB BBC BCA BCB BCC CAA CAB CAC CBA CBB CBC
   * CCA CCB CCC
   * 
   * 
   */

  void printPermute() {

    if (result.length() == inputString.length()) {
      print(result.toString().toCharArray());
      return;
    }

    for (int i = 0; i < inputString.length(); i++) {
      if (isUsed[i] == true) {
        continue;
      }
      result.append(inputString.charAt(i));
      isUsed[i] = true;
      printPermute();
      isUsed[i] = false;
      result.setLength(result.length() - 1);

    }

  }

  private void print(char arr[]) {
    for (char ch : arr) {
      System.out.print(ch);
    }
    System.out.println();

  }

  // Driver code
  public static void main(String[] args) {
    PermutationLogic2 permutation2 = new PermutationLogic2("abb");
    permutation2.printPermute();

  }

}
