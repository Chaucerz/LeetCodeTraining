package invertBinaryTree;

public class Solution {
	
	public TreeNode invertTree(TreeNode node) {
        
		if(node == null)
			return null;	
		
		
		TreeNode temp;
		
		temp = node.right;
		node.right = node.left;
		node.left = temp;
		
		
		invertTree(node.left);
		invertTree(node.right);
		
		return node;
		
					
		
    }
	
}
