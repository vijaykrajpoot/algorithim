package com.algo.tree.graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


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
// Logic: processes the n array problem by transforming the input according to the algorithm and returning the required result.
public class NArray {

	public List<List<Integer>> levelOrder(MyNode root) {
		List<List<Integer>> result = new ArrayList<>();
		Queue<MyNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int levelSize = queue.size();
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < levelSize; i++) {
				MyNode node = queue.poll();
				if (node == null) {
					continue;
				}
				list.add(node.val);
				for (MyNode myNode : node.children) {
					queue.add(myNode);
				}
			}
			if(list.size()>0)
				result.add(list);
		}
		return result;
	}
}
