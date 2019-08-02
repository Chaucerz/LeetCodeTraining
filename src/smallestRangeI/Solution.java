package smallestRangeI;

public class Solution {
	
	 public int smallestRangeI(int[] A, int K) {
		 
		 int ans;
		 int max = A[0];
		 int min = A[0];
		 for(int i = 0; i < A.length;i++){
			 if(A[i] > max){
				 max = A[i];
			 }
			 if(A[i] < min){
				 min = A[i];
			 }
		 }
		 
		 if(max - min > 2*K){
			 ans = max+(-K) - (min+K);
		 }
		 else{
			 ans = 0;
		 }
		 
		 return ans;
	 }
	

}
