package unclassified;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Marshal
 * @date 2021/5/15
 */
public class RomanToInt {
    private Map<Character, Integer> roman = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            Integer current = roman.get(s.charAt(i));
            if (i < n - 1 && current < roman.get(s.charAt(i + 1))) {
                ans -= current;
            } else {
                ans += current;
            }
        }
        return ans;
    }
}
