package parctice;
import java.util.Arrays;
// Logic: Recursively splits the array, sorts each half, and merges the sorted halves back together in order.


public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {10, 100, 40, 60, 30, 70, 60, 30, 80, 50};
        int[] sortedArray = mergeSort(arr);
        System.out.println("Sorted:" + Arrays.toString(sortedArray));
    }
    static int[] mergeSort(int[] arr) {
        int length = arr.length;
        if (length <= 1) {
            return arr;
        } else {
            int mid = length / 2;
            int remLength = length - mid;

            int[] arr1 = new int[mid];
            int[] arr2 = new int[remLength];

            System.arraycopy(arr, 0, arr1, 0, mid);
            System.arraycopy(arr, mid, arr2, 0, remLength);
            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);
            return mergeArray(arr1, arr2);
        }
    }
    static int[] mergeArray(int[] arr1, int[] arr2) {
        int l1 = arr1.length;
        int l2 = arr2.length;
        int idx = 0;
        int idx1 = 0;
        int idx2 = 0;
        int[] arr = new int[l1 + l2];
        while (idx1 < l1 && idx2 < l2) {
            if (arr1[idx1] < arr2[idx2]) {
                arr[idx++] = arr1[idx1++];
            } else {
                arr[idx++] = arr2[idx2++];
            }
        }
        while (idx1 < l1) {
            arr[idx++] = arr1[idx1++];
        }
        while (idx2 < l2) {
            arr[idx++] = arr2[idx2++];
        }
        return arr;
    }
}