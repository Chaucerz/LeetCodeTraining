package reorderLogFiles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
	
	 public String[] reorderLogFiles(String[] logs) {
	        
		  //int alphaLogs = 0;	//字母日志的个数
		  //int numLogs = 0;		//数字日志的个数
			 
		  List<String> alphalist = new ArrayList<String>();
		  List<String> numlist = new ArrayList<String>();
		  
		 for(int i = 0; i < logs.length;i++){

			 //logsArray存放的是每条日志经过spit()方法通过空格分隔之后的结果
			 String[] logsArray = logs[i].split("\\s");
			 
			 //将String类型强制转换成int型
			 
			 
			 if(logsArray[1].charAt(0) >= '0' && logsArray[1].charAt(0) <= '9'){
				 numlist.add(logs[i]);
				 
			 }
			 else{
				 //alphaLogs++;
				 alphalist.add(logs[i]);
			 }
			 
		 }
		 
		 alphalist.sort(new Comparator<String>() {
			 
			 @Override
			 public int compare(String o1, String o2){
				 
				 int s1 = o1.indexOf(" ");
				 int s2 = o2.indexOf(" ");
				 
				 String substring1 = o1.substring(s1);
				 String substring2 = o2.substring(s2);
				 return substring1.compareTo(substring2);
			 } 
			 
		});
		 
		 
	
		 for(String str : numlist){
			 alphalist.add(str);
		 }
		 
		String[] result = alphalist.toArray(new String[alphalist.size()]);
		 return result;
	    }

}
