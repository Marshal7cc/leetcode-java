package stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marshal
 * @since 2025/9/16
 */
public class ReplaceNonCoprimes {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        for (int num : nums) {
            while (!answer.isEmpty()) {
                Integer last = answer.get(answer.size() - 1);
                int g = gcd(last, num);
                if (g > 1) {
                    answer.remove(answer.size() - 1);
                    num = last / g * num;
                } else {
                    break;
                }
            }
            answer.add(num);
        }

        return answer;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
