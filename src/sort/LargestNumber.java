package sort;

import java.util.Arrays;

/**
 * @author Marshal
 * @date 2021/4/12
 */
public class LargestNumber {
    public static void main(String[] args) {
        int
                [] s = {10, 2};
        largestNumber(s);
    }

    public static String largestNumber(int[] nums) {
        int n = nums.length;
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i] + "";
        }

        // 排序
        // 比较ab与ba的大小，类似冒泡排序
        Arrays.sort(arr, ((o1, o2) -> (o2 + o1).compareTo(o1 + o2)));

        // 去掉前面的0
        int idx = 0;
        while (idx < n && arr[idx].equals("0")) {
            idx++;
        }
        // 数组元素全为0的特殊情况
        if (idx == n) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = idx; i < n; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
