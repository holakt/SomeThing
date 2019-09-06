package coding_interviews;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class ci_03 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList list = new ArrayList<Integer>();
        if (listNode == null) {
            return list;
        }
        while (listNode.next != null) {
            list.add(0, listNode.val);
            listNode = listNode.next;
        }
        list.add(0, listNode.val);
        return list;
    }
}
