package binarysearch;

/**
 * @author Marshal
 * @date 2021/4/8
 */
public class FindMinTwo {
    public int findMin(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else if (nums[mid] == nums[right]) {
                right--;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}
