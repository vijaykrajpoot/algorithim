package com.algo.tree.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Definition for a Node.
class MyNode {
	public int val;
	public List<MyNode> children;

	public MyNode() {
	}

	public MyNode(int _val) {
		val = _val;
	}

	public MyNode(int _val, List<MyNode> _children) {
		val = _val;
		children = _children;
	}
};

public class NArray {

	public List<List<Integer>> levelOrder(MyNode root) {
		List<List<Integer>> result = new ArrayList<>();  //1
		Queue<MyNode> queue = new LinkedList<>();   //1
		queue.add(root); // add root
		while (!queue.isEmpty()) {
			int levelSize = queue.size();
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < levelSize; i++) { // O(N)
				MyNode node = queue.poll();
				if (node == null) {
					continue;
				}
				list.add(node.val);
				// Add the child nodes to queue.
				for (MyNode myNode : node.children) {  //O(N)
					queue.add(myNode);
				}
			}
			if(list.size()>0)
				result.add(list);
		}
		return result;
	}


}
