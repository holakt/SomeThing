package coding_interviews;

public class ci_06 {
    public int JumpFloor(int target) {
        int n[]=new int[target+3];
        n[0] = 0;
        n[1] = 1;
        n[2] = 2;
        for (int i = 3; i <= target; i++) {
            n[i] = n[i - 1] + n[i - 2];
        }
        return n[target];
    }

    public static void main(String[] args) {
        System.out.println(new ci_06().JumpFloor(3));
    }
}
/**
 * 动态规划或者递归
 * dp(i) = dp(i-2) + dp(i-1)
 */