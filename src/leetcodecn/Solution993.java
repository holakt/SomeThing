package leetcodecn;

/**
 * @author holate
 * @date 2021/5/17
 */
public class Solution993 {
    public int deepNode(TreeNode root, int n, int deep) {
        if (root != null) {
            if (root.val == n) {
                return deep;
            }
            int l = deepNode(root.left, n, deep + 1);
            int r = deepNode(root.right, n, deep + 1);
            return l == -1 ? r : l;
        }
        return -1;
    }

    public boolean fatherNodeVal(TreeNode root, int x, int y) {
        if (root != null) {
            if (root.left != null && root.right != null) {
                if ((root.left.val == x && root.right.val == y) || (root.left.val == y && root.right.val == x)) {
                    return false;
                }
            }
            return fatherNodeVal(root.left, x, y) && fatherNodeVal(root.right, x, y);
        }
        return true;
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        return deepNode(root, x, 0) == deepNode(root, y, 0) && fatherNodeVal(root, x, y);
    }
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
}
