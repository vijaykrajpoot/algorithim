package com.algo.tree.graph;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


// Logic: visits nodes in a defined traversal order so each subtree is processed consistently and every node is checked.
public class BTreeRightSideView {

	public List<Integer> rightSideView(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		List<Integer> result = new ArrayList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int qSize=q.size();
			TreeNode node = q.poll();
			TreeNode lastElement = null;
			for (TreeNode treeNode : q) {
				lastElement = treeNode;
			}
			if (lastElement != null) {
				result.add(lastElement.val);
			}
			for (int i = 0; i < qSize; i++) {
				if (node.left != null) {
					q.add(node.left);
				}
				if (node.right != null) {
					q.add(node.right);
				}
			}
		}
		return result;
	}
}
