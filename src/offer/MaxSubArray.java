package offer;

import java.util.Arrays;

/**
 * @author Marshal
 * @date 2021/7/17
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
