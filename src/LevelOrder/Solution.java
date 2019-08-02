package LevelOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root){
		
		List<List<Integer>> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();	
		queue.add(root);
		
		while(!queue.isEmpty()){
			int n = queue.size();
			List<Integer> list = new ArrayList<>();
			for(int i = 0; i < n; i++){
				TreeNode curr = queue.poll();
				list.add(curr.val);
				if(curr.left != null)
					queue.add(curr.left);
				if(curr.right != null)
					queue.add(curr.right);
			}
			result.add(list);
		}
		
		return result;
	}

}
