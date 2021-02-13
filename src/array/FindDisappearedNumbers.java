package array;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Marshal
 * @date 2021/2/13
 */
public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        for (int val : nums) {
            // 不可取的原因：数组越界,转换成下面的写法
            //int i = val % len;
            //nums[i-1] += len;
            int i = (val - 1) % len;
            nums[i] += len;
        }

        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            if (nums[i] <= len) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
