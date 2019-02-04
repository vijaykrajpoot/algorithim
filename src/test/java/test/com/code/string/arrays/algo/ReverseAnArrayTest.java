package test.com.code.string.arrays.algo;

import org.junit.Assert;
import org.junit.Test;

import com.code.string.arrays.algo.ReverseAnArray;

public class ReverseAnArrayTest {

	@Test
	public void testReverseArray() {
		int [] testArray={10,20,30,40,50};
		int [] excepted={50,40,30,20,10};
		int []reversedArray=ReverseAnArray.reverseArray(testArray);		
		Assert.assertArrayEquals(excepted, reversedArray);
	}
	
	@Test
	public void testReverseArrayWhenOnly1Item() {
		int [] testArray={10};
		int [] excepted={10};
		int []reversedArray=ReverseAnArray.reverseArray(testArray);		
		Assert.assertArrayEquals(excepted, reversedArray);
	}
	
	@Test
	public void testReverseArrayWhenOnly2Item() {
		int [] testArray={10,20};
		int [] excepted={20,10};
		int []reversedArray=ReverseAnArray.reverseArray(testArray);		
		Assert.assertArrayEquals(excepted, reversedArray);
	}
	
	@Test
	public void testReverseArrayWhenNoItem() {
		int [] testArray={};
		int [] excepted={};
		int []reversedArray=ReverseAnArray.reverseArray(testArray);		
		Assert.assertArrayEquals(excepted, reversedArray);
	}
	
	@Test(expected=IllegalArgumentException.class)	
	public void testReverseArrayWhenNullArray() {
		int [] testArray=null;
		int [] excepted={};
		int []reversedArray=ReverseAnArray.reverseArray(testArray);		
		Assert.assertArrayEquals(excepted, reversedArray);
	}
	
	@Test	
	public void testReverseArrayWhenItemsAreLessThenZERO() {
		int [] testArray={-100,45,-10,-1000};
		int [] excepted={-1000,-10,45,-100};
		int []reversedArray=ReverseAnArray.reverseArray(testArray);		
		Assert.assertArrayEquals(excepted, reversedArray);
	}
}
