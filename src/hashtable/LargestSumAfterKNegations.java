package hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Marshal
 * @since 2021/12/3
 */
public class LargestSumAfterKNegations {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> record = new HashMap<>(n);

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                record.put(nums[i], i);
                min = Math.min(nums[i], min);
                k--;
                if (k == 0) {
                    break;
                }
            } else {
                if (k % 2 == 0 || min == 0 || nums[i] == 0) {
                    break;
                } else {
                    if (min < nums[i]) {
                        nums[record.get(min)] = -nums[record.get(min)];
                    } else {
                        nums[i] = -nums[i];
                    }
                    break;
                }
            }
        }

        // 全是负数的情况
        if (k % 2 == 1 && record.size() == n) {
            nums[record.get(min)] = -nums[record.get(min)];
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
