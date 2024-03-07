package com.algo.leetcode.seventy_five;
// 1768. Merge Strings Alternately
/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r

Example 2:
Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b
word2:    p   q   r   s
merged: a p b q   r   s

Example 3:
Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"

Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q
merged: a p b q c   d

Constraints:
		1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.*/

public class MergeAlternately {

	public static void main(String[] args) {
		MergeAlternately solution = new MergeAlternately();
		String word1 = "abcd";
		String word2 = "pq";
		String mergedString = solution.mergeAlternately(word1, word2);
		System.out.println("mergedString:"+ mergedString);
	}

	public String mergeAlternately(String word1, String word2) {

		char[] arr1 = word1.toCharArray();
		char[] arr2 = word2.toCharArray();
		int idx1 = 0;
		int idx2 = 0;
		int idx = 0;
		int len1 = arr1.length;
		int len2 = arr2.length;
		char[] arr = new char[len1 + len2];
		boolean skip = false;
		while (idx1 < len1 && idx2 < len2) {
			if (!skip) {
				arr[idx++] = arr1[idx1++];
			} else {
				arr[idx++] = arr2[idx2++];
			}
			skip = !skip;
		}
		while (idx1 < len1) {
			arr[idx++] = arr1[idx1++];
		}
		while (idx2 < len2) {
			arr[idx++] = arr2[idx2++];
		}
		return new String(arr);
	}


}
