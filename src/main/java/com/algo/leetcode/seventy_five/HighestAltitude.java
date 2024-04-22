package com.algo.leetcode.seventy_five;

/**
 * There is a biker going on a road trip.
 * The road trip consists of n + 1 points at different altitudes.
 * The biker starts his trip on point 0 with altitude equal 0.
 * <p>
 * You are given an integer array gain of length n where gain[i] is the net gain in
 * altitude between points i and i + 1 for all (0 <= i < n).
 * Return the highest altitude of a point.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: gain = [-5,1,5,0,-7]
 * Output: 1
 * Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
 * Example 2:
 * <p>
 * Input: gain = [-4,-3,-2,-1,4,3,2]
 * Output: 0
 * Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
 */
public class HighestAltitude {
    public static void main(String[] args) {
        int arr[] = new int[]{0,-4,-7,-9,-10,-6,-3,-1};
        HighestAltitude highestAltitude = new HighestAltitude();
        int result = highestAltitude.largestAltitude(arr);
        System.out.println("result:" + result);
    }

    public int largestAltitude(int[] gain) {
        int sum = 0;
        int result = 0;
        for (int i = 0; i < gain.length; i++) {
            sum = sum + gain[i];
            if (sum > result) {
                result = sum;
            }
        }
        return result;
    }

}


