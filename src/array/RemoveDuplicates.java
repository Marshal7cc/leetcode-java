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
}
