package unclassified;

/**
 * @author Marshal
 * @since 2022/1/2
 */
public class LastRemaining {
    public int lastRemaining(int n) {
        int left = 1;
        int cnt = n;
        int step = 1;
        int level = 0;

        while (cnt > 1) {
            if (level % 2 == 0) {
                left = left + step;
            } else {
                left = (cnt % 2 == 0) ? left : left + step;
            }

            step = step << 1;
            cnt = cnt >> 1;
            level++;
        }
        return left;
    }
}
