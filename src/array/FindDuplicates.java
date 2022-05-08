package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marshal
 * @since 2022/5/8
 */
public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // nums[i]应该被放置在nums[nums[i]-1]
            while (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != (i + 1)) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    private void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}
