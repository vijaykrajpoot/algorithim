package com.algo.string.arrays;


// Logic: processes the array max average sliding window problem by transforming the input according to the algorithm and returning the required result.
public class ArrayMaxAverageSlidingWindow {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 12, -5, -6, 50, 3};
        double avg = average(arr, 4);
        System.out.println(avg);
    }
    static double average(int[] arr, int k) {
        double maxAvg = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
            if (i <   k) {
                int sum = arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3];
                System.out.println("sum:" + sum);
                double calcSum = (double) sum / k;
                if (calcSum > maxAvg) {
                    maxAvg = calcSum;
                    System.out.println("calcSum: [" + calcSum + "]: maxSum:[" + maxAvg + "]");
                }
            }
        }
        return maxAvg;
    }
    static double average2(int[] arr, int k) {
        double maxSum = -1;
        double sum = 0;
        int start = 0;
        int end = 4;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        while (start < arr.length - 1 - k) {
            sum = sum - arr[start] + arr[end];
            maxSum = Math.max(maxSum, sum);
            start++;
            end++;
        }
        return maxSum / 4;
    }
}
