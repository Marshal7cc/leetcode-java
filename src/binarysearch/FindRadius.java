package binarysearch;

import java.util.Arrays;

/**
 * @author Marshal
 * @since 2021/12/20
 */
public class FindRadius {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);

        int ans = 0;
        for (int house : houses) {
            int left = binarySort(heaters, house);
            int right = left + 1;

            int leftDis = left < 0 ? Integer.MAX_VALUE : house - heaters[left];
            int rightDis = right >= heaters.length ? Integer.MAX_VALUE : heaters[right] - house;

            ans = Math.max(ans, Math.min(leftDis, rightDis));
        }
        return ans;
    }

    public int binarySort(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (nums[left] > target) {
            return -1;
        }
        while (left < right) {
            int mid = (right - left + 1) / 2 + left;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return left;
    }
}
