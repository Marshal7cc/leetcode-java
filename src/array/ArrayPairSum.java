package array;

import java.util.Arrays;

/**
 * @author Marshal
 * @date 2021/2/16
 */
public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int len = nums.length;
        for (int i = 0; i < len; i += 2) {
            res += nums[i];
        }
        return res;
    }
}
