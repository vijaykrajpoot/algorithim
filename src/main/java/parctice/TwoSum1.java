package parctice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 2};
        int[] result = twoSum(arr, 4);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int r = target - nums[i];
            if (hashMap.containsKey(r)) {
                return new int[]{hashMap.get(r), i};
            }
            hashMap.put(nums[i], i + 1);
            System.out.println(hashMap);
        }
        throw new IllegalArgumentException("No Two Sum Solution");
    }
}


