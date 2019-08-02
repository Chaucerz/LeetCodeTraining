package postorder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Solution {
	
	public List<Integer> postorder(Node root) {
		
	List<Integer> ansList = new ArrayList<>();		//存放遍历过的节点
	if(root == null){
		return ansList;
	}
	
	Stack<Node> s = new Stack<>();
	s.push(root);
	Node tmp = null;
	while(!s.isEmpty()){
		tmp = s.pop();
		ansList.add(tmp.val);						//将弹出的节点存到list中
		for(Node n : root.children){
			s.push(n);
			
		}
	}
	
	Collections.reverse(ansList);
	return ansList;
	
	
	}
	
}
