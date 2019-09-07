package coding_interviews;

import java.util.ArrayList;

public class ci_12 {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k == 0) {
            return null;
        }
        int i = 0;
        ArrayList<ListNode> list = new ArrayList();
        while (head.next != null) {
            list.add(head);
            i++;
            head = head.next;
        }
        list.add(head);
        if (i - k + 1 < 0) {
            return null;
        }
        return list.get(i - k + 1);
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        System.out.println(new ci_12().FindKthToTail(l1, 0).val);
    }

    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
/**
 * 思路一：
 * 存到list按照位置读取
 * */