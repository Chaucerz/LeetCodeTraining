package middleNode;

public class Solution {
	
	public ListNode middleNode(ListNode head) {
		
        ListNode p = head;
		int count = 0;
		
		while(head.next != null){
			head = head.next;
			count++;
		}
		
		int midposition;
		if(count % 2 == 0){
			midposition = (count / 2) + 1;
		}
		else{
			midposition = (int)Math.ceil(count / 2);
		}
		
		int _count = 0;
		while(p.next != null){
			p = p.next;
			_count++;
			if(_count == midposition){
				break;
			}
		}
		return p;
		
		
		
    }
}
