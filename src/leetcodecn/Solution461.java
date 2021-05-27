package leetcodecn;

/**
 * @author holate
 * @date 2021/5/27
 */
public class Solution461 {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
