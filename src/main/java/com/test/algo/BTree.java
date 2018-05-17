package com.test.algo;
public class BTree {

	private int value;
	private BTree left;
	private BTree right;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public BTree getLeft() {
		return left;
	}

	public void setLeft(BTree left) {
		this.left = left;
	}

	public BTree getRight() {
		return right;
	}

	public void setRight(BTree right) {
		this.right = right;
	}

	public BTree(int value) {
		this.value = value;
	}
	
	public int get(BTree bTree, int value){
		
		if(bTree==null){
			return 0;
		}
		while(bTree.value!=value){			
			if(value>bTree.value){
				if(bTree.right!=null)
					bTree=bTree.right;
				else
					return -1;
			}else{
				if(bTree.left!=null)
					bTree=bTree.left;
				else
					return -1;
			}
			
		}
		return bTree.value;
	}
	
	public void insert(BTree bTree, int value) {
		if (value < bTree.value) {
			if (bTree.getLeft() != null) {
				insert(bTree.getLeft(), value);
			} else {
				bTree.setLeft(new BTree(value));
			}
		} else if (value > bTree.value) {
			if (bTree.getRight() != null) {
				insert(bTree.getRight(), value);
			} else {
				bTree.setRight(new BTree(value));
			}
		}
	}

	public int getHight(BTree bt) {
		if (bt == null) {
			return 0;
		}
		return Math.max(getHight(bt.getLeft()), getHight(bt.getRight())) + 1;
	}
	
}
