package averageofLevelsinBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Solution {
	public List<Double> averageOfLevels(TreeNode root) {
		
		List<Double> resultlist = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		
		queue.add(root);
		while(!queue.isEmpty()){
			int length = queue.size();
			long sum = 0;
			int count = 0;
			List<Integer> elemList = new ArrayList<>();
			
			for(int i = 0; i < length; i++){ 	
				TreeNode node = queue.poll();
				//sum += node.val;
				//count ++;
				elemList.add(node.val);
				
				if(node.left != null)
					queue.add(node.left);
				if(node.right != null)
					queue.add(node.right);
			}
			
			for(int ele : elemList){
				sum += ele;	
			}
			resultlist.add(sum * 1.0 /elemList.size());
			//resultlist.add(sum * 1.0 /count);
		}
		
        return resultlist;
    }

}
