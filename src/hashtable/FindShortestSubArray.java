package hashtable;

import java.util.HashMap;

/**
 * @author Marshal
 * @date 2021/2/20
 */
public class FindShortestSubArray {
    public int findShortestSubArray(int[] nums) {
        int len = nums.length;
        // int[],第一位存储出现次数，第二位存首次出现位置，第二位存最后一次出现位置
        HashMap<Integer, int[]> map = new HashMap<>(len);

        for (int i = 0; i < len; i++) {
            if (map.containsKey(nums[i])) {
                int[] arr = map.get(nums[i]);
                arr[0]++;
                arr[2] = i;
            } else {
                map.put(nums[i], new int[]{1, i, i});
            }
        }

        int[] maxArr = new int[3];
        for (int[] arr : map.values()) {
            if (arr[0] > maxArr[0]) {
                maxArr = arr;
            } else if (arr[0] == maxArr[0]) {
                // 如果度相等，比较子数组的长度，取长度小的
                if (arr[2] - arr[1] < maxArr[2] - maxArr[1]) {
                    maxArr = arr;
                }
            }
        }

        return maxArr[2] - maxArr[1] + 1;
    }
}
