package toLowerCase;

public class Solution {

	 public static String toLowerCase1(String str) {
		 
		 char[] strArray = str.toCharArray();
		 
		 for(int i = 0; i < strArray.length;i++){
			 
			 if(strArray[i] >= 'A' && strArray[i] <= 'Z'){
				 strArray[i] += 32;
			 }
			 
		 }
		 for(int i = 0; i < strArray.length;i++){
			 System.out.print(strArray[i]);
		 }
		 String ss = new String(strArray);
		 return ss;

	 }
	 
	 
	 public static void main(String[] args) {
		
		 String s = "HELLO";
		 System.out.println(toLowerCase1(s));
	}
}
