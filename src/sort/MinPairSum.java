package sort;

import java.util.Arrays;

/**
 * @author Marshal
 * @date 2021/7/20
 */
public class MinPairSum {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n / 2; i++) {
            ans = Math.max(ans, nums[i] + nums[n - 1 - i]);
        }
        return ans;
    }
}
