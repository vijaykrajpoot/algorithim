package com.algo.leetcode.seventy_five;

/**
 * Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
 * <p>
 * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abciiidef", k = 3
 * Output: 3
 * Explanation: The substring "iii" contains 3 vowel letters.
 * Example 2:
 * <p>
 * Input: s = "aeiou", k = 2
 * Output: 2
 * Explanation: Any substring of length 2 contains 2 vowels.
 * Example 3:
 * <p>
 * Input: s = "leetcode", k = 3
 * Output: 2
 * Explanation: "lee", "eet" and "ode" contain 2 vowels.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 105
 * s consists of lowercase English letters.
 * 1 <= k <= s.length
 */

import java.util.*;


class MaxVowelsInSubString_1456 {
    HashSet<Character> hashSet = new HashSet<>();
    List<Character> aa = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public static void main(String[] args) {
        String st = "leetcode";
        int k = 2;
        MaxVowelsInSubString_1456 maxVowelsInSubString1456 = new MaxVowelsInSubString_1456();
        int result = maxVowelsInSubString1456.maxVowelSolution1(st, k);
        System.out.println(result);
    }

    public int maxVowelSolution2(String s, int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (isV(s.charAt(i))) {
                count++;
            }
        }
        int maxV = count;
        for (int i = k; i < s.length(); i++) {
            if (hashSet.contains(s.charAt(i))) {
                count++;
            }
            if (hashSet.contains(s.charAt(i - k))) {
                count--;
            }
        }

        if (maxV > count) {
            maxV = count;
        }
        return maxV;
    }

    private boolean isV(char c) {
        return hashSet.contains(c);
    }

    public int maxVowelSolution1(String s, int k) {
        int maxVcCount = 0;
        hashSet.addAll(aa);
        for (int i = 0; i < s.length(); i++) {
            if (i + k <= s.length()) {
                String st = s.substring(i, i + k);
                int c = countVW(st);
                if (c > maxVcCount) {
                    maxVcCount = c;
                }
            }
        }
        return maxVcCount;
    }

    int countVW(String st) {
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if (hashSet.contains(st.charAt(i))) {
                count++;
            }
        }
        return count;
    }


}
