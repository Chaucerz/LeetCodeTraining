package projectionArea;

public class Solution {
	
	public static int projectionArea(int[][] grid) {
		
        int top = 0;
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[0].length; j++){
				if(grid[i][j] > 0)
					top++;
			}
		}
		
		int maxColumn = 0;
		int maxColumnSum = 0;
		for(int i = 0; i < grid[0].length; i++){
			for(int j = 0; j < grid.length; j++){
				if(grid[j][i] > maxColumn){
					maxColumn = grid[j][i];
				}
			}
			maxColumnSum += maxColumn;
			maxColumn =0;
		}
		
		int maxRow = 0;
		int maxRowSum = 0;
		
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[i].length; j++){
				if(grid[i][j] > maxRow){
					maxRow = grid[i][j];
				}
			}
			maxRowSum += maxRow;
			maxRow = 0;
		}
		
		return  maxColumnSum + maxRowSum + top;
    }

	public static void main(String[] args) {
		
		int[][] grid = {{1,4},{1,1}};
		System.out.println(projectionArea(grid));
	}
}
