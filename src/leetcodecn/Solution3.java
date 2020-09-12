package leetcodecn;

import java.util.HashSet;
import java.util.Set;

/*
给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。

示例1:

输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是"wke"，所以其长度为 3。
    请注意，你的答案必须是 子串 的长度，"pwke"是一个子序列，不是子串。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution3 {
    public static void main(String[] args) {
        System.out.println(new Solution3().lengthOfLongestSubstring("abba"));
    }

    public int lengthOfLongestSubstring(String s) {
        int max = 0, len = 0;
        int[] nums = new int[128];
        Set<Character>  set = new HashSet<>();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (set.contains(c)) {
                int b = i - nums[c];
                len = Math.min(len, --b);
            }
            set.add(c);
            nums[c] = i;
            max = Math.max(++len, max);
        }
        return max;
    }
}
