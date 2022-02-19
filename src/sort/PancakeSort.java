package sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marshal
 * @since 2022/2/19
 */
public class PancakeSort {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ret = new ArrayList<>();
        for (int n = arr.length; n > 1; n--) {
            // 记录最大值的idx
            int index = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] >= arr[index]) {
                    index = i;
                }
            }
            //  如果最大值是最后一个直接跳过
            if (index == n - 1) {
                continue;
            }
            // 两次反转,确保最大值反转到n-1位上
            reverse(arr, index);
            reverse(arr, n - 1);

            // 记录答案
            ret.add(index + 1);
            ret.add(n);
        }
        return ret;
    }

    public void reverse(int[] arr, int end) {
        for (int i = 0, j = end; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
