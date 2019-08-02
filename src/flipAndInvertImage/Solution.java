package flipAndInvertImage;

public class Solution {
	
	public int[][] flipAndInvertImage(int[][] A) {
		
		int[][] B = new int[A.length][A[0].length];
		
		for(int i = 0; i < A.length;i++){
			int k = 0;
			for(int j = A[i].length - 1;j >= 0; j--){
				B[i][k++] = A[i][j];
			}
		}
		
		for(int i = 0; i < B.length; i++){
			
			for(int j = 0; j < B[i].length; j++){
				
				if(B[i][j] == 1){
					B[i][j] = 0;
				}
				else{
					B[i][j] = 1;
							
				}
			}
		}
		return B;
	}
	
	

}
