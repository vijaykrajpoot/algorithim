package parctice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] result = twoSum(arr, 8);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hashMap= new HashMap<>();
        for( int i=0;i< nums.length;i++){

            int r=target- nums[i];
            if(hashMap.containsKey(r)){
                return  new int[] {hashMap.get(r),i};
            }
            hashMap.put(nums[i],i);
        }
        throw new IllegalArgumentException("No Two Sum Solution");
    }
}


