package hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Marshal
 * @since 2022/5/25
 */
public class RepeatedNTimes {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> founded = new HashSet<>();
        for (int n : nums) {
            if (!founded.add(n)) {
                return n;
            }
        }
        return -1;
    }
}
