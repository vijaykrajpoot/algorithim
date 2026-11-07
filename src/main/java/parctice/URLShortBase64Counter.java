package parctice; // Declares the package so the class is organized under the correct Java namespace.

import java.util.Random; // Imports the classes needed to support this file's logic.

public class URLShortBase64Counter { // Defines the Java type that contains the related data and behavior.

	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		//for(long l=1000;l<50000;l++)
			System.out.println("Final String:"+ URLShortBase64Counter.encodeBAse64(1324363883L)); // Prints the result to the console so the current state can be inspected.
	} // Closes the current block and ends the active scope.

	static String encodeBAse64(long counter) { // Defines the method that performs this unit of work for the class.
		String originalString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; // Stores the computed or supplied value in a variable for later use.
		StringBuilder stringBuilder = new StringBuilder(); // Stores the computed or supplied value in a variable for later use.
		long currentValue = counter; // Stores the computed or supplied value in a variable for later use.
		while (currentValue >= 62) { // Keeps executing this block until the loop condition becomes false.
			long q = currentValue / 62; // Stores the computed or supplied value in a variable for later use.
			int rem = (int) currentValue % 62; // Stores the computed or supplied value in a variable for later use.
			currentValue = q; // Stores the computed or supplied value in a variable for later use.
			System.out.println("rem:"+rem); // Prints the result to the console so the current state can be inspected.
			stringBuilder.append(originalString.charAt(rem)); // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
		// Ensure the string is at least 6 characters long by padding with zeros
		Random random=new Random(); // Stores the computed or supplied value in a variable for later use.
		System.out.println("Before:"+ stringBuilder); // Prints the result to the console so the current state can be inspected.
		while (stringBuilder.length() < 6) { // Keeps executing this block until the loop condition becomes false.
			stringBuilder.append(originalString.charAt(random.nextInt(62))); // Executes the current statement to update state or trigger the required behavior.
		} // Closes the current block and ends the active scope.
		return stringBuilder.toString(); // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
