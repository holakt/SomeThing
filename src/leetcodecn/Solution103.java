package leetcodecn;

/**
 * 给定一个二叉树，返回其节点值的锯齿形层序遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 * <p>
 * 例如：
 * 给定二叉树[3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回锯齿形层序遍历如下：
 * <p>
 * [
 * [3],
 * [20,9],
 * [15,7]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 执行用时：1 ms, 在所有 Java 提交中击败了98.12%的用户
 * 内存消耗：38.8 MB, 在所有 Java 提交中击败了19.94%的用户
 *
 * @author holate
 * @date 2020/12/23
 */
public class Solution103 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(3);
//        TreeNode r1 = new TreeNode(9);
//        TreeNode r2 = new TreeNode(20);
//        TreeNode r21 = new TreeNode(15);
//        TreeNode r22 = new TreeNode(7);
//        root.left = r1;
//        root.right = r2;
//        r2.left = r21;
//        r2.right = r22;
//        new Solution103().zigzagLevelOrder(root);
//    }
/*    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);
        boolean isOrderLeft = true;

        while (!nodeQueue.isEmpty()) {
            Deque<Integer> levelList = new LinkedList<>();
            int size = nodeQueue.size();
            for (int i = 0; i < size; ++i) {
                TreeNode curNode = nodeQueue.poll();
                if (isOrderLeft) levelList.offerLast(curNode.val);
                else levelList.offerFirst(curNode.val);
                if (curNode.left != null) nodeQueue.offer(curNode.left);
                if (curNode.right != null) nodeQueue.offer(curNode.right);
            }
            ans.add(new LinkedList<>(levelList));
            isOrderLeft = !isOrderLeft;
        }
        return ans;
    }*/
}

/*
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}*/
