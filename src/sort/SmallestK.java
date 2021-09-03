package sort;

import java.util.Arrays;

/**
 * @author Marshal
 * @since 2021/9/3
 */
public class SmallestK {
    public int[] smallestK(int[] arr, int k) {
        Arrays.sort(arr);

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }
}
