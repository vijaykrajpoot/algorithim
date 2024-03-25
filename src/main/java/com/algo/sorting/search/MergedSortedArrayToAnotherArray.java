package com.algo.sorting.search;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * First array has n positive numbers, and they are sorted in the non-descending order.
 * <p>
 * Second array has 2n numbers: first n are also positive and sorted in the same way but the last n are all zeroes.
 * <p>
 * Merge the first array into the second and return the latter. You should get 2n positive integers sorted in the non-descending order.
 * <p>
 * Example
 * {
 * "first": [1, 3, 5],
 * "second": [2, 4, 6, 0, 0, 0]
 * }
 * Output:
 * <p>
 * [1, 2, 3, 4, 5, 6]
 */
public class MergedSortedArrayToAnotherArray {
    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>();
        first.add(2);

        ArrayList<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(0);

        merge_one_into_another(first, second);


    }

    static ArrayList<Integer> merge_one_into_another(ArrayList<Integer> first, ArrayList<Integer> second) {
        int idx1 = 0;
        int idx2 = 0;
        while (idx1 < first.size()) {
            if (idx2 >= second.size()  || first.get(idx1) <=second.get(idx2)) {
                second.add(idx2++, first.get(idx1++));
            } else {
                idx2++;
            }
        }
        second.removeIf(integer -> integer == 0);
        System.out.println(second);
        return second;
    }

}
