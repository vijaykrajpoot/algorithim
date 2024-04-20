package com.algo.string.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = IntStream.of(1, 2, 3, 4, 5, 8, 9).toArray();
        RotateArray rotateArray = new RotateArray();
        int result[] = rotateArray.rotateArray(arr, 1);
        System.out.println(Arrays.toString(result));
    }


    int[] rotateArray(int[] arr, int rotation) {
        int rr = rotation % arr.length;
        for (int r = 1; r <= rr; r++) {
            int t = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = t;
        }
        return arr;
    }
}
