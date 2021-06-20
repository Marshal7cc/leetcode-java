package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Marshal
 * @date 2021/6/20
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int ans = 0;
        boolean existSingle = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            ans += value / 2;
            if (value % 2 == 1) {
                existSingle = true;
            }
        }

        return 2 * ans + (existSingle ? 1 : 0);
    }
}
