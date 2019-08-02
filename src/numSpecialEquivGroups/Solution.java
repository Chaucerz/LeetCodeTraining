package numSpecialEquivGroups;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static int  numSpecialEquivGroups(String[] A) {
        
		Set<String> ans = new HashSet<>();
		
		for(int i = 0;i < A.length;i++){
			
			String oddStr = "";
			String evenStr = "";
			
			for(int j = 0; j < A[i].length(); j++){
				if(j % 2 == 0){
					evenStr += A[i].charAt(j);
				}
				else{
					oddStr += A[i].charAt(j);
				}
			}
			
			ans.add(sortString(evenStr) + sortString(oddStr));
		}
	
		return ans.size();
    }
	
	private static String sortString(String s){
		
		 char[] arr = s.toCharArray();
		 
		 for(int i = 0; i < arr.length - 1; i++){
			 for(int j = 0; j < arr.length - 1; j++){
				 if(arr[j] > arr[j+1]){
					 char temp = arr[j+1];
					 arr[j+1] = arr[j];
					 arr[j] = temp;
				 }
			 }
		 }
		 
		 return new String(arr);
	}
	
	
	
}
