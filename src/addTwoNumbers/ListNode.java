package addTwoNumbers;

public class ListNode {
	
	int val;
	ListNode next = null;
	
	ListNode(int x){
		val = x;
	}

	public static ListNode createList(int[] arr){
		
		ListNode curr = new ListNode(arr[0]);
		ListNode head = curr;
		for(int i = 1; i < arr.length; i++){
			curr.next = new ListNode(arr[i]);
			curr = curr.next;
		}
		return head;
	}
	
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		ListNode cur = this;
		while(cur != null){
			res.append(cur.val + "->");
			cur = cur.next;
		}
		res.append("null");
		return res.toString();
	}
	
	
}
