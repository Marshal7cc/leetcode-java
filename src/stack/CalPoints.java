package stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marshal
 * @since 2022/5/6
 */
public class CalPoints {
    public int calPoints(String[] ops) {
        int ans = 0;
        List<Integer> stack = new ArrayList<>();

        for (String s : ops) {
            switch (s) {
                case "+":
                    stack.add(stack.get(stack.size() - 1) + stack.get(stack.size() - 2));
                    break;
                case "D":
                    stack.add(stack.get(stack.size() - 1) * 2);
                    break;
                case "C":
                    stack.remove(stack.size() - 1);
                    break;
                default:
                    stack.add(Integer.parseInt(s));
                    break;
            }
        }
        for (Integer i : stack) {
            ans += i;
        }
        return ans;
    }
}
