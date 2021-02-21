package slidewindow;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author Marshal
 * @date 2021/2/21
 */
public class LongestSubarray {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(9);
        set.add(100);

        System.out.println(set.first());
        System.out.println(set.last());
        longestSubarray(new int[]{4, 2, 2, 2, 4, 4, 2, 2}, 0);
    }

    public static int longestSubarray(int[] nums, int limit) {
        int len = nums.length;
        int max = 0;
        int left = 0;
        int right = 0;
        // 存储当前窗口的最大值，最小值以及出现次数,出现次数是为了防止多删
        TreeMap<Integer, Integer> map = new TreeMap<>();

        while (right < len) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (map.lastKey() - map.firstKey() > limit) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}
