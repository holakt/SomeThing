package coding_interviews;

public class ci_08 {
    public int RectCover(int target) {
        int n[] = new int[target + 3];
        n[0] = 0;
        n[1] = 1;
        n[2] = 2;
        for (int i = 3; i <= target; i++) {
            n[i] = n[i - 1] + n[i - 2];
        }
        return n[target];
    }
    public static void main(String[] args) {
        System.out.println(new ci_08().RectCover(5));
    }
}
/**
 * 被覆盖的目标矩形的形状： 2*n
 * 每次新增加的一列
 *（1）如果竖着放对应的情况与 target为 n-1 时相同；
 * (2如果横着放，对应的情况与 target 为 n-2 时相同。
 *动态规划与递归
 */