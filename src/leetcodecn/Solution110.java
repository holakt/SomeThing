package leetcodecn;

/*
给定一个二叉树，判断它是否是高度平衡的二叉树。

本题中，一棵高度平衡二叉树定义为：

一个二叉树每个节点的左右两个子树的高度差的绝对值不超过1。

示例 1:

给定二叉树 [3,9,20,null,null,15,7]

    3
   / \
  9  20
    /  \
   15   7
返回 true 。

示例 2:

给定二叉树 [1,2,2,3,3,null,null,4,4]

       1
      / \
     2   2
    / \
   3   3
  / \
 4   4
返回false 。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/balanced-binary-tree
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 * <p>
 * 数据结构
 * <p>
 * 数据结构
 */
/*
public class Solution110 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode r1 = new TreeNode(20);
        r1.left = new TreeNode(15);
        r1.right = new TreeNode(17);
        root.right = r1;
        new Solution110().isBalanced(root);
    }

    public boolean isBalanced(TreeNode root) {
        return balancedHeight(root) != -1;
    }

    public int balancedHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = balancedHeight(root.left);
        int right = balancedHeight(root.right);
        if (left == -1 || right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left + 1, right + 1);
    }
}
*/
/**
 * 数据结构
 */
/*
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
*/
