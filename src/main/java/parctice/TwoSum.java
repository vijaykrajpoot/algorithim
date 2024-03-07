package parctice;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {12,5,8,6,4,8,2,3,7,10,25};
        int[] result = twoSum(arr, 8);
        System.out.println(Arrays.toString(result));
    }

    static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
