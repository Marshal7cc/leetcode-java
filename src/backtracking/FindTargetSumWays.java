package backtracking;

/**
 * @author Marshal
 * @date 2021/6/7
 */
public class FindTargetSumWays {
    private int count = 0;

    public int findTargetSumWays(int[] nums, int target) {
        backTrack(nums, target, 0, 0);
        return count;
    }

    /**
     * @param nums
     * @param target
     * @param index  已经累加的数组元素的个数 index+1
     * @param sum    已经累加的数组总和       sum+nums[index]
     */
    private void backTrack(int[] nums, int target, int index, int sum) {
        if (index == nums.length) {
            if (sum == target) {
                count++;
            }
        } else {
            backTrack(nums, target, index + 1, sum + nums[index]);
            backTrack(nums, target, index + 1, sum - nums[index]);
        }
    }
}
