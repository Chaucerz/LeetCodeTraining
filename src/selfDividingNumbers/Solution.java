package selfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	 public List<Integer> selfDividingNumbers(int left, int right){
		 
		 List sDNum = new ArrayList<>();
		 for(int i = left; i <= right; i++){
			 
			 if(i / 10 == 0 && i != 0){
				 sDNum.add(i);
			 }
			 if(i / 100 == 0){
				 int gewei = i % 10;
				 int shiwei = i / 10;
				 if( gewei == 0 || shiwei == 0 )
					 continue;
				 if(i % gewei == 0 && i % shiwei == 0)
					 sDNum.add(i);
			 }
			 if(i / 1000 == 0){
				 int gewei = i % 10;
				 int shiwei = (i % 100) / 10;
				 int baiwei = i / 100;
				 if( gewei == 0 || shiwei == 0 || baiwei == 0)
					 continue;
				 if(i % gewei == 0 && i % shiwei == 0 && i % baiwei == 0)
					 sDNum.add(i);
			 }
			 if(i / 10000 == 0){
				 int gewei = i % 10;
				 int shiwei = (i % 100) / 10;
				 int baiwei = (i & 1000) / 100;
				 int qianwei = i / 1000 ;
				 if( gewei == 0 || shiwei == 0 || baiwei == 0 || qianwei == 0)
					 continue;
				 if(i % gewei == 0 && i % shiwei == 0 && i % baiwei == 0 && i % qianwei == 0)
					 sDNum.add(i);
			 }
			 if (i == 10000)
				 break;
			 
			 
		 }
		 
		 return sDNum;
		 
		 
	 }
	
	
}
