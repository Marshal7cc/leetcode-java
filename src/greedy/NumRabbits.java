package greedy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Marshal
 * @date 2021/4/4
 */
public class NumRabbits {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : answers) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            Integer x = item.getKey();
            Integer y = item.getValue();
            ans += (x + y) / (x + 1) * (x + 1);
        }
        return ans;
    }
}
