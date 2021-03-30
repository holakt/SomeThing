package leetcodecn;

/**
 * 编写一个高效的算法来判断m x n矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 * <p>
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * 输出：true
 * 示例 2：
 * <p>
 * <p>
 * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * 输出：false
 * <p>
 * <p>
 * 提示：
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 100
 * -104 <= matrix[i][j], target <= 104
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-a-2d-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author holate
 * @date 2021/3/30
 * <p>
 * 二分法
 */
public class Solution74 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(new Solution74().searchMatrix(matrix, anInt) + "  ");
            }
            System.out.println();
        }
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix.length * matrix[0].length;
        return find(matrix, 0, len - 1, len, target);
    }

    private boolean find(int[][] matrix, int start, int end, int len, int target) {
        if (start < 0 || end >= len || start > end) {
            return false;
        }
        int midM = (end + start) / 2 / matrix[0].length;
        int midN = (end + start) / 2 % matrix[0].length;
        if (matrix[midM][midN] == target) {
            return true;
        } else if (matrix[midM][midN] > target) {
            return find(matrix, start, (end + start) / 2 - 1, len, target);
        } else {
            return find(matrix, (end + start) / 2 + 1, end, len, target);
        }
    }
}
