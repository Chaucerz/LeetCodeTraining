package invertBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_iteration {
	
	public TreeNode invertTree(TreeNode root){
		
		
		Queue<TreeNode> queue = new LinkedList<>();
		
		queue.add(root);
		
		while(!queue.isEmpty()){
			
			TreeNode curr = queue.poll();
			TreeNode temp = curr.right;
			curr.right = curr.left;
			curr.left = temp;
			
			queue.add(curr.left);
			queue.add(curr.right);
			
		}
		return root;
		
	}

}
