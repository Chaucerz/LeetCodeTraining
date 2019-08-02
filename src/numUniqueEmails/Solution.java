package numUniqueEmails;

import java.util.HashSet;

class Solution {
    public int numUniqueEmails(String[] emails) {
        
    	HashSet<String> uniqueEmails = new HashSet<>();
    	
    	for(String email : emails){
    		//本地名称
    		String name = email.substring(0,email.indexOf('@'));
    		//域名
    		String domain = email.substring(email.indexOf('@'));
    		//按规则修改
    		String uniquename = name.substring(0,name.indexOf('+')).replaceAll(".", "");
    		
    		String uniqueEmail = uniquename+domain;
    		uniqueEmails.add(uniqueEmail);
    	}
    	
    	return uniqueEmails.size();
    	
    	
    }
}