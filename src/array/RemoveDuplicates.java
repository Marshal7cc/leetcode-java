package array;

/**
 * @author Marshal
 * @date 2021/4/6
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int m = nums.length;
        if (m <= 1) {
            return m;
        }
        int slow = 0;
        int fast = 1;

        while (fast < m) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }

    /**
     * 通用写法
     *
     * @param nums
     * @return
     */
    public int common(int[] nums) {
        int m = nums.length;
        if (m <= 1) {
            return m;
        }
        // 当前待判断的慢指针,0肯定符合所以不用判断
        int slow = 1;
        // 当前待判断的快指针
        int fast = 1;
        while (fast < m) {
            if (nums[fast] != nums[slow - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
