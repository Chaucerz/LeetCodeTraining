package youzan;

import java.util.Scanner;

/**
 * @author Chaucer
 * @date 2019-09-10 21:13
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        String num1 = "";
        String num2 = "";
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '|') {
                num1 = num.substring(0, i);
                num2 = num.substring(i + 1);
            }
        }

        String[] list1 = num1.split(",");
        String[] list2 = num2.split(",");

        ListNode l1 = new ListNode(Integer.parseInt(list1[0]));
        ListNode temp = l1;
        for (int i = 1; i < list1.length; i++) {
            temp.next = new ListNode(Integer.parseInt(list1[i]));
            temp = temp.next;
        }

        ListNode l2 = new ListNode(Integer.parseInt(list2[0]));
        ListNode temp2 = l2;
        for (int i = 1; i < list2.length; i++) {
            temp2.next = new ListNode(Integer.parseInt(list2[i]));
            temp2 = temp2.next;
        }

        ListNode res = meregeList(l1, l2);
        System.out.print("[");
        while (res != null) {
            System.out.print(res.val);

            if (res.next != null) {
                System.out.print(", ");
            }
            res = res.next;
        }

        System.out.print("]");
    }

    private static ListNode meregeList(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode lastNode = dummyHead;
        int pre = -1;
        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                lastNode.next = l1;
                l1 = l1.next;
            } else if (l1.val == l2.val) {
                lastNode.next = l1;
                l1 = l1.next;
                l2 = l2.next;
            } else {
                lastNode.next = l2;
                l2 = l2.next;
            }
            lastNode = lastNode.next;
        }
        lastNode.next = l1 != null ? l1 : l2;
        return dummyHead.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }



}