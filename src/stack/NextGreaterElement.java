package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Marshal
 * @date 2021/3/6
 */
public class NextGreaterElement {
    public int[] nextGreaterElementAsc(int[] nums1, int[] nums2) {
        // 正序思维法
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] ans = new int[len1];
        // 栈中存放还未找到下一个对应元素的元素
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>(len2);

        for (int i = 0; i < len2; i++) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        for (int i = 0; i < len1; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }

    public int[] nextGreaterElementDesc(int[] nums1, int[] nums2) {
        // 逆序思维法
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] ans = new int[len1];
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>(len2);
        for (int i = len2 - 1; i > -1; i--) {
            while (!stack.isEmpty() && nums2[i] >= nums2[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], nums2[stack.peek()]);
            }
            stack.push(i);
        }

        for (int i = 0; i < len1; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}
