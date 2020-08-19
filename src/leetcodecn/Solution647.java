package leetcodecn;

public class Solution647 {

    public static void main(String[] args) {
        System.out.println(new Solution647().countSubstrings("abcba"));
    }

    public int countSubstrings(String s) {
        StringBuilder builder = new StringBuilder("$#");
        int size = s.length();
        for (int i = 0; i < size; i++) {
            builder.append(s.charAt(i));
            builder.append("#");
        }
        builder.append("^");
        String m = builder.toString();
        size = (size << 1) + 2;

        int[] f = new int[size];
        int ans = 0;
        int iMax = 0, rMax = 0;
        for (int i = 1; i < size; i++) {
            f[i] = i < rMax ? Math.min(f[2 * iMax - i], rMax - i) : 1;
            while (m.charAt(i - f[i]) == m.charAt(i + f[i])) {
                f[i]++;
            }
            if (i + f[i] > rMax) {
                iMax = i;
                rMax = i + f[i];
            }
            ans += f[i] / 2;
        }
        return ans;
    }
}
