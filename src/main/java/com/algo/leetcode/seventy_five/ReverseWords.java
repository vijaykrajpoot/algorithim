package com.algo.leetcode.seventy_five;

import java.util.Arrays;

/**
 * Given an input string s, reverse the order of the words.
 * <p>
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * <p>
 * Return a string of the words in reverse order concatenated by a single space.
 * <p>
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 * Example 2:
 * <p>
 * Input: s = "  hello world  "
 * Output: "world hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 * Example 3:
 * <p>
 * Input: s = "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
public class ReverseWords {
    public static void main(String[] args) {
        String str = "   AA  BB  CC   ";
        trim(str.toCharArray());
        System.out.println("After Trim:" + str);
//        char[] charArray = str.toCharArray();
//        System.out.println("Original String: " + str);
//        reverseWords(charArray);
//        System.out.println("Reverse String : " + str);
    }


    public static void reverseWords(char[] str) {
        int start = 0;
        int tempIdx = 0;
        int k = 0;
        int end = str.length - 1;
        reverseIt(str, start, end);
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                k = i;
                reverseIt(str, start, i - 1);
                start = i + 1;
            }
        }
        reverseIt(str, k + 1, str.length - 1);
    }

    static void reverseIt(char[] ch, int start, int end) {
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }

    static void trim(char [] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Trim leading spaces
        while (left <= right && arr[left] == ' ') {
            left++;
        }

        // Trim trailing spaces
        while (right >= left && arr[right] == ' ') {
            right--;
        }

        int writeIndex = 0;
        boolean spaceFound = false;

        // Copy non-space characters to the beginning of the array
        for (int i = left; i <= right; i++) {
            char c = arr[i];

            if (c != ' ') {
                arr[writeIndex++] = c;
                spaceFound = false;
            } else if (!spaceFound) {
                arr[writeIndex++] = c;
                spaceFound = true;
            }
        }

        // Resize array if necessary
        if (writeIndex < arr.length) {
            arr = Arrays.copyOf(arr, writeIndex);
        }

        System.out.println("Trimmed: " + Arrays.toString(arr));
    }
}
