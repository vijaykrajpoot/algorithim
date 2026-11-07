package com.algo.leetcode.seventy_five;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
public class Sample {
    public static void main(String[] args) {
        // Create a sample string that we want to reverse.
        String name = "ruchi arya";
        // Print the length of the string to confirm its size before reversing.
        System.out.println("Length:" + name.length());
        // Set the last index of the string so the loop can swap from the end toward the start.
        int len = name.length() - 1;
        // Convert the string into a character array so individual characters can be swapped in place.
        char[] ch = name.toCharArray();
        // Loop through the first half of the array and swap each character with its mirror from the end.
        for (int i = 0, j = len; i < len / 2; i++, j--) {
            // Save the character at the front index before overwriting it.
            char temp = ch[i];
            // Put the character from the end into the front position.
            ch[i] = ch[j];
            // Place the saved front character into the end position to complete the swap.
            ch[j] = temp;
        }
        // Print the original string to show it was not changed in the variable itself.
        System.out.println("Original String : " + name);
        // Print the reversed character array as the reversed string result.
        System.out.println("Reverse String  : " + new String(ch));
    }
}