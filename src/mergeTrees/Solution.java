package mergeTrees;

public class Solution {
	
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		
		if(t1 == null){
			return t2;
		}
		if(t2 == null){
			return t1;
		}
		
		
		TreeNode mergeTree = new TreeNode(0);
		mergeTree.val = t1.val + t2.val;
		mergeTree.left = mergeTrees(t1.left, t2.left);
		mergeTree.right = mergeTrees(t1.right, t2.right);
		return mergeTree;
		
		
		
		
		
	}
	
}
