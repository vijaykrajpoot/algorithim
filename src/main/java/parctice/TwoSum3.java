package parctice;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// Logic: searches for a pair whose sum equals the target, often by tracking seen values or using two pointers moving toward the middle.
public class TwoSum3 {

	public static void main(String[] args) {
		int[] arr = {12, 5, 8, 6, 4, 8, 2, 3, 7, 13,10, 25};
		int[] result = twoSum(arr, 25);
		System.out.println(Arrays.toString(result));
	}
	private static int[] twoSum(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			int element = target - arr[i];
			int idx = findItem(arr, element);
			if (idx > -1) {
				return new int[]{i, idx};
			}
		}
 		return new int[]{};
	}
	private static int findItem(int[] arr, int element) {
		for (int i = 0; i < arr.length; i++) {
			if (element == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
