package search.binarySearch;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 1173: 切木棍
 * 时间限制: 1 Sec  内存限制: 128 MB
 * 提交: 87  解决: 16
 * [提交][状态][讨论版][命题人:hehaitao]
 * 题目描述
 * 有n根木棍,农夫要把这些木棍做成晾衣杆送给m个邻居. 为了避免邻居们说他偏心,他需要把这些晾衣杆切的一样长.现在你帮农夫算一下,这些晾衣杆最长可以做多长?注意:木棍不能拼接的.
 *
 * 输入
 * 第一行是2个整数n和m ( 1<n<m<10000 )
 *
 * 接下来n行是这些棍子的长度,
 *
 * 输出
 * 最长的晾衣杆长度, 保留2位小数(四舍五入,若为整数也要输出2位小数)
 *
 * 样例输入
 * 4 11
 * 8.02
 * 7.43
 * 4.57
 * 5.39
 * 样例输出
 * 2.00
 * 提示
 * 来源http://119.23.214.227/problem.php?id=1173
 */
public class qiemugun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        double sum = 0.0;
        double[] a = new double[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextDouble();
            sum += a[i];
        }
        sc.close();
        double value = solve(a, n, sum);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(value));
    }

    private static double solve(double[] a, int n, double sum) {
        double left = 0.0;
        double right = sum / n;
        double middle;
        while (true) {
            int s = 0;
            middle = (left + right) / 2;
            for (double v : a) {
                s += v / middle;
            }
            if (s >= n) {
                left = middle;
            } else {
                right = middle;
            }
            if (s == n && (right - left) < 0.001) {
                break;
            }
        }
        return middle;
    }
}