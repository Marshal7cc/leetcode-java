package array;

/**
 * @author Marshal
 * @date 2021/3/1
 */
public class NumArray {
    private int[] sum;

    public NumArray(int[] nums) {
        int len = nums.length;
        sum = new int[len + 1];
        for (int i = 0; i < len; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
    }

    /**
     * sumRange[i,j] = sum[j]-sum[i-1]
     * 为避免i=0是数组越界，故以sum[1]表示sum[0],sum[2]表示sum[1]
     * sum[i+1] = sum[i]+num[i]
     */
    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }
}
