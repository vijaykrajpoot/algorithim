package parctice;
import com.algo.string.arrays.ValidParentheses;
import java.util.Stack;
public class ValidBrackets {
	public static void main(String[] args) {
		ValidBrackets validator = new ValidBrackets();
		System.out.println(validator.isValid("()"));
		System.out.println(validator.isValid("()[]{}"));
		System.out.println(validator.isValid("(]"));
		System.out.println(validator.isValid("([)]"));
		System.out.println(validator.isValid("{[]}"));
	}
	public boolean isValid(String str) {
		char[] ch = str.toCharArray();
		Stack<Character> charStack = new Stack<>();
		for (char c : ch) {
			if (c == '{' || c == '(' || c == '[') {
				charStack.push(c);
			} else if(charStack.isEmpty()){
				return false;
			}else if (c == ')' && charStack.pop() != '('){
				return false;
			}else if (c == '}' && charStack.pop() != '{'){
				return false;
			}else if (c == ']' && charStack.pop() != '['){
				return false;
			}
		}
		return charStack.isEmpty();
	}
}