package com.algo.string.arrays;

/**
 * Write a function that reverses a string. The input string is given as an array of characters char[]. Do not allocate extra space for another array, you must do this by modifying the input array
 * in-place with O(1) extra memory. You may assume all the characters consist of printable ascii characters.
 * 
 * @author Vijay
 *
 */
public class ReverseAString {

	public void reverseString(char[] s) {
		int len = s.length;
		char temp = ' ';
		for (int i = 0, j = len - 1; i < len/2; i++, j--) {
			temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			
		}

		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + ",");
		}
	}

	public static void main(String[] args) {
		//char aa[] =new char[] {'h','e','l','l','o',};
		char aa[] =null;
		new ReverseAString().reverseString(aa);

	}
}
