package com.algo.leetcode.seventy_five;

/**
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
 * <p>
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 * Example 2:
 * <p>
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 * <p>
 * Input: str1 = "ABBCABBC", str2 = "ABBC"
 * Output: "AB"
 * <p>
 * Example 3:
 * <p>
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= str1.length, str2.length <= 1000
 * str1 and str2 consist of English uppercase letters.
 */
public class GreatestCommonDivisor {
	public static void main(String[] args) {

		GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		String aa = gcd.gcdOfStrings("ABBCABBC", "ABBC");
		System.out.println(aa);

	}

	public String gcdOfStrings(String str1, String str2) {
		if (!(str1 + str2).equals(str2 + str1)) {
			return "";
		}
		int len1 = str1.length();
		int len2 = str2.length();
		int l = gcd(len1, len2);
		return str2.substring(0,l);

	}

	private int gcd(int a, int b) {

		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;

	}

}
