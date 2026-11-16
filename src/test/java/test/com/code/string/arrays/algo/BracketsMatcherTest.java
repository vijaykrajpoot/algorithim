package test.com.code.string.arrays.algo;
import static org.junit.Assert.*;
import org.junit.Test;
import com.algo.string.arrays.BracketsMatcher;



// Logic: pushes opening brackets onto a stack and matches each closing bracket against the most recent opening bracket; a mismatch or leftover opener means the string is invalid.
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
