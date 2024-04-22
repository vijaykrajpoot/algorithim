package com.algo.string.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Two friends like to pool their money and go to the ice cream parlor. They always choose two distinct flavors and they spend all of their money.
 * <p>
 * Given a list of prices for the flavors of ice cream, select the two that will cost all of the money they have.
 * <p>
 * Example.
 * <p>
 * The two flavors that cost  and  meet the criteria. Using -based indexing, they are at indices  and .
 * <p>
 * Function Description
 * <p>
 * Complete the icecreamParlor function in the editor below.
 * <p>
 * icecreamParlor has the following parameter(s):
 * <p>
 * int m: the amount of money they have to spend
 * int cost[n]: the cost of each flavor of ice cream
 * Returns
 * <p>
 * int[2]: the indices of the prices of the two flavors they buy, sorted ascending
 * Input Format
 * <p>
 * The first line contains an integer, , the number of trips to the ice cream parlor. The next  sets of lines each describe a visit.
 * <p>
 * Each trip is described as follows:
 * <p>
 * The integer , the amount of money they have pooled.
 * The integer , the number of flavors offered at the time.
 * space-separated integers denoting the cost of each flavor: .
 * Note: The index within the cost array represents the flavor of the ice cream purchased.
 * <p>
 * Constraints
 * <p>
 * , ∀
 * There will always be a unique solution.
 */
public class IceCreamParlor {

    public static void main(String[] args) {
        List<Integer> aa = Arrays.asList(1, 4, 5, 3, 2);
        List<Integer> out = icecreamParlor(4, aa);
        System.out.println(out);
    }


    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        HashMap<Integer, Integer> hh = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.size(); i++) {
            int sum = m - arr.get(i);
            if (hh.containsKey(sum)) {
                return Arrays.asList(i, hh.get(sum));
            } else {
                hh.put(arr.get(i)+1, i+1);
            }

        }
        return List.of();
    }


}
