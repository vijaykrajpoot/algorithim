package com.algo.sorting.search;

import java.util.Arrays;


public class QuickSort {

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
         int[] arr = {3, 2, 1, 44, -232, 6, 7, 9, 67, -89, 32, -1, 12};
        //int[] arr = {10, 5, 8, 9, 3, 6, 15, 12, 16, 6};

        System.out.println(Arrays.toString(arr));
        qs.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int j = partition(arr, low, high);
            System.out.println("Partition Value:" + j);
            quickSort(arr, low, j );
            quickSort(arr, j + 1, high);
        }
    }

    int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;
        while (i < j) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i < j) {
                swap(arr, i, j);
            }
        }
        // swap(arr, low, j);
        return j;
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
