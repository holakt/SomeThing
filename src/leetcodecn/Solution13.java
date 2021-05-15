package leetcodecn;

/**
 * @author holate
 * @date 2021/5/15
 */
public class Solution13 {
    public static void main(String[] args) {
        int num = new Solution13().romanToInt("MCMXCIV");
        System.out.println(num);
    }

    private int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public int romanToInt(String s) {
        int ans = 0;
        int pre = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num = getValue(s.charAt(i));
            if (pre < num) {
                ans = ans - pre;
            } else {
                ans = ans + pre;
            }
            pre = num;
        }
        ans = ans + pre;
        return ans;
    }
}
