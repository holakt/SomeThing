package leetcodecn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author holate
 * @date 2021/5/15
 */
public class Solution13 {
    static Map<String, Integer> map = new HashMap<String, Integer>() {{
        put("M", 1000);
        put("CM", 900);
        put("D", 500);
        put("CD", 400);
        put("C", 100);
        put("XC", 90);
        put("L", 50);
        put("XL", 40);
        put("X", 10);
        put("IX", 9);
        put("V", 5);
        put("IV", 4);
        put("I", 1);
    }};

    public static void main(String[] args) {
        int num = new Solution13().romanToInt("MCMXCIV");
        System.out.println(num);
    }

    public int romanToInt(String s) {
        char[] array = s.toCharArray();
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            String a1 = String.valueOf(array[i]);
            if (i + 1 < array.length) {
                String a2 = a1 + array[i + 1];
                if (map.containsKey(a2)) {
                    num += map.get(a2);
                    ++i;
                    continue;
                }
            }
            num += map.get(a1);
        }
        return num;
    }
}
