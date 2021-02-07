package array;

/**
 * @author Marshal
 * @date 2021/2/7
 */
public class CheckPossibility {
    public boolean checkPossibility(int[] nums) {
        int len = nums.length;
        // 记录 nums[i] > nums[i+1]的次数
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            int x = nums[i];
            int y = nums[i + 1];
            // 只要出现nums[i] > nums[i+1]则计数器加1
            if (x > y) {
                count++;
                if (count > 1) {
                    return false;
                }
                // 如果nums[i+1] < nums[i-1]则将nums[i+1]替换为nums[i]
                // 否则将nums[i]替换为nums[i+1]即可，但在这里不需要操作，因为i++后不会再操作到nums[i]
                if (i > 0 && y < nums[i - 1]) {
                    nums[i + 1] = x;
                }
            }
        }
        return true;
    }
}
