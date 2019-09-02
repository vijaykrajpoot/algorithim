package com.algo;

/**
 * 
 * Find a given number is Prime or not.
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class PrimeNumber {
  

  public static void main(String[] args) {
    int number = 3;
    System.out.println("PrimeNumber.isPrime(" + number + ") :" + PrimeNumber.isPrime(number));
    number = 7;
    System.out.println("PrimeNumber.isPrime(" + number + ") :" + PrimeNumber.isPrime(number));
    number = 25;
    System.out.println("PrimeNumber.isPrime(" + number + ") :" + PrimeNumber.isPrime(number));
    number = 343;
    System.out.println("PrimeNumber.isPrime(" + number + ") :" + PrimeNumber.isPrime(number));
    number = 0;
    System.out.println("PrimeNumber.isPrime(" + number + ") :" + PrimeNumber.isPrime(number));
    number = 2;
    System.out.println("PrimeNumber.isPrime(" + number + ") :" + PrimeNumber.isPrime(number));
    number = 1;
    System.out.println("PrimeNumber.isPrime(" + number + ") :" + PrimeNumber.isPrime(number));

    number = -23;
    System.out.println("PrimeNumber.isPrime(" + number + ") :" + PrimeNumber.isPrime(number));


    number = 29;
    System.out.println("PrimeNumber.isPrime(" + number + ") :" + PrimeNumber.isPrime(number));

  }

  static boolean isPrime(int numnber) {
    if (numnber <= 1) {
      return false;
    }

    for (int i = 2; i < numnber / 2; i++) {
      if (numnber % i == 0) {
        return false;
      }
    }
    return true;
  }

}
