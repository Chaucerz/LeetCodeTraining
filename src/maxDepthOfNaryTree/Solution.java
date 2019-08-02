package maxDepthOfNaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Solution {
	
	public int maxDepth(Node root){

		if(root == null)
			return 0;
		
		Queue<Node> queue = new LinkedList<>();
		
		queue.offer(root);
		int depth = 0;

		while(!queue.isEmpty()){
			int n = queue.size();
			for(int i = 0; i < n;i++){
				Node node = queue.poll();
				
				if(node.children != null){
					for(Node no : node.children){
						queue.add(no);
					}
				}
			}
			depth++;
		}
		return depth;
	}
	
	

}
