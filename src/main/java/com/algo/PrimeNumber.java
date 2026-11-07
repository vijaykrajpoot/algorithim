package com.algo;
import java.time.Duration;
import java.time.Instant;
/**
 * 
 * Find a given number is Prime or not.
 * 
 * @author Vijay Kumar Rajput
 *
 */
public class PrimeNumber {
  public static void main(String[] args) {
    int number = 1500450271;
    long stTime = Instant.now().toEpochMilli();
    PrimeNumber.isPrime(number);
    long endTime = Instant.now().toEpochMilli();
    long timeElapsed = endTime - stTime;
    System.out.println(timeElapsed);

  }
  static boolean isPrime(int numnber) {
    if (numnber <= 1) {
      return false;
    }
    for (int i = 2; i < Math.sqrt(numnber); i++) {
      if (numnber % i == 0) {
        return false;
      }
    }
    return true;
  }
}