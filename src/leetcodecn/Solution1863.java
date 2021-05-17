package leetcodecn;

/**
 * @author holate
 * @date 2021/5/17
 */
public class Solution1863 {
    int subsetXORSum(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int msk = 0; msk < ((1 << n)); msk++) {
            int x = 0;
            for (int i = 0; i < n; i++) {
                if (((msk >> i) & 1) == 1)
                    x ^= nums[i];
            }
            ans += x;
        }
        return ans;
    }
}
