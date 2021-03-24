package enumeration;

import java.util.TreeMap;

/**
 * @author Marshal
 * @date 2021/3/24
 */
public class Find132pattern {
    /**
     * 枚举3
     *
     * @param nums
     * @return
     */
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return false;
        }

        // 存放'3'右边的所有元素
        TreeMap<Integer, Integer> right = new TreeMap<>();
        // 存放左边的最小值
        int leftMin = nums[0];
        // 从初始情况开始，把所有右边的元素存入
        for (int i = 2; i < n; i++) {
            right.put(nums[i], right.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 1; i < n - 1; i++) {
            if (leftMin < nums[i]) {
                Integer next = right.ceilingKey(leftMin + 1);
                if (next != null && next < nums[i]) {
                    return true;
                }
            }

            leftMin = Math.min(leftMin, nums[i]);
            // 清除当前元素'3'右边的元素
            right.put(nums[i + 1], right.get(nums[i + 1]) - 1);
            if (right.get(nums[i + 1]) == 0) {
                right.remove(nums[i + 1]);
            }
        }
        return false;
    }
}
