package com.algo.leetcode.seventy_five;

import java.util.HashMap;
import java.util.Stack;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * <p>
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
 * of the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
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
        boolean result=false;
        result = subSequence392.isSubsequence("abc", "ahbgdcdefg");
        System.out.println("isSubsequence:" + result);
//        result = subSequence392.isSubsequence("axc", "ahbgdc");
//        System.out.println("isSubsequence:" + result);
//        result = subSequence392.isSubsequence("acb", "ahbgdc");
//        System.out.println("isSubsequence:" + result);
//        result = subSequence392.isSubsequence("aaaaaa", "bbaaaas");
//        System.out.println("isSubsequence:" + result);


    }

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty())
            return true;
        if (t.isEmpty())
            return false;

        System.out.println("Source :"+ s);
        System.out.println("Target :"+ t);

        int sourceLen = s.length();
        int targetLen = t.length();
        int sourceIdx = 0;

        for (int targetIdx = 0; targetIdx < targetLen; targetIdx++) {
            if (t.charAt(targetIdx) == s.charAt(sourceIdx)) {
                sourceIdx++;
            }
            if (sourceIdx >=sourceLen) {
                return true;
            }
        }
        return false;

    }
}
