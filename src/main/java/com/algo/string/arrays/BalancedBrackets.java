package com.algo.string.arrays;

import java.util.Stack;
import java.util.concurrent.ConcurrentNavigableMap;

public class BalancedBrackets {

    public static void main(String[] args) {
        String string = isBalanced("{{[[(())]]}}");
        System.out.println(string);
    }


    public static String isBalanced(String s) {

        java.util.Stack<Character> stack = new Stack<>();
        char poppedCh = ' ';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
                continue;
            } else if (stack.isEmpty()) {
                return "NO";
            }
            // closing
            if (ch == '}' || ch == ']' || ch == ')') {
                poppedCh = stack.pop();
                if (poppedCh != '{' && ch == '}') {
                    return "NO";
                }
                if (poppedCh != '[' && ch == ']') {
                    return "NO";
                }
                if (poppedCh != '(' && ch == ')') {
                    return "NO";
                }
            }
        }
        if (stack.isEmpty()) {
            return "YES";
        }
        return "NO";
    }


}
