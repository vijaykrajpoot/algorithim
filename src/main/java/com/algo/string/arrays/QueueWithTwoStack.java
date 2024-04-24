package com.algo.string.arrays;

import java.util.Scanner;
import java.util.Stack;

class StackQ {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();


    public void enqueue(int value) {
        s1.push(value);
    }

    public int dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) {
            return -1;
        }
      return   s2.pop();
    }

    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) {
            return -1;
        }
        return s2.peek();
    }
}

public class QueueWithTwoStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackQ stackQ = new StackQ();
        int q = scanner.nextInt();
        while (q > 0) {
            int in = scanner.nextInt();
            System.out.println("In==> " + in);
            if (in == 1) {
                in = scanner.nextInt();
                System.out.println("EQ==> q: " + in);
                stackQ.enqueue(in);
            } else if (in == 2) {
                System.out.println("DQ==> q: " + in);
                int element = stackQ.dequeue();
                System.out.println("DQ:" + element);
            } else {
                System.out.println("PEEK==> " + in);
                System.out.println(stackQ.peek());
            }
            q--;

        }
    }

}




