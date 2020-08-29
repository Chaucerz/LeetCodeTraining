package leetcode_23_mergeKLists;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Chaucer
 * @date 2019-08-21 22:14
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }

        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(lists.length,
                Comparator.comparingInt(value -> value.val));
        ListNode dummyNode = new ListNode(-1);
        ListNode curr = dummyNode;

        for (ListNode list : lists) {
            if(list != null) {
                priorityQueue.add(list);
            }
        }

        while (!priorityQueue.isEmpty()) {
            ListNode node = priorityQueue.poll();
            curr.next = node;
            curr = curr.next;
            if(curr.next != null) {
                priorityQueue.add(curr.next);
            }
        }
        return dummyNode.next;
    }
}
