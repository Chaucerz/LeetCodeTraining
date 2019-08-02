package increasingBST;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
    List<Integer> list = new ArrayList<>();
	public TreeNode increasingBST(TreeNode root) {
		
		inorder(root);
		TreeNode resultNode = new TreeNode(list.get(0));
		TreeNode currentNode = resultNode;
		for(int i = 1; i < list.size();i++){
			currentNode.right = new TreeNode(list.get(i));
			currentNode = currentNode.right;
		}
		return resultNode;
    }
	
	
	public void inorder(TreeNode root){
		if(root == null)
			return;
		inorder(root.left);
		list.add(root.val);
		inorder(root.right);
	}



}
