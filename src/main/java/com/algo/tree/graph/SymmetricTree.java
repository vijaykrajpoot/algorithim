package com.algo.tree.graph;


/*
Given a binary tree, check whether it is a mirror of itself i.e. symmetric around its centre.

Example One
Tree
https://aaronice.gitbook.io/lintcode/trees/symmetric-tree

https://aaronice.gitbook.io/lintcode/trees/symmetric-tree
*/


import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

    static Boolean check_if_symmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int qSize = queue.size();
            Object[] nodeArr = queue.toArray();
            for (int idx = 0; idx < qSize / 2; idx++) {
                if (((TreeNode) nodeArr[idx]).val != ((TreeNode) nodeArr[qSize - idx - 1]).val) {
                    return false;
                }
            }
            for (int i = 0; i < qSize; i++) {
                TreeNode treeNode = queue.poll();
                if (treeNode == null) {
                    continue;
                }
                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }
            }
        }
        // Write your code here.
        return true;
    }


}
