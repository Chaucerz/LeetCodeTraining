package leafSimilar;

import java.util.ArrayList;

public class Solution {

	 public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		 
		 ArrayList<Integer> root1List = new ArrayList<>();
	     ArrayList<Integer> root2List = new ArrayList<>();
	     root1List = leafNodeArray(root1,root1List);
	     root2List = leafNodeArray(root2,root2List);
	     
	     if(root1List.size() != root2List.size()){
	    	 return false;
	     }
	     if(root1List.equals(root2List))
	    	 return true;
	     return false;
	    }
	
	
	 public ArrayList<Integer> leafNodeArray(TreeNode root,ArrayList<Integer> leafList){
		 if(root == null)
			 return null;
		 
		 if(root.left == null && root.right == null){
			 leafList.add(root.val);
		 }
		 if(root.left != null){
			 leafNodeArray(root.left,leafList);
		 }
		 if(root.right != null){
			 leafNodeArray(root.right,leafList);
		 }
		 return leafList;
	 }
	 
}
