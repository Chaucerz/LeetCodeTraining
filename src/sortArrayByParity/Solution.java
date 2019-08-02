package sortArrayByParity;

import java.util.ArrayList;

public class Solution {

	
	 public int[] sortArrayByParity(int[] A) {
	        
		 ArrayList<Integer> onlyOdd = new ArrayList<Integer>();	//存放数组中的偶数
		 ArrayList<Integer> onlyEven = new ArrayList<Integer>();//存放数组中的奇数
		 
		 for(int i = 0; i < A.length; i++){
			 if(A[i] % 2 == 0 ){
				 onlyOdd.add(A[i]);
				 
			 }
			 else{
				 onlyEven.add(A[i]);
			 }
		 }
		 
		 for(int i = 0; i < onlyEven.size();i++){
			 onlyOdd.add(onlyEven.get(i));
		 }
		 
		 int[] array = new int[onlyOdd.size()];
		 for(int i = 0;i < onlyOdd.size();i++){
			 array[i] = onlyOdd.get(i);
		 }
		 
		 return array;
		 
		 
		 
	    }
	
	
	
	
	
}
