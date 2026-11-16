package parctice;


// Logic: compares characters from both ends toward the middle and stops on the first mismatch, because a palindrome must read the same forward and backward.
public class ValidPalindrome {

	public static void main(String[] args) {
		ValidPalindrome palindromeChecker = new ValidPalindrome();
		String s1 = "A man, a plan, a canal: Panama";
		String s2 = "race a car";
		System.out.println("amanaplanacanalpanama: " + palindromeChecker.isPalindrome("ABCBA"));
		System.out.println("Is \"" + s1 + "\" a palindrome? " + palindromeChecker.isPalindrome(s1));
		System.out.println("Is \"" + s2 + "\" a palindrome? " + palindromeChecker.isPalindrome(s2));
	}
	boolean isPalindrome(String str) {
		 str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		char[] ch = str.toLowerCase().toCharArray();
		for (int i = 0; i < ch.length /2; i++) {
			if (ch[i] != ch[(ch.length - 1) - i]) {
				return false;
			}
		}
		return true;
	}
}
