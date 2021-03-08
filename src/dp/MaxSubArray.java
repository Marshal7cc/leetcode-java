package dp;

import java.util.Arrays;

/**
 * @author Marshal
 * @date 2021/3/8
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        // dp[i]数组保存的是##以num[i]结尾时##的具有最大和的连续子数组
        int[] dp = new int[len];
        // 以nums[0]结尾的最大子序和就是nums[0]
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            // 状态转移方程
            //dp[i]的最大子序和要么是自成一派最大，要么就是当前值加上前面i - 1个数的最大子序和
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
