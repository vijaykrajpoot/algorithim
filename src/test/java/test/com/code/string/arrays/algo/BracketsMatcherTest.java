package test.com.code.string.arrays.algo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.algo.string.arrays.BracketsMatcher;

public class BracketsMatcherTest {
	@Test
	public void testIsBracketsBalanced() {
		String str = "{[]()}";
		assertTrue(BracketsMatcher.isBracketsBalanced(str));
	}

	@Test
	public void testIsBracketsInBalanced() {
		String str = "{ [ ( ] ) }";
		assertFalse(BracketsMatcher.isBracketsBalanced(str));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testBracketBalancedWithEmptyString() {
		String str = "";
		assertFalse(BracketsMatcher.isBracketsBalanced(str));
	}
	
	@Test
	public void testWhenSingleBracket() {
		String str = "{";
		assertFalse(BracketsMatcher.isBracketsBalanced(str));
	}
}
