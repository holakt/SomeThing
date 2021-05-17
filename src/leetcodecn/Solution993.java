package leetcodecn;

/**
 * @author holate
 * @date 2021/5/17
 */
public class Solution993 {
/*    public static void main(String[] args) {
        System.out.println(1 ^ 3);
        System.out.println(2 ^ 3);
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> nodeList = new LinkedList<>();
        nodeList.add(root);
        while (!nodeList.isEmpty()) {
            int size = nodeList.size();
            int t = 0;
            for (int j = 0; j < size; j++) {
                TreeNode curNode = nodeList.poll();
                if (curNode == null) {
                    continue;
                }
                if (curNode.left != null && curNode.right != null) {
                    if ((x == curNode.left.val && y == curNode.right.val) ||
                        (y == curNode.left.val && x == curNode.right.val)) {
                        return false;
                    }
                }
                if (t != 0 && t == curNode.val) {
                    return true;
                } else if (curNode.val == x || curNode.val == y) {
                    t = curNode.val ^ x ^ y;
                }
                nodeList.add(curNode.left);
                nodeList.add(curNode.right);
            }
        }
        return false;
    }*/
}

/*class TreeNode {
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
