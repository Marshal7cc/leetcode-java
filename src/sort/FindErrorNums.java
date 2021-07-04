package sort;

import java.util.Arrays;

/**
 * @author Marshal
 * @date 2021/7/4
 */
public class FindErrorNums {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int[] ans = new int[2];

        // 找到重复出现的数
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                ans[0] = nums[i - 1];
            }
            if (nums[i] - nums[i - 1] > 1) {
                ans[1] = nums[i] - 1;
            }
        }

        // 特殊情况
        if (nums[0] != 1) {
            ans[1] = 1;
        }
        if (nums[n - 1] != n) {
            ans[1] = n;
        }
        return ans;
    }
}
