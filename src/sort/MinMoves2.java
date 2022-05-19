package sort;

import java.util.Arrays;

/**
 * @author Marshal
 * @since 2022/5/19
 */
public class MinMoves2 {
    public int minMoves2(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            ans += Math.abs(nums[i] - nums[n / 2]);
        }

        return ans;
    }
}
