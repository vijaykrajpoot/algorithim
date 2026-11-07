package com.algo.string.arrays;
import java.util.Stack;
// Logic: Uses a stack to match opening and closing symbols in the correct order and detect invalid nesting.


public class BracketsMatcher {

	public static boolean isBracketsBalanced(String str) {
		if (str == null || str.length() == 0)
			throw new IllegalArgumentException("Invalid Input");
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (stack.isEmpty()) {
				return false;
			} else if (ch == ')' && stack.pop() != '(') {
				return false;
			} else if (ch == '}' && stack.pop() != '{') {
				return false;
			} else if (ch == ']' && stack.pop() != '[') {
				return false;
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		System.out.println(BracketsMatcher.isBracketsBalanced("([])"));
	}
}