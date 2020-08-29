package leetcode_23_mergeKLists;

/**
 * @author Chaucer
 * @date 2019-08-22 10:22
 * 分治法：先一分为二，分别递归地解决了与原问题同结构，但规模更小的两个子问题；
 * 再考虑如何合并，这个合并的过程也是一个递归的方法。
 */
public class Solution2 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0)
            return null;

        return mergeList(lists, 0, lists.length - 1);
    }

    private ListNode mergeList(ListNode[] lists, int left, int right) {
        if (left >= right){
            return lists[left];
        }
        int mid = left + (right - left) / 2;
        ListNode l = mergeList(lists, left, mid);
        ListNode r = mergeList(lists, mid + 1, right);
        return merge(l, r);
    }

    private ListNode merge(ListNode l, ListNode r) {
        if(l == null || r == null) {
            return l == null ? r : l;
        }

        if(l.val < r.val){
            l.next = merge(l.next, r);
            return l;
        } else {
            r.next = merge(l, r.next);
            return r;
        }
    }
    public static void main(String[] args) {
        Integer[] nums1 = {1, 4, 5};
        Integer[] nums2 = {1, 3, 4};
        Integer[] nums3 = {2, 6};
        ListNode head1 = new ListNode(nums1);
        ListNode head2 = new ListNode(nums2);
        ListNode head3 = new ListNode(nums3);
        ListNode[] lists = new ListNode[3];
        lists[0] = head1;
        lists[1] = head2;
        lists[2] = head3;
        Solution2 solution = new Solution2();
        ListNode mergeKLists = solution.mergeKLists(lists);
        System.out.println(mergeKLists);
    }

}
