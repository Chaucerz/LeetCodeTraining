package KClosestPointstoOrigin;

import java.util.Arrays;

public class Solution {
	
	public int[][] kClosest(int[][] points, int K) {
		
		int[] results = new int[points.length];
		
		for(int i = 0; i < points.length; i++){
			results[i] = dist(points[i]);
		}

		Arrays.sort(results);
		int[][] ans = new int[K][2];
		int t = 0;
		
		for(int i = 0; i < points.length; i++){
			if(dist(points[i]) <= results[K - 1]){
				ans[t++] = points[i];
			}
		}
		return ans;
	}
	
	public int dist(int[] points){
		return points[0]*points[0]+points[1]*points[1];
	}

}
