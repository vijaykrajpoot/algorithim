package com.algo.string.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ValidParentheses {

	public static void main(String[] args) {
		System.out.println(ValidParentheses.isValidParentheses(" [ ( [ { ( ) } ] ) ]"));
	}

	public static boolean isValidParentheses(String str) {
		Stack<Character> charStack = new Stack<>();
		boolean isValid = true;
		List<Character> openingBrackets = Arrays.asList(new Character[] { '[', '{', '(' });
		List<Character> closingBrackets = Arrays.asList(new Character[] { ']', '}', ')' });

		HashMap<Character, Character> hashMap = new HashMap<Character, Character>();
		hashMap.put('(', ')');
		hashMap.put('[', ']');
		hashMap.put('{', '}');
		hashMap.put(')', '(');
		hashMap.put('}', '{');
		hashMap.put(']', '[');

		for (char ch : str.toCharArray()) {
			if (openingBrackets.contains(ch)) {
				charStack.push(ch);
			} else {
				if (closingBrackets.contains(ch)) {

					if (!charStack.isEmpty()) {
						if (hashMap.get(charStack.pop()).equals(ch)) {
							isValid = true;
						}else {
							isValid = false;
							break;
						}
					} else {
						isValid = false;
						break;
					}
				}
			}
		}

		return charStack.isEmpty() && isValid;
	}

}
