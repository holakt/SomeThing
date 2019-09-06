package coding_interviews;


public class ci_09 {
    public static void main(String[] args) {
        System.out.println(new ci_09().NumberOf1(-1));
    }
    public int NumberOf1(int n) {
        int count = 0;
        String s = Integer.toBinaryString(n);
        int i = 0;
        while ((i=s.indexOf("1",i))!=-1) {
            count++;
            i++;
        }
        return count;
    }
}
