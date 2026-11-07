package test.com.algo.linkedlist;
import java.util.stream.IntStream;
import org.junit.Assert;
import org.junit.Test;
import com.algo.linkedlist.CircularLinkedList;
// Logic: Traverses node references to add, remove, or inspect items in the linked structure.



public class TestCircularLinkedList {
	CircularLinkedList cll = new CircularLinkedList();
	@Test

	public void testCircularLinkedList() {
		IntStream.range(0, 10).forEach(i -> cll.add(++i));
		cll.printList();
		Assert.assertTrue(cll.isCircularLinkedList());
	}
}