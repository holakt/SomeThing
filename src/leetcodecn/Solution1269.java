package leetcodecn;

/**
 * 有一个长度为arrLen的数组，开始有一个指针在索引0 处。
 * <p>
 * 每一步操作中，你可以将指针向左或向右移动 1 步，或者停在原地（指针不能被移动到数组范围外）。
 * <p>
 * 给你两个整数steps 和arrLen ，请你计算并返回：在恰好执行steps次操作以后，指针仍然指向索引0 处的方案数。
 * <p>
 * 由于答案可能会很大，请返回方案数 模10^9 + 7 后的结果。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：steps = 3, arrLen = 2
 * 输出：4
 * 解释：3 步后，总共有 4 种不同的方法可以停在索引 0 处。
 * 向右，向左，不动
 * 不动，向右，向左
 * 向右，不动，向左
 * 不动，不动，不动
 * 示例 2：
 * <p>
 * 输入：steps = 2, arrLen = 4
 * 输出：2
 * 解释：2 步后，总共有 2 种不同的方法可以停在索引 0 处。
 * 向右，向左
 * 不动，不动
 * 示例 3：
 * <p>
 * 输入：steps = 4, arrLen = 2
 * 输出：8
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= steps <= 500
 * 1 <= arrLen<= 10^6
 * 通过次数22,594提交次数46,513
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-ways-to-stay-in-the-same-place-after-some-steps
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * solution:false
 *
 * @author holate
 * @date 2021/5/13
 */
public class Solution1269 {
    static final int MODULO = 1000000007;

    public int numWays(int steps, int arrLen) {
        int maxColumn = arrLen > steps + 1 ? steps + 1 : arrLen;
        int[] dp = new int[maxColumn];
        int[] dpNext;
        dp[0] = 1;
        for (int i = 1; i <= steps; i++) {
            dpNext = new int[maxColumn];
            for (int j = 0; j < maxColumn; j++) {
                if (j == 0) {
                    dpNext[j] = (dp[j] + dp[j + 1]) % MODULO;
                } else if (j == maxColumn - 1) {
                    dpNext[j] = (dp[j] + dp[j - 1]) % MODULO;
                } else {
                    dpNext[j] = ((dp[j] + dp[j - 1]) % MODULO + dp[j + 1]) % MODULO;
                }
            }
            dp = dpNext;
        }
        return dp[0];
    }
}
