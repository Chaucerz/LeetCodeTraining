package sortArrayByParityII;

import java.util.Stack;

public class Solution {
	
	public int[] sortArrayByParityII(int[] A) {
		
		Stack<Integer> odd = new Stack<>();
		Stack<Integer> even = new Stack<>();
		
		int[] sortArray = new int[A.length];
        
		for(int num : A){
			if(num % 2 == 1){
				odd.add(num);
			}
			else{
				even.add(num);
			}
		}
		
		for(int i = 0; i < A.length; i++){
			if(i % 2 == 0){
				sortArray[i] = even.pop();
			}
			else{
				sortArray[i] = odd.pop();
			}
		}
		
		return sortArray;
    }

}
