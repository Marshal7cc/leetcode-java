package binarysearch;

/**
 * @author Marshal
 * @date 2021/7/17
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        // 第一个大于等于target的idx
        int left = bs(nums, target, true);
        // 第一个大于target的idx
        int right = bs(nums, target, false) - 1;
        if (left <= right && right < nums.length && nums[left] == target && nums[right] == target) {
            return new int[]{left, right};
        }
        return new int[]{-1, -1};
    }

    private int bs(int[] nums, int target, boolean eq) {
        // 目标索引，这个值是为了防止只有一个元素的时候出错
        int idx = nums.length;
        int left = 0;
        int right = idx - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((nums[mid] > target) || (eq && nums[mid] >= target)) {
                right = mid - 1;
                idx = mid;
            } else {
                left = mid + 1;
            }
        }
        return idx;
    }
}
