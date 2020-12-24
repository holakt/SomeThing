package leetcodecn;

/**
 * 给你一个字符串 s ，请你去除字符串中重复的字母，使得每个字母只出现一次。需保证 返回结果的字典序最小（要求不能打乱其他字符的相对位置）。
 * <p>
 * 注意：该题与 1081 https://leetcode-cn.com/problems/smallest-subsequence-of-distinct-characters 相同
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "bcabc"
 * 输出："abc"
 * 示例 2：
 * <p>
 * 输入：s = "cbacdcbc"
 * 输出："acdb"
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 104
 * s 由小写英文字母组成
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicate-letters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author holate
 * @date 2020/12/24
 */
public class Solution316 {
    public String removeDuplicateLetters(String s) {
        char[] chars = s.toCharArray();
        int[] w = new int[26];
        boolean[] b = new boolean[26];
        for (char c : chars) {
            w[c - 'a']++;
        }
        StringBuilder builder = new StringBuilder();
        for (char c : chars) {
            if (!b[c - 'a']) {
                int blen = builder.length();
                while (blen > 0 && builder.charAt(blen - 1) > c) {
                    if (w[builder.charAt(blen - 1) - 'a'] > 0) {
                        b[builder.charAt(blen - 1) - 'a'] = false;
                        builder.deleteCharAt(blen - 1);
                        blen--;
                    } else {
                        break;
                    }
                }
                b[c - 'a'] = true;
                builder.append(c);
            }
            w[c - 'a']--;
        }
        return builder.toString();
    }
}
