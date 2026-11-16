package parctice;
import java.util.Arrays;


// Logic: searches for a pair whose sum equals the target, often by tracking seen values or using two pointers moving toward the middle.
public class TwoSum2 {

    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50,60,70,80,90,100};
        TwoSum2 twoSum2 = new TwoSum2();
        System.out.println(Arrays.toString(twoSum2.twoSum(arr, 70)));
    }
    public int[] twoSum(int[] arr, int target) {
        Arrays.sort(arr);
        int leftIdx = 0;
        int rightIdx = arr.length - 1;
        while (leftIdx < rightIdx) {
            int sum = arr[leftIdx] + arr[rightIdx];
            if (sum == target) {
                System.out.println(leftIdx + "," + rightIdx);
                return new int []{leftIdx, rightIdx};
            } else {
                if (sum < target) {
                    leftIdx++;
                } else {
                    rightIdx--;
                }
            }
        }
        return new int[0];
    }
}
