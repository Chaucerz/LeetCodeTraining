package diStringMatch;

public class Solution {
	
	public int[] diStringMatch(String S) {
         
		int[] StringMatchArray = new int[S.length() + 1];
		int maxNum = S.length();
		int minNum = 0; 
		

		for(int i = 0; i < S.length();i++){
		
			if(S.charAt(i) == 'I'){
				StringMatchArray[i] = minNum;
				minNum++;
			}
			if(S.charAt(i) == 'D'){
				StringMatchArray[i] = maxNum;
				maxNum--;
			}
			
			if(S.charAt(S.length() - 1) == 'D')
				StringMatchArray[S.length()] = StringMatchArray[S.length() - 1] + 1;
			if(S.charAt(S.length() - 1) == 'I')
				StringMatchArray[S.length()] = StringMatchArray[S.length() - 1] - 1;
			
		}
        
		return StringMatchArray;
    }

}
