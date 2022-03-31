package unclassified;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marshal
 * @since 2022/3/31
 */
public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumbers(i)) {
                ans.add(i);
            }
        }
        return ans;
    }

    private boolean isSelfDividingNumbers(int num) {
        int val = num;
        while (num > 0) {
            int a = num % 10;
            if (a == 0 || val % a != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
