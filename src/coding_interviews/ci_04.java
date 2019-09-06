package coding_interviews;


import java.util.Arrays;

//  Definition for binary tree
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
//Arrays.copyOfRange(T[ ] original,int from,int to)
//将一个原始的数组original，从下标from开始复制，复制到上标to，生成一个新的数组。
//注意这里包括下标from，不包括上标to。
//提交注意 import java.util.Arrays; 在提交平台没有，不加会报错
public class ci_04 {
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        // 在中序中找到前序的根
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                // 左子树，注意 copyOfRange 函数，左闭右开
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                // 右子树，注意 copyOfRange 函数，左闭右开
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));
                break;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 4, 7, 3, 5, 6, 8};
        int b[] = {4, 7, 2, 1, 5, 3, 8, 6};
        System.out.println(reConstructBinaryTree(a,b));
    }
}
