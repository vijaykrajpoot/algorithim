package com.algo.tree.graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;
// Logic: Walks the tree using a defined traversal order so every node is visited and processed correctly.


public class BTreeTraversal {
    TreeNode root;

    public static void main(String[] args) {
        BTreeTraversal binaryTree = new BTreeTraversal();
        binaryTree.root = new TreeNode(3);
        binaryTree.root.left = new TreeNode(9);
        binaryTree.root.left.left = null;
        binaryTree.root.left.right = null;
        binaryTree.root.right = new TreeNode(20);
        binaryTree.root.right.left = new TreeNode(15);
        binaryTree.root.right.right = new TreeNode(7);
        binaryTree.displayTree(binaryTree.root, 0);
        List<List<Integer>> result = binaryTree.bfs(binaryTree.root);
        System.out.println(result);
    }
    private void displayTree(TreeNode node, int level) {
        if (node == null)
            return;
        displayTree(node.right, level + 1);
        for (int i = 0; i < level; i++) {
            System.out.print("\t\t");
        }
        System.out.println(node.val);
        displayTree(node.left, level + 1);
    }
    public List<List<Integer>> bfs(TreeNode root) {
        List<List<Integer>> Values = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> nodeValues = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                nodeValues.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
            Values.add(nodeValues);
        }
        return Values;
    }
}