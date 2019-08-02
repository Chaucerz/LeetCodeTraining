package preorder;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<Integer> preorder(Node root){
		
		List<Integer> ansList = new ArrayList<>();
		recursivePreOrder(root, ansList);
		return ansList;
		
	}
	
	void recursivePreOrder(Node root,List<Integer> ansList){
		
		if(root == null){
			return ;
		}
		ansList.add(root.val);
		if(root.children != null){
			for(Node n : root.children){
				recursivePreOrder(n, ansList);
				
			}
		}
	}
	
	
	
	
}
