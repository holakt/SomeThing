package leetcodecn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
给定一个二叉树，找出其最小深度。

最小深度是从根节点到最近叶子节点的最短路径上的节点数量。

说明:叶子节点是指没有子节点的节点。

示例:

给定二叉树[3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回它的最小深度 2.

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/minimum-depth-of-binary-tree
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution111 {
//
//    public int minDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        List<TreeNode> list = new LinkedList<>();
//        List<Integer> deep = new ArrayList<>();
//        list.add(root);
//        deep.add(1);
//        TreeNode next;
//        while (!list.isEmpty()) {
//            next = list.get(0);
//            int d = deep.get(0);
//            if (next == null) {
//                list.remove(0);
//                deep.remove(0);
//                continue;
//            }
//            if (next.right == null && next.left == null) {
//                return d;
//            }
//            list.add(next.left);
//            deep.add(d + 1);
//            list.add(next.right);
//            deep.add(d + 1);
//            list.remove(0);
//            deep.remove(0);
//        }
//        return 0;
//    }
}
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}
