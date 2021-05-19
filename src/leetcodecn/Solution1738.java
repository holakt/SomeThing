package leetcodecn;

/**
 * @author holate
 * @date 2021/5/19
 */
public class Solution1738 {
    public static void main(String[] args) {
        int ret = new Solution1738().kthLargestValue(new int[][]{{5, 2}, {1, 6}, {7, 3}}, 1);
        System.out.println(ret);
    }

    public int kthLargestValue(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        int[][] pre = new int[m + 1][n + 1];
        int[] nums = new int[m * n];
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                pre[i][j] = pre[i - 1][j] ^ pre[i][j - 1] ^ pre[i - 1][j - 1] ^ matrix[i - 1][j - 1];
                nums[(i - 1) * n + j - 1] = pre[i][j];
            }
        }
        return quickSelect(nums, 0, nums.length - 1, nums.length - k + 1);
    }

    private int quickSelect(int[] nums, int start, int end, int k) {
        if (start == end) {
            return nums[start];
        }
        int left = start;
        int right = end;
        int pivot = nums[start + (end - start) / 2];
        while (left <= right) {
            if (nums[left] < pivot) {
                left++;
            } else if (nums[right] > pivot) {
                right--;
            } else {
                int temp = nums[left];
                nums[left++] = nums[right];
                nums[right--] = temp;
            }
        }
        if (start + k - 1 <= right) {
            return quickSelect(nums, start, right, k);
        }
        if (start + k - 1 >= left) {
            return quickSelect(nums, left, end, start + k - left);
        }
        return nums[right + 1];
    }
}
