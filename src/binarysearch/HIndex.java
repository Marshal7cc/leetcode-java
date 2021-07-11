package binarysearch;

/**
 * @author Marshal
 * @date 2021/7/12
 */
public class HIndex {
    public int hIndex(int[] citations) {
        int n = citations.length;

        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (n - middle == citations[middle]) {
                return n - middle;
            } else if (n - middle > citations[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return n - left;
    }
}
