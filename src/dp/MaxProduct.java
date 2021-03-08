package dp;

import java.util.Arrays;

/**
 * @author Marshal
 * @date 2021/3/8
 */
public class MaxProduct {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int[] dpMax = new int[len];
        int[] dpMin = new int[len];

        dpMax[0] = nums[0];
        dpMin[0] = nums[0];
        for (int i = 1; i < len; i++) {
            int num = nums[i];
            dpMax[i] = Math.max(Math.max(dpMax[i - 1] * num, num), dpMin[i - 1] * num);
            dpMin[i] = Math.min(Math.min(dpMin[i - 1] * num, num), dpMax[i - 1] * num);
        }
        return Arrays.stream(dpMax).max().getAsInt();
    }
}
