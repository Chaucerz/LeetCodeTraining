package judgeCircle;

public class Solution {

	public static boolean judgeCircle(String moves) {
		
		int countL = 0;
		int countR = 0;
		int countU = 0;
		int countD = 0;
		
		for(char move : moves.toCharArray()){
		
			if(move == 'L'){
				countL++;
			}
			if(move == 'R'){
				countR++;
			}
			if(move == 'U'){
				countU++;
			}
			if(move == 'D'){
				countD++;
			}
	
		}
			
		if(countL == countR && countU == countD){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		String m = "LUDDRU";
		System.out.println(judgeCircle(m));
	}
	
	
	
	
}
