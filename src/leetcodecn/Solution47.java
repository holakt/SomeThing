package leetcodecn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
给定一个可包含重复数字的序列，返回所有不重复的全排列。

示例:

输入: [1,1,2]
输出:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/permutations-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution47 {
    public static void main(String[] args) {
        int[] nums =
            {2, 2, 1, 1};
        new Solution47().permuteUnique(nums);
    }

    boolean[] vis;
    List<List<Integer>> ans;

    public List<List<Integer>> permuteUnique(int[] nums) {
        ans = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        vis = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums, 0, perm);
        return ans;
    }

    public void backtrack(int[] nums, int idx, List<Integer> perm) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(perm));
            return;
        }
        for (int i = 0; i < nums.length; ++i) {
            //如果左边(i-1)相同数字(nums[i] == nums[i - 1])填过vis[i - 1]==true
            //则第i个数字可以填入
            //规则：从左往右 第一个 未被填过 的数字
            if (vis[i] || (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1])) {
                continue;
            }
            perm.add(nums[i]);
            vis[i] = true;
            backtrack(nums, idx + 1, perm);
            vis[i] = false;
            perm.remove(idx);
        }
    }
}