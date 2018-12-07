package other;

import java.util.Scanner;

/**
 * 有一些由英文字符组成的大小写敏感的字符串。
 * 请写一个程序，找到一个最长的字符串x，使得对于已经给出的字符串中的任意一个y，
 * x或者是y的子串、或者x中的字符反序之后得到的新字符串是y的子串。
 * 输入的第一行是一个整数t(1≤t≤10)，t表示测试数据的数目。
 * 对于每一组测试数据，第一行是一个整数n(1≤n≤100)，表示已经给出n个字符串。
 * 接下来n行，每行给出一个长度在1和100之间的字符串。
 * 对于每一组测试数据，输出一行，给出题目中要求的字符串x的长度；如果找不到符合要求的字符串，则输出0。
 * 输入样例
 * 2
 * 3
 * ABCD
 * BCDFF
 * BRCD
 * 2
 * rose
 * orchid
 * 输出样例
 * 2
 * 2
 */
public class Zichuanwenti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int group = sc.nextInt();
        int max;
        for (int i = 0; i < group; i++) {
            max = 0;
            int min = 0;
            int len = sc.nextInt();
            String a[] = new String[len];
            sc.nextLine();
            for (int j = 0; j < len; j++) {
                a[j] = sc.nextLine().trim();
                min = a[min].length() < a[j].length() ? min : j;
            }
            String minStr = a[min];
            a[min] = null;
            for (int k = 0; k < 2; k++) {
                StringBuffer buffer = new StringBuffer(minStr);
                a1:
                while (buffer.length() != 0) {
                    min = 0;
                    if (k == 0)
                        buffer.deleteCharAt(0);
                    else
                        buffer.deleteCharAt(buffer.length() - 1);
                    for (int j = 0; j < len; j++) {
                        if (a[j] == null) {
                            continue;
                        }
                        if (a[j].contains(buffer.reverse()) || a[j].contains(buffer.reverse())) {
                            min++;
                        } else {
                            break;
                        }
                    }
                    if (min == a.length - 1) {
                        max = max > buffer.length() ? max : buffer.length();
                        break a1;
                    }
                }
            }
            System.out.println(max);
        }
        sc.close();
    }
}