package stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Marshal
 * @date 2021/4/1
 */
public class Clumsy {
    public int clumsy(int N) {
        Deque<Integer> stack = new LinkedList<>();
        stack.push(N);
        N--;

        int idx = 0;
        while (N > 0) {
            switch (idx % 4) {
                case 0:
                    stack.push(N * stack.pop());
                    break;
                case 1:
                    stack.push(stack.pop() / N);
                    break;
                case 2:
                    stack.push(N);
                    break;
                case 3:
                    stack.push(-N);
                    break;
            }

            N--;
            idx++;
        }

        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }
}
