package com.algo.leetcode.seventy_five;

import org.junit.Assert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Given an array of characters chars, compress it using the following algorithm:
 * <p>
 * Begin with an empty string s. For each group of consecutive repeating characters in chars:
 * <p>
 * If the group's length is 1, append the character to s.
 * Otherwise, append the character followed by the group's length.
 * The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.
 * <p>
 * After you are done modifying the input array, return the new length of the array.
 * <p>
 * You must write an algorithm that uses only constant extra space.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: chars = ['a','a','b','b','c','c','c']
 * Output: Return 6, and the first 6 characters of the input array should be: ['a','2','b','2','c','3']
 * Explanation: The groups are 'aa', 'bb', and 'ccc'. This compresses to 'a2b2c3'.
 * Example 2:
 * <p>
 * Input: chars = ['a']
 * Output: Return 1, and the first character of the input array should be: ['a']
 * Explanation: The only group is 'a', which remains uncompressed since it's a single character.
 * Example 3:
 * <p>
 * Input: chars = ['a','b','b','b','b','b','b','b','b','b','b','b','b']
 * Output: Return 4, and the first 4 characters of the input array should be: ['a','b','1','2'].
 * Explanation: The groups are 'a' and 'bbbbbbbbbbbb'. This compresses to 'ab12'.
 */
public class StringCompress_443 {

    public static void main(String[] args) {

        StringCompress_443 s = new StringCompress_443();
        char[] ch = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int out = s.compress(ch);
        System.out.println(ch);
        System.out.println(out);


        ch = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        out = s.compress(ch);
        System.out.println(out);

        ch = new char[]{'a'};
        out = s.compress(ch);
        System.out.println(out);


    }

    // ["a","a","a","b","b","a","a"]
    public int compress(char[] chars) {
        int fIdx = 0;
        int count = 1;
        char prevChar;
        for (int i = 0; i < chars.length; i++) {
            prevChar = chars[i];
            if (i + 1 < chars.length) {
                if (prevChar == chars[i + 1]) {
                    count++;
                    continue;
                }
            }
            if (count > 2) {
                chars[fIdx++] = prevChar;
                fIdx = convert(chars, count, fIdx);

            } else if (count == 2) {
                chars[fIdx++] = prevChar;
                fIdx = convert(chars, count, fIdx);
            } else {
                chars[fIdx++] = prevChar;
            }
            count = 1;
        }

        System.out.println(Arrays.toString(chars));
        return fIdx;

    }

    private int convert(char[] chars, int value, int fIdx) {
        String intString = String.valueOf(value); // Convert int to String
        char[] charArray = intString.toCharArray(); // Convert String to char[]

        // Printing each character in the char array
        for (char c : charArray) {
            chars[fIdx++] = c;
        }
        return fIdx;

    }

}
