package permute;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public  List<List<Integer>> permute(int[] nums) {
          
    	Permute(nums,0,nums.length - 1);   	
    	return res;
    }
    
    public void Permute(int[] nums, int start, int end){
        
        List<Integer> list = new ArrayList<>();
        if(start == end){
            for(Integer i : nums){
                list.add(i);
            }
            res.add(list);
        }else {
            for(int i = start; i <= end; i++){
                swap(nums, start, i);
                Permute(nums, start + 1,end);
                swap(nums, start, i);
            }  
        }
    }
    
    public  void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
    
}