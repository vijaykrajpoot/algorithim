package parctice; // Declares the package so the class is organized under the correct Java namespace.

import java.security.MessageDigest; // Imports the classes needed to support this file's logic.
import java.security.NoSuchAlgorithmException; // Imports the classes needed to support this file's logic.
import java.util.HashSet; // Imports the classes needed to support this file's logic.
import java.util.Random; // Imports the classes needed to support this file's logic.

public class URLRandomShort { // Defines the Java type that contains the related data and behavior.
	private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // Stores the computed or supplied value in a variable for later use.
	private static final int SHORT_URL_LENGTH = 6; // Stores the computed or supplied value in a variable for later use.

	public static void main(String[] args) throws NoSuchAlgorithmException { // Carries out the current statement to support the program's logic.
		Random random = new Random(); // Stores the computed or supplied value in a variable for later use.
		HashSet<String> hashSet = new HashSet<>(); // Stores the computed or supplied value in a variable for later use.
		StringBuilder stringBuilder = new StringBuilder(); // Stores the computed or supplied value in a variable for later use.
		int cc = 0; // Stores the computed or supplied value in a variable for later use.
		while (cc < Integer.MAX_VALUE) { // Keeps executing this block until the loop condition becomes false.
			MessageDigest digest = MessageDigest.getInstance("SHA-256"); // Stores the computed or supplied value in a variable for later use.
			byte[] hash = digest.digest(Long.toString(cc).getBytes()); // Stores the computed or supplied value in a variable for later use.

			for (int i = 0; i < SHORT_URL_LENGTH; i++) { // Repeats the loop body as long as the loop condition remains true.
				int idx = random.nextInt(CHARACTERS.length()); // Stores the computed or supplied value in a variable for later use.
				stringBuilder.append(CHARACTERS.charAt(idx)); // Executes the current statement to update state or trigger the required behavior.
			} // Closes the current block and ends the active scope.

			boolean added = hashSet.add( stringBuilder.toString()); // Stores the computed or supplied value in a variable for later use.
		//	System.out.println(hashSet);
			if (!added) { // Checks whether the condition is true before taking the matching action.
				System.out.println("Duplicate: ["+cc+"]: " + stringBuilder.toString()); // Prints the result to the console so the current state can be inspected.
			} // Closes the current block and ends the active scope.
			stringBuilder.setLength(0); // Executes the current statement to update state or trigger the required behavior.
			cc++; // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
		System.out.println(hashSet); // Prints the result to the console so the current state can be inspected.
	} // Closes the current block and ends the active scope.


} // Closes the current block and ends the active scope.
