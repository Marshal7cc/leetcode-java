package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Marshal
 * @date 2021/6/18
 */
public class MaxLengthBetweenEqualCharacters {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = -1;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                ans = Math.max(ans, i - map.get(c) - 1);
            } else {
                map.put(c, i);
            }
        }
        return ans;
    }
}
