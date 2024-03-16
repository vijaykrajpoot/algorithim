package parctice;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

public class URLUniqueKeyGeneratorCrypto {
	public static void main(String[] args) {
		try {
			// Generate a unique key using SHA-256 hashing
			String uniqueKey = generateUniqueKey();
			System.out.println("Generated unique key: " + uniqueKey);

			// Encode the key using Base64
			String base64EncodedKey = encodeToBase64(uniqueKey);
			System.out.println("Base64 encoded key: " + base64EncodedKey);

			// Extract the first 6 characters
			String sixCharacterKey = base64EncodedKey.substring(0, 6);
			System.out.println("Generated 6-character key: " + sixCharacterKey);
		} catch (NoSuchAlgorithmException e) {
			System.err.println("SHA-256 algorithm not available.");
		}
	}

	// Generate a unique key using SHA-256 hashing
	public static String generateUniqueKey() throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] hash = digest.digest(Long.toString(System.nanoTime()).getBytes());
		//byte[] hash = digest.digest();
		System.out.println("hash:"+ Arrays.toString(hash));
		System.out.println("Length:"+hash.length);
		String str=bytesToHex(hash);
		System.out.println("Hex String:"+ str);
		return str;
	}

	// Encode a string to Base64
	public static String encodeToBase64(String input) {
		return Base64.getEncoder().encodeToString(input.getBytes());
	}

	// Convert bytes to hexadecimal
	public static String bytesToHex(byte[] bytes) {
		StringBuilder result = new StringBuilder();
		for (byte b : bytes) {
			result.append(String.format("%02x", b));
		}
		return result.toString();
	}
}
