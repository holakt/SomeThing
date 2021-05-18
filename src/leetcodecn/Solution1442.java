package leetcodecn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author holate
 * @date 2021/5/18
 */
public class Solution1442 {
    public static void main(String[] args) {
        int ret = new Solution1442().countTriplets(new int[]{7, 11, 12, 9, 5, 2, 7, 17, 22});
        System.out.println(ret);
    }

    public int countTriplets(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> cnt = new HashMap<>();
        Map<Integer, Integer> total = new HashMap<>();
        int s = 0, ret = 0;
        for (int k = 0; k < n; k++) {
            int key = s ^ arr[k];
            if (cnt.containsKey(key)) {
                ret += cnt.get(key) * k - total.get(key);
            }
            cnt.put(s, cnt.getOrDefault(s, 0) + 1);
            total.put(s, total.getOrDefault(s, 0) + k);
            s ^= arr[k];
        }
        return ret;
    }
}
