package leetcodecn;

/**
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 * <p>
 * 在构造过程中，请注意区分大小写。比如"Aa"不能当做一个回文字符串。
 * <p>
 * 注意:
 * 假设字符串的长度不会超过 1010。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * "abccccdd"
 * <p>
 * 输出:
 * 7
 * <p>
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindrome
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author holate
 * @date 2020/12/17
 */
public class Solution469 {
    public int longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int[] times = new int[58];
        for (char c : chars) {
            times[c - 65]++;
        }
        int k = 0;
        boolean f = true;
        for (int t : times) {
            k += t;
            if (t % 2 == 1)
                if (f) f = false;
                else k--;
        }
        return k;
    }
}
