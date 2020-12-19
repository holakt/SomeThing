package leetcodecn;

/**
 * 给定一个非负整数N，找出小于或等于N的最大的整数，同时这个整数需要满足其各个位数上的数字是单调递增。
 * <p>
 * （当且仅当每个相邻位数上的数字x和y满足x <= y时，我们称这个整数是单调递增的。）
 * <p>
 * 示例 1:
 * <p>
 * 输入: N = 10
 * 输出: 9
 * 示例 2:
 * <p>
 * 输入: N = 1234
 * 输出: 1234
 * 示例 3:
 * <p>
 * 输入: N = 332
 * 输出: 299
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/monotone-increasing-digits
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author holate
 * @date 2020/12/19
 */
public class Solution738 {
    public int monotoneIncreasingDigits(int N) {
        char[] a = Integer.toString(N).toCharArray();
        int i = 1;
        while (i < a.length && a[i - 1] <= a[i]) {
            i++;
        }
        if (i < a.length) {
            while (i > 0 && a[i] < a[i - 1]) {
                a[i - 1] -= 1;
                i--;
            }
            for (int j = i + 1; j < a.length; j++) {
                a[j] = '9';
            }
        }
        return Integer.parseInt(new String(a));
    }
}
