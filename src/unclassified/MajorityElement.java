package unclassified;

/**
 * @author Marshal
 * @date 2021/7/10
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int candidate = -1;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        return count * 2 > n ? candidate : -1;
    }
}
