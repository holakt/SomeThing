package leetcodecn;

/**
 * @author holate
 * @date 2021/5/17
 */
public class Solution1864 {
    public static void main(String[] args) {
        int ret = new Solution1864().minSwaps("1001");
        System.out.println(ret);
    }

    public int minSwaps(String s) {
        char[] arr = s.toCharArray();
        int num0 = 0;
        for (char c : arr) {
            if (c == '0') num0++;
        }
        int num1 = arr.length - num0;
        if (Math.abs(num0 - num1) > 1) return -1;

        //如果0更多只能出现0开头的结果，同理1更多只能出现1开头的结果
        if (num0 > num1) {
            // 0开头
            return getSum(arr, '1');
        } else if (num1 > num0) {
            // 1开头
            return getSum(arr, '0');
        } else {
            // 取0开头和1开头的min值
            return Math.min(getSum(arr, '0'), getSum(arr, '1'));
        }
    }

    // 不需要index记录奇数位下标 因为奇数位跟偶数位一对一交换
    // 只需要遍历偶数位下标的数组 找出需要交换的即可
    private int getSum(char[] arr, char even) {
        int res = 0;
        // 注意：i+=2
        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i] == even) {
                res++;
            }
        }
        return res;
    }
// 以下为示例：
// 111100000   1:4个 0:5个
// i    取值：0 2 4 6 8
// index取值：1 3 5 7 9

// i=0 需要替换 找到第一个值为0的下标5 （不是4 每次+2）
// arr[0]和arr[5]交换 sum=1; 011101000

// i=2 需要交换 找到下一个值为0的下标7
// arr[2]和arr[7]交换 sum=2; 010101010

// 结束 sum=2 需要交换2次
}
