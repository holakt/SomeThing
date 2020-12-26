package leetcodecn;

/**
 * 给你一个 非递减有序整数数组nums。
 * <p>
 * 请你建立并返回一个整数数组result，它跟nums长度相同，且result[i]等于nums[i]与数组中所有其他元素差的绝对值之和。
 * <p>
 * 换句话说，result[i]等于sum(|nums[i]-nums[j]|) ，其中0 <= j < nums.length 且j != i（下标从 0 开始）。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,3,5]
 * 输出：[4,3,5]
 * 解释：假设数组下标从 0 开始，那么
 * result[0] = |2-2| + |2-3| + |2-5| = 0 + 1 + 3 = 4，
 * result[1] = |3-2| + |3-3| + |3-5| = 1 + 0 + 2 = 3，
 * result[2] = |5-2| + |5-3| + |5-5| = 3 + 2 + 0 = 5。
 * 示例 2：
 * <p>
 * 输入：nums = [1,4,6,8,10]
 * 输出：[24,15,13,15,21]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 2 <= nums.length <= 105
 * 1 <= nums[i] <= nums[i + 1] <= 104
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sum-of-absolute-differences-in-a-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * 用柱状图理解，面积和
 * <p>
 * 有序列表sum(n) - nums[i] * n 是 i 位置的不取绝对值的结果
 * 有序列表因为数组是非递减的， 正数部分都在 i 后面，这部分无论是否绝对值都不改变
 * 在 i 前面的部分是 负数 ，取绝对值后应该是正的，所以上面公式相当于多减去了这部分
 * 这部分内容是 nums[i]*i - sum(i-1)，这部分内容应该加两次
 * 第一次是和多减部分的扯平，相当于不加 i 前面的部分
 * 第二次是绝对值让他变正，此时为答案
 *
 * @author holate
 * @date 2020/12/25
 */
public class Solution1685 {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int sum = 0;
        for (int num : nums) sum += num;
        int su = 0;
        for (int i = 0; i < length; i++) {
            result[i] = sum - nums[i] * length + (i * nums[i] - su) * 2;
            su += nums[i];
        }
        return result;
    }
}
