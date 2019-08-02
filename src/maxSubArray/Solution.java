package maxSubArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public int maxSubArray(int[] nums){
		
		int sum = 0;
		int max = nums[0];
		for(int i = 0; i < nums.length; i++){
			if(sum > 0)
				sum = sum + nums[i];
			else
				sum = nums[i];
			max = Math.max(max, sum);
		}
		return max;
	}
	

	
}
