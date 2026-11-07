package com.algo; // Declares the package so the class is organized under the correct Java namespace.

public class Pow { // Defines the Java type that contains the related data and behavior.
	static int i = 0; // Stores the computed or supplied value in a variable for later use.

	public double myPow(double x, long l) { // Defines the method that performs this unit of work for the class.
		if (l < 0) { // Checks whether the condition is true before taking the matching action.
			return 1 / pow(x, -l); // Returns the computed value to the caller and exits the method.
		} else { // Closes the current block and ends the active scope.
			return pow(x, l); // Returns the computed value to the caller and exits the method.
		} // Closes the current block and ends the active scope.
	} // Closes the current block and ends the active scope.

	private double pow(double x, long l) { // Defines the method that performs this unit of work for the class.
		if (l == 0) { // Checks whether the condition is true before taking the matching action.
			return 1.0; // Returns the computed value to the caller and exits the method.
		} // Closes the current block and ends the active scope.
		if (x == 1) { // Checks whether the condition is true before taking the matching action.
			return x; // Returns the computed value to the caller and exits the method.
		} // Closes the current block and ends the active scope.
		double val = pow(x, l / 2); // Stores the computed or supplied value in a variable for later use.
		System.out.println("Val:" + val); // Prints the result to the console so the current state can be inspected.
		if (l % 2 == 0) { // Checks whether the condition is true before taking the matching action.
			System.err.println("l is Even:" + l + " Val:" + val); // Executes the current statement to update state or trigger the required behavior.
			return val * val; // Returns the computed value to the caller and exits the method.
		} else { // Closes the current block and ends the active scope.

			System.err.println("l is Odd:" + l + " Val:" + val); // Executes the current statement to update state or trigger the required behavior.
			return val * val * x; // Returns the computed value to the caller and exits the method.
		} // Closes the current block and ends the active scope.

	} // Closes the current block and ends the active scope.

	public static void main(String[] args) { // Defines the method that performs this unit of work for the class.
		Pow pow = new Pow(); // Stores the computed or supplied value in a variable for later use.
		double aa = pow.myPow(2.2, 10); // Stores the computed or supplied value in a variable for later use.
		System.out.println(" Pow:" + aa); // Prints the result to the console so the current state can be inspected.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
