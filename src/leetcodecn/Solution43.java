package leetcodecn;

/*
给定两个以字符串形式表示的非负整数num1和num2，返回num1和num2的乘积，它们的乘积也表示为字符串形式。

示例 1:

输入: num1 = "2", num2 = "3"
输出: "6"
示例2:

输入: num1 = "123", num2 = "456"
输出: "56088"
说明：

num1和num2的长度小于110。
num1和num2 只包含数字0-9。
num1和num2均不以零开头，除非是数字 0 本身。
不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/multiply-strings
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution43 {

    public static void main(String[] args) {
        System.out.println(new Solution43().multiply("12", "34"));
    }

    public String multiply(String num1, String num2) {
        char[] numA = new StringBuilder(num1).reverse().toString().toCharArray();
        char[] numB = new StringBuilder(num2).reverse().toString().toCharArray();
        char[] sum = new char[numA.length + numB.length];
        for (int i = 0; i < numA.length; i++) {
            int a = numA[i] - '0';
            for (int j = 0; j < numB.length; j++) {
                int b = numB[j] - '0';
                int c = a * b;
                sum[i + j + 1] += c / 10;
                sum[i + j] += c % 10;
                int t = 0;
                while (sum[i + j + t] > 9) {
                    sum[i + j + t + 1] += sum[i + j + t] / 10;
                    sum[i + j + t] = (char) (sum[i + j + t++] % 10);
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        boolean f = true;
        for (int i = sum.length - 1; i >= 0; i--) {
            if (f && sum[i] == 0) {
                continue;
            }
            f = false;
            builder.append((int)sum[i]);
        }
        String s = builder.toString();
        return s.equals("") ? "0" : s;
    }

    public String multiplyOfficial(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int m = num1.length(), n = num2.length();
        int[] ansArr = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            int x = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int y = num2.charAt(j) - '0';
                ansArr[i + j + 1] += x * y;
            }
        }
        for (int i = m + n - 1; i > 0; i--) {
            ansArr[i - 1] += ansArr[i] / 10;
            ansArr[i] %= 10;
        }
        int index = ansArr[0] == 0 ? 1 : 0;
        StringBuffer ans = new StringBuffer();
        while (index < m + n) {
            ans.append(ansArr[index]);
            index++;
        }
        return ans.toString();
    }
}