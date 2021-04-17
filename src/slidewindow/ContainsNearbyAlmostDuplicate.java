package slidewindow;

import java.util.TreeSet;

/**
 * @author Marshal
 * @date 2021/4/17
 */
public class ContainsNearbyAlmostDuplicate {
    public static void main(String[] args) {
        // nums[i]在int数字范围内，但加减都可能逸出
        int[] nums = {2147483640, 2147483641};
        containsNearbyAlmostDuplicate(nums, 1, 100);
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n = nums.length;
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            Long ceiling = set.ceiling((long) nums[i] - (long) t);
            if (ceiling != null && ceiling <= (long) nums[i] + (long) t) {
                return true;
            }
            set.add((long) nums[i]);
            if (i >= k) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }
}
