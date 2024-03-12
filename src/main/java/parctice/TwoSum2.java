package parctice;

import java.util.Arrays;

public class TwoSum2 {
	public static void main(String[] args) {
		int[] arr = new int[]{12, 5, 8, 6, 4, 8, 2, 3, 7, 10, 25};
		TwoSum2 twoSum2 = new TwoSum2();
		System.out.println(Arrays.toString(twoSum2.twoSum(arr, 17)));
	}

	public int[] twoSum(int[] nums, int target) {
		int sortedArray[] = Arrays.copyOf(nums, nums.length);
		Arrays.sort(sortedArray);
		int leftIdx = 0;
		int rightIdx = sortedArray.length - 1;
		// 1,2,3,4,5,6,7,8,9 =13
		//10
		while (leftIdx < rightIdx) {
			int sum = sortedArray[leftIdx] + sortedArray[rightIdx];
			if (sum == target) {
				int idx1 = findIndex(nums, sortedArray[leftIdx], -1);
				int idx2 = findIndex(nums, sortedArray[rightIdx], idx1);
				System.out.println(leftIdx + "," + rightIdx);
				return new int[]{idx1, idx2};
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

//	private int find(int[] arr, int item) {
//		int low = 0;
//		int high = arr.length - 1;
//		while (low < high) {
//			int mid = high + low;
//			if (arr[mid] == item) {
//				return mid;
//			}
//			if (low < arr[mid]) {
//				low++;
//			} else {
//				high++;
//			}
//		}
//		return -1;
//	}

	private int findIndex(int[] nums, int foundItem, int skipIndex) {
		int foundIdx = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == foundItem && i != skipIndex) {
				foundIdx = i;
				break;
			}
		}
		return foundIdx;
	}
}
