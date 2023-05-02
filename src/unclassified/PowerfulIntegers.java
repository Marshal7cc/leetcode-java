package unclassified;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Marshal
 * @since 2023/5/2
 */
public class PowerfulIntegers {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> set = new HashSet<>();
        int value1 = 1;
        // 2^20 < 10^6
        for (int i = 0; i < 21; i++) {

            int value2 = 1;
            for (int j = 0; j < 21; j++) {
                int value = value1 + value2;
                if (value <= bound) {
                    set.add(value);
                } else {
                    break;
                }
                value2 *= y;
            }

            if (value1 > bound) {
                break;
            }
            value1 *= x;
        }
        return new ArrayList<>(set);
    }

}
