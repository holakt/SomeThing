package leetcodecn;

/*
给出两个非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照逆序的方式存储的，并且它们的每个节点只能存储一位数字。

如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

您可以假设除了数字 0 之外，这两个数都不会以 0开头。

示例：

输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/add-two-numbers
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution2 {
  /*  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode next1 = l1;
        ListNode next2 = l2;
        ListNode head = null;
        ListNode next = null;
        int x = 0;
        while (next1 != null || next2 != null || x != 0) {
            int a = 0, b = 0;
            if (next1 != null) {
                a = next1.val;
                next1 = next1.next;
            }
            if (next2 != null) {
                b = next2.val;
                next2 = next2.next;
            }
            int temp = a + b + x;
            if (head == null) {
                head = new ListNode(temp % 10);
                next = head;
            } else {
                next.next = new ListNode(temp % 10);
                next = next.next;
            }
            x = temp / 10;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }*/
}