package com.algo.tree.graph;


import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

public class LevelOrderBottom {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result=new ArrayList<>();
		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()){
			int size=queue.size();
			List<Integer> list=new ArrayList<>();
			for(int i=0;i< size;i++){
				TreeNode node=queue.poll();
				if(node==null)
					continue;
				list.add(node.val);
				if(node.left!=null){
					queue.add(node.left);
				}
				if(node.right!=null){
					queue.add(node.right);
				}
			}
			if(list.size()>0)
				result.add(list);
		}

		Collections.reverse(result);
		return result;
	}
}
