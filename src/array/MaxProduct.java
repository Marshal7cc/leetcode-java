package array;

import java.util.Arrays;

/**
 * @author Marshal
 * @since 2021/8/28
 */
public class MaxProduct {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        return (nums[n - 1] - 1) * (nums[n - 2] - 1);
    }
}
