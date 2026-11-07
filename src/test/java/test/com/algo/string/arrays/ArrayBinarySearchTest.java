package test.com.algo.string.arrays;
import static org.junit.Assert.*;
import java.util.stream.IntStream;
import org.junit.Test;
import com.algo.string.arrays.ArrayBinarySearch;
// Logic: Repeatedly narrows the search range around the middle value until the target is found or the range is empty.



public class ArrayBinarySearchTest {
	@Test

	public void testSearch() {
		assertEquals(6,ArrayBinarySearch.search(IntStream.range(1, 10).toArray(),7));
	}
	@Test
	public void testSearchWith1Element() {
		assertEquals(-1,ArrayBinarySearch.search(IntStream.range(1, 2).toArray(),7));
	}
	@Test
	public void trueWhenSingleItem() {
		assertEquals(0,ArrayBinarySearch.search(IntStream.range(1, 2).toArray(),1));
	}
}