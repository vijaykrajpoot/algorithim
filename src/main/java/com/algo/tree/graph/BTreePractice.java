package com.algo.tree.graph;

import java.util.*;

public class BTreePractice {
    TreeNode<Integer> root = null;

    void dfs(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        System.out.print(root.val + " ");
        dfs(root.right);

    }

    public int getHeightBFS(TreeNode root) {

        if (root == null) {
            return -1;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int height = -1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                if (root.left != null) {
                    queue.offer(root.left);
                }
                if (root.right != null) {
                    queue.offer(root.right);
                }
            }
            height++;
        }
        return height;
    }

    public int getHeight(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        int maxHeight = 0;
        if (leftHeight >= rightHeight) {
            maxHeight = leftHeight;
        } else {
            maxHeight = rightHeight;
        }
        return maxHeight + 1;

    }

    public void displayTree() {
        Stack<TreeNode<Integer>> globalStack = new Stack<>();
        globalStack.push(root);
        int nBlanks = 50;
        boolean isRowEmpty = false;
        while (isRowEmpty == false) {
            Stack<TreeNode<Integer>> localStack = new Stack<>();
            isRowEmpty = true;
            for (int j = 0; j < nBlanks; j++)
                System.out.print(' ');
            while (globalStack.isEmpty() == false) {
                TreeNode<Integer> temp = globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.val);
                    localStack.push(temp.left);
                    localStack.push(temp.right);
                    if (temp.left != null || temp.right != null)
                        isRowEmpty = false;
                } else {
                    System.out.print("##");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < nBlanks * 2 - 2; j++)
                    System.out.print(' ');
            } // end while globalStack not empty
            System.out.println();
            nBlanks /= 2;
            while (localStack.isEmpty() == false)
                globalStack.push(localStack.pop());
        } // end while isRowEmpty is false
    }

    public static void main(String[] args) {
        BTreePractice bt = new BTreePractice();
        bt.insert(bt.root, 55);
        bt.insert(bt.root, 20);
        bt.insert(bt.root, 30);
        bt.insert(bt.root, 40);
        bt.insert(bt.root, 50);
        bt.insert(bt.root, 60);
        bt.insert(bt.root, 70);
        bt.insert(bt.root, 80);
        bt.insert(bt.root, 55);
        bt.insert(bt.root, 56);
        bt.insert(bt.root, 57);
        bt.insert(bt.root, 75);
        bt.insert(bt.root, 62);
        bt.insert(bt.root, 63);
        bt.insert(bt.root, 63);
        bt.insert(bt.root, 19);
        bt.insert(bt.root, 18);
        bt.insert(bt.root, 17);
        bt.displayTree();
        bt.dfs(bt.root);
        List<List<Integer>> bfs = bt.bfs(bt.root);
        System.out.println();
        System.out.println(bfs);

//        System.out.println("Tree Height:" + bt.getHeight(bt.root));
//        List<List<Integer>> bfs = bt.bfs(bt.root);
//        System.out.println(bfs);
//
//        bfs = bt.zigzagLevelOrder(bt.root);
//        System.out.println(bfs);

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        Queue<TreeNode> q = new LinkedList<>();
        boolean skip = false;
        q.add(root);
        while (!q.isEmpty()) {
            int qSize = q.size();
            List<Integer> list = new ArrayList();
            for (int i = 0; i < qSize; i++) {
                TreeNode node = q.poll();
                if (node == null) {
                    continue;
                }
                list.add(node.val);
                if (node.left != null) {
                    if (skip) {
                        q.add(node.left);
                    } else {
                        q.add(node.right);
                    }
                }

                if (node.right != null) {
                    if (skip) {
                        q.add(node.right);
                    } else {
                        q.add(node.left);
                    }
                }
                skip = !skip;
            }
            if (list.size() > 0)
                result.add(list);
        }
        return result;
    }


    List<List<Integer>> bfs(TreeNode<Integer> root) {
        List<List<Integer>> bfs = new ArrayList<>();
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> values = new ArrayList<>();
            int s = queue.size();
            for (int i = 0; i < s; i++) {
                TreeNode<Integer> treeNode = queue.poll();
                values.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
            bfs.add(values);
        }
        return bfs;
    }

    void insert(TreeNode<Integer> root, int value) {

        if (this.root == null) {
            this.root = new TreeNode<>(value);
            return;
        }

        if (value < root.val) {
            if (root.left == null) {
                root.left = new TreeNode(value);
            } else {
                insert(root.left, value);
            }
        } else {
            if (root.right == null) {
                root.right = new TreeNode(value);
            } else {
                insert(root.right, value);
            }
        }
    }

}
