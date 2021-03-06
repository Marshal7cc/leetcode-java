package stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Marshal
 * @date 2021/3/6
 */
public class NextGreaterElements {
    public int[] nextGreaterElements(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        Stack<Integer> stack = new Stack<>();
        Arrays.fill(ans, -1);
        for (int i = 0; i < 2 * length - 1; i++) {
            while (!stack.isEmpty() && nums[i % length] > nums[stack.peek()]) {
                // 如果当前值大于栈顶元素，则栈顶元素的下一个大于的值就是当前元素
                ans[stack.pop()] = nums[i % length];
            }
            stack.push(i % length);
        }
        return ans;
    }
}
