package slidewindow;

/**
 * @author Marshal
 * @date 2021/2/4
 */
public class FindMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        if (k == 0) {
            throw new IllegalArgumentException();
        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int left = 0;
        int right = k;
        int maxSum = sum;
        while (right < nums.length) {
            sum = sum - nums[left] + nums[right];
            maxSum = Math.max(maxSum, sum);

            left++;
            right++;
        }

        return 1.0 * maxSum / k;
    }
}
