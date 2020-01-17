package bytedance;

import java.util.Scanner;

public class bd0902 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),d = sc.nextInt();
        int buiding[] = new int[n];
        long count = 0;
        for (int i = 0, j = 0; i < n; i++) {
            buiding[i] = sc.nextInt();
            while (i >= 2 && (buiding[i] -buiding[j]) > d) {
                j++;
            }
            count += fun(i - j);
        }
        System.out.println(count % 99997867);
    }

    private static long fun(int n) {
        return (n-1) * n / 2;
    }
}
