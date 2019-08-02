package preorder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import postorder.Node;

public class Solution_iterative {

	public List<Integer> preorder(Node root) {
		
		List<Integer> ansList = new ArrayList<>();
		
		if(root == null){
			return ansList;
		}
		
		Stack<Node> s = new Stack<>();
		Node tmp = null;
		s.push(root);
		while(!s.isEmpty()){
			tmp = s.pop();
			ansList.add(tmp.val);
			for(Node n : root.children){
				s.push(n);
				
			}
		}
		return ansList;
	}
}
