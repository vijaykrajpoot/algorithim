package com.algo.string.arrays;
import java.util.Stack;
import java.util.concurrent.ConcurrentNavigableMap;


// Logic: processes the balanced brackets problem by transforming the input according to the algorithm and returning the required result.
public class BalancedBrackets {

    public static void main(String[] args) {
        boolean isBalanced = isBalanced("{{[[(())]]}}");
        System.out.println(isBalanced);
    }
    public static boolean isBalanced(String s) {
        java.util.Stack<Character> stack = new Stack<>();
        char poppedCh = ' ';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
                continue;
            } else if (stack.isEmpty()) {
                return false;
            }

            if (ch == '}' || ch == ']' || ch == ')') {
                poppedCh = stack.pop();
                if (poppedCh != '{' && ch == '}') {
                    return false;
                }
                if (poppedCh != '[' && ch == ']') {
                    return false;
                }
                if (poppedCh != '(' && ch == ')') {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
