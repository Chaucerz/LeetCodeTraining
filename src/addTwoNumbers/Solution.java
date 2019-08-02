package addTwoNumbers;

public class Solution {
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode headNode = new ListNode(0);  
	        ListNode currentNode = headNode;  
	        
	        int carray = 0;  
	        while(l1 != null || l2 != null){  
	            if(l1!=null){
	                carray +=l1.val;
	                l1 = l1.next;
	            }
	            if(l2!=null){
	                carray +=l2.val;
	                l2 = l2.next;
	            }
	           currentNode.next = new ListNode(carray%10);
	           currentNode = currentNode.next;
	           carray/=10;
	           
	        }
	        
	        if(carray==1){
	            currentNode.next = new ListNode(1);
	            currentNode = currentNode.next;
	        }
	       return headNode.next;
	    }

	   



	public static void main(String[] args) {
		
		   int[] a = {1,8};
		   int[] b = {0};
		   ListNode l = null;
		   ListNode l1 = l.createList(a);
		   ListNode l2 = l.createList(b);
		  //System.out.println(l2.toString());
		   System.out.println(addTwoNumbers(l1, l2));
	}
}
