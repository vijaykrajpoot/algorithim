package com.algo.leetcode.seventy_five; // Declares the package so the class is organized under the correct Java namespace.

/**
 * There are n kids with candies. You are given an integer array candies,
 * where each candies[i] represents the number of candies
 * the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
 * <p>
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith
 * kid all the extraCandies, they will have the greatest number of candies among all the kids,
 * or false otherwise.
 * <p>
 * Note that multiple kids can have the greatest number of candies.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: candies = [2,3,5,1,3], extraCandies = 3
 * Output: [true,true,true,false,true]
 * Explanation: If you give all extraCandies to:
 * - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
 * - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
 * - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
 * - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
 * - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
 * Example 2:
 * <p>
 * Input: candies = [4,2,1,1,2], extraCandies = 1
 * Output: [true,false,false,false,false]
 * Explanation: There is only 1 extra candy.
 * Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
 * Example 3:
 * <p>
 * Input: candies = [12,1,12], extraCandies = 10
 * Output: [true,false,true]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * n == candies.length
 * 2 <= n <= 100
 * 1 <= candies[i] <= 100
 * 1 <= extraCandies <= 50
 */

import java.util.ArrayList; // Imports the classes needed to support this file's logic.
import java.util.Arrays; // Imports the classes needed to support this file's logic.
import java.util.OptionalInt; // Imports the classes needed to support this file's logic.

public class KidsWithMaxCandy { // Defines the Java type that contains the related data and behavior.
	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		KidsWithMaxCandy maxCandyList = new KidsWithMaxCandy(); // Stores the computed or supplied value in a variable for later use.
		ArrayList<Boolean> aa = maxCandyList.kidsWithCandies(new int[]{4,2,1,1,2}, 1); // Stores the computed or supplied value in a variable for later use.
		System.out.println(Arrays.toString(aa.toArray())); // Prints the result to the console so the current state can be inspected.
	} // Closes the current block and ends the active scope.

	public ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) { // Defines the method that performs this unit of work for the class.
		ArrayList<Boolean> candiesList = new ArrayList<>(); // Stores the computed or supplied value in a variable for later use.
		int max = 0; // Stores the computed or supplied value in a variable for later use.

		for(int i=0;i<candies.length;i++){ // Carries out the current statement to support the program's logic.
			if(candies[i]>max){ // Carries out the current statement to support the program's logic.
				max=candies[i]; // Stores the computed or supplied value in a variable for later use.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.

		for (int candy : candies) { // Repeats the loop body as long as the loop condition remains true.
			if ((candy + extraCandies) >= max) { // Checks whether the condition is true before taking the matching action.
				candiesList.add(true); // Executes the current statement to update state or trigger the required behavior.
			} else { // Closes the current block and ends the active scope.
				candiesList.add(false); // Executes the current statement to update state or trigger the required behavior.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.
		return candiesList; // Returns the computed value to the caller and exits the method.

	} // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
