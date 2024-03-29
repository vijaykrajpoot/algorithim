package com.algo.string.arrays;

public class ArrayBinarySearch {

    public static int search(int arr[], int num) {

        int lowerIdx = 0;
        int upperIdx = arr.length - 1;
        int midIdx = 0;
        int indexFound = -1;

        while (lowerIdx < upperIdx) {
            midIdx = (lowerIdx + upperIdx) / 2;
            if (arr[midIdx] == num) {
                indexFound = midIdx;

            }
            {
                if (arr[midIdx] > num) {
                    upperIdx = midIdx - 1;
                } else {
                    lowerIdx = midIdx + 1;
                }
            }
        }
        return indexFound;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int a : arr){
            System.out.println(ArrayBinarySearch.search(arr, a));
        }

    }

}













