package leetcodecn;

/**
 * @author holate
 * @date 2021/5/17
 */
public class Solution1863 {
    static int ret = 0;

    public int subsetXORSum(int[] nums) {
        ret = 0;
        if (nums == null || nums.length == 0) {
            return ret;
        }
        f(0, nums, 0);
        return ret;
    }

    public void f(int cur, int nums[], int k) {
        for (int i = k; i < nums.length; i++) {
            cur ^= nums[i];
            ret += cur;
            f(cur, nums, i + 1);
            cur ^= nums[i];
        }
    }
}
