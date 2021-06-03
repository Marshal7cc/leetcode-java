package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Marshal
 * @date 2021/6/3
 */
public class FindMaxLength {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (num == 1) {
                sum++;
            } else {
                sum--;
            }
            if (map.containsKey(sum)) {
                ans = Math.max(i - map.get(sum), ans);
            } else {
                map.put(sum, i);
            }
        }
        return ans;
    }
}
