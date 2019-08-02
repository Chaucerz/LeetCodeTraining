package reverseWords;

public class Solution {
	
	
	 public static String reverseWords(String s) {
	        
		 char[] sArray = s.toCharArray();
		 int[] _spacePosition = new int[sArray.length];
		 char[] reverseArray = new char[sArray.length];
		 int t = 0;
		 for(int i = 0;i < sArray.length;i++){
			 
			 if(sArray[i] == ' '){
				 _spacePosition[t++] = i;
			 }
		 }
		 int[] spacePosition = new int[t];
		 
		 if(t == 0){
			 for(int i = sArray.length - 1;i >= 0;i--){
				 reverseArray[t++] = sArray[i];
			 }
		 }
		 else{
		 for(int i = 0; i < t; i++){
			 spacePosition[i] = _spacePosition[i];
		 }
		 }
		 int k = 0;
		 for(int i = 0; i < spacePosition.length; i++){
			 
			 if( i - 1 < 0){
				 for(int j = spacePosition[i] - 1 ; j >= 0;j--){
					 reverseArray[k++] = sArray[j];
				 }
					 k++;
			 }
			 else{
			for(int j = spacePosition[i] - 1 ;j > spacePosition[i - 1]; j--){
				reverseArray[k++] = sArray[j];
				
			}
				 k++;
		 }
			 if(i + 1 == spacePosition.length){
				 for(int j = sArray.length - 1;j >= spacePosition[i] + 1;j--){
					 reverseArray[k++] = sArray[j];
				 }
			 }
		 }

		 //String reverseString = new String(reverseArray);
		 StringBuffer out = new StringBuffer();
		 for(int i = 0; i < reverseArray.length;i++){
			 if(reverseArray[i] == '\u0000'){
				 out.append(" ");
			 }
			 else{
				 out.append(reverseArray[i]);
			 }
				 
		 }
		 return out.toString();
		 //return reverseString;
	    }

	 
	 public static void main(String[] args) {
		
		 String ss = "A man, a plan, a canal: Panama";
		 System.out.println(reverseWords(ss));
		 //reverseWords(ss);
	}
	 
	 
	 
	 
	 
	 
	 
	 
}
