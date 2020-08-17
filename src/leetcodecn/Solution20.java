package leetcodecn;

import java.util.Stack;
/*
给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。

示例 1:

输入: "()"
输出: true
示例2:

输入: "()[]{}"
输出: true
示例3:

输入: "(]"
输出: false
示例4:

输入: "([)]"
输出: false
示例5:

输入: "{[]}"
输出: true

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/valid-parentheses
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution20 {
    public static void main(String[] args) {
        System.out.println(new Solution20().isValid("()"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else if (stack.size() == 0)
                return false;
            else if (c == ')' && stack.pop()!='(') {
                return false;
            } else if (c == ']' && stack.pop()!='[') {
                return false;
            } else if (c == '}' && stack.pop()!='{') {
                return false;
            }
        }
        return stack.size() == 0;
    }
}