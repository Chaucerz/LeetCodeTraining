package titleToNumber;

public class Solution {
	
	 public int titleToNumber(String s) {
	        
		 int len = s.length();
		 
		 int result = 0;
		 
		 for(int i = len - 1; i >= 0; i--){
			 
			 result += (s.charAt(i) - 'A' + 1) * Math.pow(26, len - 1 - i);
		 }
	        return result;
	    }

}
