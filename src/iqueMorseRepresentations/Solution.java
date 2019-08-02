package iqueMorseRepresentations;

import java.util.HashSet;

public class Solution {


	public static int uniqueMorseRepresentations(String[] words) {
		
		String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
								".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
		HashSet<String> resultMorseCode = new HashSet<>();   //保存最后的结果
		
		for(String word : words){
			String resultCode = "";
			for(char letter : word.toCharArray()){
				resultCode += morseCodes[letter - 'a'];
			}
			resultMorseCode.add(resultCode);
		}
		
		
		return resultMorseCode.size();
		
		}
		
		
	public static void main(String[] args) {
		
		String[] s = {"gin", "zen", "gig", "msg"};
		System.out.println(uniqueMorseRepresentations(s));
	}
	
	
}
