package leetcodecn;

/**
 * 有一个二维矩阵A 其中每个元素的值为0或1。
 * <p>
 * 移动是指选择任一行或列，并转换该行或列中的每一个值：将所有 0 都更改为 1，将所有 1 都更改为 0。
 * <p>
 * 在做出任意次数的移动后，将该矩阵的每一行都按照二进制数来解释，矩阵的得分就是这些数字的总和。
 * <p>
 * 返回尽可能高的分数。
 * <p>
 * 示例：
 * <p>
 * 输入：[[0,0,1,1],[1,0,1,0],[1,1,0,0]]
 * 输出：39
 * 解释：
 * 转换为 [[1,1,1,1],[1,0,0,1],[1,1,1,1]]
 * 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
 * <p>
 * 提示：
 * <p>
 * 1 <= A.length <= 20
 * 1 <= A[0].length <= 20
 * A[i][j]是0 或1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/score-after-flipping-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author holate
 * @date 2020/12/7
 */
public class Solution861 {
    public int matrixScore(int[][] A) {
        int m = A.length, n = A[0].length;
        int ret = m * (1 << (n - 1));
        for (int i = 1; i < n; i++) {
            int nOnes = 0;
            for (int[] ints : A) {
                if (ints[0] == 1) {
                    nOnes += ints[i];
                } else {
                    // 如果这一行进行了行反转，则该元素的实际取值为 1 - A[i][i]
                    nOnes += (1 - ints[i]);
                }
            }
            int k = Math.max(nOnes, m - nOnes);
            ret += k * (1 << (n - i - 1));
        }
        return ret;
    }
}
