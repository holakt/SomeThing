package easy;

import java.util.Scanner;

/**
 * 1192: 2018四川理工学院大学生ACM程序设计:安排比赛
 * 时间限制: 1 Sec  内存限制: 128 MB
 * 提交: 21  解决: 13
 * [提交][状态][讨论版][命题人:hehaitao]
 * 题目描述
 * 一种游戏可以是3人同时比赛, 仅1人晋级,其他2人淘汰. 也可以2个人比赛,淘汰1个. 现在有n个人, 最少安排多少场比赛才能产生冠军?
 * <p>
 * <p>
 * 输入
 * 输入: 多个测试用例,每个是一个正整数n ( 3~10000000),表示参赛人数. 0表示终止
 * <p>
 * 输出
 * 输出: 最少比赛场次
 * <p>
 * 样例输入
 * 3
 * 4
 * 0
 * 样例输出
 * 1
 * 2
 * 提示
 * 来源http://119.23.214.227/problem.php?id=1192
 */
public class Anpaibisai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count, j, k;
        while ((k = sc.nextInt()) != 0) {
            count = 0;
            while (k > 3) {
                j = k % 3;
                k = k / 3;
                count += k;
                k += j;
            }
            System.out.println(count+1);
        }
    }
}
