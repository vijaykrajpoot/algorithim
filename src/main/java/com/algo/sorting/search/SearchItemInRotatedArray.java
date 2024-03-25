package com.algo.sorting.search;

public class SearchItemInRotatedArray {
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        // 50,56,57,58,59,70,80,90,95,|97|,98,99 |100| ,10,20,30,40
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            // If left half is sorted
            if (arr[left] <= arr[mid]) {
                if (arr[left] <= target && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // If right half is sorted
            else {
                if (arr[mid] < target && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {50, 56, 57, 58, 59, 70, 80, 90, 95, 97, 98, 99, 100, 10, 20, 30, 40};
        for(int a:nums) {
            System.out.println(search(nums, a)); // Output: 4 (index of the target element)
        }
    }
}
