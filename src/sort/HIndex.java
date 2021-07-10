package sort;

import java.util.Arrays;

/**
 * @author Marshal
 * @date 2021/7/11
 */
public class HIndex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int h = 0;
        int n = citations.length;

        int i = n - 1;
        while (i >= 0 && citations[i] > h) {
            h++;
            i--;
        }
        return h;
    }
}
