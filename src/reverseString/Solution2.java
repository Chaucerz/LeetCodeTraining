package reverseString;

public class Solution2 {
	
	public static String reverseWords(String s){
		char[] strArr = s.toCharArray();
		int start = 0;
		int end = strArr.length - 1;
		
		while(start < end){
			char temp = strArr[end];
			strArr[end] = strArr[start];
			strArr[start] = temp;
			start++;
			end--;
		}
		
		String str = new String(strArr);
		return str;
	}
	
	
}
