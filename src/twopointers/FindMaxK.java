package twopointers;

import java.util.Arrays;

/**
 * @author Marshal
 * @since 2023/5/13
 */
public class FindMaxK {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int ans = -1;
        for (int i = 0, j = nums.length - 1; i < j; j--) {
            while (i < j && -nums[i] > nums[j]) {
                i++;
            }
            if (-nums[i] == nums[j]) {
                return nums[j];
            }
        }
        return -1;
    }
}
