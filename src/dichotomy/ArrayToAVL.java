package dichotomy;

public class ArrayToAVL {

    public static void main(String[] args) {
        int nums[] = new int[]{-10, -3, 0, 5, 9};
        TreeNode treeNode = new ArrayToAVL().sortedArrayToBST(nums);
        System.out.println("");
    }


    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int middle;
        int len = end - start + 1;
        middle = len / 2 + start;
        TreeNode root = new TreeNode(nums[middle]);
        if (start == end) {
            return root;
        }
        root.left = sortedArrayToBST(nums, start, middle - 1);
        root.right = sortedArrayToBST(nums, middle + 1, end);
        return root;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}