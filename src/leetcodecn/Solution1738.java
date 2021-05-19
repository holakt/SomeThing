package leetcodecn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author holate
 * @date 2021/5/19
 */
public class Solution1738 {
    public int kthLargestValue(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m + 1][n + 1];
        List<Integer> ret = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i - 1][j - 1] ^ dp[i][j - 1] ^ dp[i - 1][j] ^ matrix[i - 1][j - 1];
                ret.add(dp[i][j]);
            }
        }
        Collections.sort(ret);
        return ret.get(ret.size() - k + 1);
    }
}
