package com.algo.sorting.search;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenOddSegregate {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(10);
        System.out.println(integers);
        integers= segregate_evens_and_odds(integers);


    }

    static ArrayList<Integer> segregate_evens_and_odds(ArrayList<Integer> numbers) {
        // Write your code here.
        int left = 0;
        int right = numbers.size() - 1;
        while (left < right) {
            int leftNum = numbers.get(left);
            int rightNum = numbers.get(right);
            if (leftNum % 2 != 0) {
                if (rightNum % 2 == 0) {
                    int temp = numbers.get(right);
                    numbers.set(right, numbers.get(left));
                    numbers.set(left, temp);
                    left++;
                }
                right--;
            } else  {
                left++;
            }
        }
        System.out.println(numbers);
        return numbers;
    }


}
