package stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Marshal
 * @date 2021/3/11
 */
public class Calculate2 {
    public static void main(String[] args) {
        calculate("42");
    }

    public static int calculate(String s) {
        Deque<Integer> stack = new LinkedList<>();
        int len = s.length();
        char preSign = '+';

        int i = 0;
        while (i < len) {
            if (s.charAt(i) == ' ') {
                i++;
            } else if (Character.isDigit(s.charAt(i))) {
                int num = 0;
                while (i < len && Character.isDigit(s.charAt(i))) {
                    num = 10 * num + (s.charAt(i) - '0');
                    i++;
                }
                switch (preSign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(num * stack.pop());
                        break;
                    case '/':
                        stack.push(stack.pop() / num);
                        break;
                }
            } else {
                preSign = s.charAt(i);
                i++;
            }
        }

        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }
}
