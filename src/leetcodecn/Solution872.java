package leetcodecn;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 请考虑一棵二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个叶值序列 。
 *
 *
 *
 * 举个例子，如上图所示，给定一棵叶值序列为(6, 7, 4, 9, 8)的树。
 *
 * 如果有两棵二叉树的叶值序列是相同，那么我们就认为它们是叶相似的。
 *
 * 如果给定的两个根结点分别为root1 和root2的树是叶相似的，则返回true；否则返回 false 。
 *
 * 
 *
 * 示例 1：
 *
 *
 *
 * 输入：root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
 * 输出：true
 * 示例 2：
 *
 * 输入：root1 = [1], root2 = [1]
 * 输出：true
 * 示例 3：
 *
 * 输入：root1 = [1], root2 = [2]
 * 输出：false
 * 示例 4：
 *
 * 输入：root1 = [1,2], root2 = [2,2]
 * 输出：true
 * 示例 5：
 *
 *
 *
 * 输入：root1 = [1,2,3], root2 = [1,3,2]
 * 输出：false
 * 
 *
 * 提示：
 *
 * 给定的两棵树可能会有1到 200个结点。
 * 给定的两棵树上的值介于 0 到 200 之间。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/leaf-similar-trees
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author holate
 * @date 2021/5/11
 */
public class Solution872 {

/*    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        dfs(root1, a);
        dfs(root2, b);
        return a.equals(b);
    }

    private void dfs(TreeNode node, List<Integer> val) {
        if(node==null) return;
        if(node.left==null&&node.right==null) {
            val.add(node.val);
            return;
        }
        dfs(node.left, val);
        dfs(node.right, val);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }*/
}