package parctice;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


// Logic: searches for a pair whose sum equals the target, often by tracking seen values or using two pointers moving toward the middle.
public class TwoSum1 {

    public static void main(String[] args) {
        int[] arr = {1,6,2,10,3};
        int[] result = twoSum(arr, 12);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int r = target - nums[i];
            if (hashMap.containsKey(r)) {
                return new int[]{hashMap.get(r), i};
            }
            hashMap.put(nums[i], i);
            System.out.println(hashMap);
        }
        return new int[]{0, 0};
    }
}
