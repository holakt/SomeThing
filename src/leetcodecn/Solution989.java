package leetcodecn;

import java.util.LinkedList;
import java.util.List;

/**
 * 对于非负整数X而言，X的数组形式是每位数字按从左到右的顺序形成的数组。例如，如果X = 1231，那么其数组形式为[1,2,3,1]。
 * <p>
 * 给定非负整数 X 的数组形式A，返回整数X+K的数组形式。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：A = [1,2,0,0], K = 34
 * 输出：[1,2,3,4]
 * 解释：1200 + 34 = 1234
 * 示例 2：
 * <p>
 * 输入：A = [2,7,4], K = 181
 * 输出：[4,5,5]
 * 解释：274 + 181 = 455
 * 示例 3：
 * <p>
 * 输入：A = [2,1,5], K = 806
 * 输出：[1,0,2,1]
 * 解释：215 + 806 = 1021
 * 示例 4：
 * <p>
 * 输入：A = [9,9,9,9,9,9,9,9,9,9], K = 1
 * 输出：[1,0,0,0,0,0,0,0,0,0,0]
 * 解释：9999999999 + 1 = 10000000000
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= A.length <= 10000
 * 0 <= A[i] <= 9
 * 0 <= K <= 10000
 * 如果A.length > 1，那么A[0] != 0
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-to-array-form-of-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author holate
 * @date 2021/1/22
 */
public class Solution989 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 0, 0};
        System.out.println(new Solution989().addToArrayForm(a, 34));
    }

    public List<Integer> addToArrayForm(int[] A, int K) {
        LinkedList<Integer> ret = new LinkedList<>();
        int i = A.length - 1;
        int lastNum = K;
        while (i >= 0 || lastNum > 0) {
            if (i >= 0) {
                lastNum += A[i];
            }
            ret.addFirst(lastNum % 10);
            lastNum /= 10;
            i--;
        }
        return ret;
    }
}
