package test.com.code.linkedlist.algo;

import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Test;

import com.code.linkedlist.algo.LinkedList;

public class TestSingleLinkedList {

	LinkedList ll=new LinkedList();

	@Test
	public void createLinkedList() {
		IntStream.range(0, 10).forEach(i -> ll.add(++i));
		Assert.assertTrue(ll.size()==10);
	}
	
	@Test
	public void findMidLinkedListLogic1() {
		IntStream.range(1, 10).forEach(i -> ll.add(i));
		Assert.assertTrue(ll.findMiddleNodeLogic1().data==5);
		//ll.printList();
	}
	@Test
	public void findMidLinkedListLogic2() {
		IntStream.range(1, 10).forEach(i -> ll.add(i));
		Assert.assertTrue(ll.findMiddleNodeLogic2().data==5);
		//ll.printList();
	}
	@Test
	public void findMidWhen1ElementLog2() {
		IntStream.range(1, 2).forEach(i -> ll.add(i));
		ll.printList("findMidWhen1ElementLog2:");
		Assert.assertTrue(ll.findMiddleNodeLogic2().data==1);
		
	}
	@Test
	public void findMidWhen1ElementLog1() {
		IntStream.range(1, 2).forEach(i -> ll.add(i));
		ll.printList("findMidWhen1ElementLog1:");
		Assert.assertTrue(ll.findMiddleNodeLogic1().data==1);
		
	}
	
	
	@Test(expected=IllegalStateException.class)
	public void findMidWhenZeroElementLogic2() {
		IntStream.range(1, 1).forEach(i -> ll.add(i));
		Assert.assertNotNull(ll.findMiddleNodeLogic2());
	//	ll.printList();
	}
	
	
	
	@Test
	public void findMidWhenListisEvenSizeLogic2() {
		IntStream.range(1, 11).forEach(i -> ll.add(i));
	//	ll.printList();
		Assert.assertTrue(ll.findMiddleNodeLogic2().data==6);
		
	}
	
	@Test
	public void findMidWhenListisEvenSizeLogic1() {
		IntStream.range(1, 11).forEach(i -> ll.add(i));
	//	ll.printList();
		Assert.assertTrue(ll.findMiddleNodeLogic1().data==6);
		
	}

}
