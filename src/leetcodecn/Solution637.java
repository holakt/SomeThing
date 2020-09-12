package leetcodecn;

/*
给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。

示例 1：

输入：
    3
   / \
  9  20
    /  \
   15   7
输出：[3, 14.5, 11]
解释：
第 0 层的平均值是 3 ,  第1层是 14.5 , 第2层是 11 。因此返回 [3, 14.5, 11] 。

提示：

节点值的范围在32位有符号整数范围内。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/average-of-levels-in-binary-tree
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution637 {
    /*
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> res = new ArrayList<>();
        if (root == null) return new ArrayList<>();
        queue.offer(root);
        while (queue.size() > 0) {
            int size = queue.size();
            int i = size;
            long sum = 0;
            while (size-- > 0) {
                TreeNode treeNode = queue.poll();
                sum += treeNode.val;
                if (treeNode.left != null)
                    queue.add(treeNode.left);
                if (treeNode.right != null)
                    queue.add(treeNode.right);
            }
            res.add(sum / (double) i);
        }
        return res;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    */
}
