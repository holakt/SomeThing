package leetcodecn;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

/*
方法一的时间复杂度的瓶颈在于寻找中位数节点。由于构造出的二叉搜索树的中序遍历结果就是链表本身，因此我们可以将分治和中序遍历结合起来，减少时间复杂度。

具体地，设当前链表的左端点编号为 {left}left，右端点编号为 {right}right，包含关系为「双闭」，即 {left}left 和 {right}right 均包含在链表中。链表节点的编号为 [0, n)[0,n)。中序遍历的顺序是「左子树 - 根节点 - 右子树」，那么在分治的过程中，我们不用急着找出链表的中位数节点，而是使用一个占位节点，等到中序遍历到该节点时，再填充它的值。

我们可以通过计算编号范围来进行中序遍历：

中位数节点对应的编号为 {mid} = ({left} + {right} + 1) / 2mid=(left+right+1)/2；

根据方法一中对于中位数的定义，编号为 ({left} + {right}) / 2(left+right)/2 的节点同样也可以是中位数节点。

左右子树对应的编号范围分别为 [{left}, {mid}-1][left,mid−1] 和 [{mid}+1, {right}][mid+1,right]。

如果 {left} > {right}left>right，那么遍历到的位置对应着一个空节点，否则对应着二叉搜索树中的一个节点。

这样一来，我们其实已经知道了这棵二叉搜索树的结构，并且题目给定了它的中序遍历结果，那么我们只要对其进行中序遍历，就可以还原出整棵二叉搜索树了。

作者：LeetCode-Solution
链接：https://leetcode-cn.com/problems/convert-sorted-list-to-binary-search-tree/solution/you-xu-lian-biao-zhuan-huan-er-cha-sou-suo-shu-1-3/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Solution109 {
    /**
     * 官方解法2
     */
//    ListNode globalHead;
//
//    public TreeNode sortedListToBST(ListNode head) {
//        globalHead = head;
//        int length = getLength(head);
//        return buildTree(0, length - 1);
//    }
//
//    public int getLength(ListNode head) {
//        int ret = 0;
//        while (head != null) {
//            ++ret;
//            head = head.next;
//        }
//        return ret;
//    }
//
//    public TreeNode buildTree(int left, int right) {
//        if (left > right) {
//            return null;
//        }
//        int mid = (left + right + 1) / 2;
//        TreeNode root = new TreeNode();
//        root.left = buildTree(left, mid - 1);
//        root.val = globalHead.val;
//        globalHead = globalHead.next;
//        root.right = buildTree(mid + 1, right);
//        return root;
//    }

/**
 * 初始解法
 */
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(Arrays.asList(-10, -3, 0, 5, 9));
//        new Solution109().sortedListToBST(list, 0, list.size() - 1);
//    }
//
//    public TreeNode sortedListToBST(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        List<Integer> list = new ArrayList<>();
//        while (head != null) {
//            list.add(head.val);
//            head = head.next;
//        }
//        return sortedListToBST(list, 0, list.size() - 1);
//    }
//
//    public TreeNode sortedListToBST(List<Integer> list, int start, int end) {
//        int size = end - start;
//        int m = size / 2 + start;
//        if (size < 0) {
//            return null;
//        } else if (size == 0) {
//            return new TreeNode(list.get(m));
//        }
//        TreeNode root = new TreeNode(list.get(m));
//        root.left = sortedListToBST(list, start, m - 1);
//        root.right = sortedListToBST(list, m + 1, end);
//        return root;
//    }

}
/**
 * 数据结构
 */
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode() {
//    }
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}
//
//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode() {
//    }
//
//    ListNode(int val) {
//        this.val = val;
//    }
//
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}