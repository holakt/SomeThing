package easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1056: ASCII码排序
 * 时间限制: 1 Sec  内存限制: 128 MB
 * 提交: 61  解决: 21
 * [提交][状态][讨论版][命题人:外部导入]
 * 题目描述
 * 输入三个字符后，按各字符的ASCII码从小到大的顺序输出这三个字符。
 *
 * 输入
 * 输入数据有多组，每组占一行，有三个字符组成，之间无空格。
 *
 * 输出
 * 对于每组输入数据，输出一行，字符中间用一个空格分开。
 *
 * 样例输入
 * qwe
 * asd
 * zxc
 * 样例输出
 * e q w
 * a d s
 * c x z
 * 提示
 * 来源http://119.23.214.227/problem.php?id=1056
 */
public class ASCIIsort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char[] chars = sc.nextLine().trim().toCharArray();
            Arrays.sort(chars);
            for (char c : chars) {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
