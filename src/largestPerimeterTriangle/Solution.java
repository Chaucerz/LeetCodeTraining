package largestPerimeterTriangle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public static int largestPerimeter(int[] A){
		
		Queue<int[]> queue = new LinkedList<>();
		List<Integer> resultList = new ArrayList<>();
		
		for(int i = 0; i < A.length; i++){
			for(int j = 1; j < A.length; j++){
				for(int k = 2; k < A.length; k++){
					
					if(i == j||i == k||j == k){
						continue;
					}
					int[] arr = new int[3];
					arr[0] = A[i];
					arr[1] = A[j];
					arr[2] = A[k];
					queue.add(arr);
				}
			}
		}
		
		while(!queue.isEmpty()){
			int[] curr = queue.poll();
			bubbleSort(curr);
			if(curr[0] + curr[1] <= curr[2])
				resultList.add(0);
			else
				resultList.add(curr[0]+curr[1]+curr[2]);
		}
		
		
			int max = resultList.get(0);
			for(int i = 0; i < resultList.size(); i++){

				if(resultList.get(i) > max)
					max = resultList.get(i);
			}
			return max;
		
		
	}
	
		
	

	public static int[] bubbleSort(int[] a){
		
		for(int i = 0; i < a.length - 1; i++){
			for(int j = 0; j < a.length - 1; j++){
				
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					 
				}
			}
		}
		return a;
	}

	
	
	public static void main(String[] args) {
		
		int[] arr = {3,6,2,3};
		System.out.println(largestPerimeter(arr));
	}
}
