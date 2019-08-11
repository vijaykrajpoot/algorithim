package test.com.algo.linkedlist;

import java.util.stream.IntStream;
import org.junit.Test;
import com.algo.linkedlist.single.LinkedList;

public class TestGenericSingleList {

  @Test
  public void middleNode() {

    LinkedList<Integer> linkedList = new LinkedList<>();
    IntStream.range(1, 11).forEach(i -> linkedList.add(i));
    
    linkedList.displayList();
    
    System.out.println("Middle Node Logic1:" + linkedList.findMiddleNodeLogic1().getData());

    System.out.println("Middle Node Logic2:" + linkedList.findMiddleNodeLogic2().getData());
    System.out.println("Middle Node Logic3:" + linkedList.findMiddleNodeLogic3().getData());

  }

}
