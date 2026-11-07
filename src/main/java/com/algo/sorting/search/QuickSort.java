package com.algo.sorting.search;
import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] arr = {3, 10,2, -1, 44, -232, 1, 6, 7,-90, 9, -67, -89, 6, 32, -1, -12};
        //int[] arr = {10, 5, 8, 9, 3, 6, 15, 12, 16, 6};

        System.out.println(Arrays.toString(arr));
        qs.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);
            System.out.println("Pivot Index:" + pivotIndex);
            // Recursively sort the left and right subarrays
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            // If current element is < pivot, move it to the left section
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);  // Swap elements at i and j
            }
        }
        swap(arr, i + 1, high);  // Swap elements at i and j
        return i + 1;
    }
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}