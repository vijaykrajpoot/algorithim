package parctice; // Declares the package so the class is organized under the correct Java namespace.

import java.security.MessageDigest; // Imports the classes needed to support this file's logic.
import java.security.NoSuchAlgorithmException; // Imports the classes needed to support this file's logic.
import java.util.Arrays; // Imports the classes needed to support this file's logic.
import java.util.Base64; // Imports the classes needed to support this file's logic.

public class URLUniqueKeyGeneratorCrypto { // Defines the Java type that contains the related data and behavior.
	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		try { // Attempts the guarded logic and prepares for possible failure.
			// Generate a unique key using SHA-256 hashing
			String uniqueKey = generateUniqueKey(); // Stores the computed or supplied value in a variable for later use.
			System.out.println("Generated unique key: " + uniqueKey); // Prints the result to the console so the current state can be inspected.

			// Encode the key using Base64
			String base64EncodedKey = encodeToBase64(uniqueKey); // Stores the computed or supplied value in a variable for later use.
			System.out.println("Base64 encoded key: " + base64EncodedKey); // Prints the result to the console so the current state can be inspected.

			// Extract the first 6 characters
			String sixCharacterKey = base64EncodedKey.substring(0, 6); // Stores the computed or supplied value in a variable for later use.
			System.out.println("Generated 6-character key: " + sixCharacterKey); // Prints the result to the console so the current state can be inspected.
		} catch (NoSuchAlgorithmException e) { // Closes the current block and ends the active scope.
			System.err.println("SHA-256 algorithm not available."); // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
	} // Closes the current block and ends the active scope.

	// Generate a unique key using SHA-256 hashing
	public static String generateUniqueKey() throws NoSuchAlgorithmException { // Carries out the current statement to support the program's logic.
		MessageDigest digest = MessageDigest.getInstance("SHA-256"); // Stores the computed or supplied value in a variable for later use.
		byte[] hash = digest.digest(Long.toString(System.nanoTime()).getBytes()); // Stores the computed or supplied value in a variable for later use.
		//byte[] hash = digest.digest();
		System.out.println("hash:"+ Arrays.toString(hash)); // Prints the result to the console so the current state can be inspected.
		System.out.println("Length:"+hash.length); // Prints the result to the console so the current state can be inspected.
		String str=bytesToHex(hash); // Stores the computed or supplied value in a variable for later use.
		System.out.println("Hex String:"+ str); // Prints the result to the console so the current state can be inspected.
		return str; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

	// Encode a string to Base64
	public static String encodeToBase64(String input) { // Defines the method that performs this unit of work for the class.
		return Base64.getEncoder().encodeToString(input.getBytes()); // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

	// Convert bytes to hexadecimal
	public static String bytesToHex(byte[] bytes) { // Defines the method that performs this unit of work for the class.
		StringBuilder result = new StringBuilder(); // Stores the computed or supplied value in a variable for later use.
		for (byte b : bytes) { // Repeats the loop body as long as the loop condition remains true.
			result.append(String.format("%02x", b)); // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
		return result.toString(); // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
