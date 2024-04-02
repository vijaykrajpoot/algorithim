package com.algo.leetcode.seventy_five;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 * <p>
 * answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
 * answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
 * Note that the integers in the lists may be returned in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,3], nums2 = [2,4,6]
 * Output: [[1,3],[4,6]]
 * Explanation:
 * For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
 * For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
 * Example 2:
 * <p>
 * Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
 * Output: [[3],[]]
 * Explanation:
 * For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
 * Every integer in nums2 is present in nums1. Therefore, answer[1] = [].
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums1.length, nums2.length <= 1000
 * -1000 <= nums1[i], nums2[i] <= 1000
 */
public class TwoArrayDiff_2215 {
    public static void main(String[] args) {
        int arr1[] = new int[]{1, 2, 3};
        int arr2[] = new int[]{2, 4, 6};
        TwoArrayDiff_2215 twoArrayDiff2215 = new TwoArrayDiff_2215();
        List<List<Integer>>  result= twoArrayDiff2215.findDifference(arr1, arr2);
        System.out.println(result);


    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> lists = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
        HashSet<Integer> set2 = new HashSet<>(Arrays.stream(nums2).boxed().collect(Collectors.toList()));

        for (int num : nums1) {
            set2.remove(num);
        }
        for (int num : nums2) {
            set1.remove(num);
        }
        lists.add(new ArrayList<>(set1));
        lists.add(new ArrayList<>(set2));
        return lists;

    }

}
