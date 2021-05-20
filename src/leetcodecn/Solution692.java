package leetcodecn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author holate
 * @date 2021/5/20
 */
public class Solution692 {
    public static void main(String[] args) {
        String[] words = new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        List<String> ret = new Solution692().topKFrequent(words, 4);
        System.out.println(ret);
    }

    public List<String> topKFrequent(String[] words, int k) {
        List<String> ret = new ArrayList<>();
        PriorityQueue<Map.Entry<String, Integer>> priorityQueue =
            new PriorityQueue<>((o1, o2) -> {
                if (o1.getValue().intValue() == o2.getValue().intValue()) {
                    return o1.getKey().compareTo(o2.getKey());
                }
                return o2.getValue() - o1.getValue();
            });
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            priorityQueue.add(entry);
        }
        for (int i = 0; i < k; i++) {
            ret.add(priorityQueue.poll().getKey());
        }
        return ret;
    }
}
