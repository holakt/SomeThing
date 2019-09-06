package coding_interviews;

public class ci_07 {
    public int JumpFloor(int target) {
        int n[]=new int[target+3];
        n[0] = 0;
        n[1] = 1;
        n[2] = 2;
//        for (int i = 3; i <= target; i++) {
//            for (int j = 0; j < i; j++) {
//                n[i] += n[j];
//            }
//            n[i] += 1;
//        }
        for (int i = 3; i <= target; i++) {
            n[i] = 2*n[i-1];
        }
        return n[target];
    }

    public static void main(String[] args) {
        System.out.println(new ci_07().JumpFloor(4));
    }
}
/**
 * f(n)=f(n-1)+f(n-2)+...+f(1)
 * f(n-1)=f(n-2)+...f(1)
 * 得:f(n)=2*f(n-1)
 *
 */
