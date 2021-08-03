package sort;

/**
 * @author Marshal
 * @date 2021/8/3
 */
public class FindUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int recentMax = Integer.MIN_VALUE;
        int recentMin = Integer.MAX_VALUE;

        int left = -1;
        int right = -1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            // 有元素相等的情况,所以要有等于号
            if (nums[i] >= recentMax) {
                recentMax = nums[i];
            } else {
                right = i;
            }

            if (nums[n - 1 - i] <= recentMin) {
                recentMin = nums[n - 1 - i];
            } else {
                left = n - 1 - i;
            }
        }

        return right == -1 ? 0 : right - left + 1;
    }
}
