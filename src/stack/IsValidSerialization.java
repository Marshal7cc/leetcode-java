package stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Marshal
 * @date 2021/3/12
 */
public class IsValidSerialization {
    // 槽位可以理解为当前可容纳的新节点的容量
    // 当增加一个非空节点的时候，会消耗掉一个槽位，同时增加两个槽位(新增节点的左右子节点的位置)
    // 增加空节点的时候，由于空节点只能是叶子节点，只会消耗掉一个槽位，而不会增加槽位。
    public boolean isValidSerialization(String preorder) {
        int n = preorder.length();
        int i = 0;
        Deque<Integer> stack = new LinkedList<Integer>();
        // 根节点特殊化处理
        stack.push(1);
        while (i < n) {
            // 槽位数量不足，序列不合法
            if (stack.isEmpty()) {
                return false;
            }
            if (preorder.charAt(i) == ',') {
                i++;
            } else if (preorder.charAt(i) == '#') {
                // 必是叶子节点，槽位-1,且不会增加
                int top = stack.pop() - 1;
                if (top > 0) {
                    stack.push(top);
                }
                i++;
            } else {
                // 读一个数字
                while (i < n && preorder.charAt(i) != ',') {
                    i++;
                }
                int top = stack.pop() - 1;
                if (top > 0) {
                    stack.push(top);
                }
                stack.push(2);
            }
        }
        return stack.isEmpty();
    }
}
