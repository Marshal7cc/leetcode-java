package greedy;

import java.util.Arrays;

/**
 * @author Marshal
 * @since 2023/2/11
 */
public class FillCups {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        if (amount[2] >= amount[0] + amount[1]) {
            return amount[2];
        } else {
            return (amount[0] + amount[1] + amount[2] + 1) / 2;
        }
    }
}
