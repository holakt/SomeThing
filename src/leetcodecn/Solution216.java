package leetcodecn;

import java.util.ArrayList;
import java.util.List;

/*
找出所有相加之和为n 的k个数的组合。组合中只允许含有 1 -9 的正整数，并且每种组合中不存在重复的数字。

说明：

所有数字都是正整数。
解集不能包含重复的组合。
示例 1:

输入: k = 3, n = 7
输出: [[1,2,4]]
示例 2:

输入: k = 3, n = 9
输出: [[1,2,6], [1,3,5], [2,3,4]]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/combination-sum-iii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution216 {
    public static void main(String[] args) {
        System.out.println(new Solution216().combinationSum3(3, 2));
    }

    static int[] nums;
    static List<List<Integer>> res;

    public List<List<Integer>> combinationSum3(int k, int n) {
        //力扣的判题机在读取您的代码后，对每个测试用例，都会初始化一次类，但全局变量和类内静态变量需要您手动初始化。
        nums = new int[]{0, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        res = new ArrayList<>();
        if (n > (9 + 9 - k + 1) * k / 2) return res;
        if (n <= 0 || k <= 0) return res;
        combinationSum3(k, n, 1, new ArrayList<>());
        return res;
    }

    public void combinationSum3(int k, int n, int s, List<Integer> list) {
        if (k < 0 || n < 0) {
            return;
        }
        if (k == 0 && n == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = s; i < 10; i++) {
            if (nums[i] == 0) continue;
            list.add(i);
            nums[i] = 0;
            combinationSum3(k - 1, n - i, i, list);
            list.remove(list.size() - 1);
            nums[i] = 1;
        }
    }
}
