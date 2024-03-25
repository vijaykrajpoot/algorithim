package com.algo.leetcode.seventy_five;

import java.util.HashSet;

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 * <p>
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "hello"
 * Output: "holle"
 * Example 2:
 * <p>
 * Input: s = "leetcode"
 * Output: "leotcede"
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 3 * 105
 * s consist of printable ASCII characters.
 */
public class ReverseVowelsOfAString {
    HashSet<Character> hashSet = new HashSet<>();

    public static void main(String[] args) {
        ReverseVowelsOfAString reverseVowelsOfAString = new ReverseVowelsOfAString();
        reverseVowelsOfAString.prepareVowelSet();
        String rev = reverseVowelsOfAString.reverseVowels("leetcode");
        System.out.println(rev);


    }

    public String reverseVowels(String s) {
        int stIdx = 0;
        int endIdx = s.length() - 1;
        char[] charArray = s.toCharArray();

        while (stIdx < endIdx) {
            if (isVowel(s.charAt(stIdx)) && isVowel(s.charAt(endIdx))) {
                // Swap
                char temp = charArray[stIdx];
                charArray[stIdx] = charArray[endIdx];
                charArray[endIdx] = temp;
            } else if (!isVowel(s.charAt(stIdx))) {
                stIdx++;
                continue;
            } else if (!isVowel(s.charAt(endIdx))) {
                endIdx--;
                continue;
            }
            stIdx++;
            endIdx--;
        }
        return new String(charArray);
    }

    boolean isVowel(char ch) {
        return hashSet.contains(ch);
    }

    void prepareVowelSet() {
        char[] v = {'A', 'a', 'e', 'E', 'o', 'O', 'i', 'I', 'u', 'U'};
        for (char c : v) {
            this.hashSet.add(c);
        }
    }
}
