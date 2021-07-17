package offer;

/**
 * @author Marshal
 * @date 2021/7/17
 */
public class Search {
    public int search(int[] nums, int target) {
        // 第一个大于等于target的idx
        int left = bs(nums, target, true);
        // 第一个大于target的idx
        int right = bs(nums, target, false) - 1;
        if (left <= right && right < nums.length && nums[left] == target && nums[right] == target) {
            return right - left + 1;
        }
        return 0;
    }

    private int bs(int[] nums, int target, boolean eq) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        // 目标索引
        int idx = nums.length;
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
