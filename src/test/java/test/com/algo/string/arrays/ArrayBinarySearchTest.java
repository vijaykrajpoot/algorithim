package test.com.algo.string.arrays;
import static org.junit.Assert.*;
import java.util.stream.IntStream;
import org.junit.Test;
import com.algo.string.arrays.ArrayBinarySearch;



// Logic: keeps low and high bounds, computes the midpoint, and moves the search window left or right depending on whether the target is smaller or larger than the middle value.
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
