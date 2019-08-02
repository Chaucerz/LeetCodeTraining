package binaryGap;

public class Solution {
	
	public static int binaryGap(int N) {
        
		String s = Integer.toBinaryString(N);
		int[] array = new int[s.length()];
		for(int i = 0 ; i < s.length(); i++){
			array[i] = s.charAt(i) - '0';
		}
		
		
		
		int count = 0;
		for(int i = 0 ;i < array.length; i++){
			if(array[i] == 1){
				count++;
			}
			
		}
		int[] array1  = new int[count]; 	
		int j = 0;
		for(int i = 0;i < array.length; i++){
			if(array[i] == 1){
				array1[j++] = i;
				
			}
		}
		int maxdistance = 0;
		for( int i = array1.length - 1; i > 0 ; i--){
			if(array1[i] - array1[i - 1] > maxdistance){
				maxdistance = array1[i] - array1[i - 1];
			}
		}
		
		return maxdistance;
    }

	
	public static void main(String[] args) {
		
		int N = 22;
		System.out.println(binaryGap(N));
	}





}

