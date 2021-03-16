package array;

/**
 * @author Marshal
 * @date 2021/3/16
 */
public class RunningSum {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
