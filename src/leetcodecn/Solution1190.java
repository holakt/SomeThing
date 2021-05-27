package leetcodecn;

import java.util.Stack;

/**
 * @author holate
 * @date 2021/5/27
 */
public class Solution1190 {
    public static void main(String[] args) {
        String ret = new Solution1190().reverseParentheses("a(bcdefghijkl(mno)p)q");
        System.out.println(ret);
    }

    public String reverseParentheses(String s) {
        int len = s.length();
        StringBuilder builder = new StringBuilder();
        int[] a = new int[len];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                a[i] = stack.peek();
                a[stack.pop()] = i;
            }
        }
        int step = 1;
        for (int i = 0; i < len; i += step) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                i = a[i];
                step = -step;
            } else {
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
}
