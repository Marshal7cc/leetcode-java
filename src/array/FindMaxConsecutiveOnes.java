package array;

/**
 * @author Marshal
 * @date 2021/2/15
 */
public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        // 当前1出现的次数
        int count = 0;
        // 最大次数
        int maxCount = 0;

        for (int val : nums) {
            // 当前值为1
            if (val == 1) {
                count++;
            } else {
                // 当前值不为1

                // 出现1的次数不为0
                if (count != 0) {
                    maxCount = Math.max(maxCount, count);
                    count = 0;
                }
            }
        }
        // 这里漏掉了最后一个数字为1的情况，需要在重新比一次大小
        // return maxCount;
        return Math.max(maxCount, count);
    }
}
