package com.algo.string.arrays;
import java.util.HashMap;
// Logic: Solves the first unique character index problem by processing the input data, applying the required algorithmic rule, and returning the expected result.


public class FirstUniqueCharacterIndex {

	public static void main(String[] args) {
		System.out.println("FirstUniqueCharacter:" + FirstUniqueCharacterIndex.findFirstUniqueChracterIndex("LALALAND"));
	}
	public static int findFirstUniqueChracterIndex(String str) {
		int idx = 0;
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (Character ch : str.toCharArray()) {
			if (!hashMap.containsKey(ch)) {
				hashMap.put(ch, idx);
			} else {
				hashMap.put(ch, -1);
			}
			idx++;
		}
		System.out.println(hashMap);
		int minVal = Integer.MAX_VALUE;
		for (char ch : hashMap.keySet()) {
			if (hashMap.get(ch) > -1 && hashMap.get(ch) < minVal) {
				minVal = hashMap.get(ch);
			}
			System.out.println("minVal:" + minVal);
		}
		return minVal == Integer.MAX_VALUE ? -1 : minVal;
	}
}