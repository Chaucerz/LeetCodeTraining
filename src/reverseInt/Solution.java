package reverseInt;

public class Solution {
	public static int reverse(int x){
		
		if(x < Math.pow(-2, 31)||x > Math.pow(2, 31) - 1)
			return 0;
		
		StringBuilder sb = new StringBuilder();
		while(x != 0){
			if(x > 0){
				if(x % 10 == 0){
					x /= 10;
				}else{
					sb.append(String.valueOf(x % 10));
					x /= 10;
				}
			}else{
				sb.append("-");
				x = Math.abs(x);
			}
		}
		return Integer.parseInt(sb.toString());
	}
	
	public static void main(String[] args) {
		System.out.println(reverse(-123));
		
	}
}
