package reverseString;

public class Solution {

	public static String reverseString(String s){
		
		char[] reverseArray = s.toCharArray();
		char[] reArray = new char[reverseArray.length];
		int t = 0;
		for(int i = reverseArray.length - 1; i >= 0;i--){
			reArray[t++] = reverseArray[i];
		}
		
		String str = new String(reArray);
		return str;
	}
	
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(reverseString(s));
	}
}
