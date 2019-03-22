package other;

/**
 * 素数筛
 */
public class SuShuShai {
    public static void main(String[] args) {
        int n = 1000000;
        Byte isPrime[] = new Byte[n];
        for (int i = 0; i < n; i++) {
            isPrime[i] = 1;
        }
        for (int i = 2; i < n; i++) {
            if (isPrime[i] == 1) {
                System.out.println(i);
                for (int j = 2; j < n; j++) {
                    int t=j*i;
                    if (t >= n) {
                        break;
                    }
                    isPrime[t]=0;
                }
            }
        }
    }
}
