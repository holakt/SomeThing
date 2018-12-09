package other;

import java.util.Scanner;

/**
 * 1110: 朋友圈
 * 时间限制: 1 Sec  内存限制: 128 MB
 * 提交: 66  解决: 15
 * [提交][状态][讨论版][命题人:liyuansong]
 * 题目描述
 * 微信朋友圈，有n个人，任何两个人都可能是朋友。如果我们告诉你哪些人是朋友，你能说出这个圈中一共有多少个朋友圈？
 *
 * 输入
 * 第一行是一个整数n，表示人数（1<n<1000000）。接下来一行是一个整数e，表示下面还有e行数据(0<e<100000)，接下来e行，每行两个整数a，b，表示编号为a的人和编号为b的人是朋友了。人的编号从1开始，连续编号。
 *
 * 输出
 * 一个整数，表示朋友圈数。
 * 样例输入
 * 7
 * 7
 * 1 2
 * 1 3
 * 2 4
 * 3 4
 * 5 6
 * 5 7
 * 6 7
 * 样例输出
 * 2
 * 提示
 * 来源http://119.23.214.227/problem.php?id=1110
 */
public class Pengyouquan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int man = sc.nextInt();
        int a[][] = new int[man + 1][man + 1];
        int len = sc.nextInt();
        for (int i = 0; i < len; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            for (int j = 1; j < man; j++) {
                a[r][c] = c;
                a[r][0] = 1;
            }
        }
        sc.close();
        for (int i = 1; i <= man; i++) {
            find(a, man + 1, 1, 1);
        }
        for (int i = 1; i <= man; i++) {
            if (a[i][0] == 1) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static void find(int[][] a, int man, int me, int row) {
        for (int i = row + 1; i < man; i++) {
            if (a[row][i] != 0&&a[row][1] != -1) {
                a[me][i] = a[row][i];
                find(a, man, row, a[row][i]);
            }
        }
        a[row][1] = -1;
        a[row][0] = 0;
    }

}
