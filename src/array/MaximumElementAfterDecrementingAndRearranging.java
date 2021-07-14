package array;

import java.util.Arrays;

/**
 * @author Marshal
 * @date 2021/7/15
 */
public class MaximumElementAfterDecrementingAndRearranging {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        arr[0] = 1;
        if (n == 1) {
            return 1;
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] > 1) {
                arr[i] = arr[i - 1] + 1;
            }
        }
        return arr[n - 1];
    }
}
