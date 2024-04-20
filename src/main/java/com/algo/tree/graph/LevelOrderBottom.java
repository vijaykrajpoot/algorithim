package com.algo.tree.graph;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

public class LevelOrderBottom {

    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int qSize = q.size();
            TreeNode lastElement = null;
            for (TreeNode treeNode : q) {
                lastElement = treeNode;
            }
            if (lastElement != null) {
                result.add(lastElement.val);
            }
            for (int i = 0; i < qSize; i++) {
                TreeNode node = q.poll();
                if (node == null)
                    continue;
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
