package SquaresofaSortedArray;

public class Solution {
	
	public static int[] sortedSquares(int[] A) {
		
		for(int i = 0; i < A.length; i++){
			
			if(A[i] < 0){
				A[i] = 0 - A[i];
			}	
		}
		
		for(int i = 0; i < A.length - 1; i++){
			for(int j = 0; j < A.length - 1; j++){
				if(A[j] > A[j+1]){
					int temp = A[j+1];
					A[j+1] = A[j];
					A[j] = temp;
					}
				
			}
		}
		
		for(int i = 0; i < A.length; i++){
			System.out.println(Math.pow(A[i], 2));
		}
		
		return A;
	}
	
	
	public static void main(String[] args) {
		
		int[] A = {-4,-1,0,3,10};
		sortedSquares(A);
	}

}
