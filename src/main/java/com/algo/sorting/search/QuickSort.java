package com.algo.sorting.search;
import java.util.Arrays;


// Logic: picks a pivot, places smaller values on the left and larger values on the right, and recursively sorts both partitions until the whole array is ordered.
public class QuickSort {

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] arr = {3, 10,2, -1, 44, -232, 1, 6, 7,-90, 9, -67, -89, 6, 32, -1, -12};

        System.out.println(Arrays.toString(arr));
        qs.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            System.out.println("Pivot Index:" + pivotIndex);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
