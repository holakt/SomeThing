package coding_interviews;

import java.util.ArrayList;

public class ci_11 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8};
        new ci_11().reOrderArray(n);
        for (int i :n) {
            System.out.println(i);
        }
    }
    public void reOrderArray(int [] array) {
        int len = array.length;
        int k = 0;
        ArrayList<Integer> a = new ArrayList();
        for (int i = 0; i < len; i++) {
            if (array[i] % 2 == 0) {
                a.add(array[i]);
            }else {
                a.add(k++,array[i]);
            }
        }
        for (int i = 0; i < len; i++) {
            array[i] = a.get(i);
        }
    }
}
/***
 * 思路一：用额外空间存然后拼接；
 * 思路二：
 * 链接：https://www.nowcoder.com/questionTerminal/beb5aa231adc45b2a5dcc5b62c93f593?answerType=1&f=discussion
 * 来源：牛客网
 *
 * i++往前走碰到偶数停下来，j = i+1
 * 若 a[j]为偶数，j++前进，直到碰到奇数
 * a[j]对应的奇数插到a[i]位置，j经过的j-i个偶数依次后移
 * 如果j==len-1时还没碰到奇数，证明i和j之间都为偶数了，完成整个移动
 *
 */