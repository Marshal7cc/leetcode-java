package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Marshal
 * @since 2025/9/22
 */
public class MaxFrequencyElements {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        int maxCnt = 0;
        int ans = 0;
        for (int x : nums) {
            int c = cnt.merge(x, 1, Integer::sum); // c = ++cnt[x]
            if (c > maxCnt) {
                ans = maxCnt = c;
            } else if (c == maxCnt) {
                ans += c;
            }
        }
        return ans;
    }
}
