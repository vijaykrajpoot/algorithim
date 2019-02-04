package com.code.string.arrays.algo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class BracketsMatcher {

	public static boolean isBracketsBalanced(String str) {
		if(str==null || str.length()==0)
			throw new IllegalArgumentException("Invalid Input");	
		Stack<Character> stack = new Stack<Character>();
		HashMap<Character, Character> bracketsMap = new HashMap<Character, Character>();
		bracketsMap.put('(', ')');
		bracketsMap.put('[', ']');
		bracketsMap.put('{', '}');
		List<Character> openingBraces = Arrays.asList('{', '(', '[');
		List<Character> closingBraces = Arrays.asList('}', ')', ']');
		for (char charS : str.toCharArray()) {
			// Push opening brackets to stack
			if (openingBraces.contains(charS)) {
				stack.push(charS);
			} else if (closingBraces.contains(charS)) {
				char poppedChar = stack.pop(); // Since it is closing bracket then pop the opening
				if (!bracketsMap.get(poppedChar).equals(charS)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
