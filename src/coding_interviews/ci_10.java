package coding_interviews;

public class ci_10 {
    public static void main(String[] args) {
        System.out.println(Math.pow(2, 3));
        System.out.println(new ci_10().Power(0.1234,1));
        System.out.println(new ci_10().Power(0,1));
        System.out.println(new ci_10().Power(3.343,0));
    }
    public double Power(double base, int exponent) {
        return Math.pow(base, exponent);
    }
}
/***
 * 思考：如果要实现一个pow函数该如何处理？
 * 思路一：
 * 乘积可以复用，大大减少计算量
 *
 */
