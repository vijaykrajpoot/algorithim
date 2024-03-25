package com.algo.string.arrays;


import java.util.*;

/**
 * 3 Sum
 * Given an integer array arr of size n, find all magic triplets in it.
 * <p>
 * Magic triplet is a group of three numbers whose sum is zero.
 * <p>
 * Note that magic triplets may or may not be made of consecutive numbers in arr.
 * <p>
 * Example
 * {
 * "arr": [10, 3, -4, 1, -6, 9]
 * }
 * Output:
 * <p>
 * ["10,-4,-6", "3,-4,1"]
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 3, -4, 1, -6, 9};
        ThreeSum threeSum = new ThreeSum();
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(10, 3, -4, 1, -6, 9));
        System.out.println(threeSum.threeSum(arrayList));
    }



    static ArrayList<String> threeSum(ArrayList<Integer> arrList) {
        int [] arr=arrList.stream().mapToInt(i->i).toArray();
        Arrays.sort(arr);
        Set<String> ll = new HashSet<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int low = i + 1;
            int high = arr.length - 1;
            while (low < high) {
                int sum = arr[i] + arr[low] + arr[high];
                if (sum == 0) {
                    StringBuilder bb = new StringBuilder();
                    bb

                            .append(arr[i])
                            .append(",")
                            .append(arr[low])
                            .append(",")
                            .append(arr[high]);

                    ll.add(bb.toString());
                    low++;
                    high--;
                } else {
                    if (sum > 0) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }
        return new ArrayList(ll);
    }


    List<List<Integer>> threeSum1(int[] arr) {
        Arrays.sort(arr);
        Set<List<Integer>> ll = new HashSet<>();
        for (int i = 0; i < arr.length - 2; i++) {
            int low = i + 1;
            int high = arr.length - 1;
            while (low < high) {
                int sum = arr[low] + arr[high] + arr[i];
                if (sum == 0) {
                    ll.add(Arrays.asList(arr[i], arr[low], arr[high]));
                    low++;
                    high--;
                }
                if (sum > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return new ArrayList<>(ll);
    }

}
