package leetcodecn;

import java.util.Arrays;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * s = "leetcode"
 * 返回 0
 * <p>
 * s = "loveleetcode"
 * 返回 2
 * <p>
 * <p>
 * 提示：你可以假定该字符串只包含小写字母。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/first-unique-character-in-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author holate
 * @date 2020/12/23
 */
public class Solution387 {
    public int firstUniqChar(String s) {
        int[][] a = new int[2][26];
        Arrays.fill(a[0], -1);
        char[] chars = s.toCharArray();
        for (int i = 0, charsLength = chars.length; i < charsLength; i++) {
            char c = chars[i];
            if (a[0][c - 97] != -1) {
                a[1][c - 97] = 1;
            } else {
                a[0][c - 97] = i;
            }
        }
        int min = -1;
        for (int i = 0; i < a[0].length; i++) {
            if (a[1][i] != 1 && a[0][i] != -1) {
                if (min == -1) {
                    min = a[0][i];
                } else {
                    min = Math.min(min, a[0][i]);
                }
            }
        }
        return min;
    }
}
