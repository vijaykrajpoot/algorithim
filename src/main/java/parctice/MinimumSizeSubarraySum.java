package parctice;
// Logic: Aggregates values across the collection to compute the required total or product.


public class MinimumSizeSubarraySum {

	public static int minSubArrayLen(int target, int[] nums) {
		int minLength = Integer.MAX_VALUE;
		int windowSum = 0;
		int windowStart = 0;
		for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
			windowSum += nums[windowEnd];
			while (windowSum >= target) {
				minLength = Math.min(minLength, windowEnd - windowStart + 1);
				windowSum -= nums[windowStart];
				windowStart++;
			}
		}
		return minLength == Integer.MAX_VALUE ? 0 : minLength;
	}
	public static void main(String[] args) {
		int[] nums = {2, 3, 1, 2, 4, 3};
		int target = 7;
		int result = minSubArrayLen(target, nums);
		System.out.println("Minimum size of subarray with sum at least " + target + ": " + result);
	}
}