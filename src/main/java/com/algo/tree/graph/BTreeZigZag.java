package com.algo.tree.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTreeZigZag {

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result=new ArrayList();
		Queue<TreeNode> q=new LinkedList<>();
		boolean skip=false;
		q.add(root);
		while(!q.isEmpty()){
			int qSize=q.size();
			List<Integer> list=new ArrayList();
			for( int i = 0;i<qSize; i++ ){
				TreeNode node=q.poll();
				if(node==null){
					continue;
				}
				list.add(node.val);
				if(node.left!=null){
					if(skip){
						q.add(node.left);
					}else{
						q.add(node.right);
					}
				}

				if(node.right!=null){
					if(skip){
						q.add(node.right);
					}else{
						q.add(node.left);
					}
				}
				skip=!skip;
			}
			if(list.size()>0)
				result.add(list);
		}
		return result;
	}
}
