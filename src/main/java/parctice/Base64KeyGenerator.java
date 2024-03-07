package parctice;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;

public class Base64KeyGenerator {

	public static void main(String[] args) {
		// Determine the number of bytes needed to produce a 6-character Base64 encoding
		int bytesNeeded = 8; // Minimum number of bytes to produce 6 characters (4 * 3 = 12 / 4 = 3)

		// Generate random bytes
		byte[] bytes = generateRandomBytes(bytesNeeded);
		System.out.println(Arrays.toString(bytes));


		// Encode bytes into Base64 format
		String base64Encoded = Base64.getEncoder().encodeToString(bytes);
		System.out.println("base64Encoded:"+ base64Encoded);

		// Extract the first 6 characters
		String sixCharacterKey = base64Encoded.substring(0, 8);

		System.out.println("Generated 6-character key: " + sixCharacterKey);
	}

	// Method to generate random bytes
	public static byte[] generateRandomBytes(int length) {
		byte[] bytes = new byte[length];
		new SecureRandom().nextBytes(bytes);
		return bytes;
	}
}
