package dp;

/**
 * @author Marshal
 * @date 2021/8/10
 */
public class NumberOfArithmeticSlices {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return 0;
        }

        int ans = 0;
        int tmp = 0;
        int d = nums[0] - nums[1];
        for (int i = 2; i < n; i++) {
            if (nums[i - 1] - nums[i] == d) {
                tmp++;
            } else {
                tmp = 0;
                d = nums[i - 1] - nums[i];
            }
            ans = ans + tmp;
        }

        return ans;
    }
}
