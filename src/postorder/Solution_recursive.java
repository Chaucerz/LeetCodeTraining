package postorder;

import java.util.ArrayList;
import java.util.List;

public class Solution_recursive {

	public List<Integer> postorder(Node root){
		List<Integer> ansList = new ArrayList<>();
		recursivePostOrder(root, ansList);
		return ansList;
	}
	
	void recursivePostOrder(Node root,List<Integer> ansList){
		if(root == null){
			return;
		}
		if(root.children != null){
			for(Node n : root.children){
				recursivePostOrder(n, ansList);
			}
		}
		ansList.add(root.val);
	}
	
}
