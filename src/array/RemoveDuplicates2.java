package array;

/**
 * @author Marshal
 * @date 2021/4/6
 */
public class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        int m = nums.length;
        if (m <= 2) {
            return m;
        }
        int slow = 2;
        int fast = 2;

        while (fast < m) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
