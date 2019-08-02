package invertTree;

public class Solution {

/**
 * 反转二叉树：
 * 思路：从底层向上递归，先找到最左边的叶子节点和最右边			
 * @param root
 * @return
 */
	
	
	
	 public TreeNode invertTree(TreeNode root) {
	     
		 if(root == null)
			 return null;
		 
		 TreeNode leftNode = root.left;
		 TreeNode rightNode = root.right;
		 
		 if(root.left != null)
			 leftNode = invertTree(root.left);
		 
		 if(root.right != null)
			 rightNode = invertTree(root.right);
		 
		 
		 root.left = rightNode;
		 root.right = leftNode;
		 
		 return root;
		 
		 
		 
		 
		 
		 
		 
		 
	 }
	 
		
}
