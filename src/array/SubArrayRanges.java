package array;

/**
 * @author Marshal
 * @since 2022/3/4
 */
public class SubArrayRanges {
    public long subArrayRanges(int[] nums) {
        long ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int minVal = Integer.MAX_VALUE;
            int maxVal = Integer.MIN_VALUE;
            for (int j = i; j < n; j++) {
                maxVal = Math.max(maxVal, nums[j]);
                minVal = Math.min(minVal, nums[j]);
                ans += maxVal - minVal;
            }
        }
        return ans;
    }
}
