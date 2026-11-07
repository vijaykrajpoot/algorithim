package test.com.code.string.arrays.algo; // Declares the package so the class is organized under the correct Java namespace.

import static org.junit.Assert.*; // Imports the classes needed to support this file's logic.

import org.junit.Test; // Imports the classes needed to support this file's logic.

import com.algo.string.arrays.BracketsMatcher; // Imports the classes needed to support this file's logic.

public class BracketsMatcherTest { // Defines the Java type that contains the related data and behavior.
	@Test // Provides metadata for the Java element that follows.
	public void testIsBracketsBalanced() { // Defines the method that performs this unit of work for the class.
		String str = "{[]()}"; // Stores the computed or supplied value in a variable for later use.
		assertTrue(BracketsMatcher.isBracketsBalanced(str)); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.

	@Test // Provides metadata for the Java element that follows.
	public void testIsBracketsInBalanced() { // Defines the method that performs this unit of work for the class.
		String str = "{ [ ( ] ) }"; // Stores the computed or supplied value in a variable for later use.
		assertFalse(BracketsMatcher.isBracketsBalanced(str)); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
	
	@Test(expected=IllegalArgumentException.class) // Provides metadata for the Java element that follows.
	public void testBracketBalancedWithEmptyString() { // Defines the method that performs this unit of work for the class.
		String str = ""; // Stores the computed or supplied value in a variable for later use.
		assertFalse(BracketsMatcher.isBracketsBalanced(str)); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
	
	@Test // Provides metadata for the Java element that follows.
	public void testWhenSingleBracket() { // Defines the method that performs this unit of work for the class.
		String str = "{"; // Stores the computed or supplied value in a variable for later use.
		assertFalse(BracketsMatcher.isBracketsBalanced(str)); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
