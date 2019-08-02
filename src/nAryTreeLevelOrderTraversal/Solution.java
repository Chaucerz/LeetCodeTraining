package nAryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	
	public List<List<Integer>> levelOrder(Node root) {
        
		if(root == null)
			return new ArrayList<>();
		
		
		List<List<Integer>> resultlist = new ArrayList<>();
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
	
		while(!queue.isEmpty()){
			int n = queue.size();
			List<Integer> list = new ArrayList<>();
			
			for(int i = 0; i < n; i++){
				Node node = queue.poll();
				list.add(node.val);
				
				if(node.children != null){
					for(Node no : node.children){
						queue.add(no);
					}
				}
				
			}
			resultlist.add(list);	
	
		}
		
		
		return resultlist;
		
		
    }
	
	
	

}
