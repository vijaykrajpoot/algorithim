package com.algo.leetcode.seventy_five;
// Logic: Solves the increasing triplet problem by processing the input data, applying the required algorithmic rule, and returning the expected result.


public class IncreasingTriplet {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 5, 0, 4, 6};
        IncreasingTriplet increasingTriplet = new IncreasingTriplet();
        boolean r = increasingTriplet.increasingTriplet(arr);
        System.out.println(r);
    }
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] <= first) {
                first = nums[i];
            } else if (nums[i] <= second) {
                second = nums[i];
            } else {
                return true;
            }
        }
        return false;
    }
}