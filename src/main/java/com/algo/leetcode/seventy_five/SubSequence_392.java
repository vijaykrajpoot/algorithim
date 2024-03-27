package com.algo.leetcode.seventy_five;

import java.util.HashMap;
import java.util.Stack;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * <p>
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 100
 * 0 <= t.length <= 104
 * s and t consist only of lowercase English letters.
 */
public class SubSequence_392 {

    public static void main(String[] args) {
        SubSequence_392 subSequence392 = new SubSequence_392();
        boolean result = subSequence392.isSubsequence("abc", "ahbgdc");
        System.out.println("isSubsequence:" + result);
        result = subSequence392.isSubsequence("axc", "ahbgdc");
        System.out.println("isSubsequence:" + result);
        result = subSequence392.isSubsequence("acb", "ahbgdc");
        System.out.println("isSubsequence:" + result);
        result = subSequence392.isSubsequence("aaaaaa", "bbaaaas");
        System.out.println("isSubsequence:" + result);


    }

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty())
            return true;
        if (t.isEmpty())
            return false;
        int ls = s.length();
        int lt = t.length();
        int j = 0;
        for (int i = 0; i < lt; i++) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
            }
            if (j >= ls) {
                return true;
            }
        }
        return false;

    }
}
