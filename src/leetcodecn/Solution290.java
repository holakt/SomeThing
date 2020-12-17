package leetcodecn;

import java.util.Arrays;

/**
 * 给定一种规律 pattern和一个字符串str，判断 str 是否遵循相同的规律。
 * <p>
 * 这里的遵循指完全匹配，例如，pattern里的每个字母和字符串str中的每个非空单词之间存在着双向连接的对应规律。
 * <p>
 * 示例1:
 * <p>
 * 输入: pattern = "abba", str = "dog cat cat dog"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入:pattern = "abba", str = "dog cat cat fish"
 * 输出: false
 * 示例 3:
 * <p>
 * 输入: pattern = "aaaa", str = "dog cat cat dog"
 * 输出: false
 * 示例4:
 * <p>
 * 输入: pattern = "abba", str = "dog dog dog dog"
 * 输出: false
 * 说明:
 * 你可以假设pattern只包含小写字母，str包含了由单个空格分隔的小写字母。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/word-pattern
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * <p>
 * <p>
 * 1：判断字符串 pattern 与 s 的长度是否相等，不等则返回 false；
 * 2：接下来遍历 pattern，用 pattern 的单个字符做为 map 的 key，s 的单个单词作为 map 的 value；这样只处理了 pattern 到 s 的映射，abba，dog dog dog dog 这种无法满足；
 * 3：因此我们用一个 set 来存储 s 的单词，保证每个单词对应的 pattern 的字符也是唯一的；该步骤也可用上面2步骤重复一遍解决，把 pattern 跟 s 调换位置后从新调用方法即可；
 * <p>
 * 第二步问题解决方式：
 * if (Arrays.asList(target).contains(s)) return false;
 * <p>
 * 作者：zheng-rong-huai
 * 链接：https://leetcode-cn.com/problems/word-pattern/solution/liang-chong-si-lu-9894-9853-by-zheng-ron-4x63/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 * @author holate
 * @date 2020/12/16
 */
public class Solution290 {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        String[] target = new String[26];
        for (int i = 0; i < words.length; i++) {
            int p = pattern.charAt(i) - 97;
            s = words[i];
            if (target[p] == null) {
                if (Arrays.asList(target).contains(s)) return false;
                target[p] = s;
            } else {
                if (!target[p].equals(s)) return false;
            }
        }
        return true;
    }
}
