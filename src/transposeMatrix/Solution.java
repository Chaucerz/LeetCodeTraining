package transposeMatrix;

public class Solution {

	public static int[][] transpose(int[][] A){
		
		int[][] tranA = new int[A[0].length][A.length];
		
		
		for(int i = 0;i < tranA.length;i++){
			
			for(int j = 0; j < tranA[i].length;j++){
				tranA[i][j] = A[j][i];
			}
		}
		return tranA;
		

		
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] tranMatrix = transpose(matrix);
		
		for(int i = 0; i < tranMatrix.length; i++){
			for(int j = 0;j < tranMatrix[i].length;j++){
				System.out.print(tranMatrix[i][j]);
			}
		}
	}
}
