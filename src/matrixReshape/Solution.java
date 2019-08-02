package matrixReshape;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	
	public static int[][] matrixReshape(int [][] nums, int r, int c){
		
		int[][] res = new int[r][c];
		int numSum = nums.length * nums[0].length;
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[0].length; j++){
				queue.add(nums[i][j]);
			}
		}
		
		if(r*c > numSum || numSum != r * c || nums.length == 0)
			return nums;
		
		int k = 0;
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				res[i][j] = queue.remove();
			}
		}
		
		return nums;
	}

	
}
