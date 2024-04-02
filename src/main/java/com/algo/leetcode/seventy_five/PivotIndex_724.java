package com.algo.leetcode.seventy_five;

public class PivotIndex_724 {

    public static void main(String[] args) {
        PivotIndex_724 pivotIndex724 = new PivotIndex_724();
        int[] arr = new int[]{2,1,-1};
        int result=pivotIndex724.pivotIndex(arr);
        System.out.println(result);
    }

    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                leftSum = calcSum(nums, 0, i - 1);
            }

            rightSum = calcSum(nums, i+1 , nums.length-1);

            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;

    }

    int calcSum(int[] arr, int startIdx, int endIdx) {
        int sum = 0;
        while (startIdx <= endIdx) {
            sum = sum + arr[startIdx];
            startIdx++;
        }
        return sum;
    }
}
