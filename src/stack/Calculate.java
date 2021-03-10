package stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Marshal
 * @date 2021/3/10
 */
public class Calculate {
    public static int calculate(String s) {
        int len = s.length();
        // 符号
        int sign = 1;
        // 栈用来记忆符号
        Deque<Integer> ops = new LinkedList<>();
        ops.push(sign);

        int ans = 0;
        int i = 0;
        while (i < len) {
            char c = s.charAt(i);
            if (c == ' ') {
                i++;
            } else if (c == '+') {
                sign = ops.peek();
                i++;
            } else if (c == '-') {
                sign = -ops.peek();
                i++;
            } else if (c == '(') {
                ops.push(sign);
                i++;
            } else if (c == ')') {
                ops.pop();
                i++;
            } else {
                long num = 0;
                while (i < len && Character.isDigit(s.charAt(i))) {
                    num = 10 * num + (s.charAt(i) - '0');
                    i++;
                }
                ans += sign * num;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        calculate(" 2-1 + 2 ");
    }
}
