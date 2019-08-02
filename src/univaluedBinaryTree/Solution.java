package univaluedBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	List<Integer> arrayList;
	public boolean isUnivalTree(TreeNode root) {
		
		 arrayList = new ArrayList<>();
		 preorder(root);
		 
		 for(int val : arrayList){
			 if(val != arrayList.get(0)){
				 return false;
			 }
		 }
		 return true;
	
		
		
    }
	
	public void preorder(TreeNode root){
		
		if(root != null){
			arrayList.add(root.val);
			preorder(root.left);
			preorder(root.right);
		}
		
	}
}
