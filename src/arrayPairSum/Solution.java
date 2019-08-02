package arrayPairSum;

public class Solution {

	public static int[] bubbleSort(int[] array){
		
		for(int i = 0; i < array.length - 1 ;i++){
			
			for(int j = 0 ;j < array.length - 1 - i;j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
				
			}
		}
		
		return array;
	}
	
	
	public int arrayPairSum(int[] nums){
		
		int[] newNums = bubbleSort(nums);
		int sum = 0;
		for(int i = 0; i < newNums.length;i++){
			if(i == 0 || i % 2 == 0){
				sum += newNums[i];
			}
		}
		
		return sum;
		
	}
	

	}
