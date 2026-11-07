package test.com.code.string.arrays.algo; // Declares the package so the class is organized under the correct Java namespace.

import org.junit.Assert; // Imports the classes needed to support this file's logic.
import org.junit.Test; // Imports the classes needed to support this file's logic.

import com.algo.string.arrays.ReverseAnArray; // Imports the classes needed to support this file's logic.

public class ReverseAnArrayTest { // Defines the Java type that contains the related data and behavior.

	@Test // Provides metadata for the Java element that follows.
	public void testReverseArray() { // Defines the method that performs this unit of work for the class.
		int [] testArray={10,20,30,40,50}; // Stores the computed or supplied value in a variable for later use.
		int [] excepted={50,40,30,20,10}; // Stores the computed or supplied value in a variable for later use.
		int []reversedArray=ReverseAnArray.reverseArray(testArray);		 // Stores the computed or supplied value in a variable for later use.
		Assert.assertArrayEquals(excepted, reversedArray); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
	
	@Test // Provides metadata for the Java element that follows.
	public void testReverseArrayWhenOnly1Item() { // Defines the method that performs this unit of work for the class.
		int [] testArray={10}; // Stores the computed or supplied value in a variable for later use.
		int [] excepted={10}; // Stores the computed or supplied value in a variable for later use.
		int []reversedArray=ReverseAnArray.reverseArray(testArray);		 // Stores the computed or supplied value in a variable for later use.
		Assert.assertArrayEquals(excepted, reversedArray); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
	
	@Test // Provides metadata for the Java element that follows.
	public void testReverseArrayWhenOnly2Item() { // Defines the method that performs this unit of work for the class.
		int [] testArray={10,20}; // Stores the computed or supplied value in a variable for later use.
		int [] excepted={20,10}; // Stores the computed or supplied value in a variable for later use.
		int []reversedArray=ReverseAnArray.reverseArray(testArray);		 // Stores the computed or supplied value in a variable for later use.
		Assert.assertArrayEquals(excepted, reversedArray); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
	
	@Test // Provides metadata for the Java element that follows.
	public void testReverseArrayWhenNoItem() { // Defines the method that performs this unit of work for the class.
		int [] testArray={}; // Stores the computed or supplied value in a variable for later use.
		int [] excepted={}; // Stores the computed or supplied value in a variable for later use.
		int []reversedArray=ReverseAnArray.reverseArray(testArray);		 // Stores the computed or supplied value in a variable for later use.
		Assert.assertArrayEquals(excepted, reversedArray); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
	
	@Test(expected=IllegalArgumentException.class)	 // Provides metadata for the Java element that follows.
	public void testReverseArrayWhenNullArray() { // Defines the method that performs this unit of work for the class.
		int [] testArray=null; // Stores the computed or supplied value in a variable for later use.
		int [] excepted={}; // Stores the computed or supplied value in a variable for later use.
		int []reversedArray=ReverseAnArray.reverseArray(testArray);		 // Stores the computed or supplied value in a variable for later use.
		Assert.assertArrayEquals(excepted, reversedArray); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
	
	@Test	 // Provides metadata for the Java element that follows.
	public void testReverseArrayWhenItemsAreLessThenZERO() { // Defines the method that performs this unit of work for the class.
		int [] testArray={-100,45,-10,-1000}; // Stores the computed or supplied value in a variable for later use.
		int [] excepted={-1000,-10,45,-100}; // Stores the computed or supplied value in a variable for later use.
		int []reversedArray=ReverseAnArray.reverseArray(testArray);		 // Stores the computed or supplied value in a variable for later use.
		Assert.assertArrayEquals(excepted, reversedArray); // Executes the current statement to update state or trigger the required behavior.
	} // Closes the current block and ends the active scope.
} // Closes the current block and ends the active scope.
