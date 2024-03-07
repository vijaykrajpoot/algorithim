package com.algo.string.arrays;

public class Anagram2 {

	public static void main(String[] args) {
		String s1="dormitory";
		String s2="dirty room";
		boolean result = isAnagram(s1, s2);
		if (result) {
			System.out.println("Test case Success: " + s1 + " and " + s2 + " should be detected as anagrams.");
		}else{
			System.err.println("Test case Failed: " + s1 + " and " + s2 + " should not be detected as anagrams.");

		}

	}

	static boolean isAnagram(String actualString, String targetString) {
		boolean result = false;
		char[] sourceArr = actualString.toCharArray();
		char[] tArr = targetString.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char c : tArr) {
			if (c == ' ')
				continue;
			int index = actualString.indexOf(c);
			if (index > -1) {
				result = true;
			//	System.out.println("sourceArr[" + index + "]:" + sourceArr[index]);
				sb.append(sourceArr[index]);
			}else{
				result =false;
				break;
			}
		}
		System.out.println(sb.toString());
		return result;
	}

}
