package com.algo;

public class Fibonacci {

  public static void main(String[] args) {
    System.out.println("Fibonacci.fibonacci(10):" + Fibonacci.fibonacci(10));

    System.out.print("Fibonacci.fibonacciRecursion(10):");
    Fibonacci.fibonacciRecursion(10);
    System.out.println();
    System.out.print("Fibonacci.fibonacciItrative(10):");
    Fibonacci.fibonacciItrative(10);

  }

  public static int fibonacci(int n) {

    if (n == 0 || n == 1)
      return n;

    return fibonacci(n - 1) + fibonacci(n - 2);

  }

  public static void fibonacciItrative(int n) {
    int n1 = 0;
    int n2 = 1;
    int n3 = 0;

    for (int i = 2; i <= n; i++) {
      n3 = n1 + n2;
      System.out.print(n3 + " ");
      n1 = n2;
      n2 = n3;
    }
  }

  static int n1 = 0;
  static int n2 = 1;
  static int n3 = 0;


  public static void fibonacciRecursion(int n) {

    if (n <= 0) {
      return;
    }
    n1 = n2;
    n2 = n3;
    n3 = n1 + n2;
    System.out.print(n3 + " ");

    fibonacciRecursion(n - 1);
  }

}
