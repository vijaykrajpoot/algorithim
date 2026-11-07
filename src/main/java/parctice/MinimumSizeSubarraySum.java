package parctice; // Declares the package so the class is organized under the correct Java namespace.
public class MinimumSizeSubarraySum { // Defines the Java type that contains the related data and behavior.
	public static int minSubArrayLen(int target, int[] nums) { // Defines the method that performs this unit of work for the class.
		int minLength = Integer.MAX_VALUE; // Stores the computed or supplied value in a variable for later use.
		int windowSum = 0; // Stores the computed or supplied value in a variable for later use.
		int windowStart = 0; // Stores the computed or supplied value in a variable for later use.

		for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) { // Repeats the loop body as long as the loop condition remains true.
			windowSum += nums[windowEnd]; // Expand the window // Carries out the current statement to support the program's logic.

			// Shrink the window until the sum is less than the target
			while (windowSum >= target) { // Keeps executing this block until the loop condition becomes false.
				minLength = Math.min(minLength, windowEnd - windowStart + 1); // Stores the computed or supplied value in a variable for later use.
				windowSum -= nums[windowStart]; // Shrink the window // Carries out the current statement to support the program's logic.
				windowStart++; // Executes the current statement to update state or trigger the required behavior.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.

		return minLength == Integer.MAX_VALUE ? 0 : minLength; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		int[] nums = {2, 3, 1, 2, 4, 3}; // Stores the computed or supplied value in a variable for later use.
		int target = 7; // Stores the computed or supplied value in a variable for later use.
		int result = minSubArrayLen(target, nums); // Stores the computed or supplied value in a variable for later use.
		System.out.println("Minimum size of subarray with sum at least " + target + ": " + result); // Prints the result to the console so the current state can be inspected.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
