package leetcodecn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<Pair> queue = new LinkedList<>();
        ArrayList<List<Integer>> lists = new ArrayList<>(new ArrayList<>());
        if (root == null) {
            return lists;
        }
        queue.offer(new Pair(root, 0));
        while (queue.size() != 0) {
            Pair now = queue.poll();
            if (lists.size() < now.deep + 1) {
                lists.add(new ArrayList<>());
            }
            if (now.deep % 2 == 0) {
                lists.get(now.deep).add(now.node.val);
            } else {
                lists.get(now.deep).add(0, now.node.val);
            }
            if (now.node.left != null) queue.offer(new Pair(now.node.left, now.deep + 1));
            if (now.node.right != null) queue.offer(new Pair(now.node.right, now.deep + 1));
        }
        return lists;
    }

    static class Pair {
        TreeNode node;
        int deep;

        public Pair(TreeNode node, int deep) {
            this.node = node;
            this.deep = deep;
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}