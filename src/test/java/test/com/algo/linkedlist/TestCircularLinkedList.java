package test.com.algo.linkedlist;

import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Test;

import com.algo.linkedlist.CircularLinkedList;

public class TestCircularLinkedList {

	CircularLinkedList cll = new CircularLinkedList();

	@Test
	public void testCircularLinkedList() {
		IntStream.range(0, 10).forEach(i -> cll.add(++i));
		cll.printList();
		Assert.assertTrue(cll.isCircularLinkedList());
	}

}
