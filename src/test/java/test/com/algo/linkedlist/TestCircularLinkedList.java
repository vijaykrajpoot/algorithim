package test.com.algo.linkedlist;
import java.util.stream.IntStream;
import org.junit.Assert;
import org.junit.Test;
import com.algo.linkedlist.CircularLinkedList;



// Logic: follows node references from one element to the next so items can be traversed, inserted, deleted, or inspected in sequence.
public class TestCircularLinkedList {
	CircularLinkedList cll = new CircularLinkedList();
	@Test

	public void testCircularLinkedList() {
		IntStream.range(0, 10).forEach(i -> cll.add(++i));
		cll.printList();
		Assert.assertTrue(cll.isCircularLinkedList());
	}
}
