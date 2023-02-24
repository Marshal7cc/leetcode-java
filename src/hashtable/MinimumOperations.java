package hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Marshal
 * @since 2023/2/24
 */
public class MinimumOperations {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }
        return set.size();
    }
}
