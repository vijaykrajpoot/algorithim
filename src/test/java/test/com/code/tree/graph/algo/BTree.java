package test.com.code.tree.graph.algo; // Declares the package so the class is organized under the correct Java namespace.

public class BTree { // Defines the Java type that contains the related data and behavior.

	private int value; // Declares a variable to hold data needed by this method.
	private BTree left; // Declares a variable to hold data needed by this method.
	private BTree right; // Declares a variable to hold data needed by this method.

	public int getValue() { // Defines the method that performs this unit of work for the class.
		return value; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

	public void setValue(int value) { // Defines the method that performs this unit of work for the class.
		this.value = value; // Stores the computed or supplied value in a variable for later use.
	} // Closes the current block and ends the active scope.

	public BTree getLeft() { // Defines the method that performs this unit of work for the class.
		return left; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

	public void setLeft(BTree left) { // Defines the method that performs this unit of work for the class.
		this.left = left; // Stores the computed or supplied value in a variable for later use.
	} // Closes the current block and ends the active scope.

	public BTree getRight() { // Defines the method that performs this unit of work for the class.
		return right; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.

	public void setRight(BTree right) { // Defines the method that performs this unit of work for the class.
		this.right = right; // Stores the computed or supplied value in a variable for later use.
	} // Closes the current block and ends the active scope.

	public BTree(int value) { // Defines the method that performs this unit of work for the class.
		this.value = value; // Stores the computed or supplied value in a variable for later use.
	} // Closes the current block and ends the active scope.
	
	public int get(BTree bTree, int value){ // Defines the method that performs this unit of work for the class.
		
		if(bTree==null){ // Carries out the current statement to support the program's logic.
			return 0; // Returns the computed value to the caller and exits the method.
		} // Closes the current block and ends the active scope.
		while(bTree.value!=value){			 // Carries out the current statement to support the program's logic.
			if(value>bTree.value){ // Carries out the current statement to support the program's logic.
				if(bTree.right!=null) // Carries out the current statement to support the program's logic.
					bTree=bTree.right; // Stores the computed or supplied value in a variable for later use.
				else // Runs this branch when the previous conditional check is false.
					return -1; // Returns the computed value to the caller and exits the method.
			}else{ // Closes the current block and ends the active scope.
				if(bTree.left!=null) // Carries out the current statement to support the program's logic.
					bTree=bTree.left; // Stores the computed or supplied value in a variable for later use.
				else // Runs this branch when the previous conditional check is false.
					return -1; // Returns the computed value to the caller and exits the method.
			} // Closes the current block and ends the active scope.
			
		} // Closes the current block and ends the active scope.
		return bTree.value; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.
	
	public void insert(BTree bTree, int value) { // Defines the method that performs this unit of work for the class.
		if (value < bTree.value) { // Checks whether the condition is true before taking the matching action.
			if (bTree.getLeft() != null) { // Checks whether the condition is true before taking the matching action.
				insert(bTree.getLeft(), value); // Executes the current statement to update state or trigger the required behavior.
			} else { // Closes the current block and ends the active scope.
				bTree.setLeft(new BTree(value)); // Executes the current statement to update state or trigger the required behavior.
			} // Closes the current block and ends the active scope.
		} else if (value > bTree.value) { // Closes the current block and ends the active scope.
			if (bTree.getRight() != null) { // Checks whether the condition is true before taking the matching action.
				insert(bTree.getRight(), value); // Executes the current statement to update state or trigger the required behavior.
			} else { // Closes the current block and ends the active scope.
				bTree.setRight(new BTree(value)); // Executes the current statement to update state or trigger the required behavior.
			} // Closes the current block and ends the active scope.
		} // Closes the current block and ends the active scope.
	} // Closes the current block and ends the active scope.

	public int getHight(BTree bt) { // Defines the method that performs this unit of work for the class.
		if (bt == null) { // Checks whether the condition is true before taking the matching action.
			return 0; // Returns the computed value to the caller and exits the method.
		} // Closes the current block and ends the active scope.
		return Math.max(getHight(bt.getLeft()), getHight(bt.getRight())) + 1; // Returns the computed value to the caller and exits the method.
	} // Closes the current block and ends the active scope.
	
} // Closes the current block and ends the active scope.
