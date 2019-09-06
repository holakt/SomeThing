package coding_interviews;

import java.util.Stack;

public class ci_05 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.push(1);
        solution.push(2);
        solution.push(3);
        System.out.println(solution.pop());
        System.out.println(solution.pop());
        System.out.println(solution.pop());
    }
}
 class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.add(0,node);
    }

    public int pop() {
        return  stack1.pop();
    }
}
/**
 * https://blog.nowcoder.net/n/ee03f62d5a6e4b5ea571d61ad7eb64c8的方法很不错，我这个有点投机取巧的意味了。
 * */