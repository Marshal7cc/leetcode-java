package dp;

import java.util.Arrays;

/**
 * @author Marshal
 * @date 2021/3/20
 */
public class RobTwo {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }
        if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }

        return Math.max(robSimple(Arrays.copyOfRange(nums, 0, n - 1)), robSimple(Arrays.copyOfRange(nums, 1, n)));
    }

    private int robSimple(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            // 状态转换方程
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
    }
}
