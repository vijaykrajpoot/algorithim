package parctice; // Declares the package so the class is organized under the correct Java namespace.

public class ValidPalindrome { // Defines the Java type that contains the related data and behavior.

	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		ValidPalindrome palindromeChecker = new ValidPalindrome(); // Stores the computed or supplied value in a variable for later use.
		String s1 = "A man, a plan, a canal: Panama"; // Stores the computed or supplied value in a variable for later use.
		String s2 = "race a car"; // Stores the computed or supplied value in a variable for later use.
		System.out.println("amanaplanacanalpanama: " + palindromeChecker.isPalindrome("ABCBA")); // true // Prints the result to the console so the current state can be inspected.
		System.out.println("Is \"" + s1 + "\" a palindrome? " + palindromeChecker.isPalindrome(s1)); // true // Prints the result to the console so the current state can be inspected.
		System.out.println("Is \"" + s2 + "\" a palindrome? " + palindromeChecker.isPalindrome(s2)); // false // Prints the result to the console so the current state can be inspected.

	} // Closes the current block and ends the active scope.

	boolean isPalindrome(String str) { // Defines the method that performs this unit of work for the class.
		 str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Stores the computed or supplied value in a variable for later use.

		char[] ch = str.toLowerCase().toCharArray(); // Stores the computed or supplied value in a variable for later use.
		for (int i = 0; i < ch.length /2; i++) { // Repeats the loop body as long as the loop condition remains true.
			if (ch[i] != ch[(ch.length - 1) - i]) { // Checks whether the condition is true before taking the matching action.
			//	System.out.println(ch[i] + ":" + ch[ch.length - 1 - i]);
				return false; // Returns the computed value to the caller and exits the method.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.
		return true; // Returns the computed value to the caller and exits the method.

	} // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
