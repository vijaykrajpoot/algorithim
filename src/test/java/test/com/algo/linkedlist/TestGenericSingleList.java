package test.com.algo.linkedlist; // Declares the package so the class is organized under the correct Java namespace.

import java.util.stream.IntStream; // Imports the classes needed to support this file's logic.
import org.junit.Test; // Imports the classes needed to support this file's logic.
import com.algo.linkedlist.single.LinkedList; // Imports the classes needed to support this file's logic.

public class TestGenericSingleList { // Defines the Java type that contains the related data and behavior.

  @Test // Provides metadata for the Java element that follows.
  public void middleNode() { // Defines the method that performs this unit of work for the class.

    LinkedList<Integer> linkedList = new LinkedList<>(); // Stores the computed or supplied value in a variable for later use.
    IntStream.range(1, 11).forEach(i -> linkedList.add(i)); // Executes the current statement to update state or trigger the required behavior.
    linkedList.displayList(); // Executes the current statement to update state or trigger the required behavior.
    
    System.out.println("Middle Node Logic1:" + linkedList.findMiddleNodeLogic1().getData()); // Prints the result to the console so the current state can be inspected.

    System.out.println("Middle Node Logic2:" + linkedList.findMiddleNodeLogic2().getData()); // Prints the result to the console so the current state can be inspected.
    System.out.println("Middle Node Logic3:" + linkedList.findMiddleNodeLogic3().getData()); // Prints the result to the console so the current state can be inspected.

  } // Closes the current block and ends the active scope.

} // Closes the current block and ends the active scope.
