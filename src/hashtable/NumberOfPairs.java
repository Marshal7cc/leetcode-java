package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Marshal
 * @since 2023/2/16
 */
public class NumberOfPairs {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Boolean> cnt = new HashMap<Integer, Boolean>();
        int res = 0;
        for (int num : nums) {
            cnt.put(num, !cnt.getOrDefault(num, false));
            if (!cnt.get(num)) {
                res++;
            }
        }
        return new int[]{res, nums.length - 2 * res};
    }

}
