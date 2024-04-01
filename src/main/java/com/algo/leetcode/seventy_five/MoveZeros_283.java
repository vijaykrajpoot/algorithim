package com.algo.leetcode.seventy_five;

import java.util.Arrays;

public class MoveZeros_283 {
    public static void main(String[] args) {
        MoveZeros_283 moveZeros283 = new MoveZeros_283();
        int[] arr = new int[]{0, 0, 0, 1,0, 1,2,3,4,5,6,0};
        moveZeros283.moveZeroes1(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void moveZeroes1(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length;i++ ) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }
        for (int j = k; j < nums.length; j++) {
                 nums[j] = 0;
        }
    }

    public void moveZeroes(int[] nums) {
        int j = 0;
        int val = 0;
        for (int i = 0; i < nums.length && j < nums.length; ) {
            if (nums[i] == 0) {
                while (nums[j++] != 0 & j < nums.length) {
                    continue;
                }
                if (j < nums.length && nums[j] != 0) {
                    val = nums[j];
                    nums[j] = 0;
                    nums[i] = val;
                }
            } else {
                i++;
            }

        }
    }


}
